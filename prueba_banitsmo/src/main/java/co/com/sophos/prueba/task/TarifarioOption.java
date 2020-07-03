package co.com.sophos.prueba.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TarifarioOption implements Task {
    private Target TarifarioOption;

    public TarifarioOption(Target TarifarioOption){
        this.TarifarioOption = TarifarioOption;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TarifarioOption));
    }

    public static TarifarioOption select(Target TarifarioOption){
        return instrumented(TarifarioOption.class, TarifarioOption);
    }
}
