public class JesseCookies {
    
    public static int cookies(int k, List<Integer> A) {
        
        Queue<Integer> cookies = new PriorityQueue<>(A);
        
        int count=0;
        while(cookies.peek()<k &&cookies.size()>=2 ){
         cookies.offer(cookies.poll()+cookies.poll()*2);
         count++;   
        }
        
        if (count!=0 && cookies.peek()<k){
            return -1;
        }
        return count;
        
    }

}
