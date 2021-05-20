package arrays;

public class FizzBuzz {

    public static void main(String[] args) {
        int A=3;
        fizz(A);
    }


    public static void fizz(int A){

        String[] s = new String[A];
        for (int i = 1; i <=A; i++) {

            s[i-1]= String.valueOf(i);
            if(i%3==0){
                s[i-1]= "FIZZ";
            }
            if(i%5==0){
                s[i-1]= "BUZZ";
            }
            if(i%3==0 && i%5==0){
                s[i-1]= "FIZBUZZ";
            }
        }
        for (int i = 0; i <A; i++) {
            System.out.println(s[i]);
        }
    }
}
