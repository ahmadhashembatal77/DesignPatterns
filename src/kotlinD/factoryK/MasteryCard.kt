package kotlinD.factoryK

class MasteryCard : IPaymentCardK {
    override fun getName(): String {
        return "MasteryCard"
    }

    override fun getProviderInfo(): String {
        return "Mastery"
    }
}