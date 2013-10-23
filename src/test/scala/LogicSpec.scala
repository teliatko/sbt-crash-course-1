import org.scalatest.FreeSpec
import org.scalatest.matchers.MustMatchers

class LogicSpec extends FreeSpec with MustMatchers {

  import LanguageKind._

	val scala = ProgrammingLanguage("Scala", Static)
	val groovy = ProgrammingLanguage("Groovy", Dynamic)
	val perl = ProgrammingLanguage("Perl", Cryptic)

	val allLangs = Seq(scala, groovy, perl)

  "The logic" - {
    "Likelihood 100%, when all the criteria match" in {
      val vacancy = JobCriteria(allLangs)
      val candidate = Geek("Joe", "Probe", allLangs)

      val result = Logic.matchLikelihood(vacancy, candidate)
      result must equal (1.0)
    }

    "Likelihood 0%, when no criteria match" in {
      val vacancy = JobCriteria(Seq(scala))
      val candidate = Geek("Joe", "Probe", Seq(perl))

      val result = Logic.matchLikelihood(vacancy, candidate)
      result must equal (0.0)
    }
  }
}