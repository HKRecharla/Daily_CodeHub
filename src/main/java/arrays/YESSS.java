package arrays;

public class YESSS {

    public static void main(String[] args) {
        int[] a={5, 17, 100, 11};
        f(a);
    }


    public static void f(int[] a){

        int len =a.length;
        int first = a[0]*a[1]; //f*s
        int last = a[len-1]*a[len-2]; // l * LS

        int temp=0; int ref=0;

        for (int i = 0; i < len-2; i++) {
            ref = a[i]*a[i+2];
            a[i]=temp;
            temp=ref;
        }
        a[0]= first;
        a[a.length-1]=last;
        a[a.length-2]=temp;

        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
