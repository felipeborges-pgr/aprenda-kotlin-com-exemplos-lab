// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(var nome: String, var email: String, var senha: String)

data class ConteudoEducacional(var nome: String, val nivel: Nivel, var duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuarios: Usuario) {
        inscritos.addAll(usuarios)
        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    
    val conteudo01 = listOf (
        	ConteudoEducacional("Java OO", Nivel.AVANCADO, 240), 
        	ConteudoEducacional("Java Exceptions", Nivel.INTERMEDIARIO, 180), 
        	ConteudoEducacional("Java Classes", Nivel.BASICO, 120)
    )
    
    val formacao01 = Formacao("Java Developer", Nivel.AVANCADO, conteudo01)
    
    val usuario01 = Usuario("Usuario01", "usuario01@email.com", "123456")
    val usuario02 = Usuario("Usuario02", "usuario02@email.com", "12345678")
  
    formacao01.matricular(usuario01, usuario02)
    
    println(formacao01)
    println(formacao01.inscritos)
//     TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//     TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}