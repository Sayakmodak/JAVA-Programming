public class ps_4 {
    public static void main(String[] args) {
        int a[][] = {{10,20,30},
                    {40,20,10}};
        int b[][] = {{2,5,10},
                    {15,15,20}};

        int sum[][] = {{0,0,0},
                       {0,0,0}};
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum[i][j] = a[i][j]+b[i][j] ;
                System.out.print(sum[i][j] + " ");
            }
            System.out.println("\n");
        }
        
    }
}
