
public class LinkedList 
{
	Node head;
	Node tail;
	int size;
	
	public LinkedList()
	{
		head = new Node(-1);
		tail = new Node(-1);
		head.setNext(tail);
		tail.setPrev(head);		
		size = 0;
	}
	
	public void printList()
	{
		int ctr = 0;
		Node iter = head;
		while(ctr < size)
		{
			iter = iter.getNext();
			System.out.print(iter.getData() + " ");
			ctr++;
		}
	}

	public void addToStart(int data)
	{
		Node newNode = new Node(data);
		newNode.setNext(head.getNext());
		newNode.setPrev(head);
		head.getNext().setPrev(newNode);
		head.setNext(newNode);
		size++;
	}
	
	public void add(int data)
	{
		Node newNode = new Node(data);
		Node lastNode = tail.getPrev();
		lastNode.setNext(newNode);
		newNode.setPrev(lastNode);
		newNode.setNext(tail);
		tail.setPrev(newNode);
		size++;
	}
	
	public void delete(Node data)
	{
		Node iter = head;
		while(iter != tail)
		{
			if(iter.getData() == data.getData())
			{
				iter.getPrev().setNext(iter.getNext());
				iter.getNext().setPrev(iter.getPrev());
				size--;
				return;
			}
			iter = iter.getNext();
		}
	}
	
	public void delete(int data)
	{
		Node iter = head;
		while(iter != tail)
		{
			if(iter.getData() == data)
			{
				iter.getPrev().setNext(iter.getNext());
				iter.getNext().setPrev(iter.getPrev());
				size--;
				return;
			}
			iter = iter.getNext();
		}
	}

	public void addAt(int data, int position)
	{
		Node newNode = new Node(data);
		Node iter = head;
		int ctr = 0;
		while(ctr < position)
		{
			iter = iter.getNext();
			ctr++;
		}
		newNode.setNext(iter.getNext());
		newNode.setPrev(iter);
		iter.getNext().setPrev(newNode);
		iter.setNext(newNode);
		size++;
	}
	
}