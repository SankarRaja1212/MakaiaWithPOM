package grid;

public class LearningString {

	public static void main(String[] args) {
		String name = "Sankar";
		char[] charArray = name.toCharArray();
		int length = charArray.length;
		for (int i= length-1 ; i >= 0; i--)
		{
			System.out.println(charArray[i]);
		}
		
		StringBuilder build =new StringBuilder("Raja");
		StringBuilder reverse = build.reverse();
		System.out.println(reverse);
		
		
		StringBuffer buff =new StringBuffer("Arun");
		StringBuffer rev = buff.reverse();
		System.out.println(rev);
		
		String myName = "Sanaa";
		char[] charArr= myName.toCharArray();
		for (char c : charArr) {
		System.out.println(c);
		}
		
		String name1 = "Ram";
		char[] charArray1 = name1.toCharArray();
		int len = charArray1.length;
		for (int i= len-1 ; i >= 0; i--)
		{
			System.out.println(name1.charAt(i));
		}
		
					
	}

}
