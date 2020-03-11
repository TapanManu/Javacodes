import java.util.ArrayList;

class ArrList{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("James");//0
        names.add("peter");//1
        names.add("coulin");//2
        names.add("soubin");//4
        names.add(3,"paul");//3
        names.set(1,"peters");//1
        names.remove(0);
        for(int i=0;i<names.size();i++)//size of number of values stored
        {
            System.out.println(names.get(i));
        }

        
    }
}
peters
coulin
paul
soubin
