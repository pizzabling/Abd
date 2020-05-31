//Каменные и бетонные конструкции табл.26

package DbCon.tables.design_work;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class StoneConcreteStructuresTable26 extends JFrame {

    String jobRank;

    double retainingWallsTime;
    double retainingWallsPrice;

    double wallsPillarTime;
    double wallsPillarPrice;

    double jumpersTime;
    double jumpersPrice;

    double cornicesTime;
    double cornicesPrice;


    public StoneConcreteStructuresTable26(int answer, double coef1) {
        if (answer == 1) {
            jobRank = "IV";

            retainingWallsTime = 5.09;
            retainingWallsPrice = 2.65;

            wallsPillarTime = 3.02;
            wallsPillarPrice = 1.57;

            jumpersTime = 2.54;
            jumpersPrice = 1.32;

            cornicesTime = 2.54;
            cornicesPrice = 1.32;

        } else if (answer == 2) {
            jobRank = "V";

            retainingWallsTime = 6.79;
            retainingWallsPrice = 4.31;

            wallsPillarTime = 5.28;
            wallsPillarPrice = 3.35;

            jumpersTime = 5.09;
            jumpersPrice = 3.23;

            cornicesTime = 5.09;
            cornicesPrice = 3.23;

        } else if (answer == 3) {
            jobRank = "V";

            retainingWallsTime = 9.42;
            retainingWallsPrice = 5.98;

            wallsPillarTime = 8.48;
            wallsPillarPrice = 5.38;

            jumpersTime = 9.42;
            jumpersPrice = 5.98;

            cornicesTime = 6.79;
            cornicesPrice = 4.31;
        }

        wallsPillarTime *= coef1;
        wallsPillarPrice *= coef1;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"276", "Подпорные стенки", jobRank, retainingWallsTime, retainingWallsPrice},
                {"277", "Стены, столбы, простенки", jobRank, wallsPillarTime, wallsPillarPrice},
                {"278", "Перемычки, арки над проёмами", jobRank, jumpersTime, jumpersPrice},
                {"279", "Карнизы", jobRank, cornicesTime, cornicesPrice}
        };

        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
//        table.getColumnModel().getColumn(1).setMinWidth(350);
        table.setRowHeight(28);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(800, 400);
        System.out.println("Вызвано");
    }
}
