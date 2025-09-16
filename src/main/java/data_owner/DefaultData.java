package data_owner;


import org.aeonbits.owner.Config;

public interface DefaultData extends Config {

    //Text Box
    @Key("fullName")
    String fullName();
    String email();
    String currentAddress();
    String permanentAddress();
}
