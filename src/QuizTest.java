import java.util.Scanner;

public class QuizTest {
    public static void main(String[] args) {

        MathQuiz wyniki = new MathQuiz();
        Scanner input = new Scanner(System.in);
        System.out.println("Jaki jest wynik mnożenia 3*5?");
        int wynMnoz = input.nextInt();
        System.out.println("Jakie jest pole kwadratu o boku 12?");
        int wynPola = input.nextInt();
        System.out.println("Jaki jest pierwiastek kwadratowy liczby 15129?");
        int wynKwad = input.nextInt();
        input.close();
        System.out.println("Wyniki testu:");
        wyniki.question1();
        wyniki.question2();
        wyniki.question3();
        }

    }


