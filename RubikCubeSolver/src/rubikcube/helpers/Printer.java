package rubikcube.helpers;

import rubikcube.RubikCube;

import java.util.Scanner;

public class Printer {
    public static String reverse(String s) {
        /**
         * 1 2 3
         * 4 5 7
         *
         * 3 2 1
         * 7 5 4
         */
        Scanner sc = new Scanner(s);
        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();

        return new StringBuilder(first).reverse().toString() + "\n"
                + new StringBuilder(second).reverse().toString() + "\n"
                + new StringBuilder(third).reverse().toString();
    }
    public static void print(RubikCube rubikCube) {
        String emptySpace = "      " + "\n" +"      " + "\n" +"      " + "\n";
        System.out.println(addBeforeAndAfter(emptySpace, reverse(reverseRows(rubikCube.top1.toString())), emptySpace));

        System.out.println(addBeforeAndAfter(reverse(reverseColumnRows(rubikCube.side1.toString())), rubikCube.face1.toString(), reverseColumnRows(rubikCube.side3.toString())));

        System.out.println(addBeforeAndAfter(emptySpace, reverse(rubikCube.top3.toString()), emptySpace));

        System.out.println(addBeforeAndAfter(emptySpace, rubikCube.face3.toString(), emptySpace));
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

    public static String reverseColumnRows(String s) {
        /**
         * 'n n n' \n 'p p p' \n 't t t'
         */

        Scanner sc1 = new Scanner(s);
        String first = sc1.nextLine();
        String second = sc1.nextLine();
        String third = sc1.nextLine();

        return first.toCharArray()[0] + " " + second.toCharArray()[0] + " " + third.toCharArray()[0] + "\n"
                + first.toCharArray()[2] + " " + second.toCharArray()[2] + " " + third.toCharArray()[2] + "\n"
        + first.toCharArray()[4] + " " + second.toCharArray()[4] + " " + third.toCharArray()[4] + "\n";
    }

    public static String reverseRows(String s) {
        /**
         * 3 4
         * 33
         * 45 will be
         * 45
         * 33
         * 34
         */

        Scanner sc1 = new Scanner(s);
        String first = sc1.nextLine();
        String second = sc1.nextLine();
        String third = sc1.nextLine();

        return third + "\n" +
                second + "\n" +
                first + "\n";

    }
}
