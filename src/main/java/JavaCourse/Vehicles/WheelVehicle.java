package JavaCourse.Vehicles;

public abstract class WheelVehicle implements Vehicle {
    private int wheelCount;
    private int distance;
    private int gearCount;
    private int currentGear;

    //Constructor with all parametrises
    public WheelVehicle(int wheelCount, int distance, int gearCount, int currentGear) {
        this.wheelCount = wheelCount;
        this.distance = distance;
        this.gearCount = gearCount;
        this.currentGear = currentGear;
    }

    //Overload constructor cause wheelCount
    public WheelVehicle(int distance, int gearCount, int currentGear) {
        this.distance = distance;
        this.gearCount = gearCount;
        this.currentGear = currentGear;
    }

    //Implement move()
    public void move() {
        move(currentGear);
    }

    //Define move()
    public void move(int currentGear){
        System.out.println("You are moving with " + currentGear + " gear");
    }
}
