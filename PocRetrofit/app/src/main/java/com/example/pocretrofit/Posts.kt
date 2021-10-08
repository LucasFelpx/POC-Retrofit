package com.example.pocretrofit

import com.google.gson.annotations.SerializedName

 data class Posts (
    @SerializedName("id")
    var id : Int,
    @SerializedName("name")
    var name : String,
    @SerializedName("truckBrand")
    var truckBrand : String,
    @SerializedName("truckType")
    var truckType : String,
    @SerializedName("licensePlate")
    var licensePlate : String,
    @SerializedName("fuelType")
    var fuelType : String,
    @SerializedName("status")
    var status : String
 )