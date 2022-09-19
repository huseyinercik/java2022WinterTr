package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {
        Deque<Integer> ll1=new LinkedList<>();


        System.out.println(ll1.peek());//bosken kullanirsak null dondurur
        //System.out.println(ll1.element());//bosken element methodunu kullanirsa exception firlatir
        System.out.println(ll1.poll());//bosken kullanirsak null dondurur
        System.out.println(ll1.pollFirst());//bosken kullanirsak null dondurur
        System.out.println(ll1.pollLast());//bosken kullanirsak null dondurur
        //ll1.pop();//ilk elementi silip bize dondurur. ilk elementi bulamazsa exception firlatir
        ll1.push(30);//son eklenen elementi listenin basina ekler
        ll1.push(20);
        System.out.println(ll1);//[20,30]
        System.out.println(ll1.remove());//ilk elementi siler ve bise dondurur. element bulamazsa exception firlatir
        ll1.push(40);
        ll1.push(50);
        ll1.remove(50);//object olarak 50 yi siler
        ll1.push(30);
        System.out.println(ll1);
        ll1.removeLastOccurrence(30);//son object i sildi
        System.out.println(ll1);
    }
}
