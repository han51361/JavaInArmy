/* 
equals() 메소드

두 객체의 동일함을 논리적으로 재정의 할 수 있다

물리적 동일함 : 같은 주소값을 가지는 객체
논리적 동일함 : 같은 학번의 학생, 혹은 논리값이 같을 때 
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
public class Object2{
    
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
    }
}