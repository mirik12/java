package uaitea.ua;

public class CatFactory {
	CatLogger logger;
public CatFactory(CatLogger logger) {
		
		this.logger = logger;
	}
void addCat(String name) {
	System.out.println("jjj"+ name +" created");
	System.out.println("Logging new caat");
}
}
