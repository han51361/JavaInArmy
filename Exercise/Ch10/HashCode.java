/*
hashCode() 메소드

hashCode() 의 반환 값 : 인스턴스가 저장된 가상머신의 주소를 10진수로 반환

두 개의 서로 다른 메모리에 위치한 인스턴스가 동일하단 것은?
-> 논리적으로 동일 : equals() 의 반환 값이 = true
-> 동일한 hashCode 값을 가짐 : hashCode() 의 반환 값이 동일
*/



class Student{
    int studentNum;
    String studentName;
    
    public Student(int studentNum, String studentName){
        this.studentName = studentName;
        this.studentNum = studentNum;
    }
 
 @Override
 public boolean equals(Object obj){
     if( obj instanceof Student){
         Student std = (Student)obj;
         return (this.studentNum == std.studentNum);
     }
     return false;
 }
}
public class HashCode{
    
    public static void main(String[] args){
        String str1 = new String("abc");
        String str2 =  new String("abc");
        
        System.out.println(str1 == str2);
          System.out.println(str1.equals(str2));
          
          
          Student Lee = new Student(100,"이순신");
          Student Shin = new Student(100,"이순신");
          Student Lee2 = Lee;
          
            System.out.println(Lee == Shin);
            System.out.println(Lee2 == Lee);
            System.out.println(Lee.equals(Shin));  
            
            System.out.println(Lee.hashCode());
            System.out.println(Shin.hashCode());
    }
}