package kotlinpracticedicoding.Map

/*
* Map merupakan sebuah collection yang dapat menyimpan data dengan format key-value
* */

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    //bisa menggunakan fungsi getValue().
    println(capital.getValue("Jakarta"))

    //menampilkan key apa saja
    val mapKeys = capital.keys

    //
}