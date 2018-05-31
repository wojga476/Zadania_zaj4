public class TriangleTest {

    public static void main(String[] args) {
        Triangle sprawdzenie =new Triangle(40,50);
        boolean czyProst = sprawdzenie.isRightTriangle(sprawdzenie);
        System.out.println(czyProst);
    }
}
