package estruturada

import java.math.BigDecimal

fun main () {
    val precoDosProdutos = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )
    val precoDosProdutos1 = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("41.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )
    val precoDosProdutos2 = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("51.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )
    val precoProduto = somarPrecoProdutos(precoDosProdutos)
    val precoProduto1 = somarPrecoProdutos(precoDosProdutos1)
    val precoProduto2 = somarPrecoProdutos(precoDosProdutos2)

    println("Preço Total: $precoProduto")
    println("Preço Total 1: $precoProduto1")
    println("Preço Total 2: $precoProduto2")
}

fun somarPrecoProdutos(produtos: Array<BigDecimal>): BigDecimal{
    var precoTotal = BigDecimal.ZERO
    for (preco in produtos) {
        precoTotal += preco
    }

    return precoTotal
}