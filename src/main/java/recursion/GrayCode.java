package recursion;

import java.util.ArrayList;

public class GrayCode {
    public static void main(String[] args) {
        int A=3;
        int[] res= generateCode(A);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }


    public static void generate(int a){
        ArrayList< Integer > result = new ArrayList < > ();
        result.add(0);
        for (int i = 0; i < a; i++) {
            int c = result.size();
            for (int j = c-1 ; j >=0 ; j--) {
                result.add(result.get(i)+(1<<i));
            }
        }
    }

    public static String[] initate(){
        String[] a= new String[4];
        a[0]="00";
        a[1]="01";
        a[2]="11";
        a[3]="10";
        return a;
    }

    public static int[] generateCode(int input){
        int[] res;
        String[] s;
        if(input==0){
            res= new int[1];
            res[0]=0;
            return res;
        }else if(input==1){
            res= new int[2];
            res[0]=0;
            res[1]=1;
            return res;
        }else if(input==2){
            s = initate();
            return binart_to_decimal(s,input);
        }else{
            s = initate();
            for (int i = 3; i <=input; i++) {
                int co = power(2,i);
                int mid=co/2;
                String[] ans = new String[co];
                for (int j = 0; j <mid ; j++) {
                    ans[j]="0"+s[j];
                }
                String[] rs = reverse(s);
                for (int j = mid; j<co ; j++) {
                    ans[j]="1"+rs[j-mid];
                }
                s=ans;
            }
            return binart_to_decimal(s,input);
        }


    }

    public static String[] reverse(String[] s){
        int l=0;
        int r=s.length-1;
        while (l<=r){
            String temp = s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
        return s;
    }

    public static int[] binart_to_decimal(String[] A,int input){
        int[] a= new int[power(2,input)];
        for (int i = 0; i < A.length; i++) {
            int ans=0;
            int base=1;
            int num=0;
            for (int j = A[i].length()-1; j >=0 ; j--) {
                if(A[i].charAt(j)=='1'){
                    num+=base;
                }
                base*=2;
                //Integer.parseInt(String.valueOf(A[i].charAt(j)))
            }
            a[i]=num;
        }
        return a;
    }

    public static int power(int a, int b){
        if(b==0) return 1;
        int c =power(a,b/2);
        int res= c*c;
        if(b%2==1){
            res= res*a;
        }
        return res;
    }


}
