package maths_PrimeNumber;

public class Merge_Intervals {


    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }

    }
//
//    vector<Interval> Solution::insert(vector<Interval> &A, Interval B) {
//        vector<Interval> merged;
//        if(A.empty()) {
//            merged.push_back(B);
//            return merged;
//        }
//
//        // initially merge partially (don't shrink here)
//        vector<Interval> full_i;
//        vector<Interval> b_l;
//        b_l.push_back(B);
//        int i = 0, j = 0;
//        int N = A.size();
//        while(i < N && j < 1) {
//            if(A[i].start <= b_l[j].start) {
//                full_i.push_back(A[i]);
//                i++;
//            } else {
//                full_i.push_back(b_l[j]);
//                j++;
//            }
//        }
//        while(i < N) {
//            full_i.push_back(A[i++]);
//        }
//        while(j < 1) {
//            full_i.push_back(b_l[j++]);
//        }
//
//        // finally shrink on full merged intervals
//        int s = full_i[0].start, e = full_i[0].end;
//        N = full_i.size();
//        for(int i = 1; i < N; i++) {
//            int t_s = full_i[i].start, t_e = full_i[i].end;
//            if(t_s > e) {
//                // sequence break
//                merged.push_back(Interval(s, e));
//                s = full_i[i].start;
//            }
//            e = max(e, t_e);
//        }
//        // merge last one
//        merged.push_back(Interval(s, e));
//
//        return merged;
//    }
}
