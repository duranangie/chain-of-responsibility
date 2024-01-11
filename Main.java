public class Main {
    public static void main(String[] args) {
        chain chain1 = new addNumber();
        chain chain2 = new SubtractNumbers();
        chain chain3 = new MultNumber();
        chain chain4 = new DivideNumber();

        chain1.setNextChain(chain2); 
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);

        Number request = new Number(4, 8, "sub");
        chain1.calculate(request);

    }
}
