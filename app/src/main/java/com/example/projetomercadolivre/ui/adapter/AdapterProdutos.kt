package com.example.projetomercadolivre.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projetomercadolivre.R
import com.example.projetomercadolivre.model.Product


class AdapterProdutos(private val products: List<Product>) : RecyclerView.Adapter<AdapterProdutos.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_products, parent,false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(products[position])
    }

    override fun getItemCount(): Int {
        return products.size
    }

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(product: Product) {
            with(itemView) {
                val productPicture = itemView.findViewById<ImageView>(R.id.ivProductPicture)
                val productModel = itemView.findViewById<TextView>(R.id.tvProductModel)
                val productYear = itemView.findViewById<TextView>(R.id.tvProductYear)
                val productKm = itemView.findViewById<TextView>(R.id.tvProductKm)
                val productPrice = itemView.findViewById<TextView>(R.id.tvProductPrice)

                productPicture.setImageResource(product.productPicture)
                productModel.text = product.productModel
                productYear.text = product.productYear
                productKm.text = product.productKm
                productPrice.text = product.productPrice
            }
        }
    }
}
