public class MultNumber implements chain{



    private chain nextInChain;

    @Override
    public void setNextChain(chain nextChain) {
      nextInChain = nextChain;
    }

    @Override
    public void calculate(Number request) {
      if(request.getcalcWanted()=="mult"){
        System.out.println(request.getNumber1()+"*"+request.getNumber2()+"="+(request.getNumber1()*request.getNumber2()));
      }else{
        nextInChain.calculate(request);
      }
    }
    

    
}
