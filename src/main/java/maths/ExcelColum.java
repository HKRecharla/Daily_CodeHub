package maths;

public class ExcelColum {

    public static void main(String[] args) {
        String A = "AB";
        excel(A);
    }
    
    public static int excel(String A){
        int len =26;
        int sum = 0;
        for (int i = 0; i < A.length(); i++) {
            int val = A.charAt(A.length() - i-1) - 'A' + 1;
            sum += ((val)*(int)Math.pow(len,i));
        }
        return sum;
    }
}
