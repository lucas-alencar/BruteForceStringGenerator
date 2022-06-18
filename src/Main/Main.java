package Main;

public class Main {
	public static void main(String args[]) throws Exception {
		Executor executor = new Executor();
		try {
			if(executor.start() == false)
				throw new Exception();		
		}
		catch(Error E) {
			System.out.println(E);
		}
	}
}
