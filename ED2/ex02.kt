fun main()
{
    for (num in 0..10) {
        var fat = 1
        for (i in 1..num) {
            fat *= i
        }
        println("O fatorial do número $num é igual a $fat")
    }
}
