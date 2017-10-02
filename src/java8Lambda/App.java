package java8Lambda;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner = new Runner();
		runner.run(new Executable(){

			@Override
			public void execute() {
				// TODO Auto-generated method stub
				
				System.out.println("this is old version of java");
			}
			
		});
		System.out.println("-------------------------------------------------");
		System.out.println("this is the new version of java -8 lambda function");
		System.out.println("--------------------------------------------------");
		runner.run(() -> {System.out.println("This is new java version 8 - lambda ");});
	}

}
