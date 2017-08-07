package ru.fsep.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * 07.08.2017
 *
 * @author Robert Bagramov.
 */

@EnableMongoRepositories("ru.fsep.repositories")
@PropertySource(value = "/properties/db.properties")
@Configuration
public class AppConfig extends AbstractMongoConfiguration {

    @Autowired
    private Environment environment;

    @Override
    protected String getDatabaseName() {
        return environment.getProperty("mongodb.database");
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(environment.getProperty("mongodb.host"));
    }


}
