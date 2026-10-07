fun main(){
    var pix = listOf<Double?>(50.0, null, 120.5, null, 10.0)
    var total = 0.0

    for (valores in pix){
        if(valores != null){
            total += valores
        }
        else{
            println("Transação ignorada")
        }
    }
    println("Valor total processado: $total")
}