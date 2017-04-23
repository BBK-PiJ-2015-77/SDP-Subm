package cake

import javax.persistence.Persistence
/**
  * Created by thomasmcgarry on 22/04/2017.
  */
object ApplicationLive {

  val userServiceComponent = new DefaultUserServiceComponent with UserRepositoryJPAComponent {
    val em = Persistence.createEntityManagerFactory("cake.pattern").
      createEntityManager()
  }
  val userService = userServiceComponent.userService

}
