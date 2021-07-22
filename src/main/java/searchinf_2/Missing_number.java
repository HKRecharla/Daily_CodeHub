package searchinf_2;

public class Missing_number {


    public static void main(String[] args) {

    }

    public int solve(int[] A) {
        int ans = 0, n = A.length;
        int low = 0, high = n-1;
        while(low <= high){ // 2 pointers
            int mid = (high - low)/2 + low; // find mid
            if(mid == n - 1) //
                return A[n-1];
            if(A[mid] == A[mid+1])
                mid++;
            // if all elements with index < mid are occuring twice then mid should be odd
            if(mid%2 == 1)
                low = mid + 1;
            else{
                ans = mid;
                high = mid - 1;
            }
        }
        return A[ans];
    }
}
