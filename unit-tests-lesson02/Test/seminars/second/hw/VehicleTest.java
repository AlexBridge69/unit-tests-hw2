package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
// В машинах и мотоциклах не разбираюсь. В полях писал более менее подходящую по смыслу околесицу.

    // Проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("MAF", "Volga", 1945);
        assertTrue(car instanceof Vehicle);
    }

    //  проверка того, объект Car создается с 4-мя колесами
    @Test
    public void testCarHas4Wheels() {
        Car car = new Car("Mercedes", "A-class", 1999);
        assertEquals(4, car.getNumWheels());
    }

    // проверка того, объект Motorcycle создается с 2-мя колесами.
    @Test
    public void testMotoHas2Wheels() {
        Motorcycle moto = new Motorcycle("Harley-Davidson", "1st model", 1939);
        assertEquals(2, moto.getNumWheels());
    }

//    проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    public void testCarSpeedDriving() {
        Car car = new Car("Mercedes", "A-class", 1999);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

//    проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    public void testMotoSpeedDriving() {
        Motorcycle moto = new Motorcycle("Harley-Davidson", "1st model", 1939);
        moto.testDrive();
        assertEquals(75, moto.getSpeed());
    }

    /**
    Проверить, что в режиме парковки
    (сначала testDrive, потом park, т.е эмуляция движения транспорта)
    машина останавливается (speed = 0).
    */
    @Test
    public void testCarPark() {
        Car car = new Car("Mercedes", "A-class", 1999);
        car.testDrive();
        assertEquals(60, car.getSpeed());
        car.park();
        assertEquals(0, car.getSpeed());
    }

    /**
    Проверить, что в режиме парковки
    (сначала testDrive, потом park т.е эмуляция движения транспорта)
    мотоцикл останавливается (speed = 0).
     */
    @Test
    public void testMotoPark() {
        Motorcycle moto = new Motorcycle("Harley-Davidson", "1st model", 1939);
        moto.testDrive();
        assertEquals(75, moto.getSpeed());
        moto.park();
        assertEquals(0, moto.getSpeed());
    }
}