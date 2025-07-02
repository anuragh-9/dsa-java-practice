public class arr {
    public static void main(String[] args) {
        int arr[] = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 2;
        arr[3] = 4;
        arr[4] = 5;
       
        int ind = 2;
        int val = 3;
        int n = 5;
        for(int i = n; i > ind;i -- )
        {
            arr[i] = arr[i-1];
        }
        
        arr[ind] = val;
        n++;
        for(int i = 0; i < n;i++ )
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = ind; i < n-1;i ++ )
        {
            arr[i] = arr[i+1];
        }
        n--;
        for(int i = 0; i < n;i++ )
        {
            System.out.print(arr[i] + " ");
        }
         System.out.println();
        int target =10;
        int l = 0;
        int h = n-1;
        while( l <= h)
        {
            int m = (l+h )>> 1;
            if (arr[m ]== target)
                {System.out.println("yes");
            return;
        }
            else if ( target >arr[ m])
                l = m+1;
            else
                h =m-1;
        }
        System.out.println("no");
        System.out.println("right rot");

        int rot[] = {1,2,3,4,5};
        int fir = rot[rot.length - 1];
        for (int i = rot.length-1 ; i > 0;i-- )
        {
            rot[i  ] = rot[i-1];
        }
        rot[0] = fir;
        
        for(int i = 0; i < rot.length;i++ )
        {
            System.out.print(rot[i] + " ");
        }
        System.out.println("left rot");
         
        int las = rot[0];
        for (int i = 0 ; i < rot.length -1; i++ )
        {
            rot[i  ] = rot[i+1];
        }
        rot[rot.length - 1] = las;

        for(int i = 0; i < rot.length;i++ )
        {
            System.out.print(rot[i] + " ");
        }
    }
}

