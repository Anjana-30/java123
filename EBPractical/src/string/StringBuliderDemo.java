package string;

public class StringBuliderDemo {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("hello");
		System.out.println(str);
		System.out.println(str.hashCode());
		
		// method append
		str.append("java");
		System.out.println(str);
		
		// method insert
		str.insert(6,"test");
		System.out.println(str);
		
		//method reverse
		str.reverse();
		System.out.println(str);
		
		//method length
		int size =str.length();
		System.out.println(size);
		
		// method delete
		str.delete(6,10);
		System.out.println(str);
		
		// method replace
		str.replace(0,5,"hi");
		System.out.println(str);
		
		// method capasity
		int cap = str.capacity();
		System.out.println(cap);

	}

}
