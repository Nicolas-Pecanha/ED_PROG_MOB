class Conta
    (val cliente: String, var saldo: Double, var numero: String, var agencia: String)
val contas = listOf(
    Conta("Adalberto da Silva Sauro", 2456.0, "111111", "01234")
    ,   Conta("Marlene dos Santos", 120.0, "222222", "56789")
    ,   Conta("Rubia dos Anjos Silva", 1000.0, "333333", "98542")
    ,   Conta("Tomas Bueno Andrade", 250000.0, "444444", "32954")
    ,   Conta("Gustavo José Antônio da Silva", 249999.0, "555555", "71255")
)
fun main()
{
    val ordemContaSaldo = contas.sortedBy { it.saldo }

    println("Mostrar as contas em ordem crescente (do maior para o menor): ")
    ordemContaSaldo.forEach { contas ->
        println("${contas.cliente} - Saldo disponível: ${contas.saldo}")
    }

    val nomeConta = contas.sortedBy { it.cliente }

    println("\nMostrar as contas em ordem alfabética:")
    nomeConta.forEach { contas ->
        println("${contas.cliente} - Saldo disponível: ${contas.saldo}")
    }
}
