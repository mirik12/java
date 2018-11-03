package uaitea.ua;

public class CatMarshal {

	public static void main(String[] args) {
//		Cat cat=new Cat ("kREVEDKO", 11);
//		CatParser p=new CatParser();
//		p.saveObject(new File("cat.xml",cat ));
		CatParser p=new CatParser();
Cat cat=p.getObject(new File"cat.xml",Cat.class);
System.out.println(cat);
	}

}
