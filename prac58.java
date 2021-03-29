package pack15;

public class prac58 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.x);
        A c = new B();
        System.out.println(c.x);
//        System.out.println(c.y);
    }
}

class A {
    public int x = 1;
}

class B extends A{
    public int x = 2;
    public int y = 3;
}