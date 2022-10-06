import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Unique{

  
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(2);

        Collections.sort(list);
        System.out.println(list+"fvghbjk");
        int result =0;
        int b=list.get(0);
        //list1.add(b);
        int f=list.get(0);
        int last=list.get(list.size()-1);
        System.out.println(last+"  "+f);
        for(int i=1;i<list.size()-1;i++){

            // System.out.println(list.get(i));

            if(i==1 && f!=list.get(i)){
               result=f;
               System.out.println("first");
               
            }
            
            else if (i==list.size()-2 && list.get(i)!=last){
               result=last;
               System.out.println(result+"result");
            }

            else if(list.get(i-1)!=list.get(i) && list.get(i)!=list.get(i+1)){
                result=list.get(i);   
                System.out.println("baska");
            }
            

        }
        
        System.out.println(result+"fghujkl");


}}