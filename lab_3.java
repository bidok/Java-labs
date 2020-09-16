
import static java.lang.Math.*;

public class lab_3 {
    public static void main(String[] args) {
        double totalArea =0;
        double start = 0;
        double finish = PI;
        int numOfSquare = 10;
        double y = 0.7;

        double segment = finish - start;
        double weidth = segment/numOfSquare;

        for (int i = 1; i < numOfSquare; i++) {
            double area = 0;
            double height = sin(i*segment/numOfSquare);
            if (height < y) {
                area = height * weidth;
                System.out.println("area of " + i +" square = " + area);
            } else {
                area = y * weidth;
                System.out.println("area of " + i +" square = " + area);
            }
            totalArea += area;
        }
        System.out.println("your integral = " + totalArea);
    }
}
