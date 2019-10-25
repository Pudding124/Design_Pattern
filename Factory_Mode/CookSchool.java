package Factory_Mode;

public class CookSchool extends School {
    CookSchool() {
        description = "訓練廚師的場所";
    }

    public Student trainingStudent() {
        Student cook = new Chef();
        return cook;
    }
}
