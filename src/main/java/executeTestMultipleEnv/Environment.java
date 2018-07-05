package executeTestMultipleEnv;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;

@Sources({
    "classpath:${env}.properties"
})
public interface Environment extends Config {

    static String url() {
		// TODO Auto-generated method stub
		return null;
	}

    String username();

    String password();

    @Key("db.hostname")
    String getDBHostname();

    @Key("db.port")
    int getDBPort();

    @Key("db.username")
    String getDBUsername();

    @Key("db.password")
    String getDBPassword();
    }
