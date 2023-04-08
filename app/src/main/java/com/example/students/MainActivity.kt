package com.example.students

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import java.util.jar.Attributes.Name


class MainActivity : AppCompatActivity() {
    var ed1:EditText?=null
    var ed2:EditText?=null
    var ed3:EditText?=null
    var b1:Button?=null
    var b2:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ed1=findViewById<EditText>(R.id.name)!!
        ed2=findViewById<EditText>(R.id.roll)!!
        ed3=findViewById<EditText>(R.id.phone)!!
        b1=findViewById<Button>(R.id.buttond)!!
        b2=findViewById<Button>(R.id.add)!!
        b1!!.setOnClickListener{
            var name= ed1!!.text.toString()
            var roll= ed2!!.text.toString()
            var phone=ed3!!.text.toString()


            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra( "Name",name)
            intent.putExtra("Roll",roll)
            intent.putExtra("Phone number",phone)
            startActivity(intent)
        }
        b2!!.setOnClickListener{
            var name= ed1!!.text.toString()
            var roll= ed2!!.text.toString()
            var phone=ed3!!.text.toString()



            intent.putExtra( "Name",name)
            intent.putExtra("Roll",roll)
            intent.putExtra("Phone number",phone)

            ed1!!.text.clear();ed1!!.text.clear();ed3!!.text.clear();
        }

    }
}