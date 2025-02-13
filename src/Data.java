import java.util.Arrays;

public class Data
{
    public static final int MAX = 1000 /* value not shown */;
    private int[][] grid = {{4,3,4},{3,4,5},{4,5,6}};
    /** Fills all elements of grid with randomly generated values, as described in part (a)
     * Precondition: grid is not null.
     * grid has at least one element.
     */
    public void repopulate()
    {
        for(int i = 0; i<grid.length;i++){
            for(int j = 0; j<grid[0].length;j++) {
                int rand = 100;
                while (rand % 100 == 0) {
                    rand = (int) (Math.random() * ((double) (MAX + 1) / 10)) * 10;
                }
                grid[i][j] = rand;
            }
        }
        System.out.println(Arrays.deepToString(grid));
    }
    /** Returns the number of columns in grid that are in increasing order, as described
     * in part (b)
     * Precondition: grid is not null.
     * grid has at least one element.
     */
    public int countIncreasingCols()
    { /* to be implemented in part (b) */
        //row col
        int count = 0;
        for(int i = 0; i<grid.length;i++){
            for(int j = 0; j<grid[0].length-1;j++) {
                if(grid[j][i]<=grid[j+1][i]) return count;
            }
            count++;
        }
        return 0;
    }
// There may be instance variables, constructors, and methods that are not shown.
}