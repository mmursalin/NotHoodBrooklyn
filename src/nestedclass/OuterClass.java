package nestedclass;

public class OuterClass {
    //outer class open body
    InnerClassA innerA = new InnerClassA();

    public void outerMethodA(){
        System.out.println("OuterClassA MethodA");
        innerA.innerAMethodA();
    }
    public void outerMethodB(){
        InnerClassB.innerBMethodA();
        System.out.println("OuterClassA MethodB");
    }

    public class InnerClassA{

        public void innerAMethodA(){
            System.out.println("InnerA MethodA");
        }
        private void innerAMethodB(){
            System.out.println("InnerA MethodB");
        }
    }
    public static class InnerClassB{

        public static void innerBMethodA(){
            System.out.println("InnerB MethodA");
        }
        private static void innerBMethodB(){
            System.out.println("InnerB MethodB");
        }
    }
}//outer class close body
