/*
Stream

자료의 대상과 관계없이 동일한 연산을 수행할 수 있는기능 (자료의 추상화)
배열 , 컬렉션에 동일한 연산이 수행되어 일관성 있는 처리 가능
한번 생성하고 사용한 스트림은 재사용할 수 없음
스트림 연산은 기존 자료를 변경하지 않는다.

*중간연산
-filter(), map()
조건에 맞는 요소를 추출filter() 하거나 요소를 변환 함map()

sList.stream().filter(s->s.length() >= 5).forEach(s ->syso(s));
스트림 생성   / 중간연산                 / 최종연산 


*최종연산
스트림의 자료를 소모하며 연산을 수행
최종 연산 후 스트림은 더 이상 다른 연산에 사용할 수 없다.

*/

import java.util.Arrays;
import java.util.List;
public class Stream1 {
    
    public static void main(String[] args){
        
        int[] arr = {1,2,3,4,5};
        
        int sum = Arrays.stream[arr].sum();
        int count  = (int)Arrays.stream[arr].count();
        
        System.out.println(sum);
         System.out.println(count);
         
         List<string> sList = new ArrayList<string>();
         sList.add("xonmin");
         sList.add("Apex");
         sList.add("Zenith");
         
         
         Stream<string> stream = sList.stream();
         // stream 객체를 만들 수 있음.
         stream.forEach(s->System.out.println(s));
         sList.stream().sorted().forEach(s->System.out.prinln(s));
    }
}