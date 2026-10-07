fun main(){
    fun avaliarMotorista(nota : Int?){
        var notaMotorista = nota ?: 0

        when (notaMotorista) {
            5 -> println("Excelente corrida!")
            4 -> println("Boa corrida.")
            3,2,1 -> println("Precisamos melhorar.")
            0 -> println("Nenhuma avaliação fornecida.")
        }
    }
    avaliarMotorista(0)
}