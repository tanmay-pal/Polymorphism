public class MethodOverloadingExample {
    private void displayData(int value) {
        System.out.println("Got Integer data "+value);
    }
    private void displayData(String value) {
        System.out.println("Got String data " +value);
    }    
    private void displayData(int value1, int value2) {
        System.out.println("Got Two Integers data "+value1+" -- "+value2);
    }
    public static void main(String[] args) {
        MethodOverloadingExample ex = new MethodOverloadingExample();
        ex.displayData(1);
        ex.displayData("Example");
        ex.displayData(3,4);
    }
}

