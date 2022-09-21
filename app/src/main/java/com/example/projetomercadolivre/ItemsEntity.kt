package com.example.projetomercadolivre

import com.google.gson.annotations.SerializedName

class ItemsEntity {

    @SerializedName("domain_id")
    var domainID: String = ""

    @SerializedName("domain_name")
    var domainName: String = ""

    @SerializedName("category_id")
    var categoryID: String = ""

    @SerializedName("category_name")
    var categoryName: String = ""


}
