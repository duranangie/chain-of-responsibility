public class Number {
    private int number1;
    private int number2;
    private String calculationWanted;

    public Number(int newNumber1, int newNumber2, String calcWanted){
    
        number1 = newNumber1;
        number2 = newNumber2;
        calculationWanted = calcWanted;

    }

    public int getNumber1() {return number1;}
    public int getNumber2() {return number2;}
    public String getcalcWanted() {return calculationWanted;} 


}
