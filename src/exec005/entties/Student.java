package exec005.entties;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	public double finalGrade;

	public double checkFinalGrade() {

		return this.finalGrade = grade1 + grade2 + grade3;
	}

	public String checkApproved(double x) {

		if (x >= 60) {
			return "PASS";
		} else {
			return "FAILED";
		}

	}

	public void calcMissingPoints() {

		if (finalGrade < 60) {
			finalGrade = 60 - finalGrade;
			System.out.printf("MISSING %.2f POINTS", finalGrade);
		}

	}

	public String toString() {
		return String.format("FINAL GRADE = %.2f%n", checkFinalGrade()) + checkApproved(finalGrade);
	}

}
