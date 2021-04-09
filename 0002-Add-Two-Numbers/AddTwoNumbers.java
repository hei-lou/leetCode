import java.util.Stack;

/**
 * @author tan
 * @version 1.0
 * @description:
 * @date 2021/4/9 10:34
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        node1.setNext(node2);
        ListNode node3 = new ListNode(3);
        node2.setNext(node3);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        node4.setNext(node5);
        ListNode node6 = new ListNode(4);
        node5.setNext(node6);

        ListNode listNode = addTwoNumbers(node1, node4);
        Stack stack = new Stack();
        while (listNode != null){
            stack.push(listNode.getValue());
            listNode = listNode.getNext();
        }
        while(!stack.empty()){
            System.out.println(stack.pop());
        }

    }

    public static ListNode addTwoNumbers(ListNode node1, ListNode node2){
        int carry = 0;
        ListNode returnNode = new ListNode(0);
        ListNode temp = returnNode;
        while(node1 != null || node2 != null){
            int sum = carry;
            carry = 0;
            if(node1 != null){
                sum += node1.getValue();
                node1 = node1.getNext();
            }
            if(node2 != null){
                sum += node2.getValue();
                node2 = node2.getNext();
            }
            ListNode newNode = new ListNode(sum % 10);
            temp.setNext(newNode);
            temp = newNode;
            if(sum >= 10){
                carry = 1;
            }
        }
        return returnNode.getNext();
    }

}

class ListNode{
    private int value;
    private ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
