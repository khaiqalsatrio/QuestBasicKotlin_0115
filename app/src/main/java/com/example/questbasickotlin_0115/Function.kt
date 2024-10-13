package com.example.questbasickotlin_0115

fun withoutParameter(){
    println("=== withoutParameter ===")
    println("Hello, Word!")
}

fun withParameter(name: String){
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

fun withNamedArgument(name: String, age: Int){
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! you are $age years old.")
}

fun withDefaultParameter(name: String = "indra", age: Int){
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! You are $age years old.")
}

fun withReturn(panjang : Int, lebar : Int) : Int {
    return println(panjang * lebar)
}

fun main(){
    withoutParameter()
    withParameter("john")
    withNamedArgument(name = "john", age = 30)
    withDefaultParameter(age = 25)
}