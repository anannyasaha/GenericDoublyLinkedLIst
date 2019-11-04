import java.util.*;
public class LinkedListDriver {


 public static void main(String[] args) {
 LinkedList<Student> list = new GenericSortedDoublyLinkedList<Student>();

list.toString();
 //Warrior krogg = new Warrior("Krogg", 30, 50, 200);
 Student kim=new Student("Kim",3.4f);
 list.insert(kim);

 System.out.println(list);
 //list.toString();
 //Warrior gurkh = new Warrior("Gurkh", 40, 45, 180);
 //int hp;
 //hp=gurkh.getHp();
Student chim=new Student("Chim",3.9f);
 list.insert(chim);

 System.out.println(list);
 //Warrior brynn = new Warrior("Brynn", 45, 40, 190);
 Student dream=new Student("Dream",2.9f);
 list.insert(dream);

  System.out.println(list);
 //Warrior dolf = new Warrior("Dolf", 20, 65, 210);
 Student pam=new Student("Pam",4.5f);
 list.insert(pam);

  System.out.println(list);
 //Warrior zuni = new Warrior("Zuni", 50, 35, 170);
 Student Tam=new Student("Tam",5.0f);
 list.insert(Tam);

  System.out.println(list);

 }
}
