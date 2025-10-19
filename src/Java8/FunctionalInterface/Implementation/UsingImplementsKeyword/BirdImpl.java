package Java8.FunctionalInterface.Implementation.UsingImplementsKeyword;

import Java8.FunctionalInterface.Implementation.Bird;

public class BirdImpl implements Bird {

    @Override
    public void canFly(String value) {
        System.out.println("Bird Can Fly : "+value);
    }
}
