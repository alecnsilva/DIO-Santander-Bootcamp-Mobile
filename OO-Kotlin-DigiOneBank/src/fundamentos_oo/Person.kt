package fundamentos_oo

// Outer Class (Members Class)
class Person {

    var name: String = "Alec N. Silva"

    var id: String = "159.357.456-82"
        private set // visibility modifier, let see, do not modify

    // Inner classes
    /* inner class Address {
          var location: String = "Rua da Minha casa"
    }*/

    constructor()

    fun personInfo() = "$name e $id"
}

fun main() {
    val alec = Person()
    // alec.id = "000.000.000-00" //Kotlin: Cannot assign to 'id': the setter is private in 'Person'

    println(alec) // memory location ref.
    println(alec.name)
    println(alec.id)
    println("-----\n")
    println(alec.personInfo())

    // println(alec.Address().location)
}
