public class exer2 {
    public static int max(int[] m) {
        int L = m.length-1;
        int maxNumber = m[0];
        for( int i = 0; i < L; i++){
            if (maxNumber > m[i+1]){
                System.out.println(maxNumber+" "+ m[i+1]);
                maxNumber = maxNumber;
                //System.out.println(maxNumber);
            }
            else {
                maxNumber = m[i+1];
                //System.out.println(maxNumber);
            }
        }
        return maxNumber;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}
