public class Matrix {   
    public static void main(){
    }

    static void indexOfFirstNonZero() {    
        int[][] matrix = {
            { 0,0,0,0,0},
            {0,0,0,-88,30},
            {95,-79,-87,-27,-97},
            {-52,-64,-13,-19,-27},
            {79,89,95,-84,-53}};
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j=matrix[i]; j++){
                if(matrix[i][j]>=1){
                    System.out.println("the first non zero line is at position: "+i);
                    break;
                }
            }
        }
    }
    static void getMinimumOfRows() {
        int[][] matrix = {
            {84,67,22,-72,95},
            {72,-70,2,-88,30},
            {95,-79,-87,-27,-97},
            {-52,-64,-13,-19,-27},
            {79,89,95,-84,-53}};
        //number that will represent the lowest number
        int num = matrix[0][0];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j=matrix[i]; j++){
                if(matrix[i][j]<num){
                    num = matrix[i][j];
                }
            }
        }
        System.out.println("the minimum number is: "+num);
    }

}
