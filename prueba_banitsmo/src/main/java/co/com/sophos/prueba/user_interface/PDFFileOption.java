package co.com.sophos.prueba.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class PDFFileOption {
    public static final Target PDF_FILE = Target.the("option PDF File")
            .locatedBy("//*[@id=\"main-content\"]/div[1]/div/div/table/tbody/tr[2]/td[2]");

}
