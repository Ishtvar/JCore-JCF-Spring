package Task23;

public class SinglyMain {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.add("sss");

        ls.add("ggg");

        ls.add("ddd");

        System.out.println(ls.getHead().getData());
        if (ls.contains("ddd")) {
            System.out.println("Contains");
        }
        ls.remove("ddd");
        System.out.println(ls.getHead().getData());
        ls.contains("ddd");
    }


}
