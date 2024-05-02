// 관계가 없는 두 클래스
class Parent {
    String p = "parent";
    void viewParent() {
        System.out.println("viewParent() 호출");
    }
}

class Child1 {
    void viewChild() {
        System.out.println("viewChild() 호출");
    }

}

class Child2 extends Parent {
    String c = "child";
    void viewChild() {
        System.out.println("viewChild() 호출");
    }
}

public class InheritanceEx01 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.viewParent();

        Child1 c1 = new Child1();
        c1.viewChild();

        Child2 c2 = new Child2();
        c2.viewChild();
        c2.viewParent();

        System.out.println(c2.c);
        System.out.println(c2.p);
    }
}