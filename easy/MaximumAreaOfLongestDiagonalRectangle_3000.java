package easy;

class MaximumAreaOfLongestDiagonalRectangle_3000{
  public static int areaOfMaxDiagonal(int[][] dimensions) {
    int longestDiagonal = 0;
    int areaOfMaxDiagonal = 0;

    for(int i = 0; i < dimensions.length; i++){
      int lA = dimensions[i][0];
      int lB = dimensions[i][1];

      int diagonal = (lA * lA) + (lB * lB);
      
      if( diagonal >= longestDiagonal || (diagonal == longestDiagonal && lA * lB > areaOfMaxDiagonal)){
        longestDiagonal = diagonal;
        areaOfMaxDiagonal = (lA * lB);
      }
    }

    return areaOfMaxDiagonal;
  }

  public static void main(String[] args) {
    int[][] dimensions = {{4,10}, {4,9}, {9,3}, {10,8}};
    System.out.println(areaOfMaxDiagonal(dimensions));
  }
}
