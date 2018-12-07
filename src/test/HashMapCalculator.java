package test;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {

	public ArrayList<String> commonKeyValues(ArrayList<Integer> list, HashMap<Integer, String> map) {
		ArrayList<String> strings = new ArrayList<String>();
		for (Integer key : map.keySet()) {
			String s = map.get(key);

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).equals(key)) {
					strings.add(s);
				}
			}

		}

		return strings;

	}

}
