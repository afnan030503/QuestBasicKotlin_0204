package com.example.bab1

// Data Class
// Data class adalah yang digunakan untuk menyimpan data
// Data class menyediakan fungsi untuk meng-override fungsi equals(), hashcode(), dan toString().
// Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan.

data class DataClass(
    val id: Int,
    var email: String
)
fun main()