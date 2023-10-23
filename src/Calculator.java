public class Calculator {
    public void averageCalc() {
        // This calculator will give you the average of the grades entered. Also good practice calculating average with some numbers in arraylists.

        // Average, total, and sum variables used for average calculation.
        double average;
        double total;
        double sum = 0;

        // Add homework grades to the sum.
        for (int num : Main.getHomework()) {
            sum += num;
        }

        // Add quiz grades to sum.
        for (int num : Main.getQuiz()) {
            sum += num;
        }

        // Add preliminary to sum.
        sum += Main.getPreliminaryTest();

        // Add final test to sum.
        sum += Main.getFinalTest();

        // Calculating the average of all grades using the sum calculated above, as well as '2' to represent the preliminary and final tests.
        total = Main.getHomework().size() + Main.getQuiz().size() + 2;
        average = sum / total;
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
