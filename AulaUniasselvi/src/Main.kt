fun main() {
    var nome: String = "João"
    var idade: Int = 5
    println("Hello World!" + nome + " você tem :" + idade + " anos")

    val numeros: IntArray = intArrayOf(1,2,3,4,5)
    val frutas = arrayOf("maça", "banana", "morango")

    val primeiroNumero = numeros[0]
    val segundaFruta = frutas[1]

    //size: retorna o tamanho do array.
    val tamanho = frutas.size
    //forEach: permite iterar sobre os elementos do array.
    numeros.forEach { println(it) }
    //sorted: retorna uma cópia do array ordenado.
    val frutasOrdenadas = frutas.sorted()
    //filter: retorna um novo array com os elementos que atendem a uma condição.
    val numerosPares = numeros.filter { it % 2 == 0 }

    val notas = intArrayOf(80,90,75,95,60)
    val media = calcularMedia(notas)

    println(media)

    // Declarando uma lista de strings
    val frutas2: MutableList<String> = mutableListOf("Maçã", "Banana", "Morango")

    // Adicionando um elemento à lista
    frutas2.add("Pêssego")

    // Removendo um elemento da lista
    frutas2.remove("Banana")

    // Declarando um conjunto de números inteiros
    val numerosUnicos: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5, 5, 3)

    // Adicionando um número ao conjunto
    numerosUnicos.add(6)

    // Removendo um número do conjunto
    numerosUnicos.remove(3)

    // Filtrando números pares de uma lista
    val numerosParesEx2 = numeros.filter { it % 2 == 0 }

    // Dobrando cada elemento de uma lista
    val numerosDobrados = numeros.map { it * 2 }

    //OPERADORES ARITMÉTICOS
    val a = 18
    val b = 5
    val soma = a + b
    val subtracao = a - b
    val multiplicacao = a * b
    val divisao = a / b
    val modulo = a % b

    //OPERADORES RELACIONAIS
    val x = 10
    val y = 5
    val igual = x == y
    val diferente = x != y
    val maior = x > y
    val menor = x < y
    val maiorIgual = x >= y
    val menorIgual = x <= y

    //OPERADORES LÓGICOS
    val p = true
    val q = false
    val and = p && q
    val or = p || q
    val not = !p

    val numero1 = 10
    if (numero1 > 0) { println("O número é positivo")}

    val numero2 = -5
    if (numero2 > 0) {
        println("O número é positivo")
    } else if (numero2 < 0) {
        println("O número é negativo")
    } else { println("O número é zero")}

    val numero = -5
    val tipo = if (numero >= 0) "positivo" else "negativo"
    println("O número é $tipo")

    for (i in 1..5 step 1) {
        println(i)
    }

    var contador = 0
    while (contador < 5) {
        println(contador)
        contador++
    }

    var i = 0
    do {
        println(i)
        i++
    } while (i < 5)

    val meuCarro = Carro()
    meuCarro.modelo = "Toyota"
    meuCarro.cor = "Prata"
    println("Modelo: ${meuCarro.modelo}, Cor: ${meuCarro.cor}")
    meuCarro.acelerar()
    println("Velocidade após acelerar: ${meuCarro.velocidade}")
    meuCarro.frear()
    println("Velocidade após frear: ${meuCarro.velocidade}")
}

fun calcularMedia (numeros: IntArray): Double {
    var soma = 0

    for (numero in numeros){
        soma+=numero
    }
    return soma.toDouble()/numeros.size
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

fun factorial(n: Int): Int {
    return if (n == 0) 1 else n * factorial(n - 1)
}

class Carro {
    var modelo: String = ""
    var cor: String = ""
    var velocidade: Int = 0
    fun acelerar() {
        velocidade += 10
    }
    fun frear() {
        velocidade -= 5
    }
}