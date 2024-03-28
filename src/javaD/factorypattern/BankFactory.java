package javaD.factorypattern;

public class BankFactory implements IBankFactory{
    @Override
    public IBank getBank(String bankCode) {
        return switch (bankCode) {
            case "123456" -> new BankAF();
            case "111111" -> new BankBF();
            default -> null;
        };
    }
}
