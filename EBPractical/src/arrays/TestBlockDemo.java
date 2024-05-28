package arrays;

public class TestBlockDemo {

	public static void main(String[] args) {
		String name ="santhosh";
		int x =10;
		// using a text block to define a multi line string
		String textBlock = """
				{
				"name": "john doe";
				"age" : 30 ;
				"address" : 
				{
				"street": "123 main st",
				"city" : "anytown ",
				"state" : "ca",
				"zipcode" : "12345"
				my name is %s and my age is %d
				}
				}
				"""
		// output of textblock
				String final Mail = String .format(textblock,name,x);
				System.out.print(%s,name);
				System.out.print(%d,x);
	
				

	}

}
