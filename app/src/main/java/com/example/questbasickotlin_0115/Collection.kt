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

fun ContohSet() {
    println()
    println("=== set ===")

    //set read-only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    //set mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triagle")
    println(shape)

    //menambah data kedalam set mutable
    shape.add("rectangle")
    println(shape)

    //menghapus data dari set mutable
    shape.remove("Circle")
    println(shape)

    //set read-only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

fun ContohMap() {

    println()
    println("=== Map ===")
    //map read-only
    val readOnlyShape: Map<String, Int> =
        mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    //Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    //menambah data ke dalam map mutable
    shape["Rectangle"] = 4
    println(shape)

    //menghapus data dari map mutable
    shape.remove("Circle")
    println(shape)

    //mengubah data di dalam map mutable
    shape["Square"] = 5
    println(shape)

    //map Read-Only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}