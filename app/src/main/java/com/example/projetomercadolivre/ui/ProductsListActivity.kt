package com.example.projetomercadolivre.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projetomercadolivre.R
import com.example.projetomercadolivre.databinding.ActivityProductsListBinding

class ProductsListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_list)


        //Esconder barra de navegacao
        supportActionBar?.hide()

        binding = ActivityProductsListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}


