package OOP.Abstraction.interfaceExample;

public class CarImplement implements Car {

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    private boolean start = true;
    private boolean stop = true;

    @Override
    public void drive() {
        if(start)System.out.println("Driving....");
        else System.out.println("Car already stopped... ");
    }

    @Override
    public void applyBreak() {
        if(stop)System.out.println("Applying Break....");
        else System.out.println("Car already stopped... ");
    }
}
