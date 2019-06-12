import java.util.Scanner;

public class DrawRectangle {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the height of the rectangle: ");
        int h = sc.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        int w = sc.nextInt();

        for(int j=1; j<=h; j++)
        {
            for(int i=1; i<=w; i++)
            {
                if(j ==1 || j==h || i==1 || i==w)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
