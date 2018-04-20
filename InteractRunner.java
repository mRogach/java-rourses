import java.util.Scanner;

public class InteractRunner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			Calculator calcucator = new Calculator();
			String exit = "no";
			while(!exit.equals("yes")) {
				System.out.println("Enter first arg: ");
				int first = Integer.valueOf(scanner.next());
				System.out.println("Enter second arg: ");
				int second = Integer.valueOf(scanner.next());
				System.out.println("Enter action(+, -, /, *): ");
				switch(scanner.next()) {
					case "+":
					calcucator.add(first, second);
					break;
					case "-":
					calcucator.substract(first, second);
					break;
					case "/":
					calcucator.devide(first, second);
					break;
					case "*":
					calcucator.multiply(first, second);
					break;
				}
					System.out.println("Result: " + calcucator.getResult());
					System.out.println("Exit : yes/no: ");
					exit = scanner.next();
			}
		} finally {
			scanner.close();
		}
	}
}