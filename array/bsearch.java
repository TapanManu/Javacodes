class BSearch{
    static int maxcount=0;
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int ele=6;
        //sorted array required
        int pos=bSearch(0,arr.length-1,arr,ele);
        if(pos==-1)
            System.out.println("no match");
        else
            System.out.println("pos:"+(pos+1));
    }
    public static int bSearch(int beg,int last,int[] arr,int ele){
        int mid = (beg+last)/2;
        if(maxcount==arr.length)
            return -1;//avoid stack over flow
        maxcount++;
        if(arr[mid]==ele)
            return mid;
        else if(arr[mid]>ele)
            return bSearch(beg,mid-1, arr, ele);
        else 
            return bSearch(mid+1,last, arr, ele);
    }
}
