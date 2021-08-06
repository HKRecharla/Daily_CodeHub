package searchinf_2;

public class sqrt {

    public static void main(String[] args) {
        int A=10;
        int a =sqrt_num(A);
        System.out.println(a);
    }


    public static int sqrt_num(int A){
        long mid=0;

        long low=0;
        long high=A;

        if(A==0) return 0;
        if(A==1) return 1;

        while (low<=high){
            mid=(low+high)/2;
            if(mid*mid==A) return (int)mid;
            else {
                if(mid*mid>A){
                    high=mid-1;
                }else{
                    if((mid+1)*(mid+1)>A){
                        return (int)mid;
                    }else{
                        low=mid+1;
                    }
                }
            }

        }
        return (int)mid;
    }
}
