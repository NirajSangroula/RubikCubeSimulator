package rubikcube.helpers;

import rubikcube.RubikCube;

import java.util.Scanner;

public class Printer {
    public static void print(RubikCube rubikCube) {
        String emptySpace = "      " + "\n" +"      " + "\n" +"      " + "\n";
        System.out.println(addBeforeAndAfter(emptySpace, rubikCube.face3.toString(), emptySpace));
        System.out.println(addBeforeAndAfter(emptySpace, rubikCube.top1.toString(), emptySpace));

        System.out.println(addBeforeAndAfter(rubikCube.side1.toString(), rubikCube.face1.toString(), rubikCube.side3.toString()));

        System.out.println(addBeforeAndAfter(emptySpace, rubikCube.top3.toString(), emptySpace));
    }

    public static String addBeforeAndAfter(String q, String r, String s) {
        Scanner sc1 = new Scanner(q);
        Scanner sc2 = new Scanner(r);
        Scanner sc3 = new Scanner(s);
        String nString = "";
        while(sc1.hasNextLine()) {
            nString += sc1.nextLine() + "   " + sc2.nextLine() + "   " + sc3.nextLine() + "\n";
        }
        return nString;
    }
}
