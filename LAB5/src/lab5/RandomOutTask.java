package lab5;

import java.util.*;

public class RandomOutTask implements Task{

    double number;

    RandomOutTask(){
        this.number = Math.random();
    }

    @Override
    public void execute() {
        System.out.println(this.number);
    }
}
