package goit.configFlyway;

import org.flywaydb.core.Flyway;

public class FlywayConfiguration {
    public void dbStart(){
        // Create the Flyway instance and point it to the database
        Flyway flyway = Flyway
                .configure()
                .dataSource(StorageConstant.CONNECTION_URL, null, null)
                .load();

        // Start the migration
        flyway.migrate();

    }


}
