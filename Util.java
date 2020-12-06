import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Util {
    private EntityManagerFactory emf;
    private EntityManager em;

    public Util() {
        emf= Persistence.createEntityManagerFactory("MyJPA");
        em=emf.createEntityManager();
    }

    public EntityManagerFactory getEmf() {
        return emf;
    }

    public EntityManager getEm() {
        return em;
    }
}
