package com.example.crud.mahasiswa

import com.google.gson.annotations.SerializedName

data class ResponseDataMahasiswa(
    @SerializedName("status") val stt:String,
    val totaldata:Int,
    val data:List<MahasiswaData>

)
