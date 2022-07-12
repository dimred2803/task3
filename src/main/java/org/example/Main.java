package org.example;

public class Main {

    public static double func (int x1, int y1, int x2, int y2, int x3, int y3) {
        double square = 0.0;
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)),
                b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3)),
                c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));


        if (a + b <= c || a + c <= b || a + c <= b) {
            System.out.println("this triangle does not exist according to the triangle inequality");
            return 0;
        }
        else
        {
            double p = (a + b + c) / 2;
            square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return square;
    }

    public static void main(String[] args) {

        int x1 = 3, x2 = 5, x3 = 0;
        int y1 = 0, y2 = 6, y3 = 1;

        System.out.println("Area of a triangle: " + func(x1,y1,x2,y2,x3,y3));
    }
}
