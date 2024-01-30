public class NQueens {
    private int[] queens;
    private int n;
    public NQueens(int n)
    {
        queens = new int[n];
        this.n = n;
    }  
    public void placeNQueens(){
        if(placeQueens(0))
        {
            for(int i = 0; i < n; i++)
            {
                System.out.println("Queen at cell: " + i + " is placed at: " + queens[i]);
            }
        }
        else{
            System.out.println("No Solution found!");
        }
    }
    private boolean placeQueens(int col)
    {
        if(col == n)
        {
            return true;
        }
        for(int row = 0; row < n; row++)
        {
            if(isSafe(row,col))
            {
                queens[col] = row;
                if(placeQueens(col + 1))
                {
                    return true;
                }
            }
            queens[col] = 0;
        }
        return false;
    }
    private boolean isSafe(int row, int col)
    {
        for(int i = 0; i < col; i++)
        {
            if(queens[i] == row || queens[i] - i == row - col || queens[i] + i == row + col)
            {
                return false;
            }
            else{
                return true;
            }
        }return true;
    }
    private void printQueens() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (queens[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
        NQueens nQueens = new NQueens(4);
        nQueens.placeNQueens();
    }
}

