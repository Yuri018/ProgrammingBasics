package ait.cars.test;

import ait.cars.dao.Garage;
import ait.cars.dao.GarageImpl;
import ait.cars.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GarageTest {

    private Garage garage;
    private Car[] cars;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Audi("a001aa", "A6", "Audi", 2500, "red");
        cars[1] = new Mercedes("m002mm", "E124", "Mercedes", 3000, "white");
        cars[2] = new Toyota("t003tt", "Corolla", "Toyota", 2000, "white");
        cars[3] = new VW("v004vv", "Caravan", "VW", 2300, "green");

        for (Car car : cars) {
            garage.addCar(car);
//            System.out.println(car);
        }
    }

    @Test
    void addCar() {
        assertFalse(garage.addCar(null));
        assertFalse(garage.addCar(cars[1]));
        Car car = new Toyota("t005tt", "Carina", "Toyota", 1800, "silver");
        assertTrue(garage.addCar(car));
        assertEquals(5, garage.quantity());
        car = new Mercedes("m006mm", "W220", "Mercedes", 5000, "black");
        assertFalse(garage.addCar(car));
    }

    @Test
    void removeCar() {
        Car car = garage.removeCar("a001aa");
        assertEquals(cars[0], car);
        assertEquals(3,garage.quantity());
        assertNull(garage.removeCar("a001aa"));

    }

    @Test
    void findCarByRegNumber() {
        Car findCarByRegNumber = garage.findCarByRegNumber("m002mm");
        assertEquals(findCarByRegNumber, garage.findCarByRegNumber("m002mm"));
        findCarByRegNumber = garage.findCarByRegNumber("l008ll");
        assertNull(findCarByRegNumber);
    }
    @Test
    void findCarsByModel() {
        Car[] actual = garage.findCarsByModel("Caravan");
        Car[] expected = {new VW("v004vv", "Caravan", "VW", 2300, "green")};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByCompany() {
        Car[] actual = garage.findCarsByCompany("Toyota");
        Car[] expected = {cars[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByEngine() {
        Car[] actual = garage.findCarsByEngine(2100, 2600);
        Car[] expected = {cars[0], cars[3]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByColor() {
        Car[] actual = garage.findCarsByColor("white");
        Car[] expected = {cars[1], cars[2]};
        assertArrayEquals(expected, actual);
    }
}