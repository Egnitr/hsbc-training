class MethodOverloadHello {
    private static void hello(int a){
        System.out.println("Integer: " + a);
    }

    private static void hello(short a){
        System.out.println("Short: " + a);
    }
     private static void hello(byte a){
        System.out.println("Byte: " + a);
    }
     private static void hello(long a){
        System.out.println("Long");
    }

    public static void main(String[] args) {
        hello(5);
    }
}