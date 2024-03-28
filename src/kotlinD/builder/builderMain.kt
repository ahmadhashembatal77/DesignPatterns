package kotlinD.builder

/*
* The Builder Pattern solves a very common problem in object-oriented programming of how
   to flexibly create an immutable object without writing many constructors.

* When considering a builder, we should focus on whether,Or the construction is complex.
   If we have too simple construction patterns, the effort to create our
   flexible builder object may far exceed the benefit.

* Lastly, we compare the builder pattern’s benefits to Kotlin’s features. We see a couple
  of problems imposed by the builder pattern and how we can address them using Kotlin’s
  features.
* */

private class JobBuilder private constructor(builder: JobBuilderD) {
    private var title: String = ""
    private var location: String = ""
    private var skills: String = ""
    private var experience: String = ""

     data class JobBuilderD(
         var title : String = "",
         var location : String = "",
         var skills : String = "",
         var experience : String = ""
     ){
         fun setTitle(title: String) = apply { this.title = title }
         fun setLocation(location: String) = apply { this.location = location }
         fun setSkills(skills: String) = apply { this.skills = skills }
         fun setExperience(experience: String) = apply { this.experience = experience }
         fun build() = JobBuilder(builder = this)
     }

    init {
        title = builder.title
        location = builder.location
        skills = builder.skills
        experience = builder.experience
    }

    override fun toString(): String {
        return "JobBuilder(" +
                "title='$title', " +
                "location='$location'," +
                " skills='$skills'," +
                " experience='$experience')" +
                ""
    }
}


private fun main() {
    val job: JobBuilder = JobBuilder.JobBuilderD()
        .setLocation("Syria")
        .setTitle("Title")
        .setSkills("AndroidDeveloper")
        .setExperience("1000000000000000000000000000000000 years")
        .build()
    println(job)
}