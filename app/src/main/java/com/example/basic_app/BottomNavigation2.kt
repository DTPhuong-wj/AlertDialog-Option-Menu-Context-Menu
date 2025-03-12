package com.example.basic_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.basic_app.databinding.ActivityBottomNavigation2Binding

class BottomNavigation2 : AppCompatActivity() {
    lateinit var binding:ActivityBottomNavigation2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityBottomNavigation2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigation.setSelectedItemId(R.id.bottomNav2)
        binding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.itemHome->{
                    val myIntent = Intent(applicationContext,MainActivity::class.java)
                    startActivity(myIntent)
                    finish()
                    true
                }
                R.id.itemAdd->{
                    val myIntent = Intent(applicationContext,BottomNavigation1::class.java)
                    startActivity(myIntent)
                    finish()
                    true
                }
                R.id.itemManage->{
                    true
                }
            }
            false
        }
    }
}