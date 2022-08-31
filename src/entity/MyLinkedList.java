package entity;

import java.util.Objects;

public class MyLinkedList {

    private int val;
    private MyLinkedList next;
    private MyLinkedList dummyHead;

    public MyLinkedList() {
        dummyHead = new MyLinkedList(0, null);
    }

    public MyLinkedList(int val, MyLinkedList next) {
        this.val = val;
        this.next = next;
    }

    public int get(int index) {
        if (Objects.isNull(dummyHead.next)){
            return -1;
        }
        MyLinkedList temp = dummyHead.next;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
            if (temp == null){
                return - 1;
            }
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        dummyHead.next = new MyLinkedList(val, dummyHead.next);
    }

    public void addAtTail(int val) {
        MyLinkedList temp = dummyHead.next;
        if (temp == null){
            addAtHead(val);
            return;
        }
        while (temp.next != null){
            temp =temp.next;
        }
        temp.next = new MyLinkedList(val,null);
    }

    public void addAtIndex(int index, int val) {
        MyLinkedList temp = dummyHead.next;
        if (index <= 0){
            addAtHead(val);
        }else{
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
                if (temp == null){
                    return;
                }
            }
            if (temp == null){
                return;
            }
            temp.next = new MyLinkedList(val, temp.next);
        }
    }
    public void deleteAtIndex(int index) {
        MyLinkedList temp = dummyHead.next;
        if (index == 0){
            dummyHead.next = temp.next;
            return;
        }
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
            if (temp == null){
                return;
            }
        }
        if (temp == null || temp.next == null){
            return;
        }
        temp.next = temp.next.next;
    }
}