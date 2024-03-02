package configs;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:properties/${data}.properties"})
public interface ApiConfig extends Config {
    @Config.Key("name")
    @Config.DefaultValue("Victor")
    String setName();
    @Config.Key("fullName")
    @Config.DefaultValue("Victor Berezovsky")
    String setFullName();

    @Config.Key("password")
    @Config.DefaultValue("pistol")
    String setPassword();

    @Config.Key("email")
    @Config.DefaultValue("eve.holt@reqres.in")
    String setEmail();

    @Config.Key("id")
    @Config.DefaultValue("5")
    String setID();

    @Config.Key("fullJob")
    @Config.DefaultValue("QA Engineer")
    String getFullJob();

    @Config.Key("job")
    @Config.DefaultValue("Engineer")
    String setJob();
    @Config.Key("baseURI")
    @Config.DefaultValue("https://reqres.in/")
    String getBaseURI();
}
