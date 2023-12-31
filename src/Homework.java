public class Homework {

    // The method used to calculate the homework totals of the six students.
    public void homeworkCalc(int homeworkAmount) {
        for (int i = 1; i <= homeworkAmount; i++) {

            int validationCheckGrade = 1;
            int validationCheckSubmission = 1;
            int homeworkGrade;
            String submissionTime;
            String submissionMissed;

            while (validationCheckGrade == 1) {

                System.out.println("Enter a grade for homework #" + i + ": ");
                homeworkGrade = Main.getUserInput().nextInt();

                if (homeworkGrade >= 0 && homeworkGrade <= 100) {

                    validationCheckGrade = 0;

                    while (validationCheckSubmission == 1) {

                        System.out.println("Was homework "+i+" submitted on time? (y or n): ");
                        submissionTime = Main.getUserInput().next();

                        if (submissionTime.equals("y")) {

                            Main.getHomework().add(homeworkGrade);
                            validationCheckSubmission = 0;

                        } else if (submissionTime.equals("n")) {

                            System.out.println("Was it submitted within 24 hours?: ");
                            submissionMissed = Main.getUserInput().next();

                            if (submissionMissed.equals("y")) {

                                Main.getHomework().add((homeworkGrade-10));
                                validationCheckSubmission = 0;

                            } else if (submissionMissed.equals("n")) {

                                Main.getHomework().add((homeworkGrade=0));
                                validationCheckSubmission = 0;

                            } else {

                                System.out.println("Please enter either y or n");

                            }
                        } else {

                            System.out.println("Please enter either y or n");

                        }

                    }

                } else if (homeworkGrade < 0 || homeworkGrade > 100) {

                    System.out.println("Please enter a number between 0 and 100.");

                }
            }

        }
    }
}
