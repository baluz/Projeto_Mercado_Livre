//package com.example.projetomercadolivre
//
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//
//
//class ApiPage : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        supportActionBar?.hide()
//
//        //val service = RetrofitClient.createService(ItemsService::class.java)
//        //val call: Call<List<ItemsEntity>> = service.list()
//        call.enqueue(object : Callback<List<ItemsEntity>> {
//            override fun onResponse(
//                call: Call<List<ItemsEntity>>,
//                response: Response<List<ItemsEntity>>
//            ) {
//                val list = response.body()
//            }
//
//            override fun onFailure(call: Call<List<ItemsEntity>>, t: Throwable) {
//                val s = ""
//            }
//        })
//    }
//}
