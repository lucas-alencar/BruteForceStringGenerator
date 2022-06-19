package Main;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Executor executor = new Executor(scanner);
		try {
			if(executor.start() == false)
				throw new Exception("some error occurred while running the process");		
		}
		catch(Error E) {
			System.out.println(E);
		}
	}
}
