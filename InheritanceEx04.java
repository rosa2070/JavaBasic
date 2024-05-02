class Parent {
    // Parent() {
    //     System.out.println("Parent 생성자 호출 : " + this);
    // }

    Parent(String data) {
        System.out.println("Parent(String data) 생성자 호출 : " + this);
    }
}

class Child extends Parent {
    Child() {
        super("10");
        System.out.println("Child 생성자 호출");
    }
}

public class InheritanceEx04 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c);

    }
}
