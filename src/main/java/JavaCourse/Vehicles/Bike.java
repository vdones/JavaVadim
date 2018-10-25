package JavaCourse.Vehicles;

public abstract class Bike extends WheelVehicle {


    private int wheelDiameter;

    //Constructor with all parametrises
    public Bike(int wheelCount, int distance, int gearCount, int currentGear, int wheelDiameter) {
        super(wheelCount, distance, gearCount, currentGear);
        this.wheelDiameter = wheelDiameter;
    }

    //Overload constructor cause wheelDiameter
    public Bike(int wheelCount, int distance, int gearCount, int currentGear) {
        super(wheelCount, distance, gearCount, currentGear);
    }

}
