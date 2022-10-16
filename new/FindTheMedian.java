public class FindTheMedian {
    public static List<Double> runningMedian(List<Integer> a) {
        PriorityQueue<Integer> right = new PriorityQueue<>();
        PriorityQueue<Integer> left=new PriorityQueue<>(Collections.reverseOrder());
        List<Double> med=new ArrayList<>();
       
        
        for(int i=0;i<a.size();i++){
         //first progress:deciding min and max value pqueue
        
         if(left.size()>0 && a.get(i)<left.peek()){
             left.add(a.get(i));    
         }else{
             right.add(a.get(i));
         }
         
         
         if(right.size()-left.size()>1){
             left.add(right.poll());
         }else if(left.size()-right.size()>1){
             right.add(left.poll());
         }
             
         
        
         
         
         if(right.size()==left.size()){
             double d=(left.peek()+right.peek());
             d=d/2;
             med.add(d);
         }
         if(left.size()-right.size()==1){
          med.add((double)left.peek());   
         }    
             
         if(right.size()-left.size()==1){
              med.add((double)right.peek());
         }
         
         }
         
         
         return med;
        }
          
          
          
        
}
