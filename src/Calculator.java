public class Calculator {
    public void averageCalc() {

        // All variables for homework.
        int homeworkSum = 0;
        int homeworkCount = Main.homework.size();
        double homeworkAverage;

        // All variables for quiz.
        int quizSum = 0;
        int quizCount = Main.quiz.size();
        double quizAverage;

        // Average used for all grades.
        double average;

        // Calculate the average for the homework grades.
        for (int numberHomework : Main.homework) {
            homeworkSum += numberHomework;
        }
        homeworkAverage = (double) homeworkSum / homeworkCount;

        // Calculate the average for the quiz grades.
        for (int numberQuiz : Main.quiz) {
            quizSum += numberQuiz;
        }
        quizAverage = (double) quizSum / quizCount;

        // Calculating the average of all grades using the averages above, as well as getters for the preliminary and final tests in Main.
        average = (homeworkAverage+quizAverage+Main.getFinalTest()+Main.getPreliminaryTest()) / 4;
        System.out.println("----------------------------------------\nFinal course score: "+average);
        // Calculating the letter grade.
        if (average > 90 && average <= 100) {
            System.out.println("\nYour letter grade is A.");
        } else if (average > 80 && average <= 90) {
            System.out.println("\nYour letter grade is B.");
        } else if (average > 70 && average <= 80) {
            System.out.println("\nYour letter grade is C.");
        } else if (average > 60 && average <= 70) {
            System.out.println("\nYour letter grade is D.");
        } else if (average > 50 && average <= 60) {
            System.out.println("\nYour letter grade is E.");
        } else {
            System.out.println("\nYour letter grade is F.");
        }

    }
}
