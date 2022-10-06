import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args){

        String ss="06:40:03AM";
        String str=""; 
        str+=ss.charAt(0);
        str+=ss.charAt(1);
        System.out.println("str"+str);
        int number = Integer.parseInt(str);
        System.out.println(number);
        String uu="";
        number+=12; 
        String nn=String.valueOf(number);
        System.out.println(nn+"nn");
        String yn="";
        yn+='0';
        yn+=nn;
        System.out.println(yn+"yn");
    }  

    class Result {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */
    
        public static String timeConversion(String ss) {
            
           String str=""; 
           str+=ss.charAt(0);
           str+=ss.charAt(1);
           int number = Integer.parseInt(str);
           String uu="";
           
           if(ss.contains("P")==true&& number<12){
               
               number+=12;
               String nn=String.valueOf(number);
               
               uu=nn;
               
           }
           else if(ss.contains("A")==true && number>=12){
              
                   number-=12; 
                   String nn=String.valueOf(number);
                   String yn="";
                   yn+='0';
                   yn+=nn;
                
              
               
                 uu=yn;
            
           }
           else if(ss.contains("A")==true && number<12){
                String nn=String.valueOf(number);
                   String yn="";
                   yn+='0';
                   yn+=nn;
               uu=yn;
           } else if(ss.contains("P")==true&& number==12){
              
               uu+=str.charAt(0);
               uu+=str.charAt(1);
           }
           
           for(int i=2;i<ss.length()-2;i++){
                   uu+=ss.charAt(i);
               } 
           return uu;
        }
    
    }
}
        // List list=new ArrayList<Integer>();
        // list.add(-4);
        // list.add(3);
        // list.add(-9);
        // list.add(4);
        // list.add(1);
        // List<Integer> numbers = Arrays.asList(-4,3,-9,0,4,1);
        // int p=0,n=0,z=0;
        // for (int i = 0; i < numbers.size(); i++){
        //     if(numbers.get(i)==0){
        //         z++;
        //     }
        //     else if(numbers.get(i)>0){
        //         p++;
        //     }else if(numbers.get(i)<0){
        //         n++;
        //     } 
        // }

      //  System.out.print(p+"p"+n+"n" + " "+z);   

      
      
    //   public static void plusMinus(List<Integer> arr) {
    //     int p=0,n=0,z=0;
    //     for(int each:arr){
    //         if(each==0){
    //             z++;
    //         }
    //         else if(each>0){
    //             p++;
    //         }else if(each<0){
    //             n++;
    //         } 
    //     }
        
      
        
        
    //     double ds=new Double(arr.size());
    //     double dp= p/ds;
    //     double dn= n/ds;
    //     double dz= z/ds;
    //     String sp=String.valueOf(dp);
    //     String sn=String.valueOf(dn);
    //     String sz=String.valueOf(dz); 
         
    //    int jp=sp.length();
    //    int jn=sn.length();
    //    int jz=sz.length();  
        
    //    if (jp<8){
             
    //        for(int i=0;i<(8-jp);i++){
    //            sp+="0"; 
    //        }
           
    //       }
    //     if (jz<6){
             
    //        for(int i=0;i<(8-jz);i++){
    //            sz+="0"; 
    //        }
           
    //       }
    //    if (jn<6){
             
    //        for(int i=0;i<(8-jn);i++){
    //            sn+="0"; 
    //        }
           
    //       }
    //      String ps="",ns="",zs="";
    //       for(int i=0;i<8;i++){
    //           ps+=sp.charAt(i);
    //           ns+=sn.charAt(i);
    //           zs+=sz.charAt(i);
    //        }
    //        System.out.println(ps);
    //        System.out.println(ns);
    //        System.out.println(zs);
       
        
        
    //    }




    //    public static void miniMaxSum(List<Integer> arr) {
     
    //     Collections.sort(arr); 
        
            
    //      //Long sum = arr.stream().collect(Collectors.summingLong(Long::longValue));
         
    //      List<Long> longs = arr.stream()
    //       .mapToLong(Integer::longValue)
    //       .boxed().collect(Collectors.toList());
       
    //     long  sumOfElements = longs.stream()
    //       .mapToLong(Long::longValue)
    //       .sum();
    //     long max=sumOfElements-arr.get(0);
    //     long min=sumOfElements-arr.get(arr.size()-1);
        
    //     Long A = Long.valueOf(max);
    //     Long B = Long.valueOf(min);
        
    //     System.out.println(B+" "+A);
      
    //   }
  
//}
