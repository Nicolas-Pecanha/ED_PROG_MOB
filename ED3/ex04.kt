open class ContaP(
    val cliente: String,
    var saldo: Double,
    val numero: String,
    val agencia: String
) {
    fun depositar(valor: Double)
    {
        saldo += valor
        println("O depósito no valor de R$$valor foi concluído")
    }

    fun retirar(valor: Double)
    {
        if (saldo >= valor)
        {
            saldo -= valor
            println("O saque no valor de R$$valor foi concluído")
        } else
        {
            println("Você não tem saldo para a operação")
        }
    }

    fun transferir(valor: Double, contaDestino: EstudoDirigido3)
    {
        if (saldo >= valor)
        {
            saldo -= valor
            contaDestino.saldoDaConta += valor
            println("A transferência no valor de R$$valor foi concluída")
        } else
        {
            println("Você não tem saldo para a operação")
        }
    }

    open fun imprimirExtrato()
    {
        println("Extrato")
        println("Nome do cliente: $cliente")
        println("Número da conta: $numero")
        println("Número da agência: $agencia")
        println("Valor do saldo disponível: R$$saldo")
    }
}


class ContaPoupanca(cliente: String,  saldo: Double, numero: String, agencia: String) : ContaP (cliente, saldo, numero, agencia){
    fun aplicarJuros()
    {
        val juros = saldo * 0.005
        depositar(juros)
    }

    override fun imprimirExtrato()
    {
        super.imprimirExtrato()
        println("Conta: Poupança")
    }
}

fun main()
{
    val contaPoupanca = ContaPoupanca("Nicolas Vila Peçanha", 6000.0, "123456", "00007")
    println()
    contaPoupanca.depositar(1000.0)
    contaPoupanca.retirar(900.0)
    contaPoupanca.aplicarJuros()
    println()
    contaPoupanca.imprimirExtrato()
}