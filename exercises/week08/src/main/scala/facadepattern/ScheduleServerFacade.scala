package facadepattern

case class ScheduleServerFacade(scheduleServer: ScheduleServer) {

  private val server: ScheduleServer = scheduleServer

  def stopServer: Unit = {
    server.releaseProcesses
    server.destory
    server.destroySystemObjects
    server.destoryListeners
    server.destoryContext
    server.shutdown
  }

  def startServer: Unit = {
    server.startBooting
    server.readSystemConfigFile
    server.init
    server.initializeContext
    server.initializeListeners
    server.createSystemObjects
  }

}
