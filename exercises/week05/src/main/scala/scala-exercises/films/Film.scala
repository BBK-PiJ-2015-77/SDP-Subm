package scala

import films.Director

/**
  * Created by thomasmcgarry on 14/05/2017.
  */
class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director) {

  def directorsAge: Int = {
    yearOfRelease - director.yearOfBirth
  }

  def isDirectedBy(director: Director): Boolean = {
    this.director == director
  }

  def copy(name: String = this.name,
           yearOfRelease: Int = this.yearOfRelease,
           imdbRating: Double = this.imdbRating,
           director: Director = this.director): Film = {
    new Film(name,yearOfRelease, imdbRating, director)
  }

}

object Film {

  def apply(name: String, yearOfRelease: Int, imdbRating: Double, director: Director): Film = {
    Film(name,yearOfRelease,imdbRating,director)
  }

  def highestRating(f1: Film, f2: Film): Film = {
    if (f1.imdbRating > f2.imdbRating) {
      f1
    } else {
      f2
    }
  }

  def oldestDirectorAtTheTime(f1: Film, f2: Film): Director = {
    if(f1.directorsAge > f2.directorsAge) {
      f1.director
    } else {
      f2.director
    }
  }

}