public class Ex4_11quiz {
    public static void main(String[] args) {
        // 방법 1
        /* 
        for(int i='A'; i<='J'; i++) {
            for (int j='A'; j<=i; j++)
                System.out.print((char)j);
            System.out.println();
        }
        */

        //방법 2
        for (int i=0; i<=9; i++) {
            for(int j=65; j<=65+i; j++) {
                System.out.print((char)j);
            }
            System.out.println();
        }


    }

    
}
