package com.example.projetomercadolivre.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.projetomercadolivre.R
import com.example.projetomercadolivre.model.Product
import com.example.projetomercadolivre.ui.adapter.AdapterProdutos


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Esconder barra de navegação
        supportActionBar?.hide()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewProdutos)
        val adapter = AdapterProdutos(getItems())
        recyclerView.adapter = adapter
    }

        private fun getItems(): List<Product> {
            return arrayListOf(
                Product(
                    "Toyota Etios 1.5 X Sedan 16v",
                    "2018",
                    "73.000 Km",
                    "R$ 61.990,00",
                    R.drawable.ic_shopping_cart
                ),
                Product(
                    "Kia Soul 1.6 Ex 16v",
                    "2011",
                    "151.079 Km",
                    "R$ 44.990,00",
                    R.drawable.ic_shopping_cart
                ),
                Product(
                    "Jeep Compass 2.0 16v Limited 4x4",
                    "2019",
                    "89.000 Km",
                    "R$ 168.990,00",
                    R.drawable.ic_shopping_cart
                ),
                Product(
                    "Honda Fit 1.5 Lx 16v",
                    "2019",
                    "55.000 Km",
                    "R$ 85.890,00",
                    R.drawable.ic_shopping_cart
                ),
                Product(
                    "Volkswagen Fox 1.6 Connect",
                    "2017",
                    "37.000 Km",
                    "R$ 50.000,00",
                    R.drawable.ic_shopping_cart
                ),
                Product(
                    "Toyota Etios 1.5 X Sedan 16v",
                    "2018",
                    "73.000 Km",
                    "R$ 61.990,00",
                    R.drawable.ic_shopping_cart
                ),
                Product(
                    "Kia Soul 1.6 Ex 16v",
                    "2011",
                    "151.079 Km",
                    "R$ 44.990,00",
                    R.drawable.ic_shopping_cart
                ),
                Product(
                    "Jeep Compass 2.0 16v Limited 4x4",
                    "2019",
                    "89.000 Km",
                    "R$ 168.990,00",
                    R.drawable.ic_shopping_cart
                ),
                Product(
                    "Honda Fit 1.5 Lx 16v",
                    "2019",
                    "55.000 Km",
                    "R$ 85.890,00",
                    R.drawable.ic_shopping_cart
                ),
                Product(
                    "Volkswagen Fox 1.6 Connect",
                    "2017",
                    "37.000 Km",
                    "R$ 50.000,00",
                    R.drawable.ic_shopping_cart
                ),
                ).toList()
        }
    }
