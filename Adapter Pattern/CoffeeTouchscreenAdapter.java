public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    private OldCoffeeMachine oldVendingMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine machine) {
        this.oldVendingMachine = machine;
    }

    public void chooseFirstSelection() {
        oldVendingMachine.selectA();
    }

    public void chooseSecondSelection() {
        oldVendingMachine.selectB();
    }
}
