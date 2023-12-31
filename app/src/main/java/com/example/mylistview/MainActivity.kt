package com.example.mylistview

import android.icu.text.Transliterator.Position
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import com.example.mylistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dogsList = ArrayList<Dogs>()
        dogsList.add(Dogs("Dog1", "Decs1", R.drawable.a))
        dogsList.add(Dogs("Dog2", "Decs1", R.drawable.download))
        dogsList.add(Dogs("Dog3", "Decs1", R.drawable.auth_ic))
        dogsList.add(Dogs("Dog4", "Decs1", R.drawable.email))
        dogsList.add(Dogs("Dog5", "Decs1", R.drawable.home_ic))
        dogsList.add(Dogs("Dog6", "Decs1", R.drawable.order_ic))
        dogsList.add(Dogs("Dog7", "Decs1", R.drawable.person))
        dogsList.add(Dogs("Dog8", "Decs1", R.drawable.program))
        dogsList.add(Dogs("Dog9", "Decs1", R.drawable.team_ic))
        dogsList.add(Dogs("Dog10", "Decs1", R.drawable.b))
        val myAdapter=Customdapter(this,dogsList)
        binding.myList.adapter=myAdapter

        binding.myList.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, position.toString(), Toast.LENGTH_SHORT).show()
        }

    }
}