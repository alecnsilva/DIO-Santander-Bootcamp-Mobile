package fundamentos_oo

import java.math.BigDecimal

class Account(
    val agency: String,
    val number: String,
    val balance: BigDecimal
) {
    fun deposit(value: BigDecimal) {
    }
    fun withdraw(value: BigDecimal) {
    }
}
