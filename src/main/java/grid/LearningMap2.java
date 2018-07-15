package grid;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearningMap2 {

	public static void main(String[] args) {

		String name = "FiveDreams";
		char[] charArr = name.toCharArray();

		Map<Character, Integer> val = new LinkedHashMap<Character, Integer>();

		for (char eachCh : charArr) {

			if (val.containsKey(eachCh))
			{
				val.put(eachCh, val.get(eachCh)+1);
				//int max = val.put(eachCh, val.get(eachCh)+1);
				//System.out.println(max);
				
			}
			else
			{
				val.put(eachCh,  1);
				//Integer min = val.put(eachCh,  1);
				//System.out.println(min);
			}

		}
		System.out.println(val);


	}
}

