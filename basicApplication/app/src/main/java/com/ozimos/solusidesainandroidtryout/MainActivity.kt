package com.ozimos.solusidesainandroidtryout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etMain = findViewById<EditText>(R.id.et_main)
        val btMain = findViewById<Button>(R.id.bt_main)

        btMain.setOnClickListener {
            if (etMain.text.toString().equals(getString(R.string.answer_1))){
                Toast.makeText(this, "PALINDROME", Toast.LENGTH_SHORT).show()
                etMain.setText("")
            } else if (etMain.text.toString().equals(getString(R.string.answer_2))) {
                Toast.makeText(this, "PALINDROME", Toast.LENGTH_SHORT).show()
                etMain.setText("")
            }else if (etMain.text.toString().equals(getString(R.string.answer_3))) {
                Toast.makeText(this, "PALINDROME", Toast.LENGTH_SHORT).show()
                etMain.setText("")
            }else if (etMain.text.toString().equals(getString(R.string.answer_4))) {
                Toast.makeText(this, "PALINDROME", Toast.LENGTH_SHORT).show()
                etMain.setText("")
            }else if (etMain.text.toString().equals(getString(R.string.answer_5))) {
                Toast.makeText(this, "PALINDROME", Toast.LENGTH_SHORT).show()
                etMain.setText("")
            }else if (etMain.text.toString().equals(getString(R.string.answer_6))) {
                Toast.makeText(this, "PALINDROME", Toast.LENGTH_SHORT).show()
                etMain.setText("")
            }else if (etMain.text.toString().equals(getString(R.string.answer_7))) {
                Toast.makeText(this, "PALINDROME", Toast.LENGTH_SHORT).show()
                etMain.setText("")
            }else if (etMain.text.toString().equals(getString(R.string.answer_8))) {
                Toast.makeText(this, "PALINDROME", Toast.LENGTH_SHORT).show()
                etMain.setText("")
            } else {
                Toast.makeText(this, "NOT PALINDROME", Toast.LENGTH_SHORT).show()
                etMain.setText("")
            }
        }
    }
}