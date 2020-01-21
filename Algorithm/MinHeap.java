import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class MinHeap {
    
    public static class minHeap {
         private ArrayList<Integer> heap ;
         
         //heap 생성자
         
         public minHeap(){
             heap = new ArrayList<>();
             heap.add(0); //index 0 채우기 (1부터 시작하기 위함)
         }
         
         
         //Insert
         public void insert(int val){
             heap.add(val);
             int p = heap.size() -1;
             
             //heap size -1 이 1보다 작아질 때까지 진행 -> root로 이동
             while(p>1 && heap.get(p/2) > heap.get(p)) {
                 System.out.println("swap");
                 //부모보다 자식 노드가 더 작으면 바꿔야 한다.(최소힙)
                 int tmp = heap.get(p/2);
                 heap.set(p/2,heap.get(p));
                 heap.set(p,tmp);
                 
                 p = p/2; //p 를 부모 값으로 변경(부모 노드 인덱스로 이동)
                 
                 
             }
             
         }
         
         //delete
         public int delete() {
             if(heap.size()-1<1){
                 return 0;
             }
             
             int deleteitem=heap.get(1);
             
             heap.set(1,heap.get(heap.size()-1));
             heap.remove(heap.size()-1);
             
             int pos = 1;
             while((pos*2)< heap.size()){
                 
                 int min = heap.get(pos*2);
                 int minPos = pos*2;
                 
                 if(((pos*2+1)<heap.size()) && min > heap.get(pos*2+1)){
                     min  = heap.get(pos*2+1);
                     minPos = pos*2+1;
                     
                 }
                 if(heap.get(pos) < min){
                     break;
                 }
                 int temp = heap.get(pos);
                 heap.set(pos,heap.get(minPos));
                 heap.set(minPos,temp);
                 pos  = minPos;
             }
             
             return deleteitem;
             
             
         }
        
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        minHeap heap = new minHeap();
        
        for(int i=0;i<N; i++){
            int val = Integer.parseInt(br.readLine());
            
            if(val ==0){
                System.out.println(heap.delete());
                
            }else{
                heap.insert(val);
            }
        }
    }
    
}