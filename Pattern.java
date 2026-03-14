import java.lang.*;

class Pattern{

    public static void main(String argv[])
    {
        int i = 0;
        int j = 0;

        int mid = 9 / 2;
        for(i = 0; i < 9; i++){

            
            for( j = 0; j < 9 ; j++)
            {

                if(Math.abs(i - mid) + Math.abs(j - mid) == mid)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}