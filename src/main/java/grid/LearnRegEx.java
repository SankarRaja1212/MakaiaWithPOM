package grid;

import java.util.regex.Pattern;

public class LearnRegEx {

	public static void main(String[] args) {

		String name = "My Name is Sankar (9600067826)";
		String replaceAll = name.replaceAll("[a-zA-Z]", "");
		String replaceAll2 = replaceAll.replaceAll("\\s", "");
		System.out.println("Splitted Numbers are:" + replaceAll.replaceAll("\\W", ""));
				
		String replaceAll3 = name.replaceAll("\\W", "");
		String replaceAll4 = replaceAll3.replaceAll("\\d", "");
		System.out.println("Only Alphabets:" + replaceAll4);
		
		String replaceAll5 = name.replaceAll("\\w", "");
		System.out.println("Only Spl Char:" +replaceAll5);


	}

}
