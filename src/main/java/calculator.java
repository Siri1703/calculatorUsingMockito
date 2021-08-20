public class calculator {
    calculatorService service;
    public calculator(calculatorService service)
    {
        this.service=service;
    }
    public int  addition(int input1, int input2) {
        return service.add(input1,input2);
    }
    public int subtraction(int input1,int input2)
    {
            return service.subtract(input1, input2);
    }
    public int product(int input1,int input2)
    {
        return service.product(input1, input2);
    }
    public int division(int input1,int input2)
    {
        return service.division(input1, input2);
    }
}
