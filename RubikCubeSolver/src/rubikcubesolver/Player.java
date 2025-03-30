package rubikcubesolver;

import rubikcube.RubikCube;
import rubikcube.RubikCubeRowBuilder;
import rubikcube.helpers.Printer;

import java.util.Scanner;

public class Player {
    public static void main(String[] args) {
        RubikCube cube = new RubikCube();
        cube.rowBuilder = RubikCube.getStandardRubikCube();
        cube.rowBuilder.setSideFromFace();
        cube.rowBuilder.setTopFromFace();
        cube.build();
        System.out.println("First cube");
        Printer.print(cube);

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter move (e.g., t c, f cc) or 'exit' to quit: ");
            input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) break;

            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Invalid input. Use format: <face> <c/cc>");
                continue;
            }

            String face = parts[0];
            String direction = parts[1];

            switch (face) {
                case "f": if (direction.equals("c")) cube.rotateFaceClockwise();
                else if (direction.equals("cc")) cube.rotateFaceAntiClockwise(); break;
                case "b": if (direction.equals("c")) cube.rotateBackClockwise();
                else if (direction.equals("cc")) cube.rotateBackAntiClockwise(); break;
                case "r": if (direction.equals("c")) cube.rotateRightClockwise();
                else if (direction.equals("cc")) cube.rotateRightAntiClockwise(); break;
                case "l": if (direction.equals("c")) cube.rotateLeftClockwise();
                else if (direction.equals("cc")) cube.rotateLeftAntiClockwise(); break;
                case "t": if (direction.equals("c")) cube.rotateTopClockwise();
                else if (direction.equals("cc")) cube.rotateTopAntiClockwise(); break;
                case "bt": if (direction.equals("c")) cube.rotateBottomClockwise();
                else if (direction.equals("cc")) cube.rotateBottomAntiClockwise(); break;
                default: System.out.println("Invalid face. Use f, b, r, l, t, or bt.");
            }
            Printer.print(cube);
        } while (true);

        scanner.close();
        System.out.println("Program exited.");

    }
}
