fun main(){
    fun validarBioInfantil(biografia:String?){
        var tamanhoBiografia = biografia?.length ?: 0

        if (tamanhoBiografia <= 50){
            println("Bio Aceita")
        }
        else{
            println("Bio muito longa")
        }
    }
    validarBioInfantil("Gosto de Assistir desenhos")
}