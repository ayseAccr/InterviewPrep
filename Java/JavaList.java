public class JavaList {
    private static Scanner scan =new Scanner(System.in);
    
    public static void main(String[] args) {
       int n = scan.nextInt();
       String s=scan.nextLine();
       ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0; i<n;i++){
        arr.add(scan.nextInt());
    }
      
       
        int q = scan.nextInt();
        for(int i = 0; i < q; i++){
            String querie = scan.next();
            if(querie.equals("Insert")){
                arr.add(scan.nextInt(), scan.nextInt());
            }
            else{
                arr.remove(scan.nextInt());
            }
        }
   
    for(Integer i: arr){
        System.out.printf("%d ",i);
    }
    }
}
