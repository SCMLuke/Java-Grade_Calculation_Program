public class Quiz {
    public void quizCalc() {
        for (int i = 1; i <= 6; i++) {

            int validationCheckQuizGrade = 1;
            int quizGrade;

            while (validationCheckQuizGrade == 1) {

                System.out.println("Enter a grade for quiz #" + i + ": ");
                quizGrade = Main.userinput.nextInt();

                if (quizGrade >= 0 && quizGrade <= 100) {

                    validationCheckQuizGrade = 0;
                    Main.quiz.add(quizGrade);

                } else {

                    System.out.println("Please enter a number between 0 and 100.");

                }

            }


        }
    }
}
