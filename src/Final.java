public class Final {
    public void finalCalc() {

        int finalGrade;
        int validationCheckFinal = 1;

        while (validationCheckFinal == 1) {

            System.out.println("Enter a grade for the final: ");
            finalGrade = Main.userinput.nextInt();

            if (finalGrade < 0 || finalGrade > 100) {

                System.out.println("Please enter an integer between 0 and 100.");

            } else {

                Main.setFinalTest(finalGrade);
                validationCheckFinal = 0;

            }
        }
    }

}
