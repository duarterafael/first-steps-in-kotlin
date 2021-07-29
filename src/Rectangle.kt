//To define a class, use the class keyword.
class Rectangle (var height: Double, var length: Double): Shape() {//Inheritance between classes is declared by a colon (:). Classes are final by default; to make a class inheritable, mark it as open.
    var perimeter = (height + length) * 2////roperties of a class can be listed in its declaration or body.
}