import java.util.*;


//linkedlist를 사용하여 stack 구현하기 


public class LinkedListStack implements InterStack {
    private InterNode topNode;
    
    public static void main(String args[]){
        LinkedListStack ls = new LinkedListStack();
        ls.push("1");
        ls.push(1);
        ls.push("A");
        
        System.out.println(ls.pop());
        System.out.println(ls.pop());
        System.out.println(ls.pop());
        
        
    }
    
    public LinkedListStack(){
        this.topNode = null;
    }
    
    @Override 
    public Object pop(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }else{
            //탑노드의 데이터
            Object data = peak();
            //새로운 탑노드는 현재 탑노드의 nextNOde
            topNode = topNode.getNextNode();
            
            return data;
        }
    }
    
    @Override
    public Object peak(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }else{
            return topNode.getData();
        }
    }
    @Override
    public boolean isEmpty(){
        return (topNode == null);
    }
    
    @Override
    public void push(Object data){
        //새로운 node  생성
        InterNode newNode = new InterNode(data);
        //새로운 노드의 다음 노드를 삽입 이전의 top을 참조하도록
        newNode.setNextNode(topNode);
        //삽입 이후의 탑은 새로운 노드
        topNode = newNode;
        
    }
    
    
    
}

class InterNode {  //스택에 활용할 노드 클래스

    private Object data; //데이터를 저장
    private InterNode nextNode; // 이전의 노드를 저장하기위한 노드
    
    
    public InterNode(Object data){
        this.data = data;
        this.nextNode = null;
        
    }
    
    public Object getData(){
        return data;
    }
    
    public void setNextNode(InterNode node){
        nextNode = node;
    }
    public InterNode getNextNode(){
        return nextNode;
    }
    
    
}
