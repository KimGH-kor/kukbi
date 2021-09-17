package 링크드;

import java.util.*;

class Node{
   int data;
   Node link;
   public Node(int data) {
      this.data = data;
      link = null;
   }
}

class myLinkedList{
   Node head;//첫번쨰 노드
   
   public myLinkedList() {
      head = null;
   }
   
   //노드를 찾는 메소드
   Node Find(int data) {
      Node curr = head;
      while(curr!=null) {
         if(curr.data == data) {
            return curr;
         }
         curr = curr.link;
      }
      return null;
   }
      
   //n을 전달하면 연결리스트에 붙여라.
   void add(Node n) {
      //연결리스트에 데이터가 하나도 없으면 
      if(head == null) {
         head = n;//지금 추가된 노드가 head가 된다.
         return;
      }
      
      Node curr = head; // 현재 시작위치는 head부터
      
      //연결리스트에 데이터가 있을 때
      //해당 데이터에 링크가 열결되있는지 확인
      while(curr.link != null) {
         curr = curr.link;//연결된 링크가 있다면 다음 노드의 주소로 이동.
      }
      curr.link = n;//link가 빈 자리를 찾으면 n을 연결시킨다.
   }

   //중간에 삽입하는 메소드
   void insert(Node curr, Node n) {
      n.link = curr.link;
      curr.link = n;
   }
   
   //가장 앞에 추가하는 메소드
   void addHead(Node n) {
      n.link = head;
      head = n;
   }
   
   void remove(int data) {
      Node curr = head;
      Node prev = null;
      
      while(curr!=null) {
         if(curr.data == data) {
            prev.link = curr.link;
         }
         prev = curr; // 이동 전에 현재의 위치를 prev에 저장하고
         curr = curr.link; // 다음번 노드의 주소로 이동한다.
      }
   }
   
   void show() {
      Node curr = head; // 현재 시작위치는 head부터
      
      //연결리스트에 데이터가 있을 때
      //해당 데이터에 링크가 열결되있는지 확인
      while(curr != null) {
         System.out.print(curr.data);
         if(curr.link!=null) {
            System.out.print("->");
         }
         curr = curr.link;//연결된 링크가 있다면 다음 노드의 주소로 이동.
      }
      System.out.println("\n");
   }
   
}

public class LinkedListEx {

   public static void main(String[] args) {
      myLinkedList list = new myLinkedList();
      
      list.add(new Node(10));
      list.add(new Node(20));
      list.add(new Node(30));
      list.add(new Node(40));
      list.add(new Node(50));
      list.add(new Node(60));
      list.show();
      
      
      list.insert(list.Find(20), new Node(25));
      list.show();

      list.insert(list.Find(30), new Node(35));
      list.show();
      
      list.addHead(new Node(0));
      list.show();
      
      list.remove(35);
      list.show();
      
   }

}