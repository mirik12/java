package adv03;

public class LambdaMain {

	public static void main(String[] args) {
		MyInt mi=new MyInt(){
			@Override
			public void doSomething() {
				System.out.println("Hello from Interface");			
			}};
		mi.doSomething();
		
		MyInt miL=()->{System.out.println("Hi");};
				
		miL.doSomething();
		//---------------------
		MyIntNew min=new MyIntNew(){

			@Override
			public void doSomething(int a) {
				System.out.println("You entered "+a);
				
			}};
			min.doSomething(66613);
			
			MyIntNew minL=(a)->System.out.println("You entered "+a);
			minL.doSomething(1);
	}

}
