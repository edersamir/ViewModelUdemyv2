package android.example.viewmodeludemyv2

import android.example.viewmodeludemyv2.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    //private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ViewModelCalulator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(ViewModelCalulator::class.java)
        binding.result.text = viewModel.getCurrentSuma().toString()
        binding.Add.setOnClickListener {
            binding.result.text =  viewModel.getUpdateSuma(binding.editNumber.text.toString().toInt()).toString()
                    }

    }



}