//Main and Hello world!
//fun main() {
//    println("Hello world!")
//}

//String args
//fun main(args: Array<String>) {
//    println(args.contentToString())
//}

//Print cmd
//fun main() {
//    print("Hello world!")
//    println(42)
//}

//Function no arg and no return
//fun notArgsAndNoReturn(): Unit {//Unit (Void) return type can be omitted.
//    println("no arg and no return")
//    return
//    println("After return")
//}
//
//fun withArgsAndNoReturn(x: Int, y: Double): Unit {
//    var z = x + y
//    println("${z}")
//}
//
//fun noArgsAndWithReturn(): Double {
//    val x = 10
//    val y = 20.44
//    var z = x + y
//    println("${z}")
//    return z
//}
//
//fun withArgsAndWithReturn(x: Int, y: Double): Double {
//    var z = x + y
//    println("${z}")
//    return z
//}
//
//fun main() {
//    notArgsAndNoReturn()
//    withArgsAndNoReturn(1, 20.33)
//    println(noArgsAndWithReturn())
//    println(withArgsAndWithReturn(10, 10.toDouble()))
//}

//Variable
//Read-only local variables are defined using the keyword val. They can be assigned a value only once.
//Variables that can be reassigned use the var keyword.

//    fun main() {
//        val a: Int = 1  // immediate assignment
//        val b = 2   // `Int` type is inferred
//        val c: Int  // Type required when no initializer is provided
//        c = 3       // deferred assignment
//        println("a = $a, b = $b, c = $c")
//        var x = 5 // `Int` type is inferred
//        x += 1
//        println("x = $x")
//    }

//You can declare variables at the top level.
//val PI = 3.14
//var x = 0
//
//fun incrementX() {
//    x += 1
//}
//
//fun main() {
//    println("x = $x; PI = $PI")
//    incrementX()
//    println("incrementX()")
//    println("x = $x; PI = $PI")
//}
//

//And below too
//fun incrementX() {
//    x += 1
//}
//
//fun main() {
//    println("x = $x; PI = $PI")
//    incrementX()
//    println("incrementX()")
//    println("x = $x; PI = $PI")
//}
//
//val PI = 3.14
//var x = 0

//Class
//fun main() {
//    val rectangle = Rectangle(5.0, 2.0)
//    println("The perimeter is ${rectangle.perimeter}")
//}

//String
//fun main() {
//    var a = 1
//    // simple name in template:
//    val s1 = "a is $a"
//
//    a = 2
//    // arbitrary expression in template:
//    val s2 = "${s1.replace("is", "was")}, but now is $a"
//    println(s2)
//}

//Conditional expressions

//fun maxOf(a: Int, b: Int): Int {
//    if (a > b) {
//        return a
//    } else {
//        return b
//    }
//    //fun maxOf(a: Int, b: Int) = if (a > b) a else b
//}
//
//fun main() {
//    println("max of 0 and 42 is ${maxOf(0, 42)}")
//}

//Loops
//For

//fun main() {
//    val items = listOf("apple", "banana", "kiwifruit")
//    for (item in items) {
//        println(item)
//    }
//    //Like array
//    for (index in items.indices) {
//        println("item at $index is ${items[index]}")
//    }
//}

//While
//fun main() {
//    val items = listOf("apple", "banana", "kiwifruit")
//    var index = 0
//    while (index < items.size) {
//        println("item at $index is ${items[index]}")
//        index++
//    }
//}

//when expression

//fun describe(obj: Any): String =
//    when (obj) {
//        1          -> "One"
//        "Hello"    -> "Greeting"
//        is Long    -> "Long"
//        !is String -> "Not a string"
//        else       -> "Unknown"
//    }
//
//fun main() {
//    println(describe(1))
//    println(describe("Hello"))
//    println(describe(1000L))
//    println(describe(2))
//    println(describe("other"))
//}

//Ranges

//Check if a number is within a range using in operator.
//fun main() {
//    val x = 10
//    val y = 9
//    if (x in 1..y+1) {
//        println("fits in range")
//    }
//}

//Check if a number is out of range.
//fun main() {
//    val list = listOf("a", "b", "c")
//
//    if (-1 !in 0..list.lastIndex) {
//        println("-1 is out of range")
//    }
//    if (list.size !in list.indices) {
//        println("list size is out of valid list indices range, too")
//    }
//}

//Iterate over a range.

//fun main() {
//    for (x in 1..5) {
//        print(x)
//    }
//}

//Or over a progression.

//fun main() {
//    for (x in 1..10 step 2) {
//        print(x)
//    }
//    println()
//    for (x in 9 downTo 0 step 3) {
//        print(x)
//    }
//}

//Collections
//Iterate over a collection.

//fun main() {
//    val items = listOf("apple", "banana", "kiwifruit")
//    for (item in items) {
//        println(item)
//    }
//}

//Check if a collection contains an object using in operator.

//fun main() {
//    val items = setOf("apple", "banana", "kiwifruit")
//    when {
//        "orange" in items -> println("juicy")
//        "apple" in items -> println("apple is fine too")
//    }
//}

//Using lambda expressions to filter and map collections:
//fun main() {
//    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
//    fruits
//        .filter { it.startsWith("a") }
//        .sortedBy { it }
//        .map { it.toUpperCase() }
//        .forEach { println(it) }
//}

//Nullable values and null checks
//A reference must be explicitly marked as nullable when null value is possible. Nullable type names have ? at the end.
//Return null if str does not hold an integer:
//fun parseInt(str: String): Int? {
//    // ...
//}

//fun parseInt(str: String): Int? {
//    return str.toIntOrNull()
//}
//
//fun printProduct(arg1: String, arg2: String) {
//    val x = parseInt(arg1)
//    val y = parseInt(arg2)
//
//    // Using `x * y` yields error because they may hold nulls.
//    if (x != null && y != null) {
//        // x and y are automatically cast to non-nullable after null check
//        println(x * y)
//    }
//    else {
//        println("'$arg1' or '$arg2' is not a number")
//    }
//}
//
//fun main() {
//    printProduct("6", "7")
//    printProduct("a", "7")
//    printProduct("a", "b")
//}

//Type checks and automatic casts
//The is operator checks if an expression is an instance of a type.
// If an immutable local variable or property is checked for a specific type, there's no need to cast it explicitly:
//fun getStringLength(obj: Any): Int? {
//    if (obj is String) {
//        // `obj` is automatically cast to `String` in this branch
//        return obj.length
//    }
//
//    // `obj` is still of type `Any` outside of the type-checked branch
//    return null
//}
//
//fun main() {
//    fun printLength(obj: Any) {
//        println("Getting the length of '$obj'. Result: ${getStringLength(obj) ?: "Error: The object is not a string"} ")
//    }
//    printLength("Incomprehensibilities")
//    printLength(1000)
//    printLength(listOf(Any()))
//}

//OR

//fun getStringLength(obj: Any): Int? {
//    if (obj !is String) return null
//
//    // `obj` is automatically cast to `String` in this branch
//    return obj.length
//}
//
//fun main() {
//    fun printLength(obj: Any) {
//        println("Getting the length of '$obj'. Result: ${getStringLength(obj) ?: "Error: The object is not a string"} ")
//    }
//    printLength("Incomprehensibilities")
//    printLength(1000)
//    printLength(listOf(Any()))
//}

//or even
//
//fun getStringLength(obj: Any): Int? {
//    // `obj` is automatically cast to `String` on the right-hand side of `&&`
//    if (obj is String && obj.length > 0) {
//        return obj.length
//    }
//
//    return null
//}
//
//fun main() {
//    fun printLength(obj: Any) {
//        println("Getting the length of '$obj'. Result: ${getStringLength(obj) ?: "Error: The object is not a string"} ")
//    }
//    printLength("Incomprehensibilities")
//    printLength("")
//    printLength(1000)
//}