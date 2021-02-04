package ru.geekbrains.java2.lesson1.team;
import java.util.Arrays;

public class Team {

    private String nameTeam;
    private Participant[] participant;

    public Team(String nameTeam, Participant... participant) {
        this.nameTeam = nameTeam;
        this.participant = participant;
    }

    public void showTeam() {
        System.out.println("Список команды:");
        System.out.println("Имя команды:" + nameTeam);
        System.out.println(Arrays.toString(participant));
    };

    public void showPassedInfo() {
        System.out.println("Список победителей:");
        System.out.println("Имя команды:" + nameTeam);
        for (int i = 0; i < participant.length; i++) {
            if (participant[i].isGetFinish()) {
                System.out.println(participant[i]);
            }
        }
    };

    public Participant[] getParticipant() {
        return participant;
    }
}
