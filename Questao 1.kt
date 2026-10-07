fun main() {
    var valorProduto: Double = 50.0

    println("O valor final é: ${calcularDesconto(valorProduto, null)}")
}
fun calcularDesconto(valorProduto : Double, cupom : String?): Double {
    return when(cupom){
        "PROMO10" -> valorProduto - 10.0
        "PROMO20" -> valorProduto - 20.0
        else -> valorProduto
    }
}

