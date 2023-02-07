import java.util.*

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
    val regex = "[ -/:-@\\[-`{-~áéíóúâêîôûãõç’]".toRegex()
    var filterValue = ""
    value.forEach {
        if(!regex.matches(it.toString())) {
            filterValue = it + filterValue
        } else{
            value.removePrefix(it.toString())
        }
    }
    return  regex.replace(value, "").lowercase() == filterValue.lowercase()
}