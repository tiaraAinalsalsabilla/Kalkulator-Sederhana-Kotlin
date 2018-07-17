package com.tiara.kalkulatorsederhana

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tambah. setOnClickListener {
            val angkaPertama = angka_pertama.text.toString()
            val angkaKedua = angka_kedua.text.toString()

            if (angkaPertama == "" || angkaKedua == "") {
                Toast.makeText(this@MainActivity, "jangan dikosongkan", Toast.LENGTH_LONG).show()

            } else {
                val ResultCon = angkaPertama.toDouble()
                val ResultCon2 = angkaKedua.toDouble()

                val tambahin = ResultCon + ResultCon2
                hasil.text = "$tambahin" // cara lain convert ke double

            }
        }

        kurang. setOnClickListener {
            val angkaPertama = angka_pertama.text.toString()
            val angkaKedua = angka_kedua.text.toString()

            if (angkaPertama == "" || angkaKedua == "") {
                Toast.makeText(this@MainActivity, "jangan dikosongkan", Toast.LENGTH_LONG).show()

            } else {
                val ResultCon = angkaPertama.toDouble()
                val ResultCon2 = angkaKedua.toDouble()

                val kurangin = ResultCon - ResultCon2
                hasil.text = "$kurangin" // cara lain convert ke double

            }
        }


        kali. setOnClickListener {
            val angkaPertama = angka_pertama.text.toString()
            val angkaKedua = angka_kedua.text.toString()

            if (angkaPertama == "" || angkaKedua == "") {
                Toast.makeText(this@MainActivity, "jangan dikosongkan", Toast.LENGTH_LONG).show()

            } else {
                val ResultCon = angkaPertama.toDouble()
                val ResultCon2 = angkaKedua.toDouble()

                val kaliin = ResultCon * ResultCon2
                hasil.text = "$kaliin" // cara lain convert ke double

            }
        }

        bagi. setOnClickListener {
            val angkaPertama = angka_pertama.text.toString()
            val angkaKedua = angka_kedua.text.toString()

            if (angkaPertama == "" || angkaKedua == "") {
                Toast.makeText(this@MainActivity, "jangan dikosongkan", Toast.LENGTH_LONG).show()

            } else {
                val ResultConbagi = angkaPertama.toDouble()
                val ResultConbagi2 = angkaKedua.toDouble()

                val tampung = ResultConbagi / ResultConbagi2
                hasil.text = "$tampung" // cara lain convert ke double

            }
        }

        bersihkan.setOnClickListener {
            hasil.text = ""
            angka_pertama.text = null
            angka_kedua.text = null
        }
    }
}