//Разрезы зданий площадью более 300 м². Рабочие чертежи табл. 20
package DbCon.tables.section;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class WorkDrawsSelectionHouseMoreTable extends JFrame {

    String jobRank;

    double sectionHouseTime50;
    double sectionHousePrice50;
    double sectionHouseTime100;
    double sectionHousePrice100;

    public WorkDrawsSelectionHouseMoreTable(int answer, double coef1, double coef2, double coef3) {
        if (answer == 1) {
            jobRank = "IV";

            sectionHouseTime50 = 3.17;
            sectionHousePrice50 = 1.65;
            sectionHouseTime100 = 1.93;
            sectionHousePrice100 = 1;

        } else if (answer == 2) {
            jobRank = "V";

            sectionHouseTime50 = 3.78;
            sectionHousePrice50 = 2.40;
            sectionHouseTime100 = 2.56;
            sectionHousePrice100 = 1.63;

        } else if (answer == 3) {
            jobRank = "V";

            sectionHouseTime50 = 5.25;
            sectionHousePrice50 = 3.33;
            sectionHouseTime100 = 3.17;
            sectionHousePrice100 = 2.01;

        }

        sectionHouseTime100 *= coef1 * coef2 * coef3;
        sectionHousePrice100 *= coef1 * coef2 * coef3;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"", "Разрез здания", "", "", ""},
                {"221", "M 1 : 50", jobRank, sectionHouseTime50, sectionHousePrice50},
                {"222", "M 1 : 100", jobRank, sectionHouseTime100, sectionHousePrice100},

        };

        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.getColumnModel().getColumn(0).setMinWidth(350);
        table.setRowHeight(28);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(800, 400);
        System.out.println("Вызвано");
    }
}
