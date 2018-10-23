package JavaProblemSolving;

public class Triangle {

    //First variant
    public static void triangleCenter(int rowsNumber) {

        for (int i = 0; i <= rowsNumber; i++) {

            //pre-spacing
            for (int j = rowsNumber - i; j > 0; j--)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("# ");
            System.out.println();

        }
    }


    //Second variant
    public static void triangleLeft(int rowsNumber) {

        for (int i = 0; i <= rowsNumber; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("#");
            System.out.println();
        }
    }

}
