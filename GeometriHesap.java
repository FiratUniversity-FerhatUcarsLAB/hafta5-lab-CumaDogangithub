/*
 * Ad Soyad: Cuma Doğan
 * Ogrenci No: 250542003
 * Tarih: 11/11/2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */
import java.util.Scanner;

public class gorev1 {
    final static double PI = Math.PI;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double squareSide, rectangleSideWidth, rectangleSideHeight, circleR, triangleSide1, triangleSide2,
                triangleSide3;

        System.out.println("4 geometrik şeklin alan ve çevre hesaplamaları: ");
        System.out.print("Karenin Bir Kenar Uzunluğunu Giriniz :");
        squareSide = in.nextDouble();
        System.out.print("\nDikdörtgenin Kısa Kenarının Giriniz :");
        rectangleSideWidth = in.nextDouble();
        System.out.print("\ndikdörtgenin uzun kenarını giriniz :");
        rectangleSideHeight = in.nextDouble();
        System.out.print("\nDairenin yarı çapını giriniz :");
        circleR = in.nextDouble();
        System.out.print("\nÜçgenin 1. kenar uzunluğunu giriniz :");
        triangleSide1 = in.nextDouble();
        System.out.print("\nÜçgenin 2. kenar uzunluğunu giriniz :");
        triangleSide2 = in.nextDouble();
        System.out.print("\nÜçgenin 3. kenar uzunluğunu giriniz:");
        triangleSide3 = in.nextDouble();

        System.out.println("\n\nSonuçlar :");
        System.out.println("Karenin Alanı :" + calculateSquareArea(squareSide));
        System.out.println("Karenin Çevresi :" + calculateSquarePerimeter(squareSide));
        System.out.println("--------------------------");
        System.out.println("Dikdörtgenin Alanı :" + calculateRectangleArea(rectangleSideWidth, rectangleSideHeight));
        System.out.println(
                "Dikdörtgenin Çevresi :" + calculateRectanglePerimeter(rectangleSideWidth, rectangleSideHeight));
        System.out.println("-----------------------------");
        System.out.println("Dairenin Alanı :" + calculateCircleArea(circleR));
        System.out.println("Dairenin Çevresi :" + calculateCircleCircumference(circleR));
        System.out.println("-----------------------------");
        System.out.println("Üçgenin Alanı :" + calculateTriangleArea(triangleSide1, triangleSide2, triangleSide3));
        System.out
                .println("Üçgenin Çevresi :" + calculateTrianglePerimeter(triangleSide1, triangleSide2, triangleSide3));
        in.close();
    }

    // Kare Hesaplama
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateSquarePerimeter(double side) {
        return 4 * side;

    }

    // Dikdörtgen Hesaplamaları
    public static double calculateRectangleArea(double sideWidth, double sideHeight) {
        return sideWidth * sideHeight;
    }

    public static double calculateRectanglePerimeter(double sideWidth, double sideHeight) {
        return (2 * sideWidth) + (2 * sideHeight);
    }

    // Daire Hesaplama
    public static double calculateCircleArea(double r) {
        return PI * r * r;
    }

    public static double calculateCircleCircumference(double r) {
        return PI * r * 2;
    }

    // Üçgen Hesaplama
    public static double calculateTriangleArea(double side1, double side2, double side3) {
        double u = (side1 + side2 + side3) / 2;

        return Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));
    }

    public static double calculateTrianglePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

}
