package com.example.basic_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.basic_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigation.setSelectedItemId(R.id.itemHome)
        binding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.itemHome->{
                    true
                }
                R.id.itemAdd->{
                    val myIntent = Intent(applicationContext, BottomNavigation1::class.java)
                    startActivity(myIntent)
                    finish()
                    true
                }
                R.id.itemManage->{
                    val myIntent = Intent(applicationContext, BottomNavigation2::class.java)
                    startActivity(myIntent)
                    finish()
                    true
                }
            }
            false
        }
    }
}