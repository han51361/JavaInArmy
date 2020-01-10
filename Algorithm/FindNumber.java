import java.util.Scanner;


/* 
배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.

*/
class Solution{
    
    
    //정렬하고 k번째 수 고르는 함수
    public void sort(int[] array, int k){
      
        for(int i=0;i<array.length;i++){
            for(int j =i+1; j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }else{
                    break;
                }
            }
        }
        
        for(int num : array){
            System.out.print(num+",");
        }
        System.out.print("k번째 수는"+array[k-1]+"입니다");
        
    }
    
    
    
    
    
    //배열을 자르는 함수 
    public int[] solution(int[] array, int i, int j){
        int answer[] = new int[j-i+1];
        
            if(i>j){
                int temp = i;
                i =j;
                j= temp;
            }
            int q=0;
          for(int p= i-1; p<j;p++){
              answer[q]=array[p];
              q++;
          }
        System.out.print("잘린 배열은");
        for(int num1:answer){
            System.out.print(num1+",");
        }
        System.out.print("\n");
        return answer;
        
        
        
        
    }
    
}
public class FindNumber{
    
    
    
    public static void main(String[] args){
        
        int[] array = {1,7,10,3,5,9,6,15,12,14,4};
        int[] solution1 ;
        Scanner scn = new Scanner(System.in); 
        
        System.out.print("잘린 배열은");
        System.out.print("\n");
        for(int ke : array){
            System.out.print(ke+",");
        }
       System.out.print("\n");
        Solution sol = new Solution();
        System.out.print("i번째에서 자를 수를 골라주십쇼\n");
        int i= scn.nextInt();
        System.out.print("j번째에서 자를 수를 골라주십쇼\n");
        int j =scn.nextInt();
        System.out.print("자른 배열에서 선택하실 k번째에서 자를 수를 골라주십쇼\n");
        System.out.print("단 k는 'j-1+1>k' \n");
        int k = scn.nextInt();
        solution1 = sol.solution(array,i,j);
        sol.sort(solution1,k);
        
        
        
    }
}