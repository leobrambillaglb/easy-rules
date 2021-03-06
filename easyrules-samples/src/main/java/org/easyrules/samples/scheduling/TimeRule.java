package org.easyrules.samples.scheduling;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import java.util.Date;

@Rule(name = "time rule", description = "Print the current time only if seconds are even")
public class TimeRule {

    private Date now;

    @Condition
    public boolean checkTime() {
        now = new Date();
        return now.getSeconds() % 2 == 0;
    }

    @Action
    public void printTime() {
        System.out.println("Seconds in " + now + " are even");
    }

}
