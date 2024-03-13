package kotlinStuff.oopStuffs.abstractAndInterface

interface AnimalStuff {
    // must the parameter in interface be final and static
    // for that we can not make set for this just get and we must put get
    val nickname: String
        get() = "cutey"
    fun jump()
    fun swim(): String
}