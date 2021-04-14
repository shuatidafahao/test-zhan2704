public class exer4 {
    public static void windowPosSum(int[] a, int n) {
        /** your code here */
        int L = a.length;
        for (int i = 0; i  < L; i++){
            if (a[i] >= 0){
                int totSum = 0;
                for (int j = 0; j <= n; j++){
                    if( i + j < L){
                        totSum = totSum + a[i+j];
                    }
                    else if (i + j >= L){
                        break;
                    }
                    }
                a[i] = totSum;

                    }

                }


            }




    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}
