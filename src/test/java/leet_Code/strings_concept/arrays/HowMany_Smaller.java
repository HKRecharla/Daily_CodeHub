package leet_Code.strings_concept.arrays;

public class HowMany_Smaller {


    public static void main(String[] args) {
        int indices[] ={8,1,2,2,3};

        String s ="";
        for(int i=0;i<indices.length;i++){
            s.charAt(indices[i]);
            String res = String.valueOf(s.charAt[indices[i]]);
        }


        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
        int count =0;
            for (int j = i; j < nums.length; j++) {
                if(nums[i]>=nums[j+1]){
                    count++;
                }

            }
            res[i]=count;
        }

    }
}
