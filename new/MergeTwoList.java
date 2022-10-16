public class MergeTwoList {
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        SinglyLinkedList newList = new SinglyLinkedList();
    
        while(head1!=null && head2!=null){
            
         if(head1.data<=head2.data){
            newList.insertNode(head1.data);
            head1=head1.next;
         }
         else if(head2.data<head1.data){
            newList.insertNode(head2.data);
            head2=head2.next;
         }
        
        }
        
        if(head1!=null){
            newList.tail.next=head1;
        }else if(head2!=null){
            newList.tail.next=head2;
        }
        
        return newList.head;
    
        }
}
