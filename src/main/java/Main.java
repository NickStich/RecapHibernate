import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.setName("Parfum");
        stock.setValue(5);

        Session session = HibernateConfig.getSession();
        session.beginTransaction();
        session.save(stock);
        session.getTransaction().commit();
        session.close();
    }
}
