package cake

/**
  * Created by thomasmcgarry on 22/04/2017.
  */
trait UserRepositoryComponent {

  def userLocator : UserLocator
  def userUpdater : UserUpdater

  trait UserLocator {
    def findAll: java.util.List[User]
  }

  trait UserUpdater {
    def save(user: User)
  }

}
