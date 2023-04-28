fun main() {
   val conta1 = AventurasComMobile("Lionel Messi", 1000.0, "400289", "98765")
   val conta2 = AventurasComMobile("Christiano Ronaldo", 2200.0, "123456", "12345")


    conta1.imprimirExtrato()
    conta2.imprimirExtrato()

    println("Conta 1")
    conta1.depositar(1000.0)
    conta1.sacar(200.0)
    conta1.transferencia(250.0, conta2)
    println()

    println("Conta 2")
    conta2.depositar(500.0)
    conta2.sacar(1500.0)
    conta2.transferencia(400.0, conta1)
    println()

    conta1.imprimirExtrato()
    conta2.imprimirExtrato()
}


