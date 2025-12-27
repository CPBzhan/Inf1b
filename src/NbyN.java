public class NbyN {
    public static int[][] nbyn(int N){
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++){
            matrix[i][i] = i;
        }
        return matrix;
    }
    public static void main(String[] args){
        int N = 10;
        int[][] matrix = nbyn(N);
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println( );
        }
    }
}
