package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Dedup {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Zen","Ben","Aarya","Aarya","Chandler", "Fidaa","Ben");
		Collections.sort(list);
		System.out.println(list);
		list = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
	}
}
