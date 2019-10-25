package Command_Mode;

public class CameraOffCommand implements Command{
    Camera camera;

    public CameraOffCommand(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void execute() {
        camera.off();
    }

    @Override
    public void undo() {
        camera.on();
    }
}
