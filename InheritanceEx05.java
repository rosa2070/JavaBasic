class Parent {
    String p = "홍길동";
    void viewParent() {
        System.out.println("Parent viewParent 호출");
    }
}

class Child extends Parent {
    String p = "박문수";

    void viewChild() {
        System.out.println("viewChild 호출");
    }

    // 재정의 중심에 실행
    void viewParent() {
        // super - 부모의 멤버필드/메서드
        // super() - 생성자
        super.viewParent();
        System.out.println(this.p);
        System.out.println(super.p);

        System.out.println("Child viewParent 호출");
    }

    

    // int viewParent() {
    //     System.out.println("Parent viewParent 호출");
    //     return 0;
    // }
}

public class InheritanceEx05 {
    public static void main(String[] args) {
        Child c = new Child();

        c.viewChild();
        c.viewParent();
    }
    
}
