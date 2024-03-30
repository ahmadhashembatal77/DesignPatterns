package javaD.abstractfactorypattern;

public class MasteryCard implements IPaymentCard {
    @Override
    public String GetName() {
        return "MasteryCard";
    }

    @Override
    public String GetProviderInfo() {
        return "Mastery";
    }
}
