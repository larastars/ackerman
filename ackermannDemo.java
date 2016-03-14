
public class ackermannDemo {
	public static void main (String [] args)
	{
		ackermann ack = new ackermann();
		ack.setTable();
		int value = ack.Ackermann(3,7);
		System.out.println("count = " + ack.getCount());
		System.out.println("value = " + value);
	}

}
