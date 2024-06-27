import java.util.Scanner;
import java.util.*;
public class Main{
	public static void main(String[] args){
		puzzle p = new puzzle();

		// int[] board = {	15, 14, 13, 12, 
		// 				11, 10, 9, 8, 
		// 				7, 6, 5, 4, 
		// 				3, 2, 1, 16   };

		int[] board = p.create();
		p.print(board);
		System.out.println(p.possible(board));

		int[][] board2 = new int[4][4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				board2[i][j] = board[(i * 4) + j];
			}
			
		}



		for(int i = 0; i < board2.length; i++) {
			for(int j = 0; j < board2[i].length; j++) {
				System.out.print(board2[i][j] + ", ");
			}
			System.out.println("},");
		}

		System.out.println(test.isSolvable(board2));
		System.out.println(test.isSolvable(board2)
                               ? "Solvable"
                               : "Not Solvable");



	
		// int step = 100;
		// while(step > 0) {
		// 	board = p.create();
		// 	board2 = new int[4][4];
		// 	for(int i = 0; i < 4; i++) {
		// 		for(int j = 0; j < 4; j++) {
		// 			board2[i][j] = board[(i * 4) + j];
		// 		}
		// 	}

		// 	if(p.possible(board) != p.isSolvable(board2)) {
		// 		p.print(board);
		// 		System.out.println(step);;
		// 		break;
		// 	}



		// 	step--;
		// }

		
	}
}