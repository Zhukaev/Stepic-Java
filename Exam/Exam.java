import java.util.List;
import java.util.Map;

/**
 * Created by Æóê on 21.03.2016.
 */
public class Exam {
	public static int maxLandSize(double[][] map) {
		int max = 0;
		int MAX = 0;
		int[][] behere = new int[map.length][map[0].length];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				max = maxLand(map, i, j, behere);
				if (MAX < max) MAX = max;
			}
		}
		return MAX;
	}
	static int maxLand(double[][] map, int i, int j, int[][] behere){

		if ( i < map.length && j < map[0].length && i >= 0 && j >= 0 && map[i][j] >= 0  && behere[i][j] != 1) {
			behere[i][j] = 1;
			return  maxLand(map, i + 1, j, behere) +
					maxLand(map, i - 1, j, behere) +
					maxLand(map, i, j + 1, behere) +
					maxLand(map, i, j - 1, behere) + 1;
		}
		return 0;
	}

	public static <T> boolean isSymmetric(Map<T, List<T>> graph) {
		for (Map.Entry<T,List<T>> m : graph.entrySet()) {
			for (T n : m.getValue()) {
				if (graph.get(n) == null) return false;
				else if (!graph.get(n).contains(m.getKey())) return false;
			}
		}
		return true;
	}
}
