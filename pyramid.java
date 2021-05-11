/*class pyramid
{
    public static void main(String args[])
    {
        int i,j;
        for(i=0;i<5;++i)
        {
            for(j=5-i;j>1;--j)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;++j)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
    class pyramid {
        public static void main(String[] args) {
            int rows = 5, k = 0;
            for(int i = 1; i <= rows; ++i, k = 0) {
                for(int space = 1; space <= rows - i; ++space) {
                    System.out.print("  ");
                }
                while(k != 2 * i - 1) {
                    System.out.print("* ");
                    ++k;
                }
                System.out.println();
            }
        }
    }


