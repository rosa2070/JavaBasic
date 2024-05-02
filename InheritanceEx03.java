class Parent extends Object {
    String p = "부모자료";
    void viewParent() {
        System.out.println("viewParent 호출");
    }
}

class Child extends Parent {
    String c = "자식자료";
    void viewChild() {
        System.out.println("viewChild 호출");
    }
}

class GrandChild extends Child {
    String c = "손자자료";
    void viewGrandChild() {
        System.out.println("viewGrandChild 호출");
    }
}


public class InheritanceEx03 {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        
        gc.viewGrandChild();
        gc.viewChild();
        gc.viewParent();

    }
}
