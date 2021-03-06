package uk.co.jatra.animatedstatebutton

import android.animation.ObjectAnimator
import android.graphics.BlendModeColorFilter
import android.graphics.ColorFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import uk.co.jatra.animatedstatebutton.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.enabledCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
            binding.icon.isEnabled = isChecked
        }
    }

}