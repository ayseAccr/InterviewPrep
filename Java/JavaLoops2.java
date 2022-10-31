public class JavaLoops2 {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        String s="";
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int power=a;
            for(int j=0;j<=n-1;j++){
    
             power+=Math.pow(2,j)*b;
             System.out.print(power+" ");

            }
            System.out.println();
           
             
        }
        in.close();
    
}
    
}
