package com.vipin.leetcode.linkedlist;

public class RemoveNthNodeFromEnd {

        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode dummyNode = new ListNode();
            dummyNode = head;

            ListNode slow = dummyNode;
            ListNode fast = dummyNode;

            for(int i = 1; i <= n; i++){
                fast = fast.next;
            }

            if(fast == null) return head.next;

            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            return head;

        }

        public ListNode removeNthFromEnd2(ListNode head, int n) {

            int size = 0;
            ListNode node = head;

            if(head == null) return null;

            while(node != null){
                size++;
                node = node.next;
            }

            if(size - n == 0) return head.next;

            ListNode prev = head;
            for(int i = 0; i < size - 1 - n; i++){
                prev = prev.next;
            }
            prev.next = prev.next.next;
            return head;
        }

    }

