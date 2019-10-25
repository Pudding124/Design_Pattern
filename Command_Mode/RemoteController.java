package Command_Mode;

public class RemoteController {
    Command[] commandOn;
    Command[] commandOff;
    Command undoCommand;

    RemoteController() {
        // 遙控器有七個按鈕
        commandOn = new Command[7];
        commandOff = new Command[7];

        // 設定空物件
        Command noCommand = new NoCommand();
        for(int index = 0;index<7;index++) {
            commandOn[index] = noCommand;
            commandOff[index] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int index, Command commandOn, Command commandOff) {
        this.commandOn[index] = commandOn;
        this.commandOff[index] = commandOff;
    }

    public void pressOnButton(int index) {
        this.commandOn[index].execute();
        undoCommand = this.commandOn[index];
    }

    public void pressOffButton(int index) {
        this.commandOff[index].execute();
        undoCommand = this.commandOff[index];
    }

    public void pressUndoButton() {
        undoCommand.undo();
    }
}
