package arrays;

public class MultipleLeft {

    public static void main(String[] args) {

        int[] A={1,2,3,4,5};
                //{6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47};;
                //{4, 74, 35, 16, 100, 77, 50, 51, 31, 29, 67, 12, 43, 31, 83, 2, 85, 85, 39, 27, 64, 86, 5};
                //{6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47};
        int[] B={2,3};
                //{88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59};;
                //{73, 70, 47, 19, 46, 25, 46, 4, 33, 33, 6, 31, 23, 19, 44, 53, 69, 30, 69, 89, 59, 25, 38, 82, 26, 8, 36, 3};
                //{88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59};

        //[27 89 23 6 56 94 40 54 95 47 6 31 33 13 82 66 9 12 69 21 17 2 50 69 90 71 31 1 13 70 94 46 89 13 55 54 67 97 28 27 62 34 41 18 15 35 13 84 93 };
        //[13 84 93 27 89 23 6 56 94 40 54 95 47 6 31 33 13 82 66 9 12 69 21 17 2 50 69 90 71 31 1 13 70 94 46 89 13 55 54 67 97 28 27 62 34 41 18 15 35 ]
        //[6 31 33 13 82 66 9 12 69 21 17 2 50 69 90 71 31 1 13 70 94 46 89 13 55 54 67 97 28 27 62 34 41 18 15 35 13 84 93 27 89 23 6 56 94 40 54 95 47 ]
        plan(A,B);

    }


    public static void plan(int[] A, int[] B){

        int len = A.length;

        System.out.println(len);
        System.out.println(B.length);
        System.out.println();
        int[][] ar = new int[B.length][];
        for (int i = 0; i < B.length; i++) {
            ar[i] = new int[A.length];
           // System.out.println();
            ar[i] = reverse(A);

            int v= len-B[i];
            if(v<0){
                v = -(v);
            }
            int f = B[i]%A.length;
//            if(A.length<B[i]){
//                for (int j = 1; j < 20; j++) {
//
//                    if(f<=B[i]){
//                        f = f+A.length;
//                    }else{
//                        f=f-A.length;
//                        break;
//                    }
//                }
//                v=B[i]-f;
//            }
            reverse(ar[i],0,(len-f-1));
            reverse(ar[i],(len-f),len-1);


        }



        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }



    }

    public static int[] reverse(int[] a){
        int[] b= new int[a.length];
        int j=0;
        for (int i = a.length-1; i >=0 ; i--) {
            b[j]=a[i];
           //System.out.print(b[j]+" ");
            j++;
        }
        //System.out.println();
        return b;
    }

    public static int[] reverse(int[] a, int l,int r ){
        while (l<r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
        return a;
    }

}
