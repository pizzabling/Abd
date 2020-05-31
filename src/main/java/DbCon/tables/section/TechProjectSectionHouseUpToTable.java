//Разрезы зданий площадью до 300 м². Технический проект табл. 17

package DbCon.tables.section;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class TechProjectSectionHouseUpToTable extends JFrame {

    String jobRank;

    double upTo100SectionTime50;
    double upTo100SectionPrice50;
    double upTo100SectionTime100;
    double upTo100SectionPrice100;
    double upTo100SectionTime200;
    double upTo100SectionPrice200;

    double upTo200SectionTime50;
    double upTo200SectionPrice50;
    double upTo200SectionTime100;
    double upTo200SectionPrice100;
    double upTo200SectionTime200;
    double upTo200SectionPrice200;

    double upTo300SectionTime50;
    double upTo300SectionPrice50;
    double upTo300SectionTime100;
    double upTo300SectionPrice100;
    double upTo300SectionTime200;
    double upTo300SectionPrice200;

    public TechProjectSectionHouseUpToTable(int answer) {

        if (answer == 1) {
            jobRank = "III";

            upTo100SectionTime50 = 0;
            upTo100SectionPrice50 = 0;
            upTo100SectionTime100 = 2.64;
            upTo100SectionPrice100 = 1.22;
            upTo100SectionTime200 = 2.06;
            upTo100SectionPrice200 = 95.2;

            upTo200SectionTime50 = 0;
            upTo200SectionPrice50 = 0;
            upTo200SectionTime50 = 4.62;
            upTo200SectionPrice50 = 2.13;
            upTo200SectionTime100 = 3.6;
            upTo200SectionPrice100 = 1.66;

            upTo300SectionTime50 = 0;
            upTo300SectionPrice50 = 0;
            upTo300SectionTime50 = 5.94;
            upTo300SectionPrice50 = 2.74;
            upTo300SectionTime100 = 4.63;
            upTo300SectionPrice100 = 2.14;

        } else if (answer == 2) {
            jobRank = "IV";

            upTo100SectionTime50 = 5.2;
            upTo100SectionPrice50 = 2.70;
            upTo100SectionTime100 = 3.9;
            upTo100SectionPrice100 = 2.03;
            upTo100SectionTime200 = 2.92;
            upTo100SectionPrice200 = 1.52;

            upTo200SectionTime50 = 9.06;
            upTo200SectionPrice50 = 4.71;
            upTo200SectionTime50 = 6.83;
            upTo200SectionPrice50 = 3.55;
            upTo200SectionTime100 = 5.11;
            upTo200SectionPrice100 = 2.66;

            upTo300SectionTime50 = 11.6;
            upTo300SectionPrice50 = 6.03;
            upTo300SectionTime50 = 8.78;
            upTo300SectionPrice50 = 4.57;
            upTo300SectionTime100 = 6.57;
            upTo300SectionPrice100 = 3.42;

        } else if (answer == 3) {
            jobRank = "IV";

            upTo100SectionTime50 = 6;
            upTo100SectionPrice50 = 3.12;
            upTo100SectionTime100 = 4.88;
            upTo100SectionPrice100 = 2.54;
            upTo100SectionTime200 = 3.9;
            upTo100SectionPrice200 = 2.03;

            upTo200SectionTime50 = 10.5;
            upTo200SectionPrice50 = 5.46;
            upTo200SectionTime100 = 8.54;
            upTo200SectionPrice100 = 4.44;
            upTo200SectionTime200 = 6.83;
            upTo200SectionPrice200 = 3.55;

            upTo300SectionTime50 = 13.5;
            upTo300SectionPrice50 = 7.02;
            upTo300SectionTime100 = 11;
            upTo300SectionPrice100 = 5.72;
            upTo300SectionTime200 = 8.78;
            upTo300SectionPrice200 = 4.57;
        }

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"", "Разрез здания площадью в м²<br>" +
                        " до 100:", "", "", ""},
                {"203", "M 1: 50", jobRank, upTo100SectionTime50, upTo100SectionPrice50},
                {"204", "M 1: 100", jobRank, upTo100SectionTime100, upTo100SectionPrice100},
                {"205", "M 1: 200", jobRank, upTo100SectionTime200, upTo100SectionPrice200},

                {"", "более 100 до 200:", "", "", ""},
                {"206", "M 1: 50", jobRank, upTo200SectionTime50, upTo100SectionPrice50},
                {"207", "M 1: 100", jobRank, upTo200SectionTime100, upTo100SectionPrice100},
                {"208", "M 1: 200", jobRank, upTo200SectionTime200, upTo100SectionPrice200},

                {"", "более 200 до 300:", "", "", ""},
                {"209", "M 1: 50", jobRank, upTo300SectionTime50, upTo100SectionPrice50},
                {"210", "M 1: 100", jobRank, upTo300SectionTime100, upTo100SectionPrice100},
                {"211", "M 1: 200", jobRank, upTo300SectionTime200, upTo100SectionPrice200},
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
