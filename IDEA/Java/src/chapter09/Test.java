package chapter09;

/**
 * @author SOMEBODY
 * @date 2021-02-17-11:02
 */
public class Test {
    A o1;

    public static void main(String[] args){
        Test t = new Test();
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        c.o4 = d;
        b.o3 = c;
        a.o2 = b;
        t.o1 = a;

        System.out.println(t.o1.o2.o3.o4.i);
    }
}

class A {
    B o2;
}

class B {
    C o3;
}

class C {
    D o4;
}

class D {
    int i;
}
