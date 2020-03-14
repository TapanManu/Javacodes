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
class Queue{
    static int front;
    static int rear; //here only one queue object needed
    int ele;
    int[] q;
    static final int MAX=5;
    Queue(){
        front=rear=-1;
        q = new int[MAX];
    }
    Boolean queuefull(){
        if((front==0)&&(rear==MAX-1)||(rear+1==front))
            return true;
        return false;
    }
    Boolean queueEmpty(){
        if(front==-1)
            return true;
        return false;    
    }
    void enqueue(int ele){
        if(queuefull()){
            System.out.println("overflow");
            return;
        }
        else{
        if(rear==-1){
            front=0;
        }
        rear=(rear+1)%MAX;
        q[rear]=ele;
        }
    }
    int dequeue(){
        if(queueEmpty()){
            System.out.println("underflow");
            return -1;
        }
        int x=q[front];
        if(front==rear){
            front=rear=-1;
        }
        else
            front=(front+1)%MAX;
        return x;
    } 
    void status(){
        if(queueEmpty()){
            System.out.println("empty queue");
        }
        else{
        for(int i=front;i<=rear;i++){
            System.out.print(q[i]+" ");
        }
        }
    }  
}
class DS{
    public static void main(String[] args) {
        int y;
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        while(true){
            q.enqueue(sc.nextInt());
            System.out.println("do you want to continue?(1/0)");
            y=sc.nextInt();
            if(y!=1)
                break;
        }
        q.status();
        while(true){
            int temp=q.dequeue();
            System.out.println("popped out:"+temp);
            System.out.println("do you want to continue?(1/0)");
            y=sc.nextInt();
            if(y!=1)
                break;
        }
        q.status();
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
