/**
Creator: Zohidjon Akbarov
 */

fun main() {
//    val ali = Person("Ali",Gender.valueOf("MALE"))
//    val alica = Person("Alica",Gender.FEMALE)
//    println(ali)
//    ali.gender.doJob()
//    println(alica)
//    alica.gender.doJob()


}



/**
 * type : Triangle, Square, Circle
 */
class Shape(val type:String)


interface Jobs{
    fun doJob()
}

enum class Gender(val description:String):Jobs{
    MALE("Erkak") {
        override fun doJob() {
            println("Men erkak kishiman va mening vazifalrim Yer chopish O'tin yorish")
        }
    },
    FEMALE("Ayol"){
        override fun doJob() {
            println("Ayol kishini vazifalari bola boqish ovqat qilish")
        }
    }

}