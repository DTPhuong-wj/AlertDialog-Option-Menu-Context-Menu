package com.example.basic_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.basic_app.databinding.ActivityBottomNavigation1Binding

class BottomNavigation1 : AppCompatActivity() {
    lateinit var binding:ActivityBottomNavigation1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityBottomNavigation1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigation.setSelectedItemId(R.id.bottomNav1)
        binding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.itemHome->{
                    val myIntent = Intent(applicationContext,MainActivity::class.java)
                    startActivity(myIntent)
                    finish()
                    true
                }
                R.id.itemAdd->{
                    true
                }
                R.id.itemManage->{
                    val myIntent = Intent(applicationContext,BottomNavigation2::class.java)
                    startActivity(myIntent)
                    finish()
                    true
                }
            }
            false
        }
    }
}