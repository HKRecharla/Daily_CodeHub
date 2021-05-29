package strings_cla;

public class CountAccurence {

    public static void main(String[] args) {
        String A= "bobob";

        String B = "bob";
        int loop=3;
        int count =0;
        for (int i = 0; i < A.length()-2; i++) {
            String sub = A.substring(i,loop);
            if(sub.equalsIgnoreCase(B)){
                count++;
            }
            loop++;
        }
        System.out.println(count);

    }
}
