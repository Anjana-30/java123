package arrays;

public class JaggedArray {

	public static void main(String[] args) {
		//initalisation and assigning
		
		
		int[][] jaggedArray = {
				new int[]{1,2},
				new int[]{3,4,5},
				new int[]{6}
		   };
		//allocating the memory for array
		
		jaggedArray = new int[3][]; // creating a jagged array with 3 rows
		jaggedArray[0]= new int [2]; //  1st row has 2 elements
		jaggedArray[1]= new int [3]; //  2nd row has 3 elements
		jaggedArray[2]= new int [1]; //  3rd row has 1 elements
		
		
		System.out.println("array value:"+ jaggedArray[1][1]);
		System.out.println("array value:"+ jaggedArray[2][0]);
		}

	}


