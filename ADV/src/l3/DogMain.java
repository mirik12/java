package l3;

import java.util.Comparator;
import java.util.TreeSet;

public class DogMain {

	public static void main(String[] args) {
	Dog dog1= new Dog ("a",5);
	Dog dog2=new Dog ("b",8);
	//DogComparator dc=new DogComparator ();
	Comparator<Dog> dc= new Comparator<Dog> () {
		@Override
		public int compare (Dog o1, Dog o2) {
		return o1.age<o2.age?1:-1;
	}};
	
	
	TreeSet<Dog> set=new TreeSet<Dog> ((o1,o2)->(o1.age<o2.age?1:-1));
	set.add(dog2);
	set.add(dog1);
	System.out.println(set);
	}

}
