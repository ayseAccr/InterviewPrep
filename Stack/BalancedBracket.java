class BalanceBracket {

    public static String isBalanced(String s) {
        Stack<Character>s1=new Stack<>();
        Stack<Character>s2=new Stack<>();
        int size=s.length();
        
        if(s.length()%2!=0){
            return "NO";
        }
        else{
          for(int i=0;i<size;i++){
              if(s.charAt(i)=='(' || s.charAt(i)=='{'|| s.charAt(i)=='[' ){
                  s1.push(s.charAt(i));
              }
              else if(s1.size() == 0){
            return "NO";
                  
              }else if(s.charAt(i)==')' && s1.lastElement()=='(' ){
                  s1.pop();
              }else if(s.charAt(i)==']' && s1.lastElement()=='['){
                  s1.pop();
              }else if(s.charAt(i)=='}' && s1.lastElement()=='{'){
                  s1.pop();
              }
               
          } 
          if(s1.empty()==false){
              return "NO";
          }
          
        }
        
         return  "YES";
    }
       




}