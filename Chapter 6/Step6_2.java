import java.util.HashSet;
import java.util.Set;

/**
 * Created by Æóê on 21.03.2016.
 */
public class Step6_2 {
	public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
		Set<T> set3 = new HashSet<T>();
		for (T e1: set1)
			if (set2.contains(e1) == false) set3.add(e1);
		for (T e2: set2)
			if (set1.contains(e2) == false) set3.add(e2);
		return set3;
	}
}
