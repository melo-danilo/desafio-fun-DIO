enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val name: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    infix fun matricular(usuario: Usuario) {
       inscritos.add(usuario)
    }
   
}

fun main() {
    
    val danilo = Usuario("Danilo")
    val funcoes = ConteudoEducacional("O poder das funcoes em kotlin", 40, Nivel.INTERMEDIARIO)
    val android = Formacao("Formação Android", listOf(funcoes))
    
    android matricular danilo
    
    print(android.inscritos)
    
   
}
