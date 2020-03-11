class Str{
    public static void main(String[] args) {
        String names[] = names();
        for ( int i=0;i<names.length;i++){
            System.out.print(names[i].charAt(0));
        }
        
    }
    public static String[] names(){
        String[] names = new String[6];
        names[0]="Albert";
        names[1]="Boss";
        names[2]="Cyriac";
        names[3]="Dave";
        names[4]="Eric";
        return names;

    }
}
