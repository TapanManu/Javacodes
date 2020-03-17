interface StudentBasicInt{
    final int FRESHMAN=1;
    final int SOPHOMORE=2;
    final int JUNIOR=3;
    final int SENIOR=4;
    String getFamilyName();
    String getOtherNames();
    int getRank();
    void setFamilyName(String o);
    void setOtherNames(String o);
    void setRank(int o);
}
class StudentBase implements StudentBasicInt{
    String family,others;
    int rank;
    public String getFamilyName(){ return family;}
    public String getOtherNames(){ return others;}
    public int getRank(){return rank;}
    StudentBase(String a,String b,int c){
        this.setFamilyName(a);
        this.setOtherNames(b);
        this.setRank(c);
    }
    public void setFamilyName(String a){family=a;}
    public void setOtherNames(String b){others=b;}
    public void setRank(int c){rank=c;}
    public static void main(String[] args) {
        StudentBase ob = StudentBaseMaster.studentBaseCreate();
        System.out.println(ob.getFamilyName());
        System.out.println(ob.getOtherNames());
        System.out.println(ob.getRank());
    }
}
class StudentBaseMaster {
    public static StudentBase studentBaseCreate(){
        StudentBase s = new StudentBase("Nadamel","Kunji",1);
        return s;
    }
}
