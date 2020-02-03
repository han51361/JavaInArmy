/* 
Object class 
java.lang.Object 클래스
모든 클래스의 최상위 클래스
- 모든 클래스는 Object 클래스에서 상속 받는다.
- 모든 클래스는 Object 클래스의 메소드를 사용할 수 있다



*/

class Book{
    String title;
    String author;
    
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    } 
    @Override
    public String toString(){
        return author + "," + title;
    }
}
public class Object1{
    
    public static void main(String[] args){
        
        Book book = new Book("xonmin","한정민");
        System.out.println(book); //결과 Book@hash코드
        String str = new String("xonmin");
        System.out.println(str.toString()); //결과 문자열만 나옴
        //toString() 은 Object 의 메소드 
        
    }
   
   
}