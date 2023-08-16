package goit;


import goit.configFlyway.FlywayConfiguration;
import goit.client.ClientCrudService;
import goit.planet.PlanetCrudService;

public class App {
    public static void main(String[] args) throws Exception {

        new FlywayConfiguration().dbStart();

        ClientCrudService clientCrudService=new ClientCrudService();
        clientCrudService.create("Moo");
        clientCrudService.getById(1);
        clientCrudService.setName(1L,"Mody");
        clientCrudService.deleteById(11L);
        clientCrudService.listAll();
//        PlanetCrudService planetCrudService=new PlanetCrudService();
//        planetCrudService.listAll();
//        planetCrudService.create("MOON","λύχνος");
//        planetCrudService.getById("MOON");
//        planetCrudService.setIdName("MOON","QQQQ");
//        planetCrudService.deleteById("MOON");

    }
}
