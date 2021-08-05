package fundamentos_oo

// Outer Class (Members Class)
open class Person(
    open val name: String,
    open val id: Int,
) {

    // var name: String = "Alec N. Silva"

    // var id: String = "159.357.456-82"
    // private set // visibility modifier, let see, do not modify

    // Inner classes
    /* inner class Address {
          var location: String = "Rua da Minha casa"
    }*/

    // constructor()

    // fun personInfo() = "$name e $id"
}
