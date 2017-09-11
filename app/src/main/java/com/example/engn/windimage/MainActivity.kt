package com.example.engn.windimage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.github.ahmadnemati.wind.WindView
import com.github.ahmadnemati.wind.enums.TrendType
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{

            wind.pressure = 150.0f
            wind.pressureUnit=" in Hg"
            wind.setWindSpeed(125.0f)
            wind.windSpeedUnit= " km/h"
            wind.trendType = TrendType.UP
            wind.start()

        }

    }
}


