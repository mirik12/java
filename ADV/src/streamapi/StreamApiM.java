package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Stream;

public class StreamApiM {

	public static void main(String[] args) {
		List list= new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		List<String> s= new ArrayList<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		Stream<Integer> stream=list.stream();
		Stream<String> streamString=Stream.of("a1","b1","c1","a1","m1");
		IntStream streamFromArray=Arrays.stream(new int [] {});
		IntStream streamFromString="123456566".chars();
		//long c=streamString.filter("a"::equals).count();
		//System.out.println(c);
System.out.println(streamFromArray.findFirst().orElse(0));
System.out.println(s.stream().skip(s.size()-1).findAny().orElse("Empty"));
System.out.println(streamString.filter((a)->a.contains("a")).collect(Collectors.toList()));
	}

}
