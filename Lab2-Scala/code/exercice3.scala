import scala.io.Source

object Main extends App {
  val orderItems = Source.fromFile("data/part-00000").getLines.toList
  val orderItemsFilter = orderItems.filter(orderItem => orderItem.split(",")(1).toInt == 2)
  val orderItemsMap = orderItemsFilter.map(orderItem => orderItem.split(",")(4).toFloat)
  val totalRevenue = orderItemsMap.reduce((total, element) => total + element)

  println(s"Total revenue for product ID 2 is: $totalRevenue")
}