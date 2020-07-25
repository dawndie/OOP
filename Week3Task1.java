public class Week3Task1 {
    public static int gcd(int num1, int num2) {
        while(num1 != num2) {
            if(num1 > num2) {
                num1 = num1 - num2;
            }
            else {
                num2 = num2 - num1;
            }
        }
         return num1;
    }

    public static   int fibonacci(int n) {
        int[] arr = new int[n+2];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n ; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

    public static void primes(int n) {
        int [] a = new int[n+2];
        for(int i=1 ; i <= n; i++) a[i] = 1;
        a[0] = 0; a[1] = 0;

        for(int i = 2; i<= n; i++)
        {
            if(a[i]==1)
            {
                int d =2;
                while(d*i<= n) {
                    a[d*i] = 0;
                    d++;
                }
            }
        }
        for( int i=1;i<= n;i++)
            if(a[i] == 1)
                System.out.print(i + " ");
    }
}