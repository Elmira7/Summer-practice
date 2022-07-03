package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textName:TextView?=findViewById(R.id.editTextTextPersonName)
        val textR:TextView?=findViewById(R.id.editTextTextPersonName2)
        val textV:TextView?=findViewById(R.id.editTextTextPersonName3)
        val textYear:TextView?=findViewById(R.id.editTextTextPersonName4)
        val texta:TextView=findViewById(R.id.textView)
        val button:Button?=findViewById(R.id.button)

        button?.setOnClickListener {
            try {
                if((textName==null)||(textR==null)||(textV==null)||(textYear==null)||
                (textR.text.toString().toInt()!in(1..250))||(textV.text.toString().toInt()!in(1..300))
                ||(textName.text.length>50)||(textYear.text.toString().toInt()!in(1..150))){
                texta.text="Данные введены некорректно"
                }
                else{
                    texta.text="Дневная норма калорий  " +((textV.text.toString().toInt()*10) +(textR.text.toString().toInt()*6)-(textYear.text.toString().toInt()*5)+textName.text.length).toString()
                 }
        } catch (e: Exception){
            texta.text = "Данные введены некорректно"
        }
        }
    }
}
