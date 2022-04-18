package exec005.entties;

public class Rectangle {

	public double width;
	public double heigh;

	public double area() {

		return width * heigh;
	}

	public double perimeter() {
		return (width * 2) + (heigh * 2);
	}

	public double diagonal() {

		return Math.sqrt(Math.pow(width, 2) + Math.pow(heigh, 2));
	}

	public String toString() {

		return String.format("AREA = %.2f%n", area()) + String.format("PERIMETER = %.2f%n", perimeter())
				+ String.format("DIAGONAL = %.2f%n", diagonal());

	}

}
