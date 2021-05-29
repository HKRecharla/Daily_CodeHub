package strings_cla;

public class Common_Prefix {

    public static void main(String[] args) {
        String[] A={"ABCD"};
        prefix(A);


    }

    public static void prefix(String[] A){

        int alen=A.length;

        int min=Integer.MAX_VALUE;
        if (A.length==1){
            System.out.println(A[0]);
        }
        for (int i = 0; i < alen; i++) {
            min = Math.min(min,A[i].length());
        }

        //System.out.println(min);
        String str="";
        boolean flag= false;
        int val =0;
        for (int i = 0; i < min; i++) {
            String a="";
            for (int j = 0; j < alen-1; j++) {
               // System.out.println("i "+i+" j "+j);
                if(A[j].charAt(i)==A[j+1].charAt(i)){
                    flag = true;
                    a=String.valueOf(A[j].charAt(i));
                    continue;
                }else {
                    flag=false;
                    a="";
                    break;
                }

            }
            if(flag){
                str=str+a;
            }
            if(!flag){
                break;
            }
            val++;
        }
        System.out.println(str);

    }
}
