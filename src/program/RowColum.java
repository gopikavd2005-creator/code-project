Class RowColum{
    public static void main(String[] args{
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int[][] arr=newInt[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt;
            }
        }
        for(int i=0;i<R;i++)
        if(i%2==0)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println(arr[i][j]+" ");
            }
        }
        else{
            for(int j=c-1;j>=0,j--)
            {
                System.out.println(arr[i][j]);
            }
            System.out.println("")
        }
    }
}