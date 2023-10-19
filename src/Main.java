import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    // All the variables that will be used for calculating the different student scores.
    // User input
    static Scanner userinput = new Scanner(System.in);
    // Variable for final test.
    static int finalTest;
    // Variable for preliminary.
    static int preliminaryTest;
    // Arraylist for homework
    static ArrayList<Integer> homework = new ArrayList<>();
    // Arraylist for quizzes.
    static ArrayList<Integer> quiz = new ArrayList<>();



    public static void main(String[] args) {

        // Creating an object of the homework calculation class and using the method to calculate the students grades.
        Homework homeworkCalcMethod = new Homework();
        homeworkCalcMethod.homeworkCalc();

        // Object and method for preliminary class.
        Preliminary prelimCalcMethod = new Preliminary();
        prelimCalcMethod.preliminaryCalc();

        //Object and method for final class.
        Final finalCalcMethod = new Final();
        finalCalcMethod.finalCalc();

        // Object and method for quiz class.
        Quiz finalQuizCalc = new Quiz();
        finalQuizCalc.quizCalc();

        // Outputting the results of the methods.
        for (int i = 0; i < homework.size(); i++) {
            System.out.println(homework.get(i));
        }
        System.out.println(preliminaryTest);
        System.out.println(finalTest);
        for (int i = 0; i < quiz.size(); i++) {
            System.out.println(quiz.get(i));
        }

        // Creating object of Calculator class to use its method to calc final grade.
        Calculator average = new Calculator();
        average.averageCalc();

    }



    // The getter and setters for the variables so that other classes can use them.
    public static void setPreliminaryTest(int preliminaryTest) {
        Main.preliminaryTest = preliminaryTest;
    }
    public static int getPreliminaryTest() {
        return preliminaryTest;
    }

    public static void setFinalTest(int finalTest) {
        Main.finalTest = finalTest;
    }
    public static int getFinalTest() {
        return finalTest;
    }
}