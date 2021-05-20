package arrays;

public class Recur {
    public static void main(String[] args) {

        int[] V = {0,1,3,3,4,5,7,7,8,9};
        int y = searchNumOccurrence(V,7,0,V.length-1);
        System.out.println(y);
    }


    public static int searchNumOccurrence(int[]V, int k, int start, int end) {
        int o=0;
        int h=0;
        if (start > end)return 0;
        int mid = (start + end) / 2;
        System.out.println("mid = "+"(start+"+"end)/2 ("+start+"+"+end+")/"+2+"--> mid="+mid);
        if (V[mid] < k){
            System.out.println("    V[mid] < k ==> "+V[mid]+"<"+k+"---> mid= "+mid+1+" end= "+end);
            return searchNumOccurrence(V, k, mid + 1, end);
        }
        if (V[mid] > k){
            System.out.println("    V[mid] > k ==> "+V[mid]+">"+k+ "---> start = "+start+" mid= "+mid+1);
            return searchNumOccurrence(V, k, start, mid - 1);}
        System.out.println();
         o= searchNumOccurrence(V, k, start, mid - 1) + 1;
         h =searchNumOccurrence(V, k, mid + 1, end);
        return o+h;
    }
}
