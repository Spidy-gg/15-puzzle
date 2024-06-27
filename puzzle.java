import java.lang.Math;
import java.util.*;
public class puzzle {
    //finds the blank and counts how many steps it takes to get to the last position and returns if it is even or odd
    private boolean blankparity(int[] board) {
        int move = 0;
        int index = -1;

    
        for(int i = 0; i < 16; i++) {
            if(board[i] == 16) {
                index = i;
                break; } }

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

        return board;
    }







    static final int N = 4;
 
    // A utility function to count inversions in given
    // array 'arr[]'. Note that this function can be
    // optimized to work in O(n Log n) time. The idea
    // here is to keep code small and simple.
    static int getInvCount(int[] arr)
    {
        int inv_count = 0;
        for (int i = 0; i < N * N - 1; i++) {
            for (int j = i + 1; j < N * N; j++) {
                // count pairs(arr[i], arr[j]) such that
                // i < j but arr[i] > arr[j]
                if (arr[j] != 0 && arr[i] != 0
                    && arr[i] > arr[j])
                    inv_count++;
            }
        }
        return inv_count;
    }
 
    // find Position of blank from bottom
    static int findXPosition(int[][] puzzle)
    {
        // start from bottom-right corner of matrix
        for (int i = N - 1; i >= 0; i--)
            for (int j = N - 1; j >= 0; j--)
                if (puzzle[i][j] == 0)
                    return N - i;
        return -1;
    }
 
    // This function returns true if given
    // instance of N*N - 1 puzzle is solvable
    static boolean isSolvable(int[][] puzzle)
    {
        // Count inversions in given puzzle
        int[] arr = new int[N * N];
        int k = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                arr[k++] = puzzle[i][j];
 
        int invCount = getInvCount(arr);
 
        // If grid is odd, return true if inversion
        // count is even.
        if (N % 2 == 1)
            return invCount % 2 == 0;
        else // grid is even
        {
            int pos = findXPosition(puzzle);
            if (pos % 2 == 1)
                return invCount % 2 == 0;
            else
                return invCount % 2 == 1;
        }
    }
}
