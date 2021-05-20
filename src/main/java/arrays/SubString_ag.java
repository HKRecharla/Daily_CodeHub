package arrays;

public class SubString_ag {

    public static void main(String[] args) {

        String str = "GUGPUAGAFQBMPYAGGAAOALAELGGGAOGLGEGZ";
        sub(str);
    }


    public static void sub(String A){

        int acount=0;
        int gcount=0;
        int count=0;
        for (int i = A.length()-1; i>=0; i--) {

            if(A.charAt(i)=='g' || A.charAt(i)=='G'){
                gcount++;
            }
            if(A.charAt(i)=='a' || A.charAt(i)=='A'){
                if(i!=A.length()-1){
                    count  += gcount;
                    //acount=0;
                }
            }
        }
        System.out.println(count);

    }
}
