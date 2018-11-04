package rotatesquarematrix;

public class RotateSquareMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][] {
			{1,2,3,4,5},
			{6,7,8,9, 10},
			{11,12,13,14,15},
			{16,17,18,19,20},
			{21,22,23,24,25}
		};
		toString(matrix);
		System.out.println("THE MATRIX ROTATION: "+rotateMatrix(matrix));
		toString(matrix);
		

	}
	
	public static boolean rotateMatrix(int[][] matrix) {
		if((matrix.length==0 && matrix[0].length==0) || (matrix.length!=matrix[0].length)) return false;
		int layer = matrix.length/2;
		int maxLength=matrix.length-1;
		while(layer>0) {
			rotate(matrix, layer, maxLength);
			layer--;
			maxLength=maxLength-1;
		}
		return true;
	}
	
	public static void rotate(int[][] matrix, int layer, int maxLength) {
		int temp = 0;
		int last=maxLength;
	    int first=matrix.length-maxLength-1;
	    System.out.println(first+" "+last);
		
		for(int i=first; i<=last; i++) {
			//int offset= i-first;
			temp=matrix[first][i];
			matrix[first][i]=matrix[i][last];
			matrix[last-i][last]=matrix[last][last-i];
			matrix[last][last-i]=matrix[last-i][first];			
			matrix[last-i][first]=temp;			
		}
		
	}
	
	public static void toString(int[][] matrix) {
		
		for(int i=0; i<matrix.length;i++) {
			System.out.println("\n");
			for(int j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]+", ");				
			}			
		}
		System.out.println();
			
	}

}
