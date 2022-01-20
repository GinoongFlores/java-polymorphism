package nine_activity;

class A {
    public void test() {
        System.out.print("A");
    }
}

class B extends A{
    public void test() {
        System.out.print("B");
    }
}

public class C extends A {
    public void test() {
        System.out.print("C");
    }

    public static void main(String[] args) {
        A b1 = new A();
        A b2 = new C();
        b1 = (A) b2; // b1 is overridden by b2 which is a C. Therefore the output is CC.

//        A b3 = (B) b2;

        b1.test();
        b2.test();
    }
}