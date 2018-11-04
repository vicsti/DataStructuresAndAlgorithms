package sudoku;

import java.awt.Point;

public class solveSuduko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Suduko board = new Suduko();
		solve(board);
		board.printMat();
		
	}
	
	public static boolean solve(Suduko board) {
		int row, col=-1;
		Point pair=null;
		//If no available pairs
		if(!board.findUnassigned()) {
			System.out.println("FALSE");
			return true;
		}
		//Get the next available position
		pair=board.getUnassigned();
		row=pair.x;
		col=pair.y;
		
		for(int num=1; num<=9;num++) {
			System.out.println("IsSafe"+row+" "+col+" "+num);
			if(board.isSafe(row, col, num)) {
				System.out.println("IsSafe"+row+" "+col+" "+num);
				board.placeNumber(row, col, num);
				if(solve(board)) return true;
				board.removeNumber(row, col);				
			}
		}		
		return false;
	}

}
