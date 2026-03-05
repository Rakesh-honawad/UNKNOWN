// Last updated: 05/03/2026, 18:49:44
// test
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode res=new ListNode(0);
14        res.next=head;
15        ListNode start=res;
16        ListNode end=res;
17        int steps=0;
18        while(start.next!=null){
19            start=start.next;
20            if(steps>=n){
21                end=end.next;
22            }
23            steps++;
24
25        }
26        end.next=end.next.next;
27        return res.next;
28    }
29}
30 
31