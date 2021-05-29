package strings_cla;

public class ReverseString {

    public static void main(String[] args) {

       String  A = "the sky is blue";
        String[] sp = A.split("\\s+");

        StringBuilder b= new StringBuilder();

        String res="";
        for(int i=0;i<sp.length;i++){
            if(i==sp.length-1){
                res = sp[i]+res;
            }else{
                res = " "+sp[i]+res;
            }

        }
        System.out.println(res);
    }
}
