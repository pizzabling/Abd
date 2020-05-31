//Разрезы зданий площадью более 300 м². Рабочие чертежи табл. 18

package DbCon.tables.section;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class WorkDrawsSelectionHouseUpToTable extends JFrame {

    String jobRank;

    double upTo100SectionTime50;
    double upTo100SectionPrice50;
    double upTo100SectionTime100;
    double upTo100SectionPrice100;

    double upTo200SectionTime50;
    double upTo200SectionPrice50;
    double upTo200SectionTime100;
    double upTo200SectionPrice100;

    double upTo300SectionTime50;
    double upTo300SectionPrice50;
    double upTo300SectionTime100;
    double upTo300SectionPrice100;

    public WorkDrawsSelectionHouseUpToTable(int answer) {
        if (answer == 1) {
            jobRank = "IV";

            upTo100SectionTime50 = 6.34;
            upTo100SectionPrice50 = 3.30;
            upTo100SectionTime100 = 3.66;
            upTo100SectionPrice100 = 1.90;

            upTo200SectionTime50 = 11.1;
            upTo200SectionPrice50 = 5.77;
            upTo200SectionTime100 = 6.4;
            upTo200SectionPrice100 = 3.33;

            upTo300SectionTime50 = 14.3;
            upTo300SectionPrice50 = 7.44;
            upTo300SectionTime100 = 8.23;
            upTo300SectionPrice100 = 4.28;

        } else if (answer == 2) {
            jobRank = "V";

            upTo100SectionTime50 = 7.56;
            upTo100SectionPrice50 = 4.80;
            upTo100SectionTime100 = 5.12;
            upTo100SectionPrice100 = 3.25;

            upTo200SectionTime50 = 13.2;
            upTo200SectionPrice50 = 8.38;
            upTo200SectionTime100 = 8.96;
            upTo200SectionPrice100 = 5.69;

            upTo300SectionTime50 = 17;
            upTo300SectionPrice50 = 10.80;
            upTo300SectionTime100 = 11.5;
            upTo300SectionPrice100 = 7.30;

        } else if (answer == 3) {
            jobRank = "V";

            upTo100SectionTime50 = 10.5;
            upTo100SectionPrice50 = 6.67;
            upTo100SectionTime100 = 6.34;
            upTo100SectionPrice100 = 4.03;

            upTo200SectionTime50 = 18.4;
            upTo200SectionPrice50 = 11.68;
            upTo200SectionTime100 = 11.1;
            upTo200SectionPrice100 = 7.05;

            upTo300SectionTime50 = 23.6;
            upTo300SectionPrice50 = 14.99;
            upTo300SectionTime100 = 14.3;
            upTo300SectionPrice100 = 9.08;
        }

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"", "Разрез здания площадью в м²<br>" +
                        " до 100:", "", "", ""},
                {"203", "M 1: 50", jobRank, upTo100SectionTime50, upTo100SectionPrice50},
                {"204", "M 1: 100", jobRank, upTo100SectionTime100, upTo100SectionPrice100},

                {"", "более 100 до 200:", "", "", ""},
                {"206", "M 1: 50", jobRank, upTo200SectionTime50, upTo100SectionPrice50},
                {"207", "M 1: 100", jobRank, upTo200SectionTime100, upTo100SectionPrice100},

                {"", "более 200 до 300:", "", "", ""},
                {"209", "M 1: 50", jobRank, upTo300SectionTime50, upTo100SectionPrice50},
                {"210", "M 1: 100", jobRank, upTo300SectionTime100, upTo100SectionPrice100},
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
