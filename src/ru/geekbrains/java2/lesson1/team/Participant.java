package ru.geekbrains.java2.lesson1.team;

public class Participant {

    private String nameParticipant;
    private boolean getFinish;
    private int RunDistance;
    private int JumpHeight;

    public Participant(String nameParticipant, int RunDistance, int JumpHeight) {
        this.nameParticipant = nameParticipant;
        this.RunDistance = RunDistance;
        this.JumpHeight = JumpHeight;
    }

    @Override
    public String toString() {
        return "Участник {" +
                "Имя='" + nameParticipant + '\'' +
                ", дошел ли до финиша = " + getFinish +
                ", способен пробежать = " + RunDistance +
                ", способен прыгнуть = " + JumpHeight +
                '}';
    }

    public int getRunDistance() {
        return RunDistance;
    }

    public int getJumpHeight() {
        return JumpHeight;
    }

    public boolean isGetFinish() {
        return getFinish;
    }

    public void setGetFinish(boolean getFinish) {
        this.getFinish = getFinish;
    }
}
