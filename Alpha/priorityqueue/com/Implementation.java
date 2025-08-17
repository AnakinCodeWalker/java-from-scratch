package priorityqueue.com;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Implementation {
    //.add()--> 0(log n)
    //.remove()-->0(log n)
    //.peek()-->0(1)
    public static void main(String[] args) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        //by default, the lower numbers will have higher priority
        // The Rest of the pq may not be sorted, but the first element will be smallest
        // you can change the order by using the comparator.reverseOrder() in the constructor
        PriorityQueue<Integer>sorted= new PriorityQueue<>(Comparator.reverseOrder());


        pq.add(9);
        pq.add(2);
        pq.add(3);
        pq.add(2);
        pq.add(0);
        while(!pq.isEmpty())
            System.out.println(pq.remove());
        sorted.add(9);
        sorted.add(2);
        sorted.add(3);
       sorted.add(2);
        sorted.add(0);
        System.out.println("sorted priority queue in reverse order :");
        while(!sorted.isEmpty())
            System.out.print(sorted.remove()+ " ");
    }
}
