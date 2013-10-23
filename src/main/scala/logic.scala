object Logic {
	def matchLikelihood(vacancy: JobCriteria, candidate: Geek): Double = {
		val matches = vacancy.skills map {
			skill => candidate.codesIn.contains(skill)
		}
		val weights = matches map { matched => if (matched) 1.0 else 0.0 }
		weights.sum / weights.length
	}
}