package maths_Combinations;

public class Maximum_intersections {

    public static void main(String[] args) {
        int A=2;
        int B=2;

        int lines=0;
        int circles=0;
        int line_circle=0;

        lines=(A*(A-1))/2;
        circles = (B*(B-1));
        line_circle=A*B*2;

        int sum = lines+circles+line_circle;
        System.out.println(sum);
    }
}
