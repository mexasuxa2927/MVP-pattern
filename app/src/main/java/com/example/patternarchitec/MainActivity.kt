package com.example.patternarchitec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer

import androidx.lifecycle.ViewModelProviders
import com.example.patternarchitec.UI.AppPrezenter
import com.example.patternarchitec.databinding.ActivityMainBinding

class MainActivity() : AppCompatActivity()  {
    lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding  =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var AppPrezenter:AppPrezenter= ViewModelProviders.of(this).get(AppPrezenter::class.java)

        binding.button.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                AppPrezenter.getAppNameData()
            }
        })

        AppPrezenter.multebledata.observe(this, object :Observer<String> {
            override fun onChanged(t: String?) {
                binding.textView.text = t

            }
        })








    }


}
