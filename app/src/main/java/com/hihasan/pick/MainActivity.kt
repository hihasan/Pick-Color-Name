package com.hihasan.pick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.hihasan.pick.databinding.ActivityTestBinding
import com.hihasan.pickcolorname.ColorUtils
import com.hihasan.pick.R

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_test)

        Log.d(MainActivity::class.java.simpleName, ColorUtils.getColorNameFromColor("#DDDDDD"))
    }
}