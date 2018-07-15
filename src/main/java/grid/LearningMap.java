package grid;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearningMap {

	public static void main(String[] args) {
		String company = "Accenture";
		char[] charArray = company.toCharArray();
		Map<Character, Integer> map= new LinkedHashMap<Character, Integer>();

		for (char eachChar : charArray) {
			System.out.println(eachChar);

			if (map.containsKey(eachChar))
			{
				map.put(eachChar, map.get(eachChar)+1);
			}
			else
			{
				map.put(eachChar, 1);
			}

		}
		System.out.println(map);
	}

}
