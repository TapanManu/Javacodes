import java.util.Scanner;
class NotPass extends Exception{
    public NotPass(String s) {
        super(s);
    }
}
class InvalidCgpaException extends Exception{
    public InvalidCgpaException (String s) {
        super(s);
    }
} 
class Student{
    private double cgpa;
    Student(double cgpa){
        this.cgpa=cgpa;
    }
    void getReport() throws NotPass,InvalidCgpaException{
        if(cgpa>=4.5 && cgpa<=10){
            System.out.println("Student is passed");
        }
        else if(cgpa<4.5)
            throw new NotPass("failed to reach next academic year");
        else
            throw new InvalidCgpaException("invalid cgpa");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student []s = new Student[5];//5 students
        for(int i=0;i<s.length;i++){
        try{
            s[i] = new Student(sc.nextDouble());
            s[i].getReport();
        }
        catch(NotPass np){
            System.out.println(np.getMessage());
        }
        catch(InvalidCgpaException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Status given of "+(i+1)+" student");
        }
        }
    }
 }
