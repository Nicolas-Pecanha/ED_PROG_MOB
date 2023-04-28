fun main()
{
    print("Digite um número número: ")
    val n1 = readLine()!!.toDouble()

    print("Digite um segundo número número: ")
    val n2 = readLine()!!.toDouble()

    print("Digite um terceiro número: ")
    val n3 = readLine()!!.toDouble()

    val numeros = listOf(n1, n2, n3).sorted()

    println("Os números em ordem crescente são: $numeros")
}

