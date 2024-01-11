public class SubtractNumbers implements chain {

    private chain nextInChain;

    @Override
    public void setNextChain(chain nextChain) {
        nextInChain = nextChain;

    }

    @Override
    public void calculate(Number request) {
        if (request.getcalcWanted() == "sub") { // cambiamos el nombre de la operacion que queremos solicitar
            System.out.println(request.getNumber1() + "-" + request.getNumber2() + "="
                    + (request.getNumber1() - request.getNumber2()));
        } else {
            nextInChain.calculate(request);
        }
    }

}
