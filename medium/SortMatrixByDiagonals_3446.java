package medium;

public class SortMatrixByDiagonals_3446 {
    public static int[][] sortMatrix(int[][] grid) {
        int numRows = grid.length;
        int numCol =  grid[0].length;

        for(int i = 1; i < numCol - 1; i++){
            int diagonal = (numRows - i) - 1;
            int o = 0;
            int p = 1;

            int j = 0;
            int k = i;

            int l = j + 1;
            int n = k + 1;
            while (o < p) {

                int a = grid[j][k];
                int b = grid[l][n];

                if(a > b){
                    int temp = a;
                    grid[j][k] = b;
                    grid[l][n] = temp;
                }

                if(diagonal > p){
                    p++;
                    l++;
                    n++;
                } else{
                    o++;
                    j = o;
                    k = o + 1;
                    l = j + 1;
                    n = k + 1;
                    p = o + 1;
                    if(p > diagonal){
                        p--;
                    }
                }
            }
        }

        for(int i = 1; i < numRows - 1; i++){
            int diagonal = (numRows - i) - 1;
            int o = 0;
            int p = 1;

            int j = i;
            int k = 0;

            int l = j + 1;
            int n = k + 1;
            while (o < p) {

                int a = grid[j][k];
                int b = grid[l][n];
                System.out.println(j);
                System.out.println(k);
                System.out.println(l);
                System.out.println(n);
                
                if(a < b){
                    int temp = a;
                    grid[j][k] = b; //3 0
                    grid[l][n] = temp; // 4 1
                }

                if(diagonal > p){
                    p++;
                    l++;
                    n++;
                } else{
                    o++;
                    j = o + 1;
                    k = o;
                    l = j + 1;
                    n = k + 1;
                    p = o + 1;
                    if(p > diagonal){
                        p--;
                    }
                }
            }
        }

        if(!(numCol == 1 && numRows == 1)){
            int diagonal = numRows - 1;
            int o = 0;
            int p = 1;
            while (o < p) {
                int a = grid[o][o];
                int b = grid[p][p];
    
                if(a < b){
                    int temp = a;
                    grid[o][o] = b;
                    grid[p][p] = temp;
                }
    
                if(diagonal > p){
                    p++;
                } else{
                    o++;
                    p = o + 1;
                    if(o == diagonal){
                        break;
                    }
                }
            }
        }

        return grid;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,7,3},{9,8,2},{4,5,6}};
        int[][] mat = {{1,2,5,0},{3,4,0,4},{4,1,0,0},{4,2,4,1}};
        int[][] m = {{5,1,1,1,3},{5,5,3,1,3},{4,1,4,3,5},{1,2,1,4,3},{0,1,3,0,2}};
        sortMatrix(m);
    }
}
