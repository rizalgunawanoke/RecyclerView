package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.adapter.AdapterTeamBola
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.model.Pemain
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        val listPemain = ArrayList<Pemain>()
        listPemain.add(Pemain("Carpajal",R.drawable.carpajal,"bek","1.80 m","bekasi","02 mei 1988"))
        listPemain.add(Pemain("benzema",R.drawable.benzema,"Penyerang","1.85","francis","12 juni 1985"))
        listPemain.add(Pemain("Modrik",R.drawable.drik,"Gelandang","1.80 m","Croatia","02 april 1980"))
        listPemain.add(Pemain("Cortois",R.drawable.tius,"Kiper","1.90 m","Sapain","02 mei 1989"))
        listPemain.add(Pemain("Vinicius",R.drawable.vini,"Penyerang","1.80 m","Brazil","02 Desember 2000"))

        binding.list.adapter = AdapterTeamBola(this, listPemain,object : AdapterTeamBola.OnClikListener  {
            override fun detailData(item: Pemain?) {
                TODO("Not yet implemented")
            }
        })
    }

}