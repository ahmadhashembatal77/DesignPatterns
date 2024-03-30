package javaD.abstractfactorypattern;

public class BankBF implements IBank{
    @Override
    public String withDraw() {
        return "your request is handling by bankB";
    }
}