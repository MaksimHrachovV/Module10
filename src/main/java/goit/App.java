package goit;


import goit.configFlyway.FlywayConfiguration;
import goit.client.ClientCrudService;
import goit.planet.PlanetCrudService;

public class App {
    public static void main(String[] args) throws Exception {
        final String connectUrl = "jdbc:h2:./start;DB_CLOSE_DELAY=-1";
        new FlywayConfiguration().dbStart(connectUrl);

//        ClientCrudService clientCrudService=new ClientCrudService();
//        clientCrudService.create("New");
//        clientCrudService.getById(1);
//        clientCrudService.setName(1L,"Mody");
//        clientCrudService.deleteById(11L);
//        clientCrudService.listAll();
//        PlanetCrudService planetCrudService=new PlanetCrudService();
//        planetCrudService.listAll();
//        planetCrudService.create("MOON","λύχνος");
//        planetCrudService.getById("MOON");
//        planetCrudService.setIdName("MOON","QQQQ");
//        planetCrudService.deleteById("MOON");

    }
}
