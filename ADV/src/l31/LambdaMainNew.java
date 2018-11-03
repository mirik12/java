package adv03;

public class LambdaMainNew {
	public static void main(String[] args) {
		ForLambda fl=new ForLambda(){
			@Override
			public void div(int a, int b) {
				System.out.println(a/b);		
			}};
		
		LambdaClass lc=new LambdaClass();
		lc.divide((a,b)->System.out.println(a/b));
	}
}
