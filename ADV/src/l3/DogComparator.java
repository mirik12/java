package l3;

import java.util.Comparator;

public class DogComparator implements Comparator<Dog> {
@Override
public int compare (Dog o1, Dog o2) {
	
		return o1.age<o2.age?1:-1;
	}
	
}

