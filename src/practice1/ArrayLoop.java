package practice1;

public class ArrayLoop {

	public static void main(String[] args) {
		//( 0,1,2,3)
		String testTakers[] = {"Shane", "Jana", "Chris", "Sarah"};

//		System.out.println(testTakers.length);
		//prints 4
		//if you type in i<= there will be an ArrayIndexOutOfBoundsException.
		for(int i =0; i<testTakers.length; i++) {
			System.out.println(testTakers[i]);
		}
	}

}
