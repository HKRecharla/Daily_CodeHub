package mathsModular;

public class Finding_Position {

    public static void main(String[] args) {
        position(10);
    }

    public static void position(int A){
        int a=2;
        int i=1;
        int ans =1;
        while (ans*2<=A){
           ans=ans*2;
        }
        System.out.println(ans);
    }
}
