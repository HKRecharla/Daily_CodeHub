package arrays;

public class Left_right_ones {


    public static void main(String[] args) {


        String A ="100001011";


        //System.out.println(Math.sqrt(256));
        solve(A);
    }


    public static void solve4(String A){

        int[] ones = new int[A.length()];

        int c =0;
        for (int i = 0; i < A.length(); i++) {

            if(A.charAt(i)=='1'){
                ones[c] = i;
                c++;
            }
        }

        for (int i = 0; i < ones.length; i++) {
            System.out.print(ones[i]);
        }

        int count =1;
        int a =0;
        for (int i = 0; i < ones.length-1; i++) {
            if(ones[i]>0){

                if(ones[i+1] - ones[i] == 2){
                    count = count+1;
                }else if((ones[i+1] - ones[i])>= 3){
                    count=1;
                    count=count+1;
                }else if(ones[i+1] - ones[i] == 1){

                }

            }

        }





    }

    public static void solve2(String A){

        int len = A.length();

        int count =0;
        String ans ="";
        int res=0;
        for (int i = 0; i < len ; i++) {
            if(A.charAt(i) == '1'){
                count = count+1;
            }else{
                if(count!=0){
                    ans=ans+""+count;
                }
                count=0;
            }
        }
        if(A.charAt(len-1)=='1'){
            ans =ans +""+count;
        }

        System.out.println(ans);

        if(ans.length()>1){
            for (int i = 0; i < ans.length()-1; i++) {
                int a =Integer.parseInt(String.valueOf(ans.charAt(i)));
                int b=Integer.parseInt(String.valueOf(ans.charAt(i+1)));
                if(a==b){
                    res= Math.max(res,(a+b)+1);
                }else{
                    res= Math.max(res,(a+b)-1);
                }

            }
        }else{
            res = Integer.parseInt(String.valueOf(ans.charAt(0)));
        }
        System.out.println(res);

    }

    public static void solve(String A){

        int[] a =  new int[A.length()];
        int[] b = new int[A.length()];


        //left
        int count =0;
        for (int i = 0; i < a.length; i++) {
            if(A.charAt(i) == '1'){
                count++;
            }else{
                count=0;
            }
            a[i]=count;
        }

        System.out.println();
        //right
        count =0;
        for (int i = a.length-1; i>=0; i--) {
            if(A.charAt(i) == '1'){
                count++;
            }else{
                count=0;
            }
            b[i]=count;
        }

        //totalones
        int ones= 0;
        for (int i = 0; i < a.length; i++) {
            if(A.charAt(i)=='1'){
                ones++;
            }

        }

        int ans =0;
        int len=0;
        for (int i = 0; i <a.length; i++) {

            if(A.charAt(i) =='1'){
                ans = Math.max(ans,a[i]+b[i] -1);
            }else{

                int l=0;
                int r=0;
                if(i-1 <0){
                    l=0;
                }else{
                    l=i-1;
                }
                if(i+1>a.length){
                    r=a.length-1;
                }else{
                    r=i+1;
                }


                    len =a[l]+b[r] +1;
                    if(len<=ones){
                        ans = Math.max(ans,len);
                    }else{
                        ans = Math.max(ans,a[l]+b[r]);
                    }
                }



        }
        //010100110101

        System.out.println(ans);



    }
}
