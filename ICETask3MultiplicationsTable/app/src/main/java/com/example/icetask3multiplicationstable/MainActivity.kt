package com.example.icetask3multiplicationstable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val edtNumber = findViewById<EditText>(R.id.edtNumberEditText)

        btnMultiply.setOnClickListener {

        val intent = Intent(this,MultiplicationsTable:: class.java)
        intent.putExtra(
                "edtNumber",
                edtNumberEditText.text.toSring()

        )
            startActivity(intent)

            startActivity(intent)
        }


    }
}