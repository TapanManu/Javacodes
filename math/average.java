import java.util.Scanner;
    class Average{
        public static void main(String[] args) {
        	Scanner s=new Scanner(System.in);
        	System.out.println("enter no of subjects:");
        	int n=s.nextInt();
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
            
        }
    }
