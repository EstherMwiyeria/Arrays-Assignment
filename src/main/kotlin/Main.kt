fun main() {
    ladies("Jem","Ess","Alexa","Samantha")
    variousCities()
    addition()
    println(vehicles("Subaru Impreza","Toyota Vanguard","Landcruiser VX"))
}
fun ladies(girl1: String,girl2: String,girl3: String,girl4: String) {
    var l = arrayOf(girl1, girl2,girl3,girl4)
    println(l.contentToString())
}
fun variousCities() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    for (city in cities ) {
        println(city.capitalize())
    }
}
fun addition() {
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numbers[1] + numbers[4]
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun vehicles(x: String,y: String,z: String): String{
    var carTypes = arrayOf(x, y, z)
    return carTypes.contentToString()
}

