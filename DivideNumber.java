public class DivideNumber implements chain {

    private chain nextInChain; // sale error poque no lo llamo en el else

    @Override
    public void setNextChain(chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Number request) {
        if (request.getcalcWanted() == "div") {
            System.out.println(request.getNumber1() + "/" + request.getNumber2() + "="
                    + (request.getNumber1() / request.getNumber2()));
        } else {
          //  nextInChain.calculate(request);
            System.out.println("recuerda que solo es valido para: 'add','sub','mult','div' ");
        }
    }

}
