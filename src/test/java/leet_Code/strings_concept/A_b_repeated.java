package leet_Code.strings_concept;

public class A_b_repeated {

    public static void main(String[] args) {
        String[] s={"a","b","c","ab","ac","bc","abc"};

       countConsistentStrings("abc",s);
    }



    public static int countConsistentStrings(String allowed, String[] words) {

        String[] split = allowed.split("");

        int count=0;
        for (int i = 0; i < words.length; i++) {

            if(words[i].contains(allowed)){
                count++;
            }
        }

        System.out.println(count);

        return count;

    }
}
