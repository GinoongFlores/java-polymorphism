package nine_handson_activity;

import java.util.Scanner;

class Quadrilateral {
    void showDescription() {
        System.out.println("- is quadrilateral");
    }

}

class Square extends Rectangle {
    void showDescription() {
        System.out.println("- has 4 equals sides");
        super.showDescription();
    }
}

class Rectangle extends Quadrilateral {
    void showDescription() {
        System.out.println("- has 4 right angles");
        super.showDescription();
    }
}



public class RunQuad {
    public static void main(String[] args) {
        Quadrilateral re = new Rectangle();
        Quadrilateral sq = new Square();

        Scanner sc = new Scanner(System.in);
        System.out.print("Press R for Rectangle or S for Square. ");
        String choice = sc.next();

        if(choice.equalsIgnoreCase("S")) {
            System.out.println("A square: ");
            sq.showDescription();

        } else if (choice.equalsIgnoreCase("R")) {
            System.out.println("A rectangle: ");
            re.showDescription();
        }

    }
}
