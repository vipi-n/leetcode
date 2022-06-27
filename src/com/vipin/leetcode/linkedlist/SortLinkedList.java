package com.vipin.leetcode.linkedlist;

public class SortLinkedList {

    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode mid = middle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }
    public ListNode merge(ListNode l1, ListNode l2){

        ListNode dummyNode = new ListNode(-1);
        ListNode curr = dummyNode;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        curr.next = (l1 != null) ? l1 : l2;
        return dummyNode.next;
    }


    public ListNode middle(ListNode head){
        if(head == null)return head;
        ListNode slow = head;
        ListNode fast = head;


        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }
}
