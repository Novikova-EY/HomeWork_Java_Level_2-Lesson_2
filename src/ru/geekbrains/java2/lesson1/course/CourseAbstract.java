package ru.geekbrains.java2.lesson1.course;
import ru.geekbrains.java2.lesson1.team.Participant;
import ru.geekbrains.java2.lesson1.team.Team;

public abstract class CourseAbstract implements Course {

    @Override
    public void doIt(Team team){
        for (int i = 0; i < team.getParticipant().length; i++) {
            doIt(team.getParticipant()[i]);
        }
    };

    protected abstract void doIt(Participant participant);
}