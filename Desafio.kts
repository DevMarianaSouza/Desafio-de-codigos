object ReceitaFederal {
    fun calcularImposto(salario: Double): Double {
        val aliquota = when {
            (salario >= 0 && salario <= 1100) -> 0.05
            (salario >= 1100.1 && salario <= 2500.00) -> 0.10
            else -> 0.15
        }
    return aliquota * salario 
    }
}

fun main () {
    val valorSalario = readLine()!!.toDouble();
    val valorBeneficios = readLine()!!
}