class Order(var orderId: Int, var orderDate: String, var orderCustomerId: Int, var orderStatus: String) {
    println("Je suis dans le constructeur")
    override def toString = "Order("+ orderId+ ","+ orderDate + ","+ orderCustomerId + ","+ orderStatus +")"
}

object Main extends App {
  // 'extends App' to make code runnable.
  var order = new Order(1, "2013-10-01 00:00:00.00", 100, "COMPLETE")
  order.orderId = 2 
  println(order.orderId) 
}
