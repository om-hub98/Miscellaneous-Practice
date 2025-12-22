package DesignPattern.Behaviour.State_Patterns;

public class ATMMachine {
    ATMState workingState;
    ATMState notWorkingState;
    boolean working = false;

    public ATMMachine(ATMState currentState){
        this.workingState = currentState;
        working = true;
    }

    public ATMState getAtmState() {
        return workingState;
    }

    public void setAtmState(ATMState state) {
        this.workingState = state;
    }

    public void request(){
        if(working)  workingState.withdrawCash();

    }
}
