package estruturada

import java.text.SimpleDateFormat
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

fun main() {
    val date = Date()
    val localDate = LocalDate.now()
    val localDateTime = LocalDateTime.now()

//    Como parsear de String para data
    var yesterday = LocalDate.from(DateTimeFormatter.ofPattern("dd/MM/yyyy").parse("20/11/2021"))
    var yesterdayTime = LocalDateTime.from(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").parse("20/11/2021 04:00"))
    val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")

    var yesterdayDate = simpleDateFormat.parse("20/11/2021")

    println(yesterday)
    println(yesterdayTime)
    println(yesterdayDate)

//    Como formatar a data de forma desejada?
    val simpleDateFormat2 = SimpleDateFormat("yyyyMMdd")
    println(DateTimeFormatter.ofPattern("yyyyMMdd").format(yesterday))
    println(DateTimeFormatter.ofPattern("yyyyMMddHHmm").format(yesterdayTime))
    println(simpleDateFormat2.format(yesterdayDate))

//    Fazendo operações com datas

    //Somar
    println("Somando Datas")
    yesterday = yesterday.plusDays(7)
    println(yesterday)

    yesterdayDate = Date(yesterdayDate.toInstant().plus(3, ChronoUnit.DAYS).toEpochMilli())
    println(yesterdayDate)

    //Comparação de datas
    println("Comparando Datas")
    println(yesterday.isAfter(yesterdayTime.toLocalDate()))
    println(yesterdayTime.isAfter(yesterday.atStartOfDay()))
    println(date.after(yesterdayDate))

    //Comparação dia da semana
    println("Comparando dias da Semana")
    while(yesterday.dayOfWeek == DayOfWeek.SUNDAY || yesterday.dayOfWeek == DayOfWeek.SATURDAY) {
        yesterday = yesterday.plusDays(1)
    }
    println(yesterday)

    Calendar.getInstance().time = yesterdayDate
    println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))

}