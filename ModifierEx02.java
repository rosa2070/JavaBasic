class Modifier {
    // 멤버 필드 - 숨김
    private String name = "홍길동";

    // 메서드 - 접근
    // 데이터 읽어 - getter : getName (get + 대문자로 시작하는 이름)
    // 데이터 쓸   - setter : setName ( set + 대문자로 시작하는 이름)
    // 데이터 확인 -          isName
    // public void viewName() {
    //     System.out.println(this.name);
    // }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    } 
}

public class ModifierEx02 {
    public static void main(String[] args) {
        Modifier m = new Modifier();
        // m.viewName();
        m.setName("박문수");
        System.out.println(m.getName());

    }
    
}
