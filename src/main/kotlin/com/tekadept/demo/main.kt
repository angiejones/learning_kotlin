fun main(args: Array<String>){
    println("hello world")

    /** Type Inference **/

    //val is for constants (immutable variables)
    val aSentence = "I'm a String" //semicolon not required
    val pi = 3.14
    val answer = 42

    //var is for mutable variables
    var changeMe = 0

    //If not initialized, type is required
    var aString: String
    val aDouble: Double
    val anInt: Int

    //More examples
    var myDouble = 1.999
    var myFloat = 1.9F
    var myLong = 1927373732929L
    var myInt = 199
    var myShort: Short = 12
    var myByte: Byte = 127
    val aLongNumber = 123_456_789 //underscores for readability
    val theSameNumber = 123456789

}