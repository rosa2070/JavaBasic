// 관계가 없는 두 클래스
class Parent1 {
    void viewParent() {
        System.out.println("viewParent() 호출");
    }
}

class Parent2 {
    void viewParent() {
        System.out.println("viewParent() 호출");
    }
}

class Child1 {
    void viewChild() {
        System.out.println("viewChild() 호출");
    }

}

// class Child2 extends Parent, Parent2 {
class Child2 extends Parent1 {
    void viewChild() {
        System.out.println("viewChild() 호출");
    }
}

class Child3 extends Parent1 {
    void viewChild() {
        System.out.println("viewChild() 호출");
    }
}

public class InheritanceEx02 {
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        Child3 c3 = new Child3();
    }
}