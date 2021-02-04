package ru.geekbrains.java2.lesson1;

import ru.geekbrains.java2.lesson1.course.Course;
import ru.geekbrains.java2.lesson1.team.Team;
import ru.geekbrains.java2.lesson1.team.Participant;
import ru.geekbrains.java2.lesson1.course.Jump;
import ru.geekbrains.java2.lesson1.course.Run;

public class Main {

    public static void main(String[] args) {

        Course[] c = {new Run(), new Jump()};

        Team team = new Team("Команда №1",
                new Participant("Участник 1", 150, 5),
                new Participant("Участник 2", 200, 8),
                new Participant("Участник 3", 100, 10),
                new Participant("Участник 4", 50, 15)
        );

        for (int i = 0; i < c.length; i++) {
            c[i].doIt(team);
            team.showTeam();
            team.showPassedInfo();
        }
    }
}

