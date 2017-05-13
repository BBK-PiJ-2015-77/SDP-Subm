package builder

// TODO

case class CarDirector(carBuilder: CarBuilder) {

  private val cb: CarBuilder = carBuilder

  def build: Unit = {
    cb.buildBodyStyle
    cb.buildPower
    cb.buildEngine
    cb.buildBreaks
    cb.buildSeats
    cb.buildWindows
    cb.buildFuelType
  }

}
