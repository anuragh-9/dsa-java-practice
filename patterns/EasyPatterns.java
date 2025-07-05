public class EasyPatterns {
     public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        int cnt = 0;
        System.out.println("Rectangle");
        for (int i =1;i < rows * cols + rows; i++ )
        {
            if(cnt < cols)
                {
                    System.out.print(" * ");
                    cnt++;
                }
            else
                {
                    cnt = 0;
                    System.out.println();
                }
        }
        System.out.println();
        System.out.println("Hollow Rectangle");
        for(int i = 1 ; i <= rows; i++ )
        {
            for(int j = 1 ; j <= cols; j++ )
            {
                if (i == 1 || i == rows || j == 1 || j == cols)
                    System.out.print("* ");
                else   
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Half Pyramid");
        for(int i = 1 ; i <= rows; i++ )
        {
            for(int j = 1 ; j <= i; j++ )
            {  
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Inverted Half Pyramid");
        for(int i = 1 ; i <= rows; i++ )
        {
            for(int j = rows ; j >= i; j-- )
            {  
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Inverted Half Pyramid 180 degree");
        for(int i = 1 ; i <= rows; i++ )
        {
            for(int j = rows ; j >= 1; j-- )
            {  
                if(j > i)    
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Half Pyramid Numbers");
        for(int i = 1 ; i <= rows; i++ )
        {
            for(int j = 1 ; j <= i; j++ )
            {  
                    System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Inverted Half Pyramid Numbers");
        for(int i = 1 ; i <= rows; i++ )
        {
            for(int j = rows ; j >= i; j-- )
            {  
                    System.out.print(rows-j+1+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Floyd's Triangle");
        int count = 0;
        for(int i = 1 ; i <= rows; i++ )
        {
            for(int j = 1 ; j <= i; j++ )
            {  
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("0-1 Triangle");
        for(int i = 1 ; i <= rows; i++ )
        {
            for(int j = 1 ; j <= i; j++ )
            {  
                if((i+j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0  ");
            }
            System.out.println();
        }
    }
}
