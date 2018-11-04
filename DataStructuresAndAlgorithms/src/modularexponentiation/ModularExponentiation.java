package modularexponentiation;

public class ModularExponentiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calModularExp(2,3,5));
		System.out.println(calRecur(2,3)%5);
		

	}
	
	//O(N) time complexity 
	//How to get O(logN) time complexity
	public static int calModularExp(int x, int y, int z) {
		int result=1;
		if(x==0) return 0;
		if(y==0) return 1;
		if(z==0) return Integer.MIN_VALUE;
		while(y>0) {
			result=result*x;
			y--;
		}
		return result%z;
	}
	
	//O(logN) time complexity with recursion
	public static int calRecur(int x, int y) {
		if(y==0) return 1;
		if(y==1) return x;
		
		return calRecur(x, y/2) * x*x;
	}

}
