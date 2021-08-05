package searchinf_2;

public class NBooks {

    public static void main(String[] args) {

        int [] A={73, 58, 30, 72, 44, 78, 23, 9};
        int B=5;
        int a = book(A,B);
        System.out.println(a);
    }



    public static boolean isconfig(int[] A, int B, int mid){

        int i=0;
        int sum=0;
        int count=1;
        while (i<A.length && count<=B){
            sum+=A[i];
            if(sum<=mid){
                i++;
            }else{
                sum=0;
                count++;
            }
        }
        if (count<=B) return true;

        return false;
    }

    public static int book(int[] A, int B){
        int ans=0;
        int len = A.length;
        if (len<B) return  -1;
        if(len==1) return A[0];


        int min=A[0];
        int sum=0;

        for (int i = 0; i < len; i++) {
            sum+=A[i];
        }
        if(B==1) return sum;
        int max =sum;
        int mid=0;
        while (min<max){
            mid = (max+min)/2;
            if(isconfig(A,B,mid) ==true){
                ans=mid;
                max=mid;
            }else{
                min= mid+1;
            }
        }
        return ans;
    }



    public static int[] prefix(int[] A){
        int[] pa= new int[A.length];
        pa[0]=A[0];
        for (int i = 1; i <A.length ; i++) {
            pa[i]=pa[i-1]+A[i];
        }
        return pa;
    }


    public static int bookd(int[] A){
        int j=A.length-1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <A.length-1; i++) {
            if(i==A.length-2){
                min = Math.min(min,A[j-1]);
            }else{
                min = Math.min(min,A[j]-A[i]);
            }
        }
        System.out.println(min);
       return min;
    }
}
