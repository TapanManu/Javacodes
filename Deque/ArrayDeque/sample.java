import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
// sample deque code

class Block{
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        //Deque is interface, ArrayDeque is class

        for(int i=0;i<20;i++){
            deque.push(i);
        }
        Iterator d = deque.iterator();
        deque.add(23);
        while(d.hasNext()){
            System.out.print(d.next()+" ");
        }
        deque.pop();
        System.out.println();
        d = deque.iterator();
        while(d.hasNext()){
            System.out.print(d.next()+" ");
        }
        deque.clear();
        deque.addFirst(50);  //==> same as push()
        //add() same as addLast()
        System.out.println();
        d = deque.iterator();
        while(d.hasNext()){
            System.out.print(d.next()+" ");
        }
    }
}
