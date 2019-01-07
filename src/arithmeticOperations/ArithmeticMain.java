package arithmeticOperations;

public class ArithmeticMain {

    public static void main(String[] args) {

        int firstNum = 125;
        int secondNum = 24;

        ArithmeticSum sm = new ArithmeticSum();
        sm.firstNum = firstNum;
        sm.secondNum = secondNum;
        sm.sum();

        ArithmeticSub sb = new ArithmeticSub();
        sb.firstNum = firstNum;
        sb.secondNum = secondNum;
        sb.sub();

        ArithmeticMulti ml = new ArithmeticMulti();
        ml.firstNum = firstNum;
        ml.secondNum = secondNum;
        ml.multi();

        ArithmeticDiv dv = new ArithmeticDiv();
        dv.firstNum = firstNum;
        dv.secondNum = secondNum;
        dv.divi();

        ArithmeticReminder rm = new ArithmeticReminder();
        rm.firstNum = firstNum;
        rm.secondNum = secondNum;
        rm.reminder();



    }
}