package interactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SwipeCordenadas implements Interaction {
    private int inicialX;
    private int inicialY;
    private int finY;

    public SwipeCordenadas (int inicialX, int inicialY, int finY){
        this.inicialX=inicialX;
        this.inicialY=inicialY;
        this.finY=finY;
    }

    public static SwipeCordenadas paraHacerScroll (int inicialX, int inicialY, int finY){
        return Tasks.instrumented(SwipeCordenadas.class,inicialX,inicialY,finY);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = ((WebDriverFacade) BrowseTheWeb.as(OnStage.theActorInTheSpotlight()).getDriver()).getProxiedDriver();
        // Aquí puedes usar el driver como AppiumDriver
        AppiumDriver appiumDriver = (AppiumDriver) driver;
        new TouchAction((PerformsTouchActions) appiumDriver)
                .longPress(new PointOption<>().withCoordinates(inicialX, inicialY))
                .moveTo(new PointOption<>().withCoordinates(inicialX, finY))
                .release()
                .perform();
    }

}
