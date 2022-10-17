import java.io.*;
import java.util.*;

public class Qheap1 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
      
      PriorityQueue<Integer> queue=new PriorityQueue<>();
      
      int num = scan.nextInt();
    
      for(int i=0;i<num+1;i++){
               String line = scan.nextLine();

            if(line.startsWith("1")){
                int number = Integer.valueOf( line.split(" ")[1] );
                queue.offer(number);  
            }else if(line.startsWith("2")){  
                int n = Integer.valueOf( line.split(" ")[1] );  
                
                queue.remove(n);
            }else if(line.startsWith("3")){
                System.out.println(queue.peek());
            }
      }
     
     scan.close();
    //      Second and better way   
       
    //     Scanner input = new Scanner(System.in);
    //     PriorityQueue<Integer> pq = new PriorityQueue<>();
    //     while(input.hasNext()){
    //         int q=input.nextInt();
    //         if(q==1){
    //            pq.offer(input.nextInt()); 
    //         }
    //         if(q==2){
    //            pq.remove(input.nextInt());
               
    //         }
    //         if(q==3)
    //         System.out.println(pq.peek());
    //     }
    //     input.close();
     
     
     
     
     
     
     
     
    }
}