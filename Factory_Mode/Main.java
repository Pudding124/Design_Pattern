package Factory_Mode;
/**
 * 定義一個建立物件的介面
 * 但由次類別來決定實體化的類別
 * 將工廠與產品分開，符合開放封閉原則
 * 當有新產品，只需新增工廠去生產即可，不必動到舊code
 */
public class Main {
    public static void main(String[] args) {
        CookSchool cookSchool = new CookSchool();
        SportSchool sportSchool = new SportSchool();
        GameSchool gameSchool = new GameSchool();

        Student student1 = cookSchool.trainingStudent();
        Student student2 = sportSchool.trainingStudent();
        Student student3 = gameSchool.trainingStudent();

        System.out.println(student1.getName()+" "+cookSchool.getDescription());
        System.out.println(student2.getName()+" "+sportSchool.getDescription());
        System.out.println(student3.getName()+" "+gameSchool.getDescription());

    }
}
