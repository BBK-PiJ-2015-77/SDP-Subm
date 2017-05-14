package film

import films.Director
import org.scalatest.{BeforeAndAfter, FunSuite}

/**
  * Created by thomasmcgarry on 14/05/2017.
  */
class FilmTest extends FunSuite with BeforeAndAfter{

  var eastwood: Director = _
  var mcTiernan: Director = _
  var nolan: Director = _
  var someGuy: Director = _

  var memento: Film = _
  var darkKnight: Film = _
  var inception: Film = _

  var highPlainsDrifter: Film = _
  var outlawJoseyWales: Film = _
  var unforgiven: Film = _
  var granTorino: Film = _
  var invictus: Film = _

  var predator: Film = _
  var dieHard: Film = _
  var huntForRedOctober: Film = _
  var thomasCrownAffair: Film = _

  var hpd2: Film = _
  var tca2: Film = _
  var inceptionCopy: Film = _

  before{
    eastwood = new Director("Clint", "Eastwood", 1930)
    mcTiernan = new Director("John", "McTiernan", 1951)
    nolan = new Director("Christopher", "Nolan", 1970)
    someGuy = new Director("Just", "Some Guy", 1990)

    memento = new Film("Memento", 2000, 8.5, nolan)
    darkKnight = new Film("Dark Knight", 2008, 9.0, nolan)
    inception = new Film("Inception", 2010, 8.8, nolan)

    highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7, eastwood)
    outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)
    unforgiven = new Film("Unforgiven", 1992, 8.3, eastwood)
    granTorino = new Film("Gran Torino", 2008, 8.2, eastwood)
    invictus = new Film("Invictus", 2009, 7.4, eastwood)

    predator = new Film("Predator", 1987, 7.9, mcTiernan)
    dieHard = new Film("Die Hard", 1988, 8.3, mcTiernan)
    huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6, mcTiernan)
    thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan)

    hpd2 = highPlainsDrifter.copy(name = "L’homme des hautes plaines")
    tca2 = thomasCrownAffair.copy(yearOfRelease = 1968, director = new Director("Norman", "Jewison", 1926))
    inceptionCopy = inception.copy().copy().copy()
  }

  test("Director name works") {
    assert(eastwood.name === "Clint Eastwood")
  }

  test("Film director's age works") {
    assert(unforgiven.directorsAge === 62)
  }

  test("Film director boolean works") {
    assert(unforgiven.isDirectedBy(eastwood) === true)
    assert(unforgiven.isDirectedBy(nolan) === false)
  }

  test("Film copy works"){
    assert(highPlainsDrifter.name !== hpd2.name)
    assert(hpd2.name === "L’homme des hautes plaines")
    assert(tca2.director.name === "Norman Jewison")
    assert(thomasCrownAffair.isDirectedBy(mcTiernan) === true)
  }

  test("older Method works on Director companion object") {
    val d1 = Director.apply("Clint", "Eastwood", 1930)
    val d2 = Director.apply("John", "McTiernan", 1951)
    val older = Director.older(d1,d2)
    assert(older.firstName === "Clint")
  }

  test("highestRating works on Film companion object") {
    val f1 = Film.apply("Memento", 2000, 8.5, nolan)
    val f2 = Film.apply("Dark Knight", 2008, 9.0, nolan)
    val higher = Film.highestRating(f1,f2)
    assert(higher.name === "Dark Knight")
  }

  test("oldestDirectorAtTheTime works on Film companion object") {
    val f1 = Film.apply("Memento", 2000, 8.5, nolan)
    val f2 = Film.apply("The Outlaw Josey Wales", 1976, 7.9, eastwood)
    val oldest = Film.oldestDirectorAtTheTime(f1,f2)
    assert(oldest.name === "Clint Eastwood")
  }

}
