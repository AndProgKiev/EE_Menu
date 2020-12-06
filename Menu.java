import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final Util util=new Util();


    public void addDish(Dish dish){
        EntityTransaction et=util.getEm().getTransaction();
        et.begin();
      try {
          util.getEm().persist(dish);
          et.commit();
      }
        catch (Exception ex){
          util.getEm().getTransaction().rollback();
        }
    }

    public void selectDishByPrice(int from,int to){
        List<Dish> dishList=null;
        Query query=util.getEm().createQuery("SELECT d FROM Dish d WHERE d.price >= :from and d.price <= :to",Dish.class);
        query.setParameter("from",from);
        query.setParameter("to",to);
        dishList=(List<Dish>) query.getResultList();

         if (dishList!=null){
             for (Dish dish:dishList) {
            System.out.println(dish);
             }
        }
    }

    public void getDiscountDish(){
        List<Dish> dishList=null;
        Query query =util.getEm().createQuery("SELECT d FROm Dish d WHERE d.discount =:result",Dish.class);
        query.setParameter("result",true);
        dishList=(List<Dish>) query.getResultList();
        if (dishList!=null){
            for (Dish dish:dishList) {
                System.out.println(dish);
            }
        }
    }

    public  void getKilogramDish(){
        List<Dish> dishList=null;
        List<Dish> kilogramList=new ArrayList<Dish>();

        Query query =util.getEm().createQuery("SELECT d FROM Dish d",Dish.class);
        dishList=(List<Dish>) query.getResultList();


            for (Dish dish : dishList) {
                kilogramList.add(dish);
                if (count(kilogramList) > 1000) {
                    kilogramList.remove(dish);
                }
            }

        if(kilogramList!=null){
            for (Dish d:kilogramList){
                System.out.println(d);
            }
        }
    }

    private static int count(List<Dish> d){
        int count=0;
        if (d!=null){
            for (Dish dish:d){
                count+=dish.getWeightGram();
            }
        }
        return count;
    }
}
