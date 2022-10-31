public class ReverseString {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverseA="";
        
        for(int i = A.length()-1; i>=0; i--) {
 
            
            reverseA+=A.charAt(i);
        }
      String p = A.equals(reverseA) ? "Yes" : "No";
      System.out.println(p);
    }
}
