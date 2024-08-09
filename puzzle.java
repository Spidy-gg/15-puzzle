import java.lang.Math;
import java.util.*;
public class puzzle {
    //finds the blank and counts how many steps it takes to get to the last position and returns if it is even or odd
    public int findBlank(int[] board) {
           
        for(int i = 0; i < 16; i++) {
            if(board[i] == 16) {
                return i;
                 } }
        return -1;
    }
    private boolean blankparity(int[] board) {
        int move = 0;
        int index = this.findBlank(board);

        while(index % 4 != 3) {
            index++;
            move++; }
        
        while(index != 15) {
            index+=4;
            move++; };
        return move % 2 == 0;
    }
    //counts how many swaps it takes to get the board in order and returns if it is even or odd
    private boolean parity(int[] board) {
        int[] blank = { 1, 2, 3, 4,
                        5, 6, 7, 8, 
                        9, 10, 11, 12, 
                        13, 14, 15, 16 };
        int count = 0;
        int temp;
        while(!Arrays.equals(board, blank)) {
            for(int i = 0; i < 16; i++) {
                if(i + 1 != board[i]) {
                    temp = board[i];
                    board[i] = board[temp - 1];
                    board[temp - 1] = temp;
                    count++;
                }
            }
        }
        return count % 2 == 0;
    }
    public boolean possible(int[] board) {
        int[] temp = new int[16];
        for(int i = 0; i < 16; i++) {temp[i] = board[i];}
        return this.blankparity(temp) == this.parity(temp);
    }

    public void print(int[] board) {
        for(int i = 0; i < 16; i++) {
            System.out.print(board[i] + " ");
            if(i % 4 == 3) {
                System.out.println();
            } } }
    
    public int[] create(){
        int[] board = new int[16];
        ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16)); 
        //System.out.println("1");
        //int debug = 1;
        while(values.size() > 0) {
            int temp = (int)(Math.random() * values.size());
            board[16-values.size()] = values.get(temp);
            values.remove(temp);
            //System.out.println(debug);
            //debug++;
        }
        if (!this.possible(board)) {
            return this.create();
        } else {
            return board; } }
    private boolean moveLeft(int[] board) {
        if(this.findBlank(board) % 4 == 0) {
            return false;
        }
        return true;
    }
    private boolean moveRight(int[] board) {
        if((this.findBlank(board) + 1) % 4 == 0) {
            return false;
        }
        return true;
    }
    private boolean moveUp(int[] board) {
        if(this.findBlank(board) <= 3) {
            return false;
        }
        return true;
    }
    private boolean moveDown(int[] board) {
        if(this.findBlank(board) >= 12) {
            return false;
        }
        return true;
    }
    public boolean[] canMove(int[] board) {
        boolean[] move = {this.moveUp(board), this.moveRight(board), this.moveDown(board), this.moveLeft(board)};
        return move;
    }

}
