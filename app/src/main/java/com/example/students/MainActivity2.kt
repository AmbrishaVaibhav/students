package com.example.students

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var intent=intent
        val name=intent.getStringExtra("Name")
        val roll=intent.getStringExtra("Roll")
        val phone=intent.getStringExtra("Phone number")
        val out=findViewById<TextView>(R.id.output)
        out.text="Name : "+name+"\nRoll :"+roll+"\nPhone Number:" +phone

    }
}