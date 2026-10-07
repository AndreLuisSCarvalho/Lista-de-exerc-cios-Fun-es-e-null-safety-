fun main() {
    var endereco = listOf<String?>("Av Djalma Batista, 200", "Av Constantino Nery, 300", null)

    organizarEntregas(endereco)
}
    fun organizarEntregas(enderecos : List<String?>) {

        for (listaEndereco in enderecos) {
            var enderecoEntrega = listaEndereco ?: "Endereço Desconhecido"

            if (enderecoEntrega == "Endereço Desconhecido")
                println("Entrega Pendente: Falta de dados")
            else {
                println("Rota traçada para: $enderecoEntrega")
            }
        }

    }
