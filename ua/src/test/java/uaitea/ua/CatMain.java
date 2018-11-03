package uaitea.ua;

public class CatMain {

	public static void main(String[] args) {
		CatLogger logger= new CatLogger();
	CatFactory factory=new CatFactory(logger);
	
	factory.addCat("Susleg");

	}

}
