package fundamentos_oo

data class Bank(
    val name: String,
    val number: Int,
) {
    fun extraInfo() = "$name - $number"
}
