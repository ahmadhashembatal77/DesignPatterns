package javaD.factorypattern;

interface IBankFactory {
    IBank getBank(String bankCode);
}
