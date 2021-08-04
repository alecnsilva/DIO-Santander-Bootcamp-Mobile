package fundamentos_oo.tests

import fundamentos_oo.ClientType

fun main() {
    ClientType.values().forEach { elements ->
        println("${elements.name} - ${elements.descricao}\n")
    }

    ClientType.values().forEach {
        println("${it.name} - ${it.descricao}\n")
    }

    val Pf = ClientType.Pf
    println(">> ${Pf.name} - ${Pf.descricao}")

    val Pj = ClientType.Pj
    println(">> ${Pj.name} - ${Pj.descricao}")
}
