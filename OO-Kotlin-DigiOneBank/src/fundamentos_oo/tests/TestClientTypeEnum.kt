package fundamentos_oo.tests

import fundamentos_oo.ClientType

fun main() {
    ClientType.values().forEach { elements ->
        println("${elements.name} - ${elements.descricao}\n")
    }

    ClientType.values().forEach {
        println("${it.name} - ${it.descricao}\n")
    }

    val pf = ClientType.Pf
    println(">> ${pf.name} - ${pf.descricao}")

    val pj = ClientType.Pj
    println(">> ${pj.name} - ${pj.descricao}")
}
