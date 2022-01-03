package com.example.patternarchitec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewAnimationUtils
import com.example.patternarchitec.UI.AppPrezenter
import com.example.patternarchitec.UI.AppView
import com.example.patternarchitec.databinding.ActivityMainBinding

class MainActivity() : AppCompatActivity() ,AppView {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val apps=AppPrezenter(this)

        binding.button.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                apps.getAppDetaile()
            }
        })

    }

    override fun ongetAppName(name: String) {
        super.ongetAppName(name)
        binding.textView.text  = name

    }
}