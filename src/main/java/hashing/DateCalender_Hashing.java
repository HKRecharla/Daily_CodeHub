package hashing;

import java.util.HashMap;

public class DateCalender_Hashing {


    public static void main(String[] args) {

        String  A = "3rd Jul 3532";
        solve(A);
    }


    public static void solve(String A){

        System.out.println(A);
        String[] sp = A.split("\\s+");

        String year = sp[2];

        HashMap<String,String> map = new HashMap<>();
        String[] montharr={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < montharr.length; i++) {
            int a = i+1;
            if(montharr[i].equalsIgnoreCase(sp[1])){
                if(a<=9){
                    map.put(sp[1].toString(),"0"+a);
                    break;
                }else{
                    map.put(sp[1].toString(),String.valueOf(a));
                }
            }
        }

        int d =0;
        System.out.println(String.valueOf(sp[0]).length());
        if(String.valueOf(sp[0]).length()<=3){
            d = Integer.parseInt(String.valueOf(sp[0].charAt(0)));
        }else{
            String a = String.valueOf(sp[0].charAt(0));
            String b = String.valueOf(sp[0].charAt(1));
            d = Integer.parseInt(a+""+b);
        }

        String day ="";
        if(d<=9){
            day = "0"+String.valueOf(d);
        }else{
            day = String.valueOf(d);
        }


        String date = year+"-"+map.get(sp[1])+"-"+day;

        System.out.println(date);

    }


}
