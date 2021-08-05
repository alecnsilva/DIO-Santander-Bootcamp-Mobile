package fundamentos_oo

import java.math.BigDecimal

class Employee(
    override val name: String,
    override val id: Int,
    val wage: BigDecimal,
) : Person(name, id)
