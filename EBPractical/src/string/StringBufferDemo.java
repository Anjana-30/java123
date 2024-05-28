package string;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		// method append
		sb.append("java");
		System.out.println(sb);
		
		// method insert
		sb.insert(6,"test");
		System.out.println(sb);
		
		//method reverse
		sb.reverse();
		System.out.println(sb);
		
		//method length
		int size =sb.length();
		System.out.println(size);
		
		// method delete
		sb.delete(6,10);
		System.out.println(sb);
		
		// method replace
		sb.replace(0,5,"hi");
		System.out.println(sb);
		
		// method capasity
		int cap = sb.capacity();
		System.out.println(cap);
	}

}
