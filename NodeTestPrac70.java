package pack19;

public class NodeTestPrac70 {
    public static void main(String[] args) {
        NodePrac69 node1 = new NodePrac69(1);
        NodePrac69 node2 = new NodePrac69(2);
        NodePrac69 node3 = new NodePrac69(3);
        NodePrac69 node4 = new NodePrac69(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        NodePrac69 head = node1;

        NodePrac69 cur = head;
        int set = 0;
        while (cur != null){
            set ++;
            System.out.println(cur.val);
            cur = cur.next;
        }
        System.out.println(set);
        NodePrac69 now = head;
        while (now.next != null){
            System.out.println(now.val);
            now = now.next;
        }
        System.out.println("last:"+now.val);
    }
}
