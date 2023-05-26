package Estudo_Kotlin.src.main.kotlin

fun main() {
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
}