package JavaCourse.Vehicles;

public abstract class Car extends WheelVehicle implements FuelVehicle {

    //Constructor with wheelCount = 4
    public Car(int distance, int gearCount, int currentGear) {
        super(4, distance, gearCount, currentGear);
    }

    //Override move()
    @Override
    public void move(int currentGear) {
        if (fuel() > 0) super.move(currentGear);

    }
}
