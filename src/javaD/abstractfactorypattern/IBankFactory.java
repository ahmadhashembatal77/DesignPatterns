package javaD.abstractfactorypattern;

interface IBankFactory {
    IBank getBank(String bankCode);
    IPaymentCard getPaymentCard(String card);
}