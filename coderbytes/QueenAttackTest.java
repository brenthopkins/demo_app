package coderbytes;

public class QueenAttackTest {

	public static int MatrixChallenge(String[] str) {
		String queenString = str[0].replace("(", "");
		queenString = queenString.replace(")", "");
		String[] queen = queenString.split(",");
		String kingString = str[1].replace("(", "");
		kingString = kingString.replace(")", "");
		String[] king = kingString.split(",");
		
		int qR = Integer.parseInt(queen[0]);
		int qF = Integer.parseInt(queen[1]);
		int kR = Integer.parseInt(king[0]);
		int kF = Integer.parseInt(king[1]);
		int count = 0;
		if (!canQueenAttack(qR, qF, kR, kF))	{
			return -1;			
		} else {
			int[][] kingMoves = getKingMoves(kR, kF);
			for (int i = 0; i < 8; i++) {
				if (!canQueenAttack(qR, qF, kingMoves[i][0], kingMoves[i][1])) {
					count++;
				}
			}
			
			
		}
		if (count > 0) {
			return count;
		}
		return -1;
	}
	static int[][] getKingMoves(int kR, int kF) {
		int[][] square = new int[8][8];

		square[0][0] = kR - 1;
		square[0][1] = kF - 1;
		square[1][0] = kR - 1;
		square[1][1] = kF;
		square[2][0] = kR - 1;
		square[2][1] = kF + 1;
		
		square[3][0] = kR;
		square[3][1] = kF - 1;
		square[4][0] = kR;
		square[4][1] = kF + 1;
		
		square[5][0] = kR + 1;
		square[5][1] = kF - 1;
		square[6][0] = kR + 1;
		square[6][1] = kF;
		square[7][0] = kR + 1;
		square[7][1] = kF + 1;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (square[i][j] < 1 || square[i][j] > 8) {
					square[i][j] = -1;
				}
			}
		}
		return square;
		
	}
		
	static boolean canQueenAttack(int qR, int qC, int oR, int oC) { 
		// If queen and the opponent 
		// are in the same row 
		if (qR == oR && qC == oC) {
			return false;
		}
		if (oR < 0 || oC < 0) {
			return true;
		}
			
		if (qR == oR) 
		return true; 

		// If queen and the opponent  
		// are in the same column 
		if (qC == oC) 
		return true; 

		// If queen can attack diagonally 
		if (Math.abs(qR - oR) == Math.abs(qC - oC)) 
		return true; 

		// Opponent is safe 
		return false; 
	} 
	
	 public static void main (String[] args) {  
		    // keep this function call here 
			String[] s = new String[] {"(4,4)","(6,6)"};
		    System.out.println(MatrixChallenge(s)); 
			String[] s1 = new String[] {"(1,1)","(1,4)"};
		    System.out.println(MatrixChallenge(s1)); 
			String[] s2 = new String[] {"(2,2)","(2,3)"};
		    System.out.println(MatrixChallenge(s2)); 
	 }   
	
}
