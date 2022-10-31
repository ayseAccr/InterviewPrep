public class JavaEnd-of-file {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();
       
        while(scan.hasNext()){
           
            arr.add(scan.nextLine());
        }
        //System.out.print(arr);
        for(int i=0;i<arr.size();i++){
            System.out.println(i+1+" "+arr.get(i));
           
            
        }
    }
}
