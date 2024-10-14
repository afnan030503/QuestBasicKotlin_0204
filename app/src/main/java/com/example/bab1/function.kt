package com.example.bab1

fun withoutParameter() {
    println("===withoutParameter===")
    println("Hello, world")
}

fun withParameter(name: String){
    println()
    println("=== withParameter")
    println("Hello, $name!")
}


// named argument
// named argument adalah cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int){
    println()
    println("=== withNamedArgument")
    println("Hello, $name!, You are $age years old.")
}


// default parameter value
// default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String= " Indra", age: Int){
    println()
    println("=== withDefaultParameter ===")
    println("Hello,$name! You are $age years old")
}
fun withReturn(panjang: Int, lebar: Int): Int {
    val hasil = panjang * lebar
    println(hasil)
    return hasil
}


fun main(){
    withoutParameter()
    withParameter("John")


    withNamedArgument(name = "John", age= 30)
    withDefaultParameter(age = 25)
}
