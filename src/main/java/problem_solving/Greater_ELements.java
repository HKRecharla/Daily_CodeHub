package problem_solving;


import java.util.Arrays;
import java.util.HashMap;

public class Greater_ELements {


    public static void main(String[] args) {

        int[] A ={11,17,100,5};
        method3(A);


    }


    public static void method3(int[] A){

        int size = A.length;

        int larg = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i <size; i++) {
            larg= Math.max(A[i],larg);
        }
        for (int i = 0; i < size; i++) {
            if (A[i] != larg){
                second = Math.max(A[i],second);
            }
        }
        int count=0;
        int[] fin = new int[size-2];
        for (int i = 0; i < size; i++) {
            if(A[i]!=second && A[i]!=larg){
                fin[count] =A[i];
                count++;
            }
        }

    }

    public static void method2(int[] A){

        int size = A.length;
        //int[] A ={1, 2, 3, 4, 5};

        System.out.println(size);
        Arrays.sort(A);
        int[] a = new int[size-2];
        for (int i = 0; i < a.length; i++) {
            a[0]= A[i];
            System.out.println(a[0]);
        }

    }

    public static void t(){
        int[] A ={1, 2, 3, 4, 5};

        int loop=0;
        int size = A.length;
        String s= "";
        for (int i = 0; i < size; i++) {
            int count =0;
            for (int j = 0; j < size; j++) {
                if(A[i] < A[j]){
                    count++;
                }
            }
            if(count>=2){
                s=s+A[i]+"_";
                loop++;
            }
        }

        int[] b= new int[loop];
        for (int i = 0; i < loop; i++) {
            String[] sp = s.split("_");
            b[i] = Integer.parseInt(sp[i]);
        }
    }
}
