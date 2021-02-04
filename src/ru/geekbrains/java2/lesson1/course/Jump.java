package ru.geekbrains.java2.lesson1.course;
import ru.geekbrains.java2.lesson1.team.Participant;

public class Jump extends CourseAbstract {
    private int height = 10;

    @Override
    protected void doIt(Participant participant) {
        participant.setGetFinish(participant.getJumpHeight() >= height);
    }
}
