package searchinf_2;

public class SingleInteger {

    public static void main(String[] args) {

    }


    public static void single(int[] A,int B){
        for (int i = 0; i < A.length; i++) {
            int j=0;
            boolean flag=true;
           while (true){
               if(A[j]!= B){
                   flag =false;
               }
               j++;
           }
        }
    }
}
