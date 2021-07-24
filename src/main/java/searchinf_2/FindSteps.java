package searchinf_2;

public class FindSteps {

        public static int solve(int A) {

            int start =0;
            int current =0;
            for(int i=1;i<=A;i++){
                start =start+1;
                current+=start;
                if(current>A){
                    return start;
                }
            }
            return 0;
        }

    public static void main(String[] args) {
        int sol = solve(20);
        System.out.println(sol);
    }
}
