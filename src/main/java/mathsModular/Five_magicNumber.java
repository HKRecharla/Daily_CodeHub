package mathsModular;

public class Five_magicNumber {

    public static void main(String[] args) {
        five(10);
    }


    public static void number(int A){
        int num =5;

        int[] res = new int[A+1];
        int p=2;
        res[0]=num;
        res[1]=(int)Math.pow(num,p);
        for (int i = 1; i <=A; i++) {
            int j=1;
            int sqr=(int)Math.pow(num,p);
            while (j<=i){
                res[j+1]=res[j-1]+sqr;
                j++;
            }
            p++;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

    public static void five(int A){
        int x=1;
        int ans=0;
        while (A>0){
            x=x*5;
            if(A%2==1){
                ans+=x;
            }
            A/=2;
        }
        System.out.println(ans);
    }
}
