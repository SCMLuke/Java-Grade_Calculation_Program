public class Preliminary {
    public void preliminaryCalc() {

        int prelimGrade;
        int validationCheckPreliminary = 1;

        while (validationCheckPreliminary == 1) {

            System.out.println("Enter a grade for the prelim: ");
            prelimGrade = Main.userinput.nextInt();

            if (prelimGrade < 0 || prelimGrade > 100) {

                System.out.println("Please enter an integer between 0 and 100.");

            } else {

                Main.setPreliminaryTest(prelimGrade);
                validationCheckPreliminary = 0;

            }
        }
    }
}
