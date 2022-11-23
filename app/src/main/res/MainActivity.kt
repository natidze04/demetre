package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ...
        class MainActivity : AppCompatActivity(){
            override fun onCreate(
                savedInstanceState: Bundle?,
                persistentState: PersistableBundle?
            ) {
                super.onCreate(savedInstanceState, persistentState)
                setContentView(R.layout.activity_main)
                
                val button = findViewById<TextView>(R.id.button)
                val imageButton2 = findViewById<TextView>(R.id.imageButton2)
                
                button.setOnClickListener {  
                    var login=login.text.toString()
                    if (login==null) {
                        Toast.makeText(, "", Toast.LENGTH_SHORT).show()
                    }
                    
                }
                
            }
        }