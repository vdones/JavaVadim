package JavaCourse.Vehicles;

public class DaciaLogan extends Car {

    //Constructor gearCount = 5
    public DaciaLogan(int distance, int currentGear) {
        super(distance, 5, currentGear);
    }

    @Override
    public int fuel() {
        return 1;
    }
}
