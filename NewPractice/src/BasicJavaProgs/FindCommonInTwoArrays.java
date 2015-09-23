package BasicJavaProgs;

import java.util.ArrayList;
import java.util.List;

public class FindCommonInTwoArrays {

	public List<Integer> commonIntegers(int[] a, int[] b) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					list.add(a[i]);
				}
			}
		}
		return list;
	}

}
