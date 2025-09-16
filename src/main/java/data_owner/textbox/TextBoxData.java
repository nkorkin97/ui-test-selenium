package data_owner.textbox;

import data_owner.DefaultData;

import static org.aeonbits.owner.Config.*;

@LoadPolicy(LoadType.FIRST)
@Sources({"classpath:textbox.properties"})
public interface TextBoxData extends DefaultData {
}
