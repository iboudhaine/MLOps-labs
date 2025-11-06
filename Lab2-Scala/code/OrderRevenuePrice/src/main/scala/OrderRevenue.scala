import scala.io.Source

object OrderRevenue {
  def main(args: Array[String]): Unit = {
    val productId = args(1).toInt 
    
    val orderItems = Source.fromFile("part-00000").getLines()

    val orderRevenue = orderItems
      .filter(line => line.split(",")(1).toInt == productId)
      .map(line => line.split(",")(4).toFloat)
      .reduce((total, price) => total + price)

    println(s"Total revenue for product ID $productId is: $orderRevenue")
  }
}
