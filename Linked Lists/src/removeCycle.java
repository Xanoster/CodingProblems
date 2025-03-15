//public class removeCycle {
//    public static void remove(){
//        //detect cycle
//        Node slow=head;
//        Node fast=head;
//        boolean cycle=false;
//        while(fast.next!=null &&fast.next.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//            if(slow==fast) {
//                cycle = true;
//                break;
//            }
//        }
//        if(cycle==false){
//            return;
//        }
//        //finding meeting point
//        slow=head;
//        Node prev=null; //last node
//        while(slow!=fast){
//            prev=fast;
//            slow=slow.next;
//            fast=fast.next;
//
//        }
//        //remove cycle
//      prev.next=null;
//    }
//    public static void main(String[] args) {
//
//    }
//}
