package problem_solving;

public class inimumPicks {

    public static void main(String[] args) {


        int[] A = {-15, -45, 43, 23, -63, 69, 35, 19, 37, -52};
        int odd = Integer.MAX_VALUE;
        int even = Integer.MIN_VALUE;
        int size =A.length;
//        for (int i = 0; i < size; i++) {
//            if(A[i]%2!=0){
//                odd=A[i];
//                break;
//            }
//        }
//        for (int i = 0; i < size; i++) {
//            if(A[i]%2==0){
//                even=A[i];
//                break;
//            }
//        }
        //even
        for (int i = 0; i < size; i++) {

            if(A[i]%2==0){
                even = Math.max(A[i],even);
            }else{
                odd = Math.min(A[i],odd);
            }
        }

        int f = even-odd;
        System.out.println(f);
    }
}
