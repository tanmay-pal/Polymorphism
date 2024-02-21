public class RunTimePolymorphismExample {
    public static void main(String[] args) {
        Employee prog = new Programmer(1, "Rohit", "Programmer - Coding", 1);
        System.out.println(prog.toString());
        
        Employee mgr = new Manager(2, "Rahul", "Manager - Management", 4);
        System.out.println(mgr.toString());
    }
}

