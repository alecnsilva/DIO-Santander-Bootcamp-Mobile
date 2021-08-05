package fundamentos_oo.tests

import fundamentos_oo.Person

fun main() {
    val alec = Person(name = "Alec N. Silva", id = 1823423430)
    // alec.id = "000.000.000-00" //Kotlin: Cannot assign to 'id': the setter is private in 'Person'

    println(alec) // memory location ref.
    println(alec.name)
    println(alec.id)
    println("-----\n")
    // println(alec.personInfo())

    // println(alec.Address().location)
}
