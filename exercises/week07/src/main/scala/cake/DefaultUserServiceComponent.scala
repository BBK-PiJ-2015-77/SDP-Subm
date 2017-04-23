package cake

/**
  * Created by thomasmcgarry on 22/04/2017.
  */
trait DefaultUserServiceComponent extends UserServiceComponent {

  // This is self type annotation, meaning that 'this' trait depends upon implementation
  // of the UserRepositoryComponent being injected

  // When we want to use/instantiate the DefaultUserServiceComponent, we need to use
  // the 'with' keyword and specify an implementation of the UserRepositoryComponent
  // which in this case would be UserRepositoryJPAComponent
  this: UserRepositoryComponent =>

  def userService = new DefaultUserService

  class DefaultUserService extends UserService {

    def findAll = userLocator.findAll

    def save(user: User) {
      userUpdater.save(user: User)
    }

  }

}
