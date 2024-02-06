import java.util.*;

class TV {
    boolean power;
    int channel;

    void power() {
        power = !power;
    };

    void channelUP() {
        ++channel;
    };

    void channelDown() {
        --channel;
    };
}

class VCR {
    boolean power;
    int counter = 0;

    void power() {
        power = !power;
    };

    void play() {
    };

    void stop() {
    };

    void rew() {
    };

    void ff() {
    };
}

class TVCR extends TV {
    VCR vcr = new VCR();

    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }
}

/*
 * class DrawShape {
 * public static void main(String[] args) {
 * Point[] p = {
 * new Point(100, 100),
 * new Point(140, 50),
 * new Point(200, 200)
 * };
 * Triangle t = new Triangle(p);
 * Circle c = new Circle(new Point(150, 150), 50);
 * 
 * t.draw();
 * c.draw();
 * }
 * 
 * }
 * 
 * class Shape {
 * String color = "black";
 * 
 * void draw() {
 * System.out.printf("[color = %s]\n", color);
 * }
 * }
 * 
 * class Point {
 * int x;
 * int y;
 * 
 * Point(int x, int y) {
 * this.x = x;
 * this.y = y;
 * }
 * 
 * Point() {
 * this(0, 0);
 * }
 * 
 * String getXY() {
 * return "(" + x + "," + y + ")";
 * }
 * }
 * 
 * class Circle extends Shape {
 * Point center; // 원의 원점좌표, 포함관계
 * int r;
 * 
 * Circle() {
 * this(new Point(0, 0), 100); // Circle(Point center, int r)를 호출
 * }
 * 
 * Circle(Point center, int r) {
 * this.center = center;
 * this.r = r;
 * }
 * 
 * void draw() {
 * System.out.printf("[center = (%d, %d), r = %d, color = %s]\n", center.x,
 * center.y, r, color);
 * }
 * }
 * 
 * class Triangle extends Shape {
 * Point[] p = new Point[3];
 * 
 * Triangle(Point[] p) {
 * this.p = p;
 * }
 * 
 * void draw() {
 * System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color = %s] \n", p[0].getXY(),
 * p[1].getXY(), p[2].getXY(),
 * color);
 * }
 * }
 */

/*
 * class Tv {
 * boolean power;
 * int channel;
 * 
 * void power() {
 * power = !power;
 * }
 * 
 * void channelUp() {
 * ++channel;
 * }
 * 
 * void channelDown() {
 * --channel;
 * }
 * }
 * 
 * class CaptionTv extends Tv {
 * boolean caption;
 * 
 * void displayCaption(String text) {
 * if (caption) {
 * System.out.println(text);
 * }
 * }
 * }
 * 
 * public class Java_Object2 {
 * public static void main(String args[]) {
 * CaptionTv ctv = new CaptionTv();
 * ctv.channel = 10;
 * ctv.channelUp();
 * System.out.println(ctv.channel);
 * 
 * ctv.displayCaption("Hello world");
 * ctv.caption = true;
 * ctv.displayCaption("Hello");
 * 
 * }
 * }
 */