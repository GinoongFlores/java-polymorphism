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

class Rectangle extends Parallelogram {
    void showDescription() {
        System.out.println("- has 4 right angles");
        super.showDescription();
    }
}

class Parallelogram extends Quadrilateral {
    void showDescription() {
        System.out.println("- has 2 pairs of parallel sides");
        super.showDescription();
    }
}

class Rhombus extends Parallelogram {
    void showDescription() {
        System.out.println("- has 4 congruent sides");
        super.showDescription();
    }
}

class Trapezoid extends Quadrilateral {
    void showDescription() {
        System.out.println("- has 1 pair of parallel sides");
        super.showDescription();
    }
}

public class RunQuad {
    public static void main(String[] args) {
        Quadrilateral re = new Rectangle();
        Quadrilateral sq = new Square();
        Quadrilateral pa = new Parallelogram();
        Quadrilateral rh = new Rhombus();
        Quadrilateral tr = new Trapezoid();

        Scanner sc = new Scanner(System.in);
        System.out.print("""
                Select from the following:\s
                R - Rectangle\s
                S - Square\s
                P - Parallelogram\s
                H - Rhombus\s
                T - Trapezoid\s
                """);
        String choice = sc.next();

        if(choice.equalsIgnoreCase("S")) {
            System.out.println("A square: ");
            sq.showDescription();
        } else if (choice.equalsIgnoreCase("R")) {
            System.out.println("A rectangle: ");
            re.showDescription();
        } else if (choice.equalsIgnoreCase("P")) {
            System.out.println("A parallelogram: ");
            pa.showDescription();
        } else if (choice.equalsIgnoreCase("H")) {
            System.out.println("A rhombus: ");
            rh.showDescription();
        } else if (choice.equalsIgnoreCase("T")) {
            System.out.println("A trapezoid: ");
            tr.showDescription();
        }

    }
}
