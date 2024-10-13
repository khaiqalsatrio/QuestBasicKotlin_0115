package com.example.questbasickotlin_0115

fun ContohList() {
    println("=== List ===")
    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List mutable
    val shape: MutableList<String> = mutableListOf("Circlel", "square", "Triagle")
    println(shape)
}