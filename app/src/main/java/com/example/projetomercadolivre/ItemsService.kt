package com.example.projetomercadolivre

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

//como faz mesmo para gerar um novo????

const val ACCESS_TOKEN: String = "APP_USR-387536581919606-091308-f99a5111049aad0e82773252348c4222-288497509"

interface ItemsService {

    @Headers("Authorization: Bearer $ACCESS_TOKEN")
    @GET ("sites.MLB/domain_discovery/search?limit=1")
    fun caterogyList(@Query("q") search: String): Call<List<CategoryPredictorEntity>>


    @Headers("Authorization: Bearer $ACCESS_TOKEN")
    @GET("highlights/MLB/category/{category_id}")
    fun highlights(@Path("category_id") categoryId: String): Call<HighlightsItemEntity>

    @Headers("Authorization: Bearer $ACCESS_TOKEN")
    @GET("items")
    fun itemList(@Query("ids") itemIds: String): Call<List<ItemsEntity>>


}




