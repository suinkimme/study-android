package study.emerg_medi_info_app

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import study.emerg_medi_info_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goInputActivity.setOnClickListener {
            val intent = Intent(this, EditActivity::class.java)
            startActivity(intent)
        }

        binding.deleteButton.setOnClickListener {
            deleteData()
        }

        binding.emergencyContactLayer.setOnClickListener {
            with(Intent(Intent.ACTION_VIEW)) {
                val phoneNumber = binding.emerContactNumberValueTextView.text.toString().replace("-", "")
                data = Uri.parse("tel:$phoneNumber")
                startActivity(this) // 왜 this지? Intent 안이라 this가  먹히는듯?
            }
        }
    }

    override fun onResume() {
        super.onResume()
        getDataUiUpdate()
    }

    private fun getDataUiUpdate() {
        with(getSharedPreferences(USER_INFORMATION, Context.MODE_PRIVATE)) {
            binding.nameValueTextView.text = getString(NAME, "미정")
            binding.birthdateValueTextView.text = getString(BIRTHDATE, "미정")
            binding.bloodTypeValueTextView.text = getString(BLOOD_TYPE, "미정")
            binding.emerContactNumberValueTextView.text = getString(CONTACT, "미정")

            val other = getString(OTHER, "")
            binding.otherTextView.isVisible = other.isNullOrEmpty().not()
            binding.otherValueTextView.isVisible = other.isNullOrEmpty().not()
            if (!other.isNullOrEmpty()) {
                binding.otherValueTextView.text = getString(OTHER, "미정")
            }
        }
    }

    private fun deleteData() {
        with(getSharedPreferences(USER_INFORMATION, MODE_PRIVATE).edit()) {
            clear()
            apply()
            getDataUiUpdate()
        }
        Toast.makeText(this, "초기화를 완료했습니다.", Toast.LENGTH_SHORT).show()
    }
}