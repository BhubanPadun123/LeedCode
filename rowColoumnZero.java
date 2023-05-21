/*Given a matrix, if any of the cells in the matrix is 0, set all the elements in its row and column to 0.

Examples
1 1 1        1 0 1
1 0 1   =>   0 0 0
1 1 1        1 0 1

0 1 2        0 0 0
3 4 5   =>   0 4 5
1 2 3        0 2 3

0 1 0        0 0 0
3 4 5   =>   0 4 0
1 2 3        0 2 0

0 1 0        0 0 0
3 0 5   =>   0 0 0
1 2 3        0 0 0 */
public class rowColoumnZero {
    public static void setZeros(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(matrix[i][j] == 0){
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
    }
    
}
