
public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = sum(100);
		System.out.println(sum);
	}

	private static int sum(int num) {
		if(num==1)
			return num;
		else
			return num+sum(--num);	
	}

}
