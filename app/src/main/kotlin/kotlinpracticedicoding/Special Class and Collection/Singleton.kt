/* Singleton object merupakan
* pattern yang berguna untuk memastikan suatu object hanya
* memiliki satu instance dengan satu titik akses globa;\l*/

object CentralLibrary {
    fun borrowBookById(id: Int) {
        print("Book with $id has been borrowed")
    }
}
/*
* Companion object
* Adalah tidak dapat membuat inner object secara langsing dalam class
* Companion object juga biasa digunakan dalam kasus penulisan konstanta
* kotlin tidak ada deklarasi static, menggunakan const val(dideklarasikan di top level atau di dalam object)*/



class Library {
    companion object {
        fun borrowBookById(id: Int) {
            println("Book with $id has been borrowed")
        }

    }

}

class MyLibrary {
    //const val are only allowed on top level, in named object
    //const val LIBRARY_NAME = "Dicoding Library"

    fun totalBook() {
        print("Total book in $LIBRARY_NAME is unlimited")
    }

    companion object {
        const val LIBRARY_NAME = "Dicoding Library"
    }
}


/*
* ANONYMOUS CLASS
* alih-alih mendefinisikan class menggunakan keywoard class
* langsung mendefinisikan isi dari sebuah class menggunakan keyword object
* */

interface IFly {
    fun fly()
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}



class Bird: IFly {
    override fun fly() {
        println("The bird flying")
    }
}


/*
* FUNCTION (SAM) INTERFACE
* menggunakan function interface atau disebut single Abstract Method
* asalah sebuah interface yang memiliki satu method abstract*/

fun interface  IFly1 {
    fun fly()
}

//contoh kode ketika menggunakan keyword object dan override fungsi seperti ini:
flyWithWings(object : IFly {
    override fun fly() {
        println()
    }
})

//dengan memanfaatkan Kotlin SAM conversion
flyWithWings {
    println("the bord flying")
}
/*
* catatan cara ini hanya bisa dilakukan pada interface yang hanya
* memiliki satu fungsi aja, sesuai dengan namanya yankni SAM(Single abstract method)*/

fun main() {
    CentralLibrary.borrowBookById(21) // singleton
    Library.Companion.borrowBookById(21)
    Library.borrowBookById(21)// companion object
    //output companion
    //Book with 21 has been borrowed
    //Book with 21 has been borrowed
    val name = MyLibrary.LIBRARY_NAME


    //Anonymous class
    flyWithWings(object: IFly {
        override fun fly() {
            println("the bird flying")
        }
    })
}
