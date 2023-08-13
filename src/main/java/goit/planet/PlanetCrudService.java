package goit.planet;

import goit.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.List;

public class PlanetCrudService {
    HibernateUtil util = HibernateUtil.getInstance();
    Session session = util.getSessionFactory().openSession();

    public void create(String id, String name){
        if (id.equals("")) {

            System.out.println("Name can't be null");
            return;

        }
        else if (name.length() < 1 | name.length() > 500) {
            System.out.println("Name must be more than 1 characters and less than 500 characters");
            return;
        }else {
        Transaction transaction = session.beginTransaction();
        Planet newPlanet = new Planet();
        newPlanet.setId(id);
        newPlanet.setName(name);
        session.persist(newPlanet);
        System.out.println("newClient = " + newPlanet);
        transaction.commit();
        session.close();}
    }

    public void getById(String id) {
        Planet planet = session.get(Planet.class, id);
        System.out.println("planet = " + planet);
        session.close();
    }


    public void setIdName(String id, String name) throws Exception {
        if (id.equals("")) {
            System.out.println("Name can't be null");
            return;
        }
        else if (name.length() < 1 | name.length() > 500) {
            System.out.println("Name must be more than 1 characters and less than 500 characters");
            return;
        }else {
        Transaction transaction = session.beginTransaction();
        Planet PlanetExisting = session.get(Planet.class, id);
        PlanetExisting.setId(id);
        PlanetExisting.setName(name);
        session.persist(PlanetExisting);
        transaction.commit();
        session.close();}
    }


    public void deleteById(String id) {
        Transaction transaction = session.beginTransaction();
        Planet delPlanet = new Planet();
        delPlanet.setId(id);
        session.delete(delPlanet);
        transaction.commit();
        session.close();
    }

    public void listAll() {
        List<Planet> fromClientList = session.createQuery("from Planet", Planet.class).list();
        System.out.println("fromClientList = " + fromClientList.toString());
        session.close();
    }
}
