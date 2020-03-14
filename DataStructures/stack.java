import java.util.Scanner;

class Stack{
    static int top; //here only one stack object needed
    int ele;
    int[] s;
    static final int MAX=5;
    Stack(){
        top=-1;
        s = new int[MAX];
    }
    void push(int ele){
        if(top==MAX-1)
            System.out.println("overflow");
        else{
        s[++top]=ele;
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("underflow");
            return -1;
        }
        int x=s[top--];
        return x;
    } 
    void status(){
        if(top==-1){
            System.out.println("empty stack");
        }
        else{
        System.out.println(s[top]+"<-top");
        for(int i=top-1;i>=0;i--){
            System.out.println(s[i]);
        }
        }
    }  
}
class DS{
    public static void main(String[] args) {
        int y;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        while(true){
            s.push(sc.nextInt());
            System.out.println("do you want to continue?(1/0)");
            y=sc.nextInt();
            if(y!=1)
                break;
        }
        s.status();
        while(true){
            int temp=s.pop();
            System.out.println("popped out:"+temp);
            System.out.println("do you want to continue?(1/0)");
            y=sc.nextInt();
            if(y!=1)
                break;
        }
        s.status();
    }
}
