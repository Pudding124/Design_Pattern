package Command_Mode;

/**
 * 將請求包裝成物件，以便使用不同的請求、佇列、日誌、參數化其他物件‧
 * 同時也支援可復原的作業
 */
public class Main {
    public static void main(String[] args) {
        // 創建一個遙控器
        RemoteController remoteController = new RemoteController();

        Camera camera = new Camera();
        CameraOnCommand cameraOnCommand = new CameraOnCommand(camera);
        CameraOffCommand cameraOffCommand = new CameraOffCommand(camera);

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteController.setCommand(0, cameraOnCommand, cameraOffCommand);
        remoteController.setCommand(1, lightOnCommand, lightOffCommand);

        remoteController.pressOnButton(0);
        remoteController.pressUndoButton();

        remoteController.pressOffButton(2);
        remoteController.pressOffButton(1);
        remoteController.pressUndoButton();
    }
}
