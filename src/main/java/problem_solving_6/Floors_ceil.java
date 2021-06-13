package problem_solving_6;

public class Floors_ceil {

    public static void main(String[] args) {
        int A=6;
        int B=6;
        int C=4;

        int a =0;
        int b=0;
        if(A%C==0){
            a=A / C;
        }else{
            a=(A / C)+1;
        }

        if(B%C==0){
            b= B/C;
        }else{
            b=(B/C)+1;
        }

        int c = (int)Math.ceil(a) * (int)Math.ceil(b);
        System.out.println(c);

    }
}
