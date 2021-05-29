package hashing;

import java.util.HashMap;

public class Dictionary_Words {
    public static void main(String[] args) {

        String[] A={"hello", "scaler", "interviewbit"};
        String B="adhbcfegskjlponmirqtxwuvzy";
        int a = solve(A,B);

        System.out.println( " O/P "+a);
    }

    public static int solve(String[] A,String B){
        int min = Integer.MAX_VALUE;

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < B.length(); i++) {
            map.put(B.charAt(i),i+1);
        }

        for (int l = 0; l < A.length-1; l++) {
            int val = compare(map,A[l],A[l+1]);
            if(val==0){
                return 0;
            }
        }
        return 1;

    }


    public static int  compare(HashMap<Character,Integer> map,String A,String B){

        int min = Math.min(A.length(),B.length());

        //hello
        //scaler

        for (int i = 0; i < min; i++) {
            Integer a = map.get(A.charAt(i));
            Integer b = map.get(B.charAt(i));
            if( a< b){
                System.out.println(""+1);
                return 1;
            }else if(a>b){
                System.out.println(" "+0);
                return 0;
            }else if(a==b){
                if(A.length() > B.length()){
                    return 0;
                    //noo - A len > Blen
                    //noo - B len
                }else {
                    continue;
                }
            }
        }
        System.out.println(""+ 1);
        return 1;
    }
}
