fun main() {
    var car : vechicle = offroadvehicle(specialdrive())
    var car2 : vechicle = nomaldrivevehicle(normaldrive())
    car.drive()
    car2.drive()
}
interface driveStrategy {
   open fun drive(){}
}
class  normaldrive : driveStrategy{
    override fun drive() {
        super.drive()
        println("this is normal drive.....")
    }
}
class  specialdrive  : driveStrategy{
    override fun drive() {
        super.drive()
        println("this is special drive.....")
    }
}
open class vechicle {
    var obj : driveStrategy
    // constructor injection
    constructor(  obj: driveStrategy){
        this.obj  = obj
    }
    fun drive()
    {
        obj.drive()
    }
}
class offroadvehicle(obj: driveStrategy) : vechicle(obj)
class nomaldrivevehicle(obj: driveStrategy) : vechicle(obj)