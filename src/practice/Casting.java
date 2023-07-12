package practice;

public class Casting {

    public static void main(String[] args) {
        //byte, short, char, int, long, float, double
        int a = 32680;
        long b = a; //Automatic casting - Widening Cast
        byte c = (byte) a; // Manual Casting - Narrowing Cast
        short d = (short) a;
        System.out.println(c);
        System.out.println(d);

        ClassA classB = new ClassA();
        ClassA classA = (ClassB)classB;

    }

    private static class ClassA implements Interface{

        @Override
        public void methodA() {

        }
    }

    private static class ClassB extends ClassA{
        public void methodA() {
            System.out.println("Signature B");
        }
    }

    private interface Interface{
        void methodA();
    }
}
