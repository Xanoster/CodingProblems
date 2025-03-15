public class MiddleAdd {
   public static class Node {
       int data;
       Node next;

       public Node(int data) {
           this.data = data;
           this.next = null;
       }
   }
       public static Node head;
       public static Node tail;
     public static int size;

       public void Add(int data){
           Node newNode=new Node(data);
           size++;
           if(head==null){
               head=tail=newNode;
               return;
           }
           newNode.next=head;
           head=newNode;
       }

       public void Middle(int idx,int data){
           size++;
          Node newNode=new Node(data);
          Node temp=head;
          int i=0;
          while(i!=idx){
              temp=temp.next;
              i++;
          }
          newNode.next=temp.next;
          temp.next=newNode;
   }
    public static void main(String[] args) {
        MiddleAdd l1 = new MiddleAdd();
        l1.Add(2);
        l1.Add(2);
        l1.Add(2);
        l1.Middle(1,1);
        System.out.println(l1.size);
    }
}
