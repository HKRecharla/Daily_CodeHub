package strings_cla;

import java.util.Arrays;

public class Lexico_Largest {
    public static void main(String[] args) {

        String A="abb_c";
        //ittmcsvmoa_jktvvblefw

        largest_3(A);
    }


    public static void largest_3(String A){
        String[] sp = A.split("_");
        String left = sp[0];
        String right =sp[1];
        String s ="";
        int left_len= 0;
        int right_len=right.length()-1;
        boolean flag =true;

        StringBuilder sb = new StringBuilder(left);
        StringBuilder sb_right = new StringBuilder();
        String[] st = new String[right.length()];
        for (int i = 0; i < right.length(); i++) {
            st[i] = String.valueOf(right.charAt(i));
        }
        Arrays.sort(st);

//        for (int i = 0; i < st.length; i++) {
//            System.out.print(st[i]+" ");
//        }

        for (int i = 0; i < left.length(); i++) {
            for (int j = right_len ; j>=0 ; j--) {
                String ch = st[j];
                if(left.charAt(i)>='a' && left.charAt(i) <='z') {
                    int a = left.charAt(i) - 'a';
                    int b = ch.charAt(0) - 'a';
                    if(a<b){
                        sb.setCharAt(i,ch.charAt(0));
                        right_len--;
                        break;
                    }
                }
            }
        }

        System.out.println(sb.toString());

    }



    public static void largest_2(String A){
        String[] sp = A.split("_");
        String left = sp[0];
        String right =sp[1];
        String s ="";
        int left_len= 0;
        boolean flag =true;

        StringBuilder sb = new StringBuilder(A);
        for (int i = right.length()-1; i >=0; i--) {
            for (int j = left_len; j < left.length()-1; j++) {
                left_len =j;
                if(left.charAt(j)>='a' && left.charAt(j) <='z') {
                    int a = left.charAt(j) - 'a';
                    int a_ = left.charAt(j+1) - 'a';
                    int b = right.charAt(i) - 'a';

                    if(a<a_){
                        sb.setCharAt(j,right.charAt(i));
                        left_len++;
                        break;
                    }
                }
                }
        }
        String[] sp1 = sb.toString().split("_");
        System.out.println(sp1[0]);
    }

    
    
    public static void largest_1(String A){
        String[] sp = A.split("_");
        String left = sp[0];
        String right =sp[1];

        StringBuilder sb = new StringBuilder();
        String s ="";
        int left_len= left.length();
        boolean flag =true;
        for (int i = 0; i < right.length(); i++) {

            for (int j = left_len-1; j >=0; j--) {
                left_len =j;
                if(left.charAt(j)>='a' && left.charAt(j) <='z'){
                    int a = left.charAt(j) - 'a';
                    int b = right.charAt(i) - 'a';

                    if(b>a){
                        sb.append(left.charAt(j)).toString();
                        s =String.valueOf(left.charAt(j))+""+s;
                    }else {
                        s=  s.substring(0,s.length());
                        s =String.valueOf(right.charAt(i))+""+s;
                      flag=false;
                        // sb.replace(left.length()-1,left.length()-2,String.valueOf(right.charAt(i)));
                    }

                    if (j==0 && b<a){
                        if(s.isEmpty()) s=left;
                        s=  s.substring(1,s.length());
                        s =String.valueOf(left.charAt(i))+""+s;
                        //sb.replace(left.length()-1,left.length()-2,String.valueOf(right.charAt(i)));
                    }else if(j==0 && b>a){
                        s=  s.substring(1,s.length());
                        s =String.valueOf(right.charAt(i))+""+s;
                    }
                    if(flag==false) break;

                }
            }


        }
        if(s.isEmpty()){
            s=s+left;
        }
        System.out.println(s);
        
    }
    
    
    public static void largest(String A){

        String[] sp = A.split("_");
       char[] ch =  sp[0].toCharArray();
       char[] sub = sp[1].toCharArray();
       int max =0;

        for (int i = 0; i < sub.length; i++) {
            int cha =(sub[i]-'a');
            System.out.println(cha);
        }
        for (int i = 0; i < sp[0].length(); i++) {
            int cha =(ch[i]-'a');
            System.out.println(cha);
        }


        
        for (int i = 0; i < sub.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if(ch[j] <sub[i]){
                }
            }
        }
        
        
        
        
    }
}
