class Constructor {
    String name;

    // 생성자 오버로딩에서
    // 생성자 간의 호출
    Constructor() {
        this.name = "박문수";
        System.out.println("디폴트 생성자 호출");
    }

    Constructor(String name) {
        this();
        this.name = name;
        // this();
    }
    
}

public class ConstructorEx02 {
    public static void main(String[] args) {
        Constructor c = new Constructor("홍길동");
    }
    
}
