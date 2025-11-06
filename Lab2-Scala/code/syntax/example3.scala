var total = 0
println(s"Start: $total")

for (element <- (1 to 100))
    total += element
    
println(s"End: $total")
