package ru.geekbrains.java2.lesson1.course;
import ru.geekbrains.java2.lesson1.team.Participant;

public class Run extends CourseAbstract{
    private int length = 150;

    @Override
    protected void doIt(Participant participant) {
        participant.setGetFinish(participant.getRunDistance() >= length);
    }
}
