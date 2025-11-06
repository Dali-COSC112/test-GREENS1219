/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int select = 4;
		System.out.println("1. Check if a number is even or odd\n2. Find the largest of three numbers\n3. Grade Calculator\n4. Simple calculator (+,-,*,/)\n5. Exit enter your choice:");;

		switch (select) {
		case 1:
			int n = 6;
			if(n%2 ==0) {
				System.out.println("even");
			} else System.out.println("odd");
			break;
		case 2:
			int a = 7;
			int b = 8;
			int c = 9;
			if((a > b) && (a > c)) {
				System.out.println(a);
			} else if((b > a) && (b > c)) {
				System.out.println(b);
			} else System.out.println(c);
			break;
		case 3:
			int score = 79;
			if(score >= 90) {
				System.out.println("A");
			} else if (score >= 80) {
				System.out.println("B");
			} else if (score >= 70) {
				System.out.println("C");
			} else if (score >= 60) {
				System.out.println("D");
			} else System.out.println("F");
			break;
		case 4:
			int op = 4;
			int num1 = 20;
			int num2 = 5;
			switch (op) {
			case 1:
				System.out.println(num1+num2);
				break;
			case 2:
				System.out.println(num1-num2);
				break;
			case 3:
				System.out.println(num1*num2);
				break;
			case 4:
				if((num1 == 0) || (num2 == 0)) {
					System.out.println("Cant divide by zero");
					break;
				} else System.out.println(num1/num2);
				break;
			}
			break;
		case 5:
			System.out.println("Goodbye!");
			break;
		default:
			System.out.println("Invalid Menu Option");
		}
	}
}
