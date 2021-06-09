package prblem_solving_2;

public class Equilibrium {

    public static void main(String[] args) {
        int[] A = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                //{-7,1,5,2,-4,3,0};

        equi_2(A);


    }


    public static void equi_2(int[] A){
        int[] ps = new int[A.length];

        ps[0] = A[0];


        for (int i = 1; i < ps.length; i++) {
            ps[i] = ps[i-1]+A[i];
        }
        int LS = ps[0];
        int RS = ps[ps.length-1];


        for (int i = 1; i < ps.length; i++) {
            int a = ps[i-1];
            int b = RS-ps[i];

            if(a==b){
                System.out.println(i);
                break;
            }
        }
        
        
//        for (int i = ps.length-1; i >=0 ; i--) {
//            LS= LS-A[i];
//            RS = RS+A[i];
//           // System.out.println(LS+" "+RS);
//            if(LS == RS){
//                System.out.println(i);
//            }
//        }



    }
    public static void equi_1(int[] A){
        int[] ps = new int[A.length];

        ps[0] = A[0];

        for (int i = 1; i < ps.length; i++) {
            ps[i] = ps[i-1]+A[i];
        }

        for (int i = 0; i < ps.length; i++) {
            if(i-1<0){
                i=1;
            }
            int a= ps[i-1]-ps[0];
            int b =  ps[ps.length-1]-ps[i];
            System.out.println(a+" "+b);
            if(a == b){
                System.out.println("qui");
            }
        }

    }
}
