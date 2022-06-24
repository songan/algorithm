package com.songan.leetcode.editor;

/**
 * @author songan
 * @version 1.0
 * @description
 * @date 2022/6/24
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {this.val = val;}

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
