import java.util.Scanner;


public class Fibonacci{
    // n번째 피보나치 수를 구하는 문제
    //여기서 n <= 20
    //이 문제는 보통 recursive or DP(dynamic Programing)으로 푼다.
    
    
    public static void main(String args[]){
        Fibonacci fibo = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        System.out.println("20 이하의 자연수를 입력해주세요");
        int n = sc.nextInt();
        
        System.out.println("F("+n+") = "+fibo.fibo1(n));
        
    }
    
    public int fibo1(int n){
        
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibo1(n-1) + fibo1(n-2);
    }
    
    
}