package com.gokcenaztorgan.hesapmakinesi

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.gokcenaztorgan.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    lateinit var ilkSayi : String
    lateinit var ikinciSayi : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        enableEdgeToEdge()
        setContentView(view)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun carp(view : View){
        ilkSayi = binding.editTextText.text.toString()
        ikinciSayi = binding.editTextText2.text.toString()
        if(ilkSayi != "" && ikinciSayi != ""){
            val sonuc = ilkSayi.toDouble() * ikinciSayi.toDouble()
            binding.textView.text = sonuc.toString()
        }
        else{
            binding.textView.text = "Sayilari girin!"
        }
    }
    fun bol(view : View){
        ilkSayi = binding.editTextText.text.toString()
        ikinciSayi = binding.editTextText2.text.toString()
        if(ilkSayi != "" && ikinciSayi != ""){
            val sonuc = ilkSayi.toDouble() / ikinciSayi.toDouble()
            binding.textView.text = sonuc.toString()
        }
        else{
            binding.textView.text = "Sayilari girin!"
        }
    }
    fun topla(view: View){
        ilkSayi = binding.editTextText.text.toString()
        ikinciSayi = binding.editTextText2.text.toString()
        if(ilkSayi != "" && ikinciSayi != ""){
            val sonuc = ilkSayi.toDouble() + ikinciSayi.toDouble()
            binding.textView.text = sonuc.toString()
        }
        else{
            binding.textView.text = "Sayilari girin!"
        }

    }
    fun cikart(view: View){
        ilkSayi = binding.editTextText.text.toString()
        ikinciSayi = binding.editTextText2.text.toString()
        if(ilkSayi != "" && ikinciSayi != ""){
            val sonuc = ilkSayi.toDouble() - ikinciSayi.toDouble()
            binding.textView.text = sonuc.toString()
        }
        else{
            binding.textView.text = "Sayilari girin!"
        }
    }
}