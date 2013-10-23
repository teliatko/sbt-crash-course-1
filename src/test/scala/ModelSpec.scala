import org.scalatest.FreeSpec
import org.scalatest.matchers.MustMatchers

class ModelSpec extends FreeSpec with MustMatchers {

  import LanguageKind._

  val scala = ProgrammingLanguage("Scala", Static)
  val groovy = ProgrammingLanguage("Groovy", Dynamic)
  val perl = ProgrammingLanguage("Perl", Cryptic)

  val allLangs = Seq(scala, groovy, perl)

  "The model" - {
    "Two job criteria should match when all langs match" in {
      val jobOne = JobCriteria(allLangs)
      val jobTwo = JobCriteria(allLangs)

      jobOne must equal (jobTwo)
    }
  }

}
