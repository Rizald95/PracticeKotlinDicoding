package kotlinpracticedicoding.List

/*
* Collections sendiri merupakan sebuah objek yang bisa menyimpan kumpulan objek lain
* termasuk data class
* */

/*
* LIST
* menyimpan banyak data menjadi satu objek*/

val numberList : List<Int> = listOf(1, 2, 3, 4, 5)
//lebih ringkas
val charList = listOf('a', 'b')

//bisa memasukan data class ke dalam List
val anyList = listOf('a', "Kotlin", 3, true, User())

/*
* MutableList
* */

var anyListMutable = mutableListOf('a', "Kotlin", 3, true)
//bersifat mutable bisa  memanipulasi data
anyListMutable.add('d')
        anyListMutable[3]
        anyListMutable.removeAt(0)

