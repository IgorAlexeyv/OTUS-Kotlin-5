package ru.otus.cars

interface Tank{
    //val mouth: TankMouth
    //var fuelLevel : Int
    fun getContents(): Int
    fun recieveFuel(literes: Int)
}

abstract class TankMouth() : Tank{
    private enum class State{ OPEN, CLOSE }
    private var cap : State = State.CLOSE
    var fuelLevel : Int = 0
    protected fun open() {cap = State.OPEN}
    protected fun close() {cap = State.CLOSE}
    override fun getContents(): Int = fuelLevel
    class PetrolMouth : TankMouth(){
        override fun recieveFuel(literes: Int){
            open()
            fuelLevel = literes
            println("Заправка бензином, принято ${literes.toString()} литров")
            close()
        }
    }
    class LpgMouth : TankMouth() {
        override fun recieveFuel(literes: Int){
            open()
            println("Заправка газом, принято ${literes.toString()} литров")
            fuelLevel = literes
            close()
        }
    }
}
