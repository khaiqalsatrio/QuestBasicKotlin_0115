package com.example.questbasickotlin_0115

fun nullsafety(){
    var neverNull: String = "This can't be null"

    var nullable: String? = " you can keep a null here"

    nullable = null

    if (neverNull == null) {
        println("inferredNonNull is null")
    }else{
        println("inferredNonNull is not null")
    }

    println(neverNull.length)
    println(nullable?.length)

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))
}

fun main (){
    nullsafety()
}