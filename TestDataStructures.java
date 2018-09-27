

public class TestDataStructures {
	private static LinkedList test = new LinkedList();

	public static void main (String[] args) {
		System.out.println("hello");
		test.addFirst(new String("this"));
		test.addFirst(new String("is"));
		test.addFirst(new String("a"));
		test.addFirst(new String("test"));

		test.addLast(new String("this-is-last"));

		System.out.println("again");
		System.out.println(test);
	}
}
