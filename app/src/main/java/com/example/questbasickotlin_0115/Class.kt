package com.example.pertemuan1

class Motor()
class Contact(val id: Int, var email: String)

fun main(){
    val contact = Contact(1, "marygmail.com")

    //print the value of the property: email
    println(contact.email)

    //update the value of the property: email
    contact.email = "janegmail.com"

    //prints the new value of the property: email
    println(contact.email)
}