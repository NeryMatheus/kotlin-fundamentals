package estruturada

fun main(args: Array<String>) {
    val list = listOf(
        1,2,3,4,5,6
    )

//    val arrayList = arrayListOf(
//        1,2,3,4,5,6
//    )
    val mutableList = mutableListOf(
        1,2,3,4,5,6
    )

    mutableList.add(7)
    println(mutableList[6])

    printarTodosOsElementos(mutableList)
}

fun printarTodosOsElementos (lista: List<Int>)
{
    lista.forEachIndexed {index, i ->
        println("Index: $index e valor: $i")
    }
}