// Last updated: 23/09/2026, 23:52:01
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode dummy= new ListNode(-1);
14        ListNode curr=dummy;
15        while(list1!=null&&list2!=null){
16            if(list1.val<=list2.val){
17                curr.next=list1;
18                list1=list1.next;
19            }
20            else{
21                curr.next=list2;
22                list2=list2.next;
23            }
24            curr=curr.next;
25        }
26        curr.next=list1==null?list2:list1;
27        return dummy.next;
28    }
29}