package searchinf_2;

public class Roatate_sorted_array {

    public static void main(String[] args) {

        int[] A={4, 5, 6, 7, 0, 1, 2, 3};
        int B=4;
        if(A.length==1 && A[0]==B) {
            System.out.println(0);
        }




    }


    public static int findposition(int[] A,int B){
        for (int i = 0; i < A.length; i++) {
            if(A[i]==B){
                return i;
            }
        }
        return 0;
    }

    public static int sorted(int[] A, int l, int r,int b){

        int mid =(l+r)/2;
        if(A[mid]==b){
            return mid;
        }



        return  0;
    }
}
