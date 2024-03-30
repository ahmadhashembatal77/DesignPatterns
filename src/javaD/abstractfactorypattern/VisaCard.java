package javaD.abstractfactorypattern;

public class VisaCard implements IPaymentCard {
    @Override
    public String GetName() {
        return "VisaCard";
    }

    @Override
    public String GetProviderInfo() {
        return "Visa";
    }
}