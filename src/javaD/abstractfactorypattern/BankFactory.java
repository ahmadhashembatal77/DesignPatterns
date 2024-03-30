package javaD.abstractfactorypattern;

public class BankFactory implements IBankFactory{
    @Override
    public IBank getBank(String bankCode) {
        return switch (bankCode) {
            case "123456" -> new BankAF();
            case "111111" -> new BankBF();
            default -> null;
        };
    }

    @Override
    public IPaymentCard getPaymentCard(String card) {
        return switch (card) {
            case "12" -> new VisaCard();
            case "22" -> new MasteryCard();
            default -> null;
        };
    }
}
