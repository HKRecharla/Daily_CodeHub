package problem_solving_4;

import java.util.HashMap;

public class inimize_Absolute_difference {

    public static void main(String[] args) {
        int[] A = {-45, -18, 23, 28, 54, 100, 142, 169, 186, 219, 263, 286, 332, 345, 345, 359, 371, 387, 403, 422, 446, 463, 486, 522, 548, 585, 607, 632, 660, 671, 677, 724, 748, 757, 778, 787, 796, 818, 840, 874, 876, 906, 955, 1002, 1024, 1026, 1066, 1100, 1140, 1159, 1169, 1207};//{ 1, 4, 5, 8, 10 };
        int[] B = {-579, -571, -554, -531, -518, -511, -504, -488, -474, -445, -418, -414, -365, -341, -314, -302, -260, -214, -212, -198, -173, -172, -165, -156, -110, -78, -35, 13, 29, 42, 90, 109, 121, 135, 158, 199, 240, 253, 280, 305, 344, 355, 395, 431, 461, 495, 535, 535, 540, 567, 616, 621, 631, 637, 641, 678, 723, 768, 817, 862, 874, 895, 896, 932, 938, 948, 975, 997, 1035, 1038, 1052, 1053, 1088, 1137, 1140, 1164, 1198, 1204, 1214, 1248, 1284, 1287, 1305, 1340, 1358, 1389, 1438, 1439, 1444, 1449, 1450, 1489, 1533, 1551, 1564, 1602, 1621, 1621, 1639, 1681, 1688, 1711, 1745};//{ 6, 9, 15 };
       int[]  C = {11, 57, 96, 105, 120, 150, 155, 158, 161, 197, 245, 277, 284, 298, 317, 319, 343, 372, 408, 421, 455, 466, 504, 516, 563, 569, 593, 599, 628, 659, 662, 705, 750, 762, 799, 839, 842, 850, 855, 863, 894, 896, 928, 964, 1011, 1039, 1057, 1086, 1093, 1101, 1149, 1180, 1205, 1221, 1242, 1287, 1332, 1349, 1367, 1386};//{ 2, 3, 6, 6 };

       int ans =  a_min(A,B,C);

        System.out.println(ans);


//        int i=0;
//        int j=0;
//        int k=0;
//
//        int curr= Integer.MAX_VALUE;
//        while (i<A.length && j<B.length && k<C.length){
//           int  mins= min1(A,i,j,k);
//            int maxs =max1(A,i,j,k);
//            int val = maxs-mins;
//             curr = Math.min(curr,maxs-mins);
//            System.out.println(curr);
//
//        i++;
//        j++;
//        k++;
//
//        }
//
//        System.out.println(curr);

    }


    public static int a_min(int[] A,int[] B, int[] C){
        int i=0;
        int j=0;
        int k=0;
        int alen = A.length;
        int blen = B.length;
        int clen = C.length;
        int ans =Integer.MAX_VALUE,max,min;
        while (i<alen && j<blen && k<clen){
            min=Math.min(Math.min(A[i], B[j]),C[k]);
            max=Math.max(Math.max(A[i], B[j]),C[k]);
            ans =Math.min(ans,(max-min));

            if(min==A[i]){
                i++;
            }else if(min ==B[j]){
                j++;
            }else if(min == C[k]){
                k++;
            }
        }
        return ans;
    }

    public static int abs_min(int[] A,int[] B, int[] C){
        int i=0;
        int j=0;
        int k=0;
        int alen = A.length;
        int blen = B.length;
        int clen = C.length;
        int ans =Integer.MAX_VALUE;

        while (i<alen && j<blen && k<clen){
            int max =A[i];
            int min= A[i];
            if(A[i]<0&& B[j]<0 && C[k]<0){
                max = Math.abs(A[i]);
                min = Math.abs(A[i]);
                max = maxof(max,Math.abs(A[i]),Math.abs(B[j]),Math.abs(C[k]));
                min = minof(min,Math.abs(A[i]),Math.abs(B[j]),Math.abs(C[k]));
                ans = Math.min(ans,(max-min));

                if(Math.abs(A[i])==min){
                    i++;
                }else if(Math.abs(B[j])==min){
                    j++;
                }else if(Math.abs(C[k])==min){
                    k++;
                }
            }else {
                max = maxof(max, A[i], B[j], C[k]);
                min = minof(min, A[i], B[j], C[k]);
                ans = Math.min(ans, (max - min));

                if(A[i]==min){
                    i++;
                }else if(B[j]==min){
                    j++;
                }else if(C[k]==min){
                    k++;
                }
            }

            System.out.println();
            System.out.println(max+"-"+min+" = "+ans);



        }

    return ans;
    }

    public static void min(){

    }




    public static int maxof(int max ,int i, int j, int k){
        max =Math.max(i,max);
        max =Math.max(j,max);
        max =Math.max(k,max);
        System.out.print(i+","+j+","+k+"==> ");
        return max;
    }

    public static int minof(int min, int i, int j, int k){
        min =Math.min(i,min);
        min =Math.min(j,min);
        min =Math.min(k,min);
        System.out.print(i+","+j+","+k);
        return min;
    }

    public static int min1(int[] A,int i, int j, int k){
        int min=A[i];
        if(A[i]<=A[j] && A[i] <=A[k]){
            min =A[i];
        }else if(A[j]<=A[i] && A[j]<=A[k]){
            min=A[j];
        }else{
            min=A[k];
        }
        return min;
    }

    public static int max1(int[] A,int i, int j, int k){
        int max=A[i];
        if(A[i]>=A[j] && A[i] >=A[k]){
            max =A[i];
        }else if(A[j]>=A[i] && A[j]>=A[k]){
            max=A[j];
        }else{
            max=A[k];
        }
        return max;
    }
}
