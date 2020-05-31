//Деревянные конструкции табл. 30

package DbCon.tables.design_work;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class WoodenStructuresTable30 extends JFrame {

    String jobRank1;
    String jobRank2;
    String jobRank3;

    double beamsGirdersTime;
    double beamsGirdersPrice;

    double compositeBeamsTime;
    double compositeBeamsPrice;

    double columnTime;
    double columnPrice;

    double farmWithoutFalseCeilingTime;
    double farmWithoutFalseCeilingPrice;

    double suspendedFarmTime;
    double suspendedFarmPrice;

    double cuttingsMatesTime;
    double cuttingsMatesPrice;

    double ArcadesBuildingTime;
    double ArcadesBuildingPrice;

    public WoodenStructuresTable30(int answer) {

        if (answer == 1) {
            jobRank1 = "IV";
            jobRank2 = "V";
            jobRank3 = "IV";

            beamsGirdersTime = 0.61;
            beamsGirdersPrice = 31.7;

            compositeBeamsTime = 5.09;
            compositeBeamsPrice = 3.23;

            columnTime = 1.22;
            columnPrice = 53.4;

            farmWithoutFalseCeilingTime = 22.9;
            farmWithoutFalseCeilingPrice = 14.54;

            suspendedFarmTime = 26.3;
            suspendedFarmPrice = 16.7;

            cuttingsMatesTime = 1.53;
            cuttingsMatesPrice = 79.6;

            ArcadesBuildingTime = 0;
            ArcadesBuildingPrice = 0;

        } else if (answer == 2) {
            jobRank1 = "V";
            jobRank2 = "V";
            jobRank3 = "IV";

            beamsGirdersTime = 0.93;
            beamsGirdersPrice = 59.1;

            compositeBeamsTime = 6.79;
            compositeBeamsPrice = 4.31;

            columnTime = 1.51;
            columnPrice = 95.9;

            farmWithoutFalseCeilingTime = 26.3;
            farmWithoutFalseCeilingPrice = 16.70;

            suspendedFarmTime = 34;
            suspendedFarmPrice = 21.59;

            cuttingsMatesTime = 2.04;
            cuttingsMatesPrice = 1.3;

            ArcadesBuildingTime = 1.7;
            ArcadesBuildingPrice = 88.4;

        } else if (answer == 3) {
            jobRank1 = "V";
            jobRank2 = "V";
            jobRank3 = "V";

            beamsGirdersTime = 1.53;
            beamsGirdersPrice = 97.2;

            compositeBeamsTime = 0;
            compositeBeamsPrice = 0;

            columnTime = 2.26;
            columnPrice = 1.44;

            farmWithoutFalseCeilingTime = 34;
            farmWithoutFalseCeilingPrice = 21.59;

            suspendedFarmTime = 41.5;
            suspendedFarmPrice = 26.35;

            cuttingsMatesTime = 0;
            cuttingsMatesPrice = 0;

            ArcadesBuildingTime = 2.54;
            ArcadesBuildingPrice = 1.61;

        }

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Измеритель", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"295", "Балки и прогоны несоставного" +
                        "сечения", "полёт", jobRank1, beamsGirdersTime, beamsGirdersPrice},
                {"296", "Балки составного сечения", "-", jobRank1, compositeBeamsTime, compositeBeamsPrice},
                {"297", "Колонна", "сечение", jobRank1, columnTime, columnPrice},
                {"298", "Ферма без подвесного потолка", "шт.", jobRank2, farmWithoutFalseCeilingTime, farmWithoutFalseCeilingPrice},
                {"299", "Ферма с подвесным потолком", "-", jobRank2, suspendedFarmTime, suspendedFarmPrice},
                {"300", "Врубки и сопряжения", "элемент", jobRank3, cuttingsMatesTime, cuttingsMatesPrice},
                {"301", "Каркасы зданий, элементы террас" +
                        "и галерей, фронтоны", "-", jobRank3, ArcadesBuildingTime, ArcadesBuildingPrice},
        };
        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.getColumnModel().getColumn(1).setMinWidth(350);
        table.setRowHeight(28);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(800, 400);
        System.out.println("Вызвано");
    }
}
