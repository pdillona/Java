package SelfTest;



public class Test1 {
    public static void main(String[] args) {
        int argument = 4;
        argument = someOperation(argument);
        
        System.out.println(argument);
    }

    private static int someOperation(int param){
        int tmp = param * 3;
        int result = tmp / 2;
        return result;
    }
}