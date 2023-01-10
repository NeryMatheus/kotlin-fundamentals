fun main() {
    val hashSet = hashSetOf<Int>(1,2,3,4)
    val sortedSet = sortedSetOf(1,2,3,4)
    val linkedSet = linkedSetOf<Int>(1,2,3,4)

    hashSet.add(5)
    printAllElements(linkedSet)
}

fun printAllElements(set: Set<Int>){
    println(set.joinToString(", "))
}