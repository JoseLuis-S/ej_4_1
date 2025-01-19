class Rectangulo(val base: Double, val altura: Double) {
    init {
        require(base > 0) { "La base debe ser mayor a 0." }
        require(altura > 0) { "La altura debe ser mayor a 0." }
    }

    private fun area(base: Double, altura: Double): Double = base * altura
    private fun perimetro(base: Double, altura: Double): Double = (base + altura) * 2

    override fun toString(): String {
        return "Altura = $altura \nBase = $base \nArea = ${area(base, altura)}\nPerimetro = ${perimetro(base, altura)}"
    }
}

fun main() {
    val rectangulo1 = Rectangulo(5.0, 3.0)
    val rectangulo2 = Rectangulo(3.0, 4.0)
    val rectangulo3 = Rectangulo(6.0, 5.0)
    println("Rectangulo 1:\n${rectangulo1}\n")
    println("Rectangulo 2:\n${rectangulo2}\n")
    println("Rectangulo 3:\n${rectangulo3}\n")
}