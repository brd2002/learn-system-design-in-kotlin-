import java.awt.Shape

class student(){
   private lateinit var name : String
   private var age : Int = 0

    constructor(name: String, age: Int) : this() {
        this.name = name
        this.age = age
    }
}
interface  shape{
    fun area(): Double
}
class Rectangle (val width : Double , val height : Double) : shape{
    override fun area(): Double {
        return width*width
    }

}
class Marker{
    private lateinit var name : String
    public lateinit var color : String
    public var year : Int = 0
    public var price : Int = 0
    constructor(name: String , color :String , year : Int , price : Int){
        this.name = name
        this.year = year
        this.price = price
        this.color = color
    }
}
fun main (){
//    var  bharat = student("bharat ruidas " , 10)
    var bluemarker = Marker("camel" , "black" , 2002 , 40)
    println(bluemarker.year)
}