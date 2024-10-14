package com.example.bab1

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "Mary@gmail.com")

    //print the value of the property: email
    println(contact.email)

    //update the value of the property: email
    contact.email = "jane@gmail.com"
    println(contact.email)
}