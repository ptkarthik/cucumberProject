package stepdefenitions;

public class BaseStepDefintions {
    public BaseStepDefintions() {
        runners.Testrunner.getInjector().injectMembers(this);
    }

}
