package strings_cla;

public class Closest_palindrom {
    public static void main(String[] args) {

        String A="a";
        close(A);
    }

    public static String close(String A){

        int len = A.length();
        int count=0;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();

        for (int i = len-1 ; i >=0 ; i--) {
            sb.append(A.charAt(i)).toString();
        }

        if(A.equals(sb.toString())){

            if(len%2==1){
                System.out.println("YES");
                return "YES";
            }else{
                System.out.println("NO");
                return "NO";
            }
        }

        for (int i = 0; i < len/2; i++) {
            if(A.charAt(i)!=A.charAt(len-1-i)){
                count++;
            }
        }

        if(count>1){
            System.out.println("NO");
            return "NO";
        }
        System.out.println("YES");
        return "YES";
    }
    public static void closest(String A){

        int len = A.length();
        int l=0;
        int r=len-1;
        int v=1;
        boolean flag =false;
    if(A.length()==1){

    }
        while (l<r){
            if(A.charAt(l) == A.charAt(r)){
                l++;
                r--;
                flag=true;
                continue;
            }else if(A.charAt(l) != A.charAt(r) && v==1){
                flag=true;
                l++;
                r--;
                v++;
                continue;
            }else {
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrom");
        }
    }
}
