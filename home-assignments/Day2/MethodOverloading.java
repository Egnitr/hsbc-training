class MethodOverloading {
    private static void display(int a){
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, String b){
        System.out.println("Arguments: " + a + " and " + b);
    }
     private static void display(String a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }
     private static void display(String s){
        System.out.println("Got String object.");
    }

    public static void main(String[] args) {
        display(1);
        display(1,"Hi");
        display("Hi",1);
        display("Hello");
    }
}