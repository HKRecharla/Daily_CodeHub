package maths_PrimeNumber;

public class SeiveMen_Prime {

    public static void main(String[] args) {
        seive(10);
    }
    
    public static void seive(int A){
        
        Boolean[] b = new Boolean[A+1];
        for (int i = 0; i <=A; i++) {
            b[i]=true;
        }

        for (int i = 2; i <=A; i++) {
            if(b[i]==true){
                for (int j = i; j*i<=A; j++) {
                    b[i*j]=false;
                }
            }
        }

        for (int i = 2; i < b.length; i++) {
            if(b[i]==true){
                System.out.print(i+" ");
            }
        }
    }
}
