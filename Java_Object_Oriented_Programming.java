import java.util.*;

class BlockTest {
    static { // 클래스 초기화 블럭
        System.out.println("static {  }");
    }
    { // 인스턴스 초기화 블럭
        System.out.println("{  }");
    }

    public BlockTest() {
        System.out.println("생성자");
    }
}

public class Java_Object_Oriented_Programming {
    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest();");
        BlockTest bt = new BlockTest();

        System.out.println("BLockTest bt2 = new BlockTEst()");
        BlockTest bt2 = new BlockTest();
    }

    /*
     * static String concatenate(String delim, String... args) {
     * String result = "";
     * 
     * for (String str : args) {
     * result += str + delim;
     * }
     * return result;
     * }
     */
}

/*
 * class Car {
 * String color;
 * String gearType;
 * int door;
 * 
 * Car() {
 * this("white", "auto", 4);
 * }
 * 
 * Car(String color) {
 * this(color, "white", 4);
 * }
 * 
 * Car(String color, String gearType, int door) {
 * this.color = color;
 * this.gearType = gearType;
 * this.door = door;
 * }
 * }
 */

/*
 * class Data1 {
 * int value;
 * }
 * 
 * class Data2 {
 * int value;
 * 
 * Data2(int x) {
 * value = x;
 * }
 * }
 */

/*
 * class ReturnTest {
 * public static void main(String[] args) {
 * ReturnTest r = new ReturnTest();
 * 
 * int result = r.add(3, 5);
 * System.out.println(result);
 * 
 * int[] result2 = { 0 }; // 배열을 생성하고 result2[0]의 값을 0으로 초기화
 * r.add(3, 5, result2); // 배열을 add메서드의 매개변수로 전달
 * System.out.println(result2[0]);
 * }
 * 
 * int add(int a, int b) {
 * return a + b;
 * }
 * 
 * void add(int c, int d, int[] result) {
 * result[0] = c + d;
 * }
 * }
 */

/*
 * class Tv {
 * String color;
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
 * void channelDoen() {
 * --channel;
 * }
 * }
 * 
 * class Tvtest4 {
 * public static void main(String args[]) {
 * Tv[] tvArr = new Tv[3];
 * 
 * for (int i = 0; i < tvArr.length; i++) {
 * tvArr[i] = new Tv();
 * tvArr[i].channel = i + 10;
 * }
 * 
 * for (int i = 0; i < tvArr.length; i++) {
 * tvArr[i].channelUp();
 * System.out.printf("tvArr[%d].channel = %d\n", i, tvArr[i].channel);
 * }
 * }
 * }
 * 
 */

/*
 * class TvTest3 {
 * public static void main(String args[]) {
 * Tv t1 = new Tv();
 * Tv t2 = new Tv();
 * 
 * System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
 * System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
 * 
 * t2 = t1; // t1이 저장하고 있는 값(주소)를 t2에 저장
 * 
 * t1.channel = 7;
 * System.out.println("t1의 channel 값은 7입니다");
 * 
 * System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
 * System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
 * }
 * }
 */

/*
 * class TvTest2 {
 * public static void main(String args[]) {
 * Tv t1 = new Tv();
 * Tv t2 = new Tv();
 * 
 * System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
 * System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
 * 
 * t1.channel = 7;
 * System.out.println("t1의 channel 값은 7입니다");
 * 
 * System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
 * System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
 * }
 * }
 */