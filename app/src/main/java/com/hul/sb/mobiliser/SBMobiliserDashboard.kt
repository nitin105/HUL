package com.hul.sb.mobiliser

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.hul.R
import com.hul.databinding.ActivityDashboardBinding
import android.util.DisplayMetrics
import com.hul.databinding.ActivitySBMobiliserDashboardBinding

class SBMobiliserDashboard : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivitySBMobiliserDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySBMobiliserDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}