package ru.otus.cars

class FuelStation {
    fun reFuel(cars: List<Car>){
        for(car in cars){

            try {
                println("Заправляем машину с номером:")
                println(car.plates.toString())
            } catch ( e: NotImplementedError ) {
                println(e.toString())
            }

            try {
                println("Уровень топлива до заправки:")
                println(car.carOutput.getFuelContents().toString())
            } catch ( e: NotImplementedError ) {
                println(e.toString())
            }

            try {
                car.tank.recieveFuel(20)
            } catch ( e: Exception ) {
                println(e.toString())
            }

            try {
                println("Уровень топлива после заправки:")
                println(car.carOutput.getFuelContents().toString())
            } catch ( e: NotImplementedError ) {
                println(e.toString())
            }

        }
    }
}