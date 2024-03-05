// You are using Java
import java.util.*;
class main{
    public static void main(String args[]){
        int n =4;
            for(int c=1;c<=n;c++){
                if(c!=n){
                ncr(n-1,c-1);
                }
                else{
                    return ncr(n-1,c-1);

                }
            }
            
            
            
        
    }

    //ncr approach
    
    static List<Integer> ncr(int rows,int col){
        List <Integer> ad1 =new ArrayList<Integer>();
        int  res =1;
        ad1.add(res);
        for(int i=0;i<col;i++){
            res =res*(rows-i);
            res=res/(i+1);
            ad1.add(res);
        }
        return ad1;
        
    }
}
