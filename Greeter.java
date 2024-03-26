class Hello {
    String getGreeting() {
        return "Hello, Mars!";
    }
}

public class Greeter {
    public static void main(String[] args) {
        Hello obj = new Hello();
        String str = obj.getGreeting();
        System.out.println(str);
    }
}
