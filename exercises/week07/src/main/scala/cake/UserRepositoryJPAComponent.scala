package cake

/**
  * Created by thomasmcgarry on 22/04/2017.
  */
trait UserRepositoryJPAComponent extends UserRepositoryComponent {

  val em: EntityManager
  def userLocator = new UserLocatorJPA(em)
  def userUpdater = new UserUpdaterJPA(em)

  class UserLocatorJPA(val em: EntityManager) extends UserLocator {
    def findAll = em.createQuery("from User", classOf[User]).getResultList
  }

  class UserUpdaterJPA(val em: EntityManager) extends UserUpdater {
    def save(user: User) { em.persist(user) }
  }

}
