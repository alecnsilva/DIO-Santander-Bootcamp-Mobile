package fundamentos_oo.tests

import fundamentos_oo.Bank

fun main() {
    val digiOneBank = Bank("DigiOneBank", 12)

    // println(digiOneBank.name)
    // println(digiOneBank.number)
    println(digiOneBank.extraInfo())

    val digiTwoBank = digiOneBank.copy("DigiTwoBank", 14)

    // println(digiTwoBank.name)
    // println(digiTwoBank.number)
    println(digiTwoBank.extraInfo())
}
