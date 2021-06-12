package problem_solving_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Construct_Array {

    public static void main(String[] args) {
        int A=5;
        int B=30;
        int C=50;

//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < a.length; i++) {
//            list.add(a[i]);
//        }
        construct_2(A,B,C);

    }

    /**
     *
     * @param A
     * @param B
     * @param C
     */

    public static void construct_2(int A, int B, int C){
        ArrayList<Integer> d = new ArrayList<>();
        //divisor of C - B
        for (int i = 1; i <=(C-B) ; i++) {
            if((C-B)%i == 0 ){
                d.add(i);
            }
        }
        System.out.println("divisor of c-b :: "+d);

        int a= Integer.MAX_VALUE;
        int term = Integer.MAX_VALUE;
        int cd =0; // current divisor
        int temp=0;

        for (int i = 0; i < d.size(); i++) {

            int val = C-(A-1)*d.get(i);
            System.out.println("val of -> c-A-1*d= "+val);
            while (val<=0){
                temp=1;
                val = val+d.get(i);
            }

            int nextVal = val+(A-1)*d.get(i);
            System.out.println("Next val of --> val+A-1*d= "+nextVal);
            
            //checking nextval is <= term && val <=B
            if(nextVal <= term && val <= B){
                System.out.println("checking nextval -> "+nextVal+" <= term "+term+" && val "+val+"<= "+B);
                
                cd = d.get(i);
                System.out.println("cd :: "+cd);
                a=val;
                System.out.println("a :: "+a);
                term=nextVal;
                System.out.println("term :: "+term);
            }
            if (temp==1){
                break;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < A; i++) {
            result.add(a+(i*cd));
        }

        System.out.println("result :: "+result);

    }


    public static void construct_1(int A, int B, int C){
        int n = C-B;
        int i=0;
        int d=0;
        int l=0;
        int[] ap = new int[A];
        if(A==3) {
            if (n % 2 != 0) {
                d = n;
            } else {
                d = n / 2;
            }
        }
            while (i>=1){
                if(n%i==0){
                    if(n>A){
                        if(C-(A-2)*i>=0 && i==1){
                            i=B;
                            d=n;break;
                        }

                        if(C-(A-2)*i>=0 && i!=1){
                            d=i;
                            break;
                        }else {
                            if(C-(A-2)*i>=0){
                                d=i;
                                break;
                            }
                        }
                        i=1-1;
                    }
                }
            }

            for (int j = 0; j < A; j++) {
                int k=0;
                if(l==0){
                     k = l+(d*j);
                    ap[j]=k;
                }else if(d==0){
                    ap[j]=j+1;
                }else {
                    k= C-(d*(A-1-j));
                    if(k<=0){
                        k=C+(d*(j+1));
                    }
                    ap[j]=k;
                }
            }
            Arrays.sort(ap);

            for (int j = 0; j < ap.length; j++) {
                System.out.print(ap[i]+" ");
            }
    }

    public static void construct(int A, int B, int C){

        int[]  arr= new int[A];

        int max = Integer.MIN_VALUE;
        for (int a = 1; a < 50; a++) {
            for (int d = 1; d < 50; d++) {
                if((C-B)%d==0){
                    int[]  narr= new int[A];
                    boolean flagc =false;
                    boolean flagb = false;

                    for (int i = 0; i < A; i++) {

                        narr[i] = a*i*d;
                       // System.out.print(narr[i]+" ");
                        if(narr[i] ==C){
                            flagc=true;
                        }
                        if(narr[i]==B){
                            flagb=true;
                        }

                        if(flagb && flagc && max<narr[A-i]){
                            arr[i] = narr[i];
                            System.out.println(arr[i]);
                        }
                    }
                }


            }
        }

        for (int i = 0; i < A; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
