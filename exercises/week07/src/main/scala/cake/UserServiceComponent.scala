package cake

/**
  * Created by thomasmcgarry on 22/04/2017.
  */
trait UserServiceComponent {

  def userService: UserService

  trait UserService {
    def findAll: java.util.List[User]
    def save(user: User)
  }

}
