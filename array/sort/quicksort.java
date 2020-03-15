class QSort{
    public static void main(String[] args) {
        int [] arr={4,2,3,1,5};
        qsort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        
    }
    public static void qsort(int []arr,int l,int h){
        if(l<h){
            int q=partition(arr,l,h);
            qsort(arr,l,q-1);
            qsort(arr,q+1,h);
        }
    }
    public static int partition(int [] arr,int l,int h){
        int x=arr[h];
        int i = l - 1;
        for(int j=l;j< h;j++){
            if(arr[j]<x){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i+1]; 
        arr[i+1] = arr[h]; 
        arr[h] = temp; 
  
        return i+1; 
        }
    }
