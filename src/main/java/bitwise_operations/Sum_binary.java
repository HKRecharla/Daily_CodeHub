package bitwise_operations;

public class Sum_binary {

    public static void main(String[] args) {

       String s =  solve();

        System.out.println(s);
    }

    public static String solve(){

        String a ="111";
        String b ="111";


        int len1=  a.length();
        int len2 =   b.length();

        int maxln = Math.max(len1,len2);

        int carry =0;
        String res = "";
        for (int i = 0; i < maxln; i++) {

            int p = i < len1 ? a.charAt(len1 - 1 - i) - '0' : 0;
            int q = i < len2 ? b.charAt(len2 - 1 - i) - '0' : 0;
            int tmp = p + q + carry;
            carry = tmp / 2;
            res = tmp % 2 + res;
        }
        if(carry != 0){
            res = "1"+res;
        }

        return (carry == 0) ? res : "1" + res;
    }


    public static String solve2(){

        String A ="111";
        String B ="111";

        int len1=  A.length();
        int len2 =   B.length();

        int maxln = Math.max(len1,len2);

        int carry =0;
        String res = "";
        for (int i = 0; i < maxln; i++) {

            int a =0;
            int b=0;
            if(i<len1){
                int val = len1-1-i; //3-1-0 = 2
                a= A.charAt(val) -'0'; //1-0 = 1
            }else{
                b=0;
            }
            if(i<len2){
                int val = len2-1-i;
                b=B.charAt(val) - '0'; // 1
            }else{
                b=0;
            }
            int tmp = a + b + carry; // 1+1+0 =2 // decimal to binary
            carry = tmp / 2; //2/2 = 1
            res = tmp % 2 + res; // 2%2 =0
        }
        if(carry != 0){
            res = "1"+res;
        }
        return res;
    }


    public static String solve3(){
        String a ="100";
        String b ="110";


        int len1=  a.length();
        int len2 =   b.length();

        int maxln = Math.max(len1,len2);

        String res ="";
        int carry=0;

        for (int i = 0; i < maxln; i++) {

            int p=0;
            int q=0;
            int temp=0;
            if(i<len1){
               p= a.charAt(len1-1-i) -'0';
            }else{
                p=0;
            }

            if(i<len2){
                q= a.charAt(len2-1-i) -'0';
            }else{
                q=0;
            }

             temp =p+q+carry;
            carry = temp/2;
            res = temp%2+res;


        }
return res;
    }
}
