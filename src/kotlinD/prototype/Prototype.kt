package kotlinD.prototype


/** Shallow Copy:
 * A shallow copy creates a new object that is a copy of the original object,
but it does not create new copies of the nested objects.

 * Instead, the new object simply contains references to the same
nested objects as the original object.
 */

/* Shallow Copy */
data class Address(val id: Int, val street: String, var city: String){
    override fun toString(): String {
        return "id=$id, street='$street', city='$city'"
    }
}

data class User(val name: String, val surname: String, val address: Address){
    override fun toString(): String {
        return "name='$name', surname='$surname', address=$address"
    }
}

/* Deep Copy */

data class AddressD(var city: String): Cloneable{
    public override fun clone(): AddressD {
        return AddressD(city = this.city)
    }
}

data class UserD(val name: String, val address: AddressD): Cloneable{
    var isChanged = false
    public override fun clone(): UserD {
        return UserD(this.name, this.address.clone()).also {
            it.isChanged = this.isChanged
        }
    }
}

fun main() {

    /* Shallow Copy */
    val address = Address(id = 1, street = "DJ", city = "New York")
    val user = User(name = "John", surname = "Smith", address = address)

    val copyUser: User = user.copy(name = "Ahmad")
    println("----------------------------------------")
    println("original User  $user")
    println("original User  $copyUser")

    user.address.city = "Aleppo"
    /*
    Note that after copying the user, only the name was altered, and everything else remained the same.
    However, when we modified the city in the originalUser, the copiedUser was also affected

    This happens because copy function did not copy the nested objects values (address) instead it just assigned
    the reference of the address to copiedUser.
     */
    println("----------------------------------------")
    println("after shallow original User  $user")
    println("after shallow original User  $copyUser")
    println("----------------------------------------")


    /* Deep Copy */
    println("------------------Deep Copy----------------------")
    val addressD = AddressD(city = "New York")
    val originalUserD = UserD(name = "John", addressD)
    originalUserD.isChanged = true

    val clonedUser: UserD = originalUserD.clone()
    originalUserD.address.city = "San Francisco"

    println("------------------Deep Copy----------------------")
    println("Original: $originalUserD, isChanged: ${originalUserD.isChanged}")
    println("------------------Deep Copy----------------------")
    println("Cloned: $clonedUser, isChanged: ${clonedUser.isChanged}")
}