import java.util.*

private val regex = "[ -/:-@\\[-`{-~áéíóúâêîôûãõç’]".toRegex()
private const val EMPTY = ""

fun main(args : Array<String>) {
    val reader = Scanner(System.`in`)
    print("Escreva uma palavra: ")
    val input = reader.nextLine()

    if(isPalindromo(input)) {
        println("$input é um palindromo")
    }else{
        println("$input não é um palindromo")
    }
}


fun isPalindromo(value: String): Boolean {
    var filterValue = EMPTY
    for (i in value.length - 1 downTo 0) {
       if (!regex.matches(value[i].toString())) {
           filterValue += value[i]
       }else {
           value.removePrefix(value[i].toString())
       }
    }
    return  regex.replace(value, EMPTY).lowercase() == filterValue.lowercase()
}