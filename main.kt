import java.text.DecimalFormat
fun main(){
    val tax = .025
    val tip = .175
    var cost = 0.0
    val form = DecimalFormat("$###,###.00")


    do{
        println("Enter item price (Enter 0 to finish)")
        var price = readLine()!!.toDouble()
        cost += price

    } while (price != 0.0)


    var total = cost
    var yourTax = (total * tax)
    var totalTaxed = (total + yourTax)
    var tipped = totalTaxed * tip
    var grandTotal = totalTaxed + tipped

    var totalForm = form.format(total)
    var yourTaxForm = form.format(yourTax)
    var totalTaxedForm = form.format(totalTaxed)
    var tippedForm = form.format(tipped)
    var grandTotalForm = form.format(grandTotal)

    println("Item total: $totalForm")
    println("Tax: $yourTaxForm")
    println("Total with Tax: $totalTaxedForm")
    println("Recommended tip: $tippedForm")
    println("Total with tip: $grandTotalForm")
}