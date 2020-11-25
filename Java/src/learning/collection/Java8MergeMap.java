package learning.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8MergeMap {

	public static void main(String[] args) {
		Map<Integer, Student> map1 =new HashMap<>();
		Map<Integer, Student> map2 =new HashMap<>();

		Student stud1= new Student(01,"Angad");
		map1.put(stud1.getRoll(),stud1);
		Student stud2= new Student(02,"Angad1");
		map2.put(stud2.getRoll(),stud2);
		
		Map<Integer, Student> map3 = map2.entrySet()
				  .stream()
				  .collect(Collectors.toMap(
				    Map.Entry::getKey,
				    Map.Entry::getValue,
				    (v1, v2) -> new Student(v1.getRoll(), v2.getName()),
				  () -> new HashMap<>(map1)));
		
		System.out.println("Map3"+map3);
	}
}
