package exceptionhandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int num = 10;
        try {
            int result = num / 0;
            System.out.println(result);
        }catch(Exception ex){
            System.out.println("You can not divide a number by zero, go learn math first");
        }
        System.out.println("I was able to come to this point");
    }

}