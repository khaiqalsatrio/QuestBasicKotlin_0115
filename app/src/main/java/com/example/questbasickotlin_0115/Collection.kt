package com.example.questbasickotlin_0115

fun ContohList() {
    println("=== List ===")
    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List mutable
    val shape: MutableList<String> = mutableListOf("Circlel", "square", "Triagle")
    println(shape)

    //menambah data kedalam list mutable
    shape.add("Circle")
    println(shape)

    //menghapus data dari list mutable
    shape.remove("Triangle")
    println(shape)

    //mengubah data di dalam list mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}