package grid;

import java.util.regex.Pattern;

public class LearnRegEx2 {

	public static void main(String[] args) {

		String name = "My Name   is  Sankar";
		
		//Pattern pat = pat.matcher(format);
		
		String replaceAll = name.replaceAll("\\s", "");
		
		System.out.println(replaceAll);

	}

}
