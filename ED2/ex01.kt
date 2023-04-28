fun main()
{
    print("Digite o número inteiro: ")
    val numInteiro = readLine()!!.toInt()

    var fatorial = 1
    for (i in 1..numInteiro) {
        fatorial *= i
    }
    println("O número fatorial do $numInteiro é igual a $fatorial")
}
