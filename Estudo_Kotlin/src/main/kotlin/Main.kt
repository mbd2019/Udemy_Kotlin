package Estudo_Kotlin.src.main.kotlin

fun main() {
   /*
    println("Olá, Mundo")

    /*Tipos de variáveis padrões*/
    println("Double: Max: " + Double.MAX_VALUE + " - Min: " + Double.MIN_VALUE)
    println("Float: Max: " + Float.MAX_VALUE + " - Min: " + Float.MIN_VALUE)
    println("Long: Max: " + Long.MAX_VALUE + " - Min: " + Long.MIN_VALUE)
    println("Int: Max: " + Int.MAX_VALUE + " - Min: " + Int.MIN_VALUE)
    println("Short: Max: " + Short.MAX_VALUE + " - Min: " + Short.MIN_VALUE)
    println("Byte: Max: " + Byte.MAX_VALUE + " - Min: " + Byte.MIN_VALUE)

    /*Tipo de variáveis Unsigned*/
    println("ULong MAX - ${ULong.MAX_VALUE} - ${ULong.MIN_VALUE}")
    println("UInt MAX - ${UInt.MAX_VALUE} - ${UInt.MIN_VALUE}")
    println("UShort MAX - ${UShort.MAX_VALUE} - ${UShort.MIN_VALUE}")
    println("UByte MAX - ${UByte.MAX_VALUE} - ${UByte.MIN_VALUE}")

    /*Instanciando variáveis do tipo Unsigned*/
    val abc: UInt = 0u
    val short: UShort = 10u
    val byte: UByte = 10u
    val long: ULong = 10u

    /*Concatenação de String*/
    val kotlin = "Kotlin " + "é show"
    println(kotlin)

    val nome = "Charles " +
            "Babbage"

    // Uso do $ para concatenar String se chama interpolação
    println("Nome é $nome")
    println("Tamanho do nome é de ${nome.length} caracteres.")

    val linguagem = "Kotlin"
    val caracteristica = "É show!"
    val strFinal = linguagem + " " + caracteristica
    println(strFinal)
    println("$linguagem $caracteristica")

    /*Operadores aritmétricos*/
    // Operações
    println("2 + 2 = ${2 + 2}")
    println("2 - 2 = ${2 - 2}")
    println("2 / 2 = ${2 / 2}")
    println("2 * 2 = ${2 * 2}")
    println("10 % 4 = ${10 % 4}")
    println("10 % 2 = ${10 % 2}")

    // Incremento e decremento
    var numero = 10
    println("numero++ = ${numero++}")
    println(numero)
    println("numero-- = ${numero--}")
    println(numero)

    println("++numero = ${++numero}")
    println(numero)
    println("--numero = ${--numero}")
    println(numero)
*/
    //Exemplos de função
    mensagem()

    println("A soma dos números são: ${soma(10,5)}")

    var word = "Programação Kotlin"
    println(word.st)
}

fun mensagem(){
    println("Olá, Bom dia.")
}

/**
* Essa função é uma maneira simplificada de escrever a função de cima
* fun mensagem() = println("Olá, Bom dia.")
*/

fun soma(a: Int, b: Int): Int{
    return (a+b)
}

/**
 * Esta função é uma maneira simplificada de escrever a função de cima
 * fun soma(a: Int, b: Int) = (a+b)
 */