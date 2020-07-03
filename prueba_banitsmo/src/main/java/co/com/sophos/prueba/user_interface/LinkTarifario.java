package co.com.sophos.prueba.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class LinkTarifario {
    public static final Target TARIFARIO = Target.the("Link tarifario")
            .locatedBy("//*[@id=\"footer-content\"]/div[2]/div[1]/div/div[2]/div/ul/li[5]/a");
}
