package back1;
public class VariableEx02 {
   public static void main(String[] args) {
      int vNum = 10;
      System.out.println(vNum);
      vNum = 20;
      System.out.println(vNum);

      // 선언과 초기화 분리 가능
      final int C_NUM;
      C_NUM = 10;
      System.out.println(C_NUM);
      // C_NUM = 20;
      // System.out.println(C_NUM);

   } 
}
