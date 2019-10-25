package Factory_Mode;

public class GameSchool extends School {
    GameSchool() {
        description = "訓練電競選手的場所";
    }

    public Student trainingStudent() {
        Student esport = new Esportsman();
        return esport;
    }
}
