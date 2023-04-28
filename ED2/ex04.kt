fun main()
{
    print("Digite uma nota: ")
    val nt1 = readLine()!!.toDouble()

    print("Digite uma segunda nota: ")
    val nt2 = readLine()!!.toDouble()

    print("Digite uma terceira nota: ")
    val nt3 = readLine()!!.toDouble()

    val media = (nt1 * 2 + nt2 * 3 + nt3 * 5) / 10

    if (media >= 7.0)
    {
        println("O aluno foi aprovado com média $media.")
    }
    else if (media < 5.0)
    {
        println("O aluno foi reprovado com média $media.")
    }
    else
    {
        println("O aluno ficou de prova final com média $media.")
    }
}

