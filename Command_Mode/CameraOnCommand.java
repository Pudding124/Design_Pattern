package Command_Mode;

public class CameraOnCommand implements Command {
    Camera camera;

    public CameraOnCommand(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void execute() {
        camera.on();
    }

    @Override
    public void undo() {
        camera.off();
    }
}
