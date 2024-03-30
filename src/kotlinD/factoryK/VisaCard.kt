package kotlinD.factoryK

class VisaCard : IPaymentCardK {
    override fun getName(): String {
        return "VisaCard"
    }

    override fun getProviderInfo(): String {
        return "Visa"
    }
}