import java.util.Scanner;

public class IntrotoStrings
	{

		public static void main(String[] args)
			{
			   challenge1();
			   challenge2();

			}

		private static void challenge1()
			{
				System.out.println("JUST SHOUT!!!");
				Scanner userInput = new Scanner(System.in);
				String Ucase = userInput.nextLine();
				
		        String Ucase1 = Ucase.toLowerCase();
				System.out.println(Ucase.substring(0,1) + Ucase1.substring(1));
			}
		private static void challenge2()
			{
				System.out.println("JUST SHOUT!!!");
				Scanner userInput = new Scanner(System.in);
				String Ucase = userInput.nextLine();
				
			    String Ucase1 = Ucase.toLowerCase();
				int Ucase2 = Ucase.length();
				System.out.println(Ucase.substring(0,1));
				for(int i=1; i<=Ucase2; i++)
					{
						System.out.println(Ucase1.substring(i,i+1));
					}
				
			}

	}
