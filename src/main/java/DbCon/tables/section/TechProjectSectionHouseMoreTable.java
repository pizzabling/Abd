//Разрезы зданий площадью более 300 м². Технический проект табл. 19
package DbCon.tables.section;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class TechProjectSectionHouseMoreTable extends JFrame {

    String jobRank;

    double sectionHouseTime50;
    double sectionHousePrice50;
    double sectionHouseTime100;
    double sectionHousePrice100;
    double sectionHouseTime200;
    double sectionHousePrice200;

    public TechProjectSectionHouseMoreTable(int answer, double coef1, double coef2, double coef3, double coef4,
                                            double coef5, double coef6, double coef7, double coef8) {
        if (answer == 1) {
            jobRank = "III";

            sectionHouseTime50 = 0;
            sectionHousePrice50 = 0;
            sectionHouseTime100 = 1.32;
            sectionHousePrice100 = 0.61;
            sectionHouseTime200 = 1.02;
            sectionHousePrice200 = 47.1;

        } else if (answer == 2) {
            jobRank = "IV";

            sectionHouseTime50 = 2.59;
            sectionHousePrice50 = 1.35;
            sectionHouseTime100 = 1.95;
            sectionHousePrice100 = 1.01;
            sectionHouseTime200 = 1.46;
            sectionHousePrice200 = 75.9;

        } else if (answer == 3) {
            jobRank = "IV";

            sectionHouseTime50 = 3;
            sectionHousePrice50 = 1.56;
            sectionHouseTime100 = 2.44;
            sectionHousePrice100 = 1.27;
            sectionHouseTime200 = 1.95;
            sectionHousePrice200 = 1.01;
        }

        sectionHouseTime50 = sectionHouseTime50 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        sectionHousePrice50 = sectionHousePrice50 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        sectionHouseTime100 = sectionHouseTime100 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        sectionHousePrice100 = sectionHousePrice100 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        sectionHouseTime200 = sectionHouseTime200 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6 * coef7 * coef8;
        sectionHousePrice200 = sectionHousePrice200 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6 * coef7 * coef8;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"", "Разрез здания", "", "", ""},
                {"218", "M 1 : 50", jobRank, sectionHouseTime50, sectionHousePrice50},
                {"219", "M 1 : 100", jobRank, sectionHouseTime100, sectionHousePrice100},
                {"220", "M 1 : 200", jobRank, sectionHouseTime200, sectionHousePrice200},
        };

        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.setRowHeight(28);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(800, 400);
        System.out.println("Вызвано");
    }
}
