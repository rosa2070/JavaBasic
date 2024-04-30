public class ArrayEx06 {
    public static void main(String[] args) {
        int[][] arr1 = new int[][] {{10, 20}, {30, 40}, {50, 60}};    
        int[][] arr2 = {{10, 20}, {30, 40}, {50, 60}};    

        arr1[0][0] = 10;
        arr1[0][1] = 20;
        arr1[1][0] = 30;
        arr1[1][1] = 40;
        arr1[2][0] = 50;
        arr1[2][1] = 60;

        System.out.println(arr1[0][0]);
        System.out.println(arr1[2][1]);

        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[0][0]);

        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[i].length; j++) {
                System.out.println(arr1[i][j]);
            }
        }

        // 향상된 for
        for(int[] cols : arr1) {
            for (int col : cols) {
                System.out.println(col);
            }
        }
    }

}
