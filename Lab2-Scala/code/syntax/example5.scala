var lb = 1
val ub = 100
var totalEven = 0
var totalOdd = 0
while (lb <= ub) {
    if (lb % 2 == 0)
        totalEven += lb
    else
        totalOdd += lb
    lb += 1
}

println(s"Final totalEven: $totalEven")
println(s"Final totalOdd: $totalOdd")
