package fundamentos_oo.tests

import fundamentos_oo.Employee
import fundamentos_oo.Person
import java.math.BigDecimal

fun main() {
    val alec = Person(name = "Alec N. Silva", id = 1823423430)

    println(alec) // memory location ref.
    println(alec.name)
    println(alec.id)
    println("-----\n")

    val jhon = Employee(name = "Nicaragua do Equador", id = 1823423430, BigDecimal.valueOf(200.0))

    println(jhon) // memory location ref.
    println(jhon.name)
    println(jhon.id)
    println(jhon.wage)
    println("-----\n")
}
