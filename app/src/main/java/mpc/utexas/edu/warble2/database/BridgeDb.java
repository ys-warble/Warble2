package mpc.utexas.edu.warble2.database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by yosef on 12/21/2017.
 */

@Entity
public class BridgeDb {
    @PrimaryKey(autoGenerate = true)
    public long dbid;
    public String UUID;
    public String name;
    public String category;
    public String base_url;

    public BridgeDb(String UUID, String name, String category, String base_url) {
        this.UUID = UUID;
        this.name = name;
        this.category = category;
        this.base_url = base_url;
    }
}
