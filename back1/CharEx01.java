package back1;
public class CharEx01 {
    public static void main(String[] args) {
        char c1 = 'A';
        System.out.println(c1);

        //c1 = 'AA';
        // System.out.println(c1);

        //문자(영문자, 숫자, 특수기호) -> 코드(ASCII)
        char c2 = 97;
        System.out.println(c2);
        // 문자(다국어) -> 코드(유니코드)
        char c3 = '\uC790';
        System.out.println(c3);
    }

}
