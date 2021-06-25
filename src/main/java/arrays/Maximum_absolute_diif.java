package arrays;

public class Maximum_absolute_diif {

    public int maxArr(int[] A) {
        int n=A.length;
        int[] a= new int[n];
        int[]b = new int[n];
        for(int i=0;i<n;i++){
            a[i]=A[i]+i;
            b[i]=A[i]-i;
        }

        int x =a[0];
        int y =a[0];
        for(int i=0;i<n;i++){
            if(a[i]>x){
                x=a[i];
            }
            if(a[i]<y){
                y=a[i];
            }
        }

        int max = (x-y);

        x =b[0];
        y =b[0];
        for(int i=0;i<n;i++){
            if(b[i]>x){
                x=b[i];
            }
            if(b[i]<y){
                y=b[i];
            }
        }

        int min =(x-y);

        return Math.max(max,min);

    }
}
