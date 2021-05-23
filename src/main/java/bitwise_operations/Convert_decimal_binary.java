package bitwise_operations;

public class Convert_decimal_binary {


    public static void main(String[] args) {
        int n=4;


        System.out.println(Math.sqrt(10));
        sol(n);
    }


    public static int solve(int A){

        int val=0;
        int binary =1000000007;
        for (int i = 1; i <=A; i++) {
           val = val+ convert(i);
        }

        return val%binary;
    }


    public static void sol(int A){ //9 +1

        int N= A+1; //10
        boolean flag =true;
        int i=2;
        int temp=0;
        int s =1;
        int sum=0;
        int f = 0;
        while (flag){
            int pair =N/i; //10/2 =5 , 10/4 =2
            int unpair = N-(N/i)*i; // 10(10/2)*2 ==
            sum =sum+(pair*s);
            //6*1 , 3*2 , 1*4 -- 6+6+4 = 16 + 4
            //5*1 , 2*2 , 1*4 -- 5+4+4 = 13 + 4

            if(unpair-s>0){
                temp = temp+unpair-s;
            }

            System.out.println(pair+" "+unpair +" "+sum +" "+temp);

            f = sum+temp;
            System.out.println(f);
            if(pair ==0){
                flag=false;
            }
            i =i*2; // 2 , 4, 8 ,16 ,32
            s=s*2; // 1*2 , 2*2 , 4*4
        }
    }


    public static void solve4(int A){
        int count=0;
        A=A+1;//as we would require 0 to A to get the results instead of 1 to A
        for(int i=0;i<=31;i++){
            //for each bit calculating the total number of set bits for numbers uptil A;
            // that is number of sets of 2^(i+1) ,each set consisting 2^(i) set bits and
            //then adding the remainder of bits by getting the modulus with 2^(i+1)
            //and subtracting the first 2^(i) 0's from the remainder if this result is
            //negative just take zero

            count=(count%1000000007
                    +(A/(int )Math.pow(2,i+1))
                    *(int )Math.pow(2,i)%1000000007
                    +Math.max(A%(int)Math.pow(2,i+1)
                    -(int)Math.pow(2,i),0)%1000000007)
                    %1000000007;
        }

        System.out.println(count);
    }


    public static void solve5(int A){
        int count=0;
        A=A+1;//as we would require 0 to A to get the results instead of 1 to A
        for(int i=0;i<=31;i++){

            int a = (int )Math.pow(2,i+1);
            int b =(int )Math.pow(2,i);
            int power =1000000007;
            count = (count%power
                    +(A/a*b)
                    +Math.max((A%a)-b,0)%power)%power;



            count=(count%1000000007
                    +(A/(int )Math.pow(2,i+1))
                    *(int )Math.pow(2,i)%1000000007
                    +Math.max(A%(int)Math.pow(2,i+1)
                    -(int)Math.pow(2,i),0)%1000000007)
                    %1000000007;
        }

        System.out.println(count);
    }


    public static int convert(int decimal){
        int[] binary =  new int[40];
        int count=0;
        while (decimal>0){
            binary[count++] = decimal%2;
            decimal =decimal/2;
        }

        int f =0;
        for (int i = count; i>=0 ; i--) {
            System.out.print(binary[i]);
           f = f+ binary[i];
        }
        return f;
    }

    public static int[] convert1(int decimal){
        int[] binary =  new int[40];
        int count=0;
        while (decimal>0){
            binary[count++] = decimal%2;
            decimal =decimal/2;
        }

        int[] binary1 =  new int[count];
        for (int i = count; i>=0 ; i--) {
            System.out.print(binary[i]);
            if(binary[i] ==0){
                binary1[i]= 1;
            }else{
                binary1[i]= 1;
            }

        }
        return binary1;
    }

    public static void convert_binary_decimal(){
        int n=5;
        //List<Integer> l;
        int a=0;
        for (int i = 0; i < n; i++) {
          //  l.add(a);
        }
    }
}
