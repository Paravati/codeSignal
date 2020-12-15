package patiDev.codeSignal;

public class problem12_isIdentityMatrix {
    public static void main(String[] args){
        System.out.println(isIdentityMatrix(new int[][]{{1,0,1},{0,1,0},{0,0,1}}));

    }

    public static boolean isIdentityMatrix(int[][] matrix) {
        int[][] reversedMatrix = new int[matrix.length][matrix.length];
        int a = 0;
        int b = 0;
        for(int i = matrix.length-1; i>=0; i--){
            b = 0;
            for(int j = matrix.length-1; j>=0; j--){
                reversedMatrix[a][b] = matrix[i][j];
                b++;
            }
            a++;
        }

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix.length; j++){
                if(matrix[i][j]!=reversedMatrix[i][j])
                    return false;
            }
        }
        return true;
    }
}
