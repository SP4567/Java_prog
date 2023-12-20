public class SingleLinkedList {
    public Node1 head;
    public Node1 tail;
    public int value;
    public Node1 next;
    public int size;
    public Node1 createSinglyLinkedList(int nodeValue)
    {
        head = new Node1();
        Node1 node = new Node1();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    public static void main(String args[])
    {
        SingleLinkedList sLL = new SingleLinkedList();
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);
    }
}
//tc: O(1)