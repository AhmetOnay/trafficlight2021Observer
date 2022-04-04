package trafficlight.states;

import trafficlight.Subject;

//TODO implement a part of the pattern here
//subject
public abstract class State extends Subject {

    public abstract State getNextState();

    public abstract String getColor();

    public String getSting(){
        return getColor();
    }

}