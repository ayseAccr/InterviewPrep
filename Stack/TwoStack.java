

class TwoStack{


private static final Scanner scan = new Scanner(System.in);

public static void main() {
   
  
    int num = scan.nextInt();
    
    // Stack<Integer> first = new Stack<Integer>();
    // Stack<Integer> sec = new Stack<Integer>();
    LinkedList<Integer> first = new LinkedList<>();
     LinkedList<Integer> sec = new LinkedList<>();
   
    for(int i=0;i<num+1;i++){
        
        String line = scan.nextLine();

        if(line.startsWith("1")){
            
            int number = Integer.valueOf( line.split(" ")[1] );
            if(first.isEmpty()==true && sec.isEmpty()==true){
                first.push(number);
            }else{
                sec.push(number);
            }
            
            
            
        }else if(line.startsWith("2")){
            
            if(first.isEmpty()==true){
                while(sec.isEmpty()==false){
                    first.push(sec.pop());
                }   
            }
             first.pop();
          
           
           
        }
        else if(line.startsWith("3")){
            
            if(first.isEmpty()==true){
                 while(sec.isEmpty()==false){
                    first.push(sec.pop());
                }
                
            }
             System.out.println(first.peek());
            
        }
     
       
       
    }
    
   
       
       
    scan.close();
    
}  
}