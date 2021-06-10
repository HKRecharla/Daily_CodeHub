package prblem_solving_2;

import java.util.ArrayList;

public class Count {
    public static void main(String[] args) {

        int[] a={1,1,1};
                //{1,4,5,6,4,3,2,0,1};
                //{2, 1, 6, 4};
                //{648, 614, 490, 138, 657, 544, 745, 582, 738, 229, 775, 665, 876, 448, 4, 81, 807, 578, 712, 951, 867, 328, 308, 440, 542, 178, 637, 446, 882, 760, 354, 523, 935, 277, 158, 698, 536, 165, 892, 327, 574, 516, 36, 705, 900, 482, 558, 937, 207, 368};
        //{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        //{648, 614, 490, 138, 657, 544, 745, 582, 738, 229, 775, 665, 876, 448, 4, 81, 807, 578, 712, 951, 867, 328, 308, 440, 542, 178, 637, 446, 882, 760, 354, 523, 935, 277, 158, 698, 536, 165, 892, 327, 574, 516, 36, 705, 900, 482, 558, 937, 207, 368};
        //{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        count_even_odd_1(list);
    }

    public static void count_even_odd_1(ArrayList<Integer> A){

        int len = A.size();

        System.out.println("Array --> "+A);

        //Prefix Sum
        ArrayList<Integer> ps = new ArrayList<>();
        ps.add(A.get(0));
        for (int i = 1; i <len ; i++) {
            ps.add(ps.get(i-1)+A.get(i));
        }
        System.out.println("Prefix --> "+ps);

        //Even Prefix Sum
        ArrayList<Integer> eps = new ArrayList<>();
        eps.add(0);
        for (int i = 1; i <len ; i++) {
            if(i%2==0){
                eps.add(eps.get(i-1)+0);
            }else{
                eps.add(eps.get(i-1)+A.get(i));
            }

        }
        System.out.println("eps --> "+eps);

        //Odd prefix

        ArrayList<Integer> ops = new ArrayList<>();
        ops.add(A.get(0));
        for (int i = 1; i <len ; i++) {
            if(i%2==0){
                ops.add(ops.get(i-1)+A.get(i));
            }else{
                ops.add(ops.get(i-1)+0);
            }

        }
        System.out.println("ops --> "+ops);

        int count =0;

        int RE=0;
        int RO=0;
        int LE=0;
        int LO=0;
        int odd=0;
        int even=0;


        RE = eps.get(len-1);
        RO = ops.get(len-1)-ops.get(0);

        even = LE+RO;
        odd=LO+RE;

        if(even==odd){
            count++;
        }
        //System.out.println("even "+even);
        //System.out.println("odd "+odd);

        RE = eps.get(len-1)-eps.get(1);
        RO = ops.get(len-1)-ops.get(0);

        LO=ps.get(0);
        even = LE+RO;
        odd=LO+RE;
        if(even==odd){
            count++;
        }
        //System.out.println("even "+even);
        //System.out.println("odd "+odd);


        for (int i = 2 ; i < len; i++) {

            if(i%2==0){
                RO = ops.get(len-1)-ops.get(i);
                RE = eps.get(len-1)-eps.get(i-1);
                LO=ops.get(i-2);
                LE=eps.get(i-1);
                even = LE+RO;
                odd=LO+RE;
            }else{
                RO = ops.get(len-1)-ops.get(i-1);
                RE = eps.get(len-1)-eps.get(i);

                LO=ops.get(i-1);
                LE=eps.get(i-2);
                even = LE+RO;
                odd=LO+RE;
            }
            if(even==odd){
                count++;
            }
            //System.out.println("even --> "+even);
            //System.out.println("odd --> "+odd);

        }

        System.out.println(count);





    }



    //Brute force
    public static void count_even_odd(ArrayList<Integer> A){


        int count=0;
        for (int i = 0; i < A.size(); i++) {
            int odd=0;
            int even=0;
            boolean flag=false; // false=odd, true even
            for (int j = 0; j < A.size(); j++) {
               if(i==j){
                   continue;
               }else if(flag==false){
                   odd+=A.get(j);
                   flag=true;
               }else{
                   even+=A.get(j);
                   flag=false;
               }
            }
            if(odd==even){
                count++;
            }
        }

        System.out.println(count);


    }

    public static void od_ev(int index){
        if(index%2==0){

        }
    }
}
