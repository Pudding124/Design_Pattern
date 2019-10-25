package Factory_Mode;

public class SportSchool extends School {
    SportSchool() {
        description = "訓練運動員的場所";
    }

    public Student trainingStudent() {
        Student sport = new Sportsman();
        return sport;
    }
}
