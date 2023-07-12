package OOP_Seminar4.OOP_Sem4_HT;

public class HT_Program {
    public static void main(String[] args) {
        GBLinkedList<String> ll = new GBLinkedList<>();
        ll.addLast("abc");
        ll.addLast("dfg");
        // System.out.println(ll.size());
        // System.out.println(ll.getEl(1));
        ll.addFrst("agsa");
        // System.out.println(ll.size());
        // System.out.println(ll.getEl(1));
        for (String item : ll){
             System.out.println(item);
        }
    }
}
