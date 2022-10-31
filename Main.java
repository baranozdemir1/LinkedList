
public class Main {
	
	public static void main(String args[])
	{
		LinkedList ll = new LinkedList();

		// 20080601061
		ll.add(2);
		ll.add(0);
		ll.add(0);
		ll.add(8);
		ll.add(0);
		ll.add(6);
		ll.add(0);
		ll.add(1);
		ll.add(0);
		ll.add(6);
		ll.add(1);
		
		ll.printList();
		System.out.println();

		ll.delete(0);
		ll.delete(0);
		ll.delete(0);
		ll.delete(0);
		ll.delete(6);
		ll.delete(1);

		ll.printList();
		System.out.println();

		ll.addAt(3, 2);
		
		ll.printList();
		System.out.println();
	}

}