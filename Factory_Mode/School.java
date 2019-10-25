package Factory_Mode;

// 工廠
public abstract class School {
    String description = "訓練所";

    abstract Student trainingStudent();

    public String getDescription() {
        return description;
    }
}
