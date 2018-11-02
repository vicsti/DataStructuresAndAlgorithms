package nqueenproblem;

public class nqueenProblem {
	
	public static void main(String[] args) {
		
	}

	public static boolean solve(Board board, int col) {
		
		if(col >= board.getMaxCol()) {
			return true;
		}
		
		for(int row=0;row<=board.getMaxRow();row++) {
			if(board.isSafe(row, col)) {
				board.placeQueen(row, col);
				if(solve(board, col+1)) return true;
				board.removeQueen(row, col);				
			}
		}		
		return false;		
	}
}
