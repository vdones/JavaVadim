package JavaCourse.Vehicles;

public class Main {

    public static void main(String[] args) {

        DaciaLogan daciaLogan = new DaciaLogan(100, 4);
        MountainBike mountainBike = new MountainBike(20, 3);
        daciaLogan.move();
        mountainBike.move();

    }

}
