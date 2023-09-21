package com.example.instagramp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.instagramp.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener(object : NavigationBarView.OnItemSelectedListener{
            override fun onNavigationItemSelected(item: MenuItem): Boolean {

                if (item.itemId==R.id.profile){
                    supportFragmentManager.beginTransaction().add(R.id.container,profileFragment()).commit()
                }
                else if (item.itemId== R.id.search){
                    supportFragmentManager.beginTransaction().add(R.id.container,MapsFragment()).commit()
                }
                else if (item.itemId== R.id.home){
                    supportFragmentManager.beginTransaction().add(R.id.container,HomeFragment()).commit()
                }


                return true
            }

        })

        
    }
}