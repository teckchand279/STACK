
public class Main {
	public static void main(String[] args) {
		Stack st=new Stack(5);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.isEmpty();

		st.display();
		System.out.println(st.isFull());
		st.peek();
//		System.out.println(st.isEmpty());
//		System.out.println(st.pop());
//		System.out.println(st.peek());
		st.display();
		
	}

}
