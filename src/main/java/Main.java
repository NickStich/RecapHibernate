import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.setName("Wine");
        stock.setValue(5);

        Stock stock1 = new Stock();
        stock1.setName("Motorbike");
        stock1.setValue(1300);

        Session session = HibernateConfig.getSession();
        session.beginTransaction();
        session.save(stock);
        session.save(stock1);
        session.getTransaction().commit();
        session.close();
    }
}
