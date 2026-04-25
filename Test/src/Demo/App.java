package Demo;
class A {

    A() {
        System.out.println("A Default");
    }

    A(int x) {
        System.out.println("A Parameterized: " + x);
    }
}

class B extends A {

    B() {
        this(10);
        System.out.println("B Default");
    }

    B(int x) {
        super(x);
        System.out.println("B Parameterized: " + x);
    }
}

public class App {
    public static void main(String[] args) {

        B obj = new B();
    }
}