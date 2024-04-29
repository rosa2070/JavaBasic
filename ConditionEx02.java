public class ConditionEx02 {
    public static void main(String[] args) {

        // switch ~ case
        // / (나눗셈 이용)
        int score = 76;
        switch (score/10) {
            case 9:
                System.out.println("A 학점");
                break;
            case 8:
                System.out.println("B 학점");
                break;
            case 7:
                System.out.println("C 학점");
                break;
            case 6:
                System.out.println("D 학점");
                break;
            default:
                System.out.println("F 학점");
        }     
        

    }
    
}
