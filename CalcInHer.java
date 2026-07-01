class Calc {
    int a, b;
    int add(int a, int b){
        return a + b;
    }

    int sub(int a, int b){
        return a - b;
    }
}
class AdvCalc extends Calc {
    int mul(int a, int b){
        return a * b;
    }

    int div(int a, int b){
        return a / b;
    }
}

class VeryAdvCalc extends AdvCalc {
    int mod(int a, int b){
        return a % b;
    }
}
public class CalcInHer {
    public static void main(String[] args) {
        VeryAdvCalc v = new VeryAdvCalc();
        int r1 = v.add(2,3);
        int r2 = v.sub(5,2);
        int r3 = v.mul(3,4);
        int r4 = v.div(8,2);
        int r5 = v.mod(7,3);

        System.out.println(" " + r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
    
}
