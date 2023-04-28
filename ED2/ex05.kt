fun main()
{
    print("Digite um valor monetário: ")
    var valor = readLine()!!.toDouble()

    val valorMoedas = listOf(1.0, 0.5, 0.25, 0.1, 0.05, 0.01)
    val nameMoedas = listOf("R$ 1,00", "R$ 0,50", "R$ 0,25", "R$ 0,10", "R$ 0,05", "R$ 0,01")
    val numerodeMoedas = mutableListOf<Int>()

    for (moeda in valorMoedas)
    {
        val quantidade = (valor / moeda).toInt()
        numerodeMoedas.add(quantidade)
        valor -= quantidade * moeda
    }

    println("Quantidade de moedas necessárias:")
    for (i in 0 until valorMoedas.size)
    {
        println("${nameMoedas[i]}: ${numerodeMoedas[i]}")
    }
}
