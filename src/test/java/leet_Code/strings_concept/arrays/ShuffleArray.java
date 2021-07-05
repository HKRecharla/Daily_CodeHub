package leet_Code.strings_concept.arrays;

public class ShuffleArray {

    public static void main(String[] args) {
        int[] nums ={2,5,1,3,4,7};
        int n =3;
        int len = nums.length;

        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int temp =nums[i+1];
            int stemp =nums[n+i];
            nums[i+1]=stemp;
            nums[i+2]=temp;

        }


        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]+" ");
        }

    }
}
