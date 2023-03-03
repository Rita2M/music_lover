fun main() {
    val purchaseAmount =12000
    val statusShopper = false
    val discount1 = (purchaseAmount - 100)  //1000 до 10000  -100р
    val discount2 = purchaseAmount - ((purchaseAmount * 5) / 100) // от 10000 тыс -5%
    var regularShopper =   purchaseAmount - ((purchaseAmount * 1) / 100)  // -1 %
     if (purchaseAmount > 1000 && purchaseAmount <= 10000) {
         regularShopper = discount1 - ((discount1 * 1) / 100)
     } else if (purchaseAmount > 10000) {
         regularShopper = discount2 - ((discount2 * 1)/ 100)
     }
    var newShopper = purchaseAmount
    if (purchaseAmount > 1000 && purchaseAmount <= 10000) {
       newShopper = discount1
    } else if (purchaseAmount > 10000) {
        newShopper = discount2
    }
    val finalAmount = if (statusShopper) regularShopper else  newShopper
    println(finalAmount)
}