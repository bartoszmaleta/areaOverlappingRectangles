package com.company;


public class Main {

    public static void main(String[] args) {
        Point leftCornerPointOfRectangle1 = new Point(-1, -1);
        Point rightCornerPointOfRectangle1 = new Point(10, 10);

        Point leftCornerPointOfRectangle2 = new Point(-1, 0);
        Point rightCornerPointOfRectangle2 = new Point(3, 9);

        System.out.println(overlappingArea(leftCornerPointOfRectangle1, rightCornerPointOfRectangle1, leftCornerPointOfRectangle2, rightCornerPointOfRectangle2));
    }

    // Returns Total Area of two overlap
    // rectangles
    static int overlappingArea(Point leftCornerPointOfRectangle1, Point rightCornerPointOfRectangle1,
                               Point leftCornerPointOfRectangle2, Point rightCornerPointOfRectangle2) {
        // Area of 1st Rectangle

        int area1 = Math.abs(leftCornerPointOfRectangle1.x - rightCornerPointOfRectangle1.x) *
                Math.abs(leftCornerPointOfRectangle1.y - rightCornerPointOfRectangle1.y);

        // Area of 2nd Rectangle
        int area2 = Math.abs(leftCornerPointOfRectangle2.x - rightCornerPointOfRectangle2.x) *
                Math.abs(leftCornerPointOfRectangle2.y - rightCornerPointOfRectangle2.y);

        // Common area
        int areaI = (Math.min(rightCornerPointOfRectangle1.x, rightCornerPointOfRectangle2.x) -
                Math.max(leftCornerPointOfRectangle1.x, leftCornerPointOfRectangle2.x)) *
                (Math.min(rightCornerPointOfRectangle1.y, rightCornerPointOfRectangle2.y) -
                        Math.max(leftCornerPointOfRectangle1.y, leftCornerPointOfRectangle2.y));

        return (area1 + area2 - areaI);
    }
}

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
};