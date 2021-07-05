package problem_solving_6;

public class Bulbs {

    public static void main(String[] args) {


        int[] A={ 1,0, 1, 0,0, 1};
       int a = bulbs1(A);
        System.out.println(a);
        int max = Integer.MIN_VALUE;
    }



    public static int bulbs1(int[] A) {

        int state = 0, ans = 0;

        // state variable will represent the state which we have to change.
        for (int i = 0; i < A.length; i++) {

            if (A[i] == state) {
                ans++;
                state = 1 - state;
                System.out.println(state);
            }
        }
        return ans;
    }
    public static void bulbs(int[] A) {

        int len = A.length;
        int index=0;
        int ones=0;
        int zeros=0;

        if(A.length==0){
           // return 0;
        }
        for(int i=0;i<len;i++){
            if(A[i]==0){
                zeros++;
            }if(A[i]==1){
                ones++;
            }
        }

        if(zeros==len){
           // return 1;
        }else if(ones==len){
            //return 0;
        }

        for(int i=0;i<len;i++){
            if(A[i]==0){
                index=i;
                break;
            }
        }

        int count=0;
        int block=0;
        boolean flag= false;
        int i=index;
        int j=index;
        while(i<len){
            if(A[i]==0){
                flag=true;
            }else{
                if(flag==true){
                    block++;
                }
                flag=false;
            }
            i++;
        }
        if(flag==true){
            block++;
        }
        flag=false;
        while(j<len){
            if(A[j]==1){
                flag=true;
            }else{
                if(flag==true){
                    block++;
                }
                flag=false;
            }
            j++;
        }
        if(flag==true){
            block++;
        }

    }



}
