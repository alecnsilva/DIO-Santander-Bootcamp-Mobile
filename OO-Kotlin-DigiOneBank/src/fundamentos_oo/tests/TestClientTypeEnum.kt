package fundamentos_oo.tests

import fundamentos_oo.ClientType

fun main() {
    ClientType.values().forEach { elements ->
        println("${elements.name} - $elements\n")
    }

    ClientType.values().forEach {
        println("${it.name} - $it\n")
    }
}
