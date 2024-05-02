class Modifier {
    String data1 = "default";
    public String data2 = "public";
    protected String data3 = "protected";
    private String data4 = "private";

    void method1() { System.out.println("method1 호출");}
    public void method2() { System.out.println("method2 호출");}
    protected void method3() { System.out.println("method3 호출");}
    private void method4() { System.out.println("method4 호출");}

    public void viewData() {

        // 같은 클래스 내부에서 접근
        System.out.println(this.data4);
        this.method4();

    }
}

public class ModifierEx01 {
    public static void main(String[] args) {
        Modifier m = new Modifier();

        // 다른 클래스에서 접근
        System.out.println(m.data1);        
        System.out.println(m.data2);        
        System.out.println(m.data3);        
        // System.out.println(m.data4);  
        
        m.viewData();

        m.method1();
        m.method2();
        m.method3();
        // m.method4();
    }
    
}
