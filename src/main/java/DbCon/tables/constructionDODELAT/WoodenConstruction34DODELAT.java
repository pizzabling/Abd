//Деревянные конструкции табл. 34
package DbCon.tables.constructionDODELAT;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class WoodenConstruction34DODELAT extends JFrame {

    String jobRank1;
    String jobRank2;

    double compositeBeamsTime;
    double compositeBeamsPrice;

    double compositeRacksTime;
    double compositeRacksPrice;

    double frameworksWallsPartitionsTime;
    double frameworksWallsPartitionsPrice;

    double farmsWithoutOutboardCeilingTime;
    double farmsWithoutOutboardCeilingPrice;

    double farmsWithFalseCeilingTime;
    double farmsWithFalseCeilingPrice;

    public WoodenConstruction34DODELAT(int answer) {

        if (answer == 1) {
            jobRank1 = "IV";
            jobRank2 = "IV";

            compositeBeamsTime = 20.1;
            compositeBeamsPrice = 10.45;

            compositeRacksTime = 22.3;
            compositeRacksPrice = 11.60;

            frameworksWallsPartitionsTime = 16.1;
            frameworksWallsPartitionsPrice = 8.37;

            farmsWithoutOutboardCeilingTime = 20.1;
            farmsWithoutOutboardCeilingPrice = 10.45;

            farmsWithFalseCeilingTime = 24.6;
            farmsWithFalseCeilingPrice = 12.79;


        } else if (answer == 2) {
            jobRank1 = "V";
            jobRank2 = "IV";

            compositeBeamsTime = 22.3;
            compositeBeamsPrice = 14.16;

            compositeRacksTime = 24.6;
            compositeRacksPrice = 15.62;

            frameworksWallsPartitionsTime = 18.1;
            frameworksWallsPartitionsPrice = 9.41;

            farmsWithoutOutboardCeilingTime = 27.9;
            farmsWithoutOutboardCeilingPrice = 17.72;

            farmsWithFalseCeilingTime = 34.6;
            farmsWithFalseCeilingPrice = 22.08;

        } else if (answer == 3) {
            jobRank1 = "V";
            jobRank2 = "V";

            compositeBeamsTime = 25.7;
            compositeBeamsPrice = 16.32;

            compositeRacksTime = 0;
            compositeRacksPrice = 0;

            frameworksWallsPartitionsTime = 0;
            frameworksWallsPartitionsPrice = 0;

            farmsWithoutOutboardCeilingTime = 35.7;
            farmsWithoutOutboardCeilingPrice = 22.67;

            farmsWithFalseCeilingTime = 43.5;
            farmsWithFalseCeilingPrice = 27.62;

        }

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Измеритель", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"315", "Составные балки (М 1 : 50); " +
                        "детали и сечения (М 1 : 20)", "лист", jobRank1, compositeBeamsTime, compositeBeamsPrice},
                {"316", "Составные стойки (М 1 : 50); " +
                        "детали и сечения (М 1 : 10, 1 : 20)", "-", jobRank1, compositeRacksTime, compositeRacksPrice},
                {"317", "Каркасы стен и перегородок (М 1 : 50)", "-", jobRank2, frameworksWallsPartitionsTime, frameworksWallsPartitionsPrice},
                {"318", "Фермы без подвестного потолка (М 1 : 50);" +
                        " детали (М 1 : 10, 1 : 20)", "ферма", jobRank1, farmsWithoutOutboardCeilingTime, farmsWithoutOutboardCeilingPrice},
                {"319", "Фермы c подвестным потолком (М 1 : 50);" +
                        " детали (М 1 : 10, 1 : 20)", "-", jobRank1, farmsWithFalseCeilingTime, farmsWithFalseCeilingPrice},
        };

        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.getColumnModel().getColumn(1).setMinWidth(350);
        table.setRowHeight(56);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(800, 400);
        System.out.println("Вызвано");
    }
}
