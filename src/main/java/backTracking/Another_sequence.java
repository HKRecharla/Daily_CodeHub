package backTracking;

public class Another_sequence {


    public static void main(String[] args) {

        int A=2;
        int ans = sum(A);
        System.out.println(ans);
    }



    public static int sum(int A){
     if(A==2) return 2;
     else if(A==0 || A==1) return 1;
     return sum(A-1)+sum(A-2)+sum(A-3)+A;
    }
}
