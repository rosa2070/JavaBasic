class Variable {
    // 인스턴스 멤버필드 / 클래스 멤버필드
    String instanceVariable = "10";
    static String classVariable = "20";

    void doFunc1() {
        System.out.println("doFunc1() 호출" + this);
        System.out.println(this.instanceVariable);

        // System.out.println(this.classVariable);
        System.out.println(Variable.classVariable);
    }

    // static 안에서는 this를 쓸 수 없다
    // 객체 생성전 만들어진 메서드이므로
    static void doFunc2() {
        System.out.println("doFunc2() 호출");
        // System.out.println("doFunc2() 호출" + this);
        // System.out.println(this.instanceVariable);
        System.out.println(Variable.classVariable);
    }
}

public class VariableEx02 {
    public static void main(String[] args) {
        Variable v1 = new Variable();
        Variable v2 = new Variable();

        v1.doFunc1();
        v2.doFunc1();

        // v1.doFunc2();
        // v2.doFunc2();
        Variable.doFunc2();
        
    }

}
