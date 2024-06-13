package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class VehicleTest {

    @Test
    void carIsVehicle (){
        Car car = new Car("NYC", "X", 2000);

        if (car instanceof Vehicle){
            System.out.println("экземпляр объекта Car также является экземпляром транспортного средства");
        }
        else {
            System.out.println("! - экземпляр объекта Car НЕ является экземпляром транспортного средства");
        }
    }

    @Test
    void doesTheCarHaveFourWheels(){
        Car car = new Car("NYC", "X", 2000);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void doesTheMotorcycleHaveTwoWheels(){
        Motorcycle motorcycle = new Motorcycle("MC", "BFG", 1992);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void doesTheCarHaveActualSpeed() {
        Car car = new Car("NYC", "X", 2000);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void doesTheMotorcycleHaveActualSpeed() {
        Motorcycle motorcycle = new Motorcycle("MC", "BFG", 1992);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void doesTheCarHaveActualStopSpeed() {
        Car car = new Car("NYC", "X", 2000);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void doesTheMotorcycleHaveActualStopSpeed() {
        Motorcycle motorcycle = new Motorcycle("MC", "BFG", 1992);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}