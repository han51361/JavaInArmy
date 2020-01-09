
import java.util.Scanner;



class Sort{
    public int[] MakeArray(int a){
        int temp[] = new int[a];
        
        return temp;
    }
    
    
    Scanner scn = new Scanner(System.in);
   int i=0;
   
    public void Insert(int[] k,int a){
         while(i<a){
         int num = scn.nextInt();
          k[i] = num;
          i++;
         
     }    
     
    }
    
    public void Sorting(int k []){
        
        for(int i =0; i<k.length; i++){
            for(int j =i+1; j<k.length;j++){
                if(k[i]> k[j]){
                    int temp = k[i];
                    k[j] = k[i];
                    k[i] = temp;
                }else{
                    break;
                }
            }
        }
        
        for(int num:k){
            System.out.print(num+"");
            
        }
    }
    
    
}

public class Sort1{
    public static void main(String[] args){
    Scanner scn1 = new Scanner(System.in);
    Sort s1 = new Sort();
    int k = scn1.nextInt();
    int [] temp1;
    temp1 = s1.MakeArray(k);
    
    s1.Insert(temp1,k);
    s1.Sorting(temp1);
    
        
        
        
        
    }
    
}