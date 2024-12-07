
public class Main {

	public static void main(String[] args) {

		String name = "Bob";
		int age = 31;
		double income = 5000.00;
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		System.out.println("Result = " + x + " meters");
		System.out.printf("Result = %.2f meters\n", x);
		System.out.printf("%s is %d years old and earns $%.2f\n", name, age, income);
	}
}
