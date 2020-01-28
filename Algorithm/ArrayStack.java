import java.util.*;
//stack 은 LIFO 특징 Last In First Out


//배열과 linkedlist 사용하여 stack 구현해보기


//interfacae 생성


//pop : stack 상단의 데이터를 가져오고 삭제
//peak  : stack 상단의 데이터를 추출
//isEmpty() : 스택이 비어있는지 확인
//push :  데이터를 stack 에 삽입

public class ArrayStack implements InterStack{
    
    private Object[] stackArray;
    private int index;
    
    public static void main(String args[]){
        ArrayStack as = new ArrayStack(10);
        as.push(2);
        as.push(42);
        as.push(31);
        
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        as.push('A');
        System.out.println(as.peak());
        System.out.println(as.pop());
    }
    
    public ArrayStack(int size){
        this.stackArray = new Object[size];
        this.index = 0;
    }
    
    @Override
    public void push(Object data){
        // TODO Auto-generated method stub
        if(index >= stackArray.length){
            throw new IndexOutOfBoundsException("full");
        }else{
            stackArray[index++] = data;
        }
        
    }
    
    @Override 
    public Object peak(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }else{
            return stackArray[index-1];
        }
    }
    
    @Override
    public Object pop(){
        // TODO Auto-generated method stub
       if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }else{
            Object obj = peak();
            stackArray[index] = null;
            index--;
            return obj;
           
        } 
    }
    
    @Override
    public boolean isEmpty(){
        return (index <=0);
    }
    
}