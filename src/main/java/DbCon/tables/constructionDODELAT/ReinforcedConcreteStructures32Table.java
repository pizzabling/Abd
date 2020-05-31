//Железобетонные конструкции табл. 32

package DbCon.tables.constructionDODELAT;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class ReinforcedConcreteStructures32Table extends JFrame {

    String jobRank1;
    String jobRank2;

    double foundationsColumnsPilesTime;
    double foundationsColumnsPilesPrice;

    double sectionsTime;
    double sectionsPrice;

    double platesBeamsGirdersTime;
    double platesBeamsGirdersPrice;

    public ReinforcedConcreteStructures32Table(int answer, double coef1) {

        if (answer == 1) {
            jobRank1 = "IV";
            jobRank2 = "IV";

            foundationsColumnsPilesTime = 14.1;
            foundationsColumnsPilesPrice = 7.33;

            sectionsTime = 15.6;
            sectionsPrice = 8.11;

            platesBeamsGirdersTime = 16.1;
            platesBeamsGirdersPrice = 8.37;

        } else if (answer == 2) {
            jobRank1 = "IV";
            jobRank2 = "V";

            foundationsColumnsPilesTime = 20.1;
            foundationsColumnsPilesPrice = 10.45;

            sectionsTime = 22.3;
            sectionsPrice = 14.16;

            platesBeamsGirdersTime = 22.3;
            platesBeamsGirdersPrice = 11.60;

        } else if (answer == 3) {
            jobRank1 = "V";
            jobRank2 = "V";

            foundationsColumnsPilesTime = 0;
            foundationsColumnsPilesPrice = 0;

            sectionsTime = 0;
            sectionsPrice = 0;

            platesBeamsGirdersTime = 25.2;
            platesBeamsGirdersPrice = 16.00;
        }

        foundationsColumnsPilesTime *= coef1;
        foundationsColumnsPilesPrice *= coef1;

        sectionsTime *= coef1;
        sectionsPrice *= coef1;

        platesBeamsGirdersTime *= coef1;
        platesBeamsGirdersPrice *= coef1;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"308", "Фундаменты, колонны и сваи (М 1 : 10; М 1 : 20)", jobRank1, foundationsColumnsPilesTime, foundationsColumnsPilesPrice},
                {"309", "Подпорные стенки (М 1 : 50,сечения" +
                        " М 1 : 20)", jobRank1, sectionsTime, sectionsPrice},
                {"310", "Плиты, балки, прогоны, своды, перемычки" +
                        "и т.п. (планы М 1 : 100; разрезы, сечения и" +
                        "детали М 1 : 40; 1 : 20, 1 : 10)", jobRank1, sectionsTime, sectionsPrice},
        };

        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.getColumnModel().getColumn(1).setMinWidth(350);
        table.setRowHeight(28);
        table.setRowHeight(2, 56);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(800, 400);
        System.out.println("Вызвано");
    }
}
