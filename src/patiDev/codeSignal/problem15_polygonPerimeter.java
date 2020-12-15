package patiDev.codeSignal;

public class problem15_polygonPerimeter {
    public static void main(String[] args){
        System.out.println(poligonPerimeter(new boolean[][]{{false,true,true}, {true,true,false}, {true,false,false}}));
    }

    public static int poligonPerimeter(boolean[][] matrix){
        int perimeter = 0;
        for(int i =0; i<matrix.length-1; i++){
            for(int j=0; j<matrix[0].length-1; j++){
                if(matrix[0][0]){
                    perimeter+=4;
                    if(matrix[0][1])
                        perimeter-=1;
                    if(matrix[1][0])
                        perimeter-=1;
                }
                if(matrix[matrix.length-1][0]){
                    perimeter+=4;
                    if(matrix[matrix.length-2][0])
                        perimeter-=1;
                    if(matrix[matrix.length-1][1])
                        perimeter-=1;
                }
                if(matrix[matrix.length-1][matrix.length-1]){
                    perimeter+=4;
                    if(matrix[matrix.length-2][matrix.length-1])
                        perimeter-=1;
                    if(matrix[matrix.length-1][matrix.length-2])
                        perimeter-=1;
                }
                if(matrix[0][matrix.length-1]){
                    perimeter+=4;
                    if(matrix[1][matrix.length-1])
                        perimeter-=1;
                    if(matrix[0][matrix.length-2])
                        perimeter-=1;
                }
                if(i!=0 && j!=0 && i!=matrix.length-1 && j!=matrix[0].length-1)
                    if(matrix[i][j]){
                        perimeter += 4;
                        if(matrix[i - 1][j])
                            perimeter-=1;
                        if(matrix[i][j - 1])
                            perimeter-=1;
                        if(i< matrix.length-1 && matrix[i + 1][j])
                            perimeter-=1;
                        if(j != matrix[0].length-1 && matrix[i][j + 1])
                            perimeter-=1;
                        }
                }
            }
        return perimeter;
    }
}
