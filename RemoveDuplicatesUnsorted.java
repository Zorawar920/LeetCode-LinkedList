class Solution {
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        
        ListNode current = head;
        while(current!=null){
            hmap.put(current.val, hmap.getOrDefault(current.val,0)+1);
            current=current.next;
        }
        
        ListNode current_1 = head;
        while(current_1!=null){
            
            if(hmap.get(current_1.val)>1){
                head = head.next;
                current_1 = head;
                continue;
            }
            
            if(current_1.next!=null){
                int value = current_1.next.val;
                if(hmap.get(value)>1){
                current_1.next = current_1.next.next;
                
            }else{
                current_1=current_1.next;
            }
            }else{
                break;
            }
            
           
        }
        return head;
    }
}
