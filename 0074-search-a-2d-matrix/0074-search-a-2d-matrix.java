class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int row =matrix.length;
    int start =0;
    int colown =matrix[0].length;
   int end =colown-1;
     while(start<row && end>=0){


        if(matrix[start][end]>target){
            System.out.print(matrix[start][end]);
            end =end-1;
            
        }
        else if(matrix[start][end]<target){
            System.out.print(matrix[start][end]);
            start=start+1;
        }
        else if(matrix[start][end]==target) {
            System.out.print(matrix[start][end]);
            return true;
        }


    }

    return false;
    }
    
}
