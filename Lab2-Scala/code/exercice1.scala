def sum2(func: Int => Int, lb: Int, ub: Int) = {
    var total = 0
    for (element <- lb to ub) {
        total += func(element)
    }
    total
}

// The Actions (Functions to be passed as parameters)

// 1. A function that squares an integer
def square(i: Int) = i * i

// 2. A function that cubes an integer
def cube(i: Int) = i * i * i

// 3. A function that doubles an integer
def double(i: Int) = i * 2


// Verification Tests

println("--- Running Verification ---")

// Test 1: Sum of Squares from 1 to 3 (1*1 + 2*2 + 3*3 = 14)
val expected_squares = 14
val result_squares = sum2(square, 1, 3)
println(s"Sum of squares from 1 to 3 is: $result_squares")
if (result_squares != expected_squares) {
    println(s"  -> Error: Expected $expected_squares.")
}

// Test 2: Sum of Cubes from 1 to 3 (1*1*1 + 2*2*2 + 3*3*3 = 36)
val expected_cubes = 36
val result_cubes = sum2(cube, 1, 3)
println(s"Sum of cubes from 1 to 3 is: $result_cubes")
if (result_cubes != expected_cubes) {
    println(s"  -> Error: Expected $expected_cubes.")
}

// Test 3: Sum of Doubles from 1 to 3 (1*2 + 2*2 + 3*2 = 12)
val expected_doubles = 12
val result_doubles = sum2(double, 1, 3)
println(s"Sum of doubles from 1 to 3 is: $result_doubles")
if (result_doubles != expected_doubles) {
    println(s"  -> Error: Expected $expected_doubles.")
}

println("--- Verification Complete ---")
