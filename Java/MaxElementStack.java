public class MaxElementStack {
    public static List<Integer> getMax(List<String> operations) {
        Stack<Integer> fStack=new Stack<>();
        fStack.push(0);
     
         Stack<Integer> nStack =new Stack<>();
         
        for(int i=0;i<operations.size();i++){
           
              String line = operations.get(i);
              char q =line.charAt(0);
              if(q=='1'){
                 int number = Integer.parseInt(line.split(" ")[1]);
                 if(number>fStack.peek()){
                     fStack.push(number);
                     continue;
                 }
                 fStack.push(fStack.peek());
              } 
                if(q=='2'){   
                  fStack.pop();  
                }
                if(q=='3'){ 
                    nStack.push(fStack.peek());
                }   
        
        } 
         return nStack;
   
     }
}
