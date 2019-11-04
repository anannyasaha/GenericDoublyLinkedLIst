//import java.util.*;
public class GenericSortedDoublyLinkedList<E extends Comparable<E>>implements LinkedList<E>{

public static class Node<E>{
  public Node<E> next=null;
  public Node<E> prev=null;
  public E element;
  public Node(E Brave){
    this.element=Brave;
  }
}
public Node<E> head;
public Node<E> tail;
private int count;

 public void insert(E person){
   Node<E> newNode= new Node<>(person);
   if(count==0){
     head =newNode;
     tail= newNode;

   }
  else if(head.element.compareTo(newNode.element)>0){
     newNode.next=head;
     head.prev=newNode;
     head=newNode;

   }

   //int c=0;
   else
   {Node<E> current=this.head;
     Node<E> save=null;
   while((current!=null)&&(newNode.element.compareTo(current.element))>0){
     //System.out.println(current.W.getName());
     save=current; //saving the intermediate greater object in the list
    current=current.next; //next comparing element
     //System.out.println(current.W.getName());
    //System.out.println(count);
//c++;
     }
     Node<E> temp=current;
     current=newNode; //replacing the position of the smaller element
     //System.out.println(current.W.getName());
     current.prev=save; //previous element is in the save is assigned to new element's previous node
     save.next=current; //next element of old element is new element.
     //System.out.println(current.prev.W.getName());
     //System.out.println(temp);
     current.next=temp;} //temp is another old element which is smaller than new element or null.
     //It is now assigned to the next node of new element.
     count++;
   }
  /* int velocity=person.getSpeed();
   Node newnode= new Node;
   Node tempnode=new Node;
   newnode.value=person.getSpeed();
   if(velocity>start.value){
     tempnode=start;
     start=newnode;
     start.next=tempnode;
     }
     if(start.value==null){
       start.value=person.getSpeed();
     }
     Node current= new Node;
     if(velocity<start.value){

       if(start.next<velocity){

       }
     }*/
     public String toString(){
       Node<E> current=this.head;
       String statement;
       //int count=0;
       statement="[ ";
       while(current!=null){
       //current=current.next;
      // System.out.println(current.W.getHp()+ "jake");
       statement=statement+current.element+" ";
       current=current.next;

}
statement=statement+"]";
return statement;
     }

 }
