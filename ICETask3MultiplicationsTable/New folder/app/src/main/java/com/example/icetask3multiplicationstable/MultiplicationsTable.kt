package com.example.icetask3multiplicationstable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MultiplicationsTable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplications_table)
        val btnBack=findViewById<Button>(R.id.btnBack)
        val bundle: Bundle? = intent.extras
        val multiplicationTable: String? = bundle?.getString("multiplicationTable")

        val txtMultiplicationTable = findViewById<TextView>(R.id.multiplicationstableTextView)
        txtMultiplicationTable.text = multiplicationTable ?: "No multiplication table received"

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)

        }
    }
}