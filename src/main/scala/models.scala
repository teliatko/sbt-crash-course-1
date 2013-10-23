object LanguageKind extends Enumeration {
	type LanguageKind = Value
	val Static, Dynamic, Cryptic = Value
}

import LanguageKind._

case class ProgrammingLanguage(name: String, kind: LanguageKind)

case class Geek(firstName: String, lastName: String, codesIn: Seq[ProgrammingLanguage])

case class JobCriteria(skills: Seq[ProgrammingLanguage])