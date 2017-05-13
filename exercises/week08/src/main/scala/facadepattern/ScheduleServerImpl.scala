package facadepattern

//TODO

case class ScheduleServerImpl() extends ScheduleServer {
  override def startBooting: Unit = {println("Booting")}

  override def readSystemConfigFile: Unit = {println("Reading System Config File")}

  override def init: Unit = {println("Initialising...")}

  override def initializeContext: Unit = {println("Initialising Context")}

  override def initializeListeners: Unit = {println("Initialising Listeners")}

  override def createSystemObjects: Unit = {println("Creating System Objects")}

  override def releaseProcesses: Unit = {println("Releasing Processes")}

  override def destory: Unit = {println("Destroying...")}

  override def destroySystemObjects: Unit = {println("Destroying System Objects")}

  override def destoryListeners: Unit = {println("Destroying Listeners")}

  override def destoryContext: Unit = {println("Destroying Context")}

  override def shutdown: Unit = {println("Shutdown")}
}
