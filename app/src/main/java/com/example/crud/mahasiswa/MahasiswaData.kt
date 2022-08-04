package com.example.crud.mahasiswa

import com.google.gson.annotations.SerializedName

data class MahasiswaData(
    @SerializedName("mhsnobp") val nobp:String,
    @SerializedName("mhsnama") val nama:String,
    @SerializedName("mhsalamat") val alamat:String,
    @SerializedName("prodinama") val prodi:String,
    @SerializedName("mhstgllhr") val tgllahir:String,
)
