import java.util.Scanner;
    class Average{
        public static void main(String[] args) {
        	Scanner s=new Scanner(System.in);
        	System.out.println("enter no of subjects:");
        	int n=s.nextInt();
        	char grade;
            double[] a = new double[n];
            double sum=0;
            System.out.println("enter marks of subjects:");
            for(int i=0;i<n;i++){
            	a[i]=s.nextDouble();
            }
            for(int i=0;i<n;i++){
            	sum+=a[i];
            }
            double avg=sum/n;
            System.out.println("average is:"+avg);
            avg/=100;
            if(avg>=0.9)
            	System.out.println("grade A");
            else if(avg>=0.8)
            	System.out.println("grade B");
            else if(avg>=0.7)
            	System.out.println("grade C");
            else if(avg>=0.6)
            	System.out.println("grade D");
            else if(avg>=0.5)
            	System.out.println("grade E");
            else
            	System.out.println("Fail");
        }
    }
