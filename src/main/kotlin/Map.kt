import kotlin.random.Random
import kotlin.system.measureNanoTime

fun main () {
    val map1 = mapOf(
        1 to "Muito Ruim",
        2 to "Ruim",
        3 to "Razoável",
        4 to "Bom",
        5 to "Muito Bom",
//        5 to "Muito Bom2",
    )
    println(map1.get(1))

    val mutable1 = mutableMapOf(
        1 to "Muito Ruim",
        2 to "Ruim",
        3 to "Razoável",
        4 to "Bom",
    )
    mutable1[5] = "Muito Bom"
    println(mutable1)

//    ==============================================================================
    var listaCodigos = Array(100000) { Random.nextInt(1,6)}
    val listMap = listOf(
        Pair(1, "Muito Ruim"),
        Pair(2, "Ruim"),
        Pair(3, "Bom"),
        Pair(4, "Razoável"),
        Pair(5, "Muito Bom"),
    )

    val time1 = measureNanoTime {
        for (codigo in listaCodigos) {
            val categoria = listMap.find { it.first == codigo }!!
            categoria.second
        }
    }
    println(time1)

    val time2 = measureNanoTime {
        for (codigo in listaCodigos) {
            val categoria = map1[codigo]
            categoria
        }
    }
    println(time2)
}