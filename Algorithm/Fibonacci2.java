import java.util.Scanner;


//DP를 이용한 피보나치 수열 계산

/* 
recursive 와 다른점
recursive : 숫자의 뒤에서부터 (n)을 계산
DP : 숫자의 앞에서 부터 (0) 계산

이후 계속해서 중복되는 값들은 저장해서 가져다 씀

*/


public class Fibonacci2{
    
  
    public static void main(String[] args){
        Fibonacci2 ex = new Fibonacci2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the postive integer");
        int n= sc.nextInt();
        int result = 0;
        if(n>0) result = ex.clacFibo(n);
        
        System.out.println("F("+n+") ="+result);
        
        
    }
    
    public int clacFibo(int n){
        int[] fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        
        int index =2;
        while(index <=n){
            fibo[index] = fibo[index-1] + fibo[index-2];
            index ++;
            
        }
        return fibo[n];
    }
    
    
    
}

//DP의 복잡도는 2부터 n 까지 1번씩 진행
// 따라서 O(n)