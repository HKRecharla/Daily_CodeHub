package maths;

public class Reverse_Integer {

    public static void main(String[] args) {

        int A=-1146467285;

        int rev = rev(A);

        System.out.println(rev);
    }

    public static int rev(int A){
        int rev_num=0;
        int prev_num =0;
        while (A!=0){
            int last=A%10;
            rev_num = rev_num*10+last;

            if((rev_num-last)/10 != prev_num){
                return 0;
            }
            prev_num =rev_num;

            A /=10;
        }
        return rev_num;
    }

    public static int reverse(int A){
        int rev_num=0;
        while (A!=0){
            int last =A%10;
            rev_num = rev_num*10+last;
            A /=10;
        }
        return rev_num;
    }

    public static String  str(int A){
        return String.valueOf(A);

    }

    public static int firstDigit(int A){
        while (A >= 10)
            A /= 10;
        return A;
    }
}
