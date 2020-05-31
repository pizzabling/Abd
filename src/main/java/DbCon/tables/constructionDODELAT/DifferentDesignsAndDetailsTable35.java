//Разные конструкции и детали табл. 35

package DbCon.tables.constructionDODELAT;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class DifferentDesignsAndDetailsTable35 extends JFrame {
    String jobRank1;
    String jobRank2;

    double prefabricatedStairsReinforcedConcreteStepsTime;
    double prefabricatedStairsReinforcedConcreteStepsPrice;

    double woodenStairsAndMetalPartsTime;
    double woodenStairsAndMetalPartsPrice;

    double spiralStairsTime;
    double spiralStairsPrice;

    double coef;

    public DifferentDesignsAndDetailsTable35(int answer, int answer1, double coef1, double coef2) {

        if (answer == 1) {
            jobRank1 = "III";

            prefabricatedStairsReinforcedConcreteStepsTime = 20.1;
            prefabricatedStairsReinforcedConcreteStepsPrice = 9.29;

            woodenStairsAndMetalPartsTime = 22.3;
            woodenStairsAndMetalPartsPrice = 10.3;

        } else if (answer == 2) {
            jobRank1 = "IV";

            prefabricatedStairsReinforcedConcreteStepsTime = 24.6;
            prefabricatedStairsReinforcedConcreteStepsPrice = 12.79;

            woodenStairsAndMetalPartsTime = 24.6;
            woodenStairsAndMetalPartsPrice = 12.79;

        } else if (answer == 3) {
            jobRank1 = "V";

            prefabricatedStairsReinforcedConcreteStepsTime = 25.1;
            prefabricatedStairsReinforcedConcreteStepsPrice = 15.94;

            woodenStairsAndMetalPartsTime = 29;
            woodenStairsAndMetalPartsPrice = 18.42;
        }

        if (answer1 == 1) {
            jobRank2 = "IV";

            spiralStairsTime = 20.1;
            spiralStairsPrice = 10.45;
        } else if (answer1 == 2) {
            jobRank2 = "V";

            spiralStairsTime = 25.7;
            spiralStairsPrice = 16.32;
        } else if (answer1 == 3) {
            jobRank2 = "-";

            spiralStairsTime = 0;
            spiralStairsPrice = 0;
        }

        coef = coef1 * coef2;

        prefabricatedStairsReinforcedConcreteStepsTime *= coef1;
        prefabricatedStairsReinforcedConcreteStepsPrice *= coef1;

        woodenStairsAndMetalPartsTime *= coef1;
        woodenStairsAndMetalPartsPrice *= coef1;

        spiralStairsTime *= coef;
        spiralStairsPrice *= coef;
        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"320", "Лестницы со сборными железобетонными ступенями по" +
                        "металлическим или железобетонными ступенями по" +
                        "метллическим или железобетонным балкам и" +
                        "косоурам (М 1 : 50), детали (М 1 : 20)", jobRank1, prefabricatedStairsReinforcedConcreteStepsTime, prefabricatedStairsReinforcedConcreteStepsPrice},
                {"321", "Лестницы деревянные и металлические (М 1 : 50)," +
                        " детали (М 1 : 10, 1 : 20)", jobRank1, woodenStairsAndMetalPartsTime, woodenStairsAndMetalPartsPrice},
                {"322", "Лестницы винтовые, деревянные или" +
                        "металлические (М 1 : 20); детали (М 1 : 10)", jobRank2, spiralStairsTime, spiralStairsPrice}
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
