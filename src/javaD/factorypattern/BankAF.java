package javaD.factorypattern;

public class BankAF implements IBank {
    @Override
    public String withDraw() {
        return "your request is handling by bankA";
    }
}