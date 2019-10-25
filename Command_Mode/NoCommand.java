package Command_Mode;

// 空物件
public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("No Command !");
    }

    @Override
    public void undo() {
        System.out.println("No Command !");
    }
}
