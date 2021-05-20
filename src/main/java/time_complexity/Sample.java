package time_complexity;

public class Sample {

    public static void main(String[] args) {

        int n=10;
        func5(n);

    }


    public static void func5(int N){

        int count = 0;
        for (int i = N; i > 0; i /= 2) {
            System.out.println("i :"+i);
            for (int j = 0; j < i; j++) {
                //ystem.out.println("j :"+j);
                count += 1;
            }
            System.out.println();
        }//o(logn)* 0
    }

    public static void func1(int n){

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }


    public static void func2(int n){

        for (int i = 0; i < n; i+=2) {
            System.out.println(i);
        }
    }

    public static void func3(int n){

        for (int i = 1; i < n; i*=2) {
            System.out.println(i);
        }
    }

    public static void func4(int n){

        for (int i = n; i >=-1; i/=2) {
            System.out.println(i);
        }
    }
}
