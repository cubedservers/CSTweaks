package org.cubedservers.cstweaks.inventorysync;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import org.apache.logging.log4j.core.appender.db.nosql.mongo.MongoDBConnection;
import org.cubedservers.cstweaks.main.ConfigHelper;

import java.net.UnknownHostException;

/**
 * Created by pixlepix on 8/9/14.
 */
public class DatabaseHelper {

    MongoClient mongoClient;

    public void connect(){
        try {
            mongoClient = new MongoClient(ConfigHelper.databaseIp);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        DB inventoryDB = mongoClient.getDB("inventories");
        inventoryDB.authenticate(ConfigHelper.user, ConfigHelper.pass.toCharArray());
    }


}
