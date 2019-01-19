package practice1;

/*How to reverse a string, word, or phrase. 
 * Also known as a palindrome 
  */

public class ReverseString {
//reversing words in a string
// It's finally snowing and it should be snowing finally It's.
	public static void main(String[] args) {
		
		String str = "It's finally snowing";
		String str1 = " ";
		String a[] = str.split(" ");
		
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		
		}
		System.out.println(" ");
		for (int i = a.length-1; i>=0; i--)
		{
			str1 = str1 + a[i] + " ";
		}
		System.out.println(str1);
		
		

	}

}
