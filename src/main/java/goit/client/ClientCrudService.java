package goit.client;

import goit.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.List;

public class ClientCrudService {
    HibernateUtil util = HibernateUtil.getInstance();
    Session session = util.getSessionFactory().openSession();

    public void create(String name) {
        if (name == null) {
            System.out.println("Name can't be null");
            return;
        }
        else if (name.length() < 3 | name.length() > 200) {
            System.out.println("Name must be more than 2 characters and less than 1000 characters");
            return;
        }else {
        Transaction transaction = session.beginTransaction();
        Client newClient = new Client();
        newClient.setName("New222");
        session.persist(newClient);
        System.out.println("newClient = " + newClient);
        transaction.commit();
        session.close();}
    }

    public void getById(long id) throws SQLException {
        Client client = session.get(Client.class, id);
        System.out.println("client = " + client);
        session.close();
    }


    public void setName(long id, String name) {
        if (name == null) {
            System.out.println("Name can't be null");
            return;
        }
        else if (name.length() < 2 | name.length() > 1000) {
            System.out.println("Name must be more than 2 characters and less than 1000 characters");
            return;
        }else {
        Transaction transaction = session.beginTransaction();
        Client clientExisting = session.get(Client.class, id);
        clientExisting.setName(name);
        session.persist(clientExisting);
        transaction.commit();
        session.close();}
    }


    public void deleteById(long id) {
        Transaction transaction = session.beginTransaction();
        Client delClient = new Client();
        delClient.setId(id);
        session.delete(delClient);
        transaction.commit();
        session.close();
    }

    public void listAll() {
        List<Client> fromClientList = session.createQuery("from Client", Client.class).list();
        System.out.println("fromClientList = " + fromClientList);
        session.close();
    }
}


