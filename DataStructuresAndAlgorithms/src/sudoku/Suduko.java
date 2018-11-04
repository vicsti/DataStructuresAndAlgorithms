package sudoku;

import java.awt.Point;

public class Suduko {
	private int[][] matrix;
	private int row, col;
	
	public Suduko() {
		//matrix=new int[9][9];	
		addDefaultSuduko();
	}
	
	private void addDefaultSuduko() {
	    matrix = new int[][] {{3, 0, 6, 5, 0, 8, 4, 0, 0}, 
                {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
                {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
                {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
                {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
                {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
                {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
                {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};
		
	}

	public int getCol() {
		// TODO Auto-generated method stub
		return matrix[0].length;
	}

	public int getRow() {
		// TODO Auto-generated method stub
		return matrix.length;
	}

	public boolean isSafe(int row, int col, int num) {
		int boxRow=row/3;
		int boxCol=col/3;

		if(row<0 || col <0) return false;
		//If the num is present in the row and col
		for(int i=0;i<9;i++) {
			if (matrix[row][i]==num || matrix[i][col]==num) {
				return false;
			}
		}
		//If the num is present in the 3x3 sub matrix
		for(int i=boxRow*3; i<boxRow*3+3;i++) {
			for(int j=boxCol*3; j<boxCol*3+3;j++) {
				if(matrix[i][j]==num) return false;
			}		
		}
		return true;
	}

	public void placeNumber(int row, int col, int num) {
		matrix[row][col]=num;
		
	}

	public void removeNumber(int row, int col) {
		matrix[row][col]=0;
	}

	public boolean findUnassigned() {
		for(int row=0; row<9;row++) {
			for(int col=0; col<9;col++) {
				if((matrix[row][col]==0)) {
					System.out.println("findUnassigned"+row+" "+col);
					setUnassigned(row, col);
					return true;
				}
			}
		}

		return false;
	}

	private void setUnassigned(int row, int col) {
		this.row=row;
		this.col=col;
		// TODO Auto-generated method stub		
	}

	public Point getUnassigned() {
		// TODO Auto-generated method stub
		return new Point(row, col);
	}

	public void printMat() {
	    for (int r = 0; r < 9; r++) 
	    { 
	        for (int d = 0; d < 9; d++) 
	        { 
	            System.out.print(matrix[r][d]); 
	            System.out.print(" "); 
	        } 
	        System.out.print("\n"); 
	          
	        if ((r + 1) % (int) Math.sqrt(9) == 0)  
	        { 
	            System.out.print(""); 
	        } 
	    } 
		
	}

}
