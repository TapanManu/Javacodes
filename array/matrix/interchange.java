    import java.util.Scanner;

    public class Interchange 

    {

        public static void main(String[] args) 

        {

            int p, q, n, x , y, temp = 0, k = 0;

            Scanner s = new Scanner(System.in);

            System.out.print("Enter number of rows in matrix:");

            p = s.nextInt();

            System.out.print("Enter number of columns in matrix:");

            q = s.nextInt();

            int a[][] = new int[p][q];

            System.out.println("Enter all the elements of matrix:");

            for (int i = 0; i < p; i++) 

            {

                for (int j = 0; j < q; j++) 

                {

                    a[i][j] = s.nextInt();

                }

            }

            System.out.println("Given Matrix:");

            for (int i = 0; i < p; i++) 

            {

                for (int j = 0; j < q; j++) 

                {

                    System.out.print(a[i][j] + " ");

                }

                System.out.println("");

            }

            while (true) 

            {

                System.out.println("Enter 1 to interchange rows");

                System.out.println("Enter 2 to interchange columns");

                System.out.println("Enter 3 to Exit");

                n=s.nextInt();

                switch (n) 

                {

                    case 1:

                    System.out.println("Enter the row numbers:");

                    x = s.nextInt();

                    y = s.nextInt();

                    for(int i = 0; i < p; i++)

                    {

                        temp = a[(x-1)][i];

                        a[x-1][i] = a[y-1][i];

                        a[y-1][i] = temp;

                    }

                    System.out.println("Matrix after interchanging rows:"+x +" and "+y);

                    for (int i = 0; i < p; i++) 

                    {

                        for (int j = 0; j < q; j++) 

                        {

                            System.out.print(a[i][j] + " ");

                        }

                    System.out.println("");

                    }

                    break;

                    case 2:

                    System.out.println("Enter the column numbers:");

                    x = s.nextInt();

                    y = s.nextInt();

                    for(int i = 0; i < p; i++)

                    {

                        temp = a[i][(x-1)];

                        a[i][x-1] = a[i][(y-1)];

                        a[i][y-1] = temp;

                    }

                    System.out.println("Matrix after interchanging columns:"+x +" and "+y);

                    for (int i = 0; i < p; i++) 

                    {

                        for (int j = 0; j < q; j++) 

                        {

                            System.out.print(a[i][j] + " ");

                        }

                    System.out.println("");

                    }

                    break;

              	case 3:

                    System.exit(0);

                }

            }

        }

    }
