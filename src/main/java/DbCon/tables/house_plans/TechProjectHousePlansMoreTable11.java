//Планы здания более 300 м². Технический проект табл. 11

package DbCon.tables.house_plans;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class TechProjectHousePlansMoreTable11 extends JFrame {

    String jobRank1;
    String jobRank2;

    double basementPlanTime50;
    double basementPlanPrice50;
    double basementPlanTime100;
    double basementPlanPrice100;
    double basementPlanTime200;
    double basementPlanPrice200;

    double nonRepeatFloorPlanTime50;
    double nonRepeatFloorPlanPrice50;
    double nonRepeatFloorPlanTime100;
    double nonRepeatFloorPlanPrice100;
    double nonRepeatFloorPlanTime200;
    double nonRepeatFloorPlanPrice200;

    double repeatFloorPlanTime50;
    double repeatFloorPlanPrice50;
    double repeatFloorPlanTime100;
    double repeatFloorPlanPrice100;
    double repeatFloorPlanTime200;
    double repeatFloorPlanPrice200;

    double roofingDesignTime200;
    double roofingDesignPrice200;
    double roofingDesignTime400;
    double roofingDesignPrice400;

    public TechProjectHousePlansMoreTable11(int answer, double coef1, double coef2, double coef3, double coef4, double coef5, double coef6) {
        if (answer == 1) {
            jobRank1 = "III";
            jobRank2 = "III";

            basementPlanTime50 = 2.2;
            basementPlanPrice50 = 1.02;
            basementPlanTime100 = 1.46;
            basementPlanPrice100 = 67.5;
            basementPlanTime200 = 0.88;
            basementPlanPrice200 = 40.7;

            nonRepeatFloorPlanTime50 = 3.1;
            nonRepeatFloorPlanPrice50 = 1.43;
            nonRepeatFloorPlanTime100 = 2.12;
            nonRepeatFloorPlanPrice100 = 97.9;
            nonRepeatFloorPlanTime200 = 1.32;
            nonRepeatFloorPlanPrice200 = 0.61;

            repeatFloorPlanTime50 = 2.9;
            repeatFloorPlanPrice50 = 1.34;
            repeatFloorPlanTime100 = 1.95;
            repeatFloorPlanPrice100 = 90.1;
            repeatFloorPlanTime200 = 1.17;
            repeatFloorPlanPrice200 = 54.1;

            roofingDesignTime200 = 0.24;
            roofingDesignPrice200 = 11.1;
            roofingDesignTime400 = 0.14;
            roofingDesignPrice400 = 6.5;
        } else if (answer == 2) {
            jobRank1 = "IV";
            jobRank2 = "IV";

            basementPlanTime50 = 2.8;
            basementPlanPrice50 = 1.46;
            basementPlanTime100 = 1.95;
            basementPlanPrice100 = 1.01;
            basementPlanTime200 = 1.32;
            basementPlanPrice200 = 68.6;

            nonRepeatFloorPlanTime50 = 3.6;
            nonRepeatFloorPlanPrice50 = 1.87;
            nonRepeatFloorPlanTime100 = 2.6;
            nonRepeatFloorPlanPrice100 = 1.35;
            nonRepeatFloorPlanTime200 = 1.63;
            nonRepeatFloorPlanPrice200 = 84.8;

            repeatFloorPlanTime50 = 3;
            repeatFloorPlanPrice50 = 1.56;
            repeatFloorPlanTime100 = 2.12;
            repeatFloorPlanPrice100 = 1.10;
            repeatFloorPlanTime200 = 1.46;
            repeatFloorPlanPrice200 = 75.9;

            roofingDesignTime200 = 0.3;
            roofingDesignPrice200 = 15.6;
            roofingDesignTime400 = 0.18;
            roofingDesignPrice400 = 9.4;
        } else if (answer == 3) {
            jobRank1 = "IV";
            jobRank2 = "V";

            basementPlanTime50 = 3.1;
            basementPlanPrice50 = 1.64;
            basementPlanTime100 = 2.44;
            basementPlanPrice100 = 1.27;
            basementPlanTime200 = 1.63;
            basementPlanPrice200 = 84.8;

            nonRepeatFloorPlanTime50 = 4.7;
            nonRepeatFloorPlanPrice50 = 2.44;
            nonRepeatFloorPlanTime100 = 3.58;
            nonRepeatFloorPlanPrice100 = 1.86;
            nonRepeatFloorPlanTime200 = 2.12;
            nonRepeatFloorPlanPrice200 = 1.10;

            repeatFloorPlanTime50 = 3.4;
            repeatFloorPlanPrice50 = 1.77;
            repeatFloorPlanTime100 = 2.6;
            repeatFloorPlanPrice100 = 1.35;
            repeatFloorPlanTime200 = 1.63;
            repeatFloorPlanPrice200 = 84.8;

            roofingDesignTime200 = 0.3;
            roofingDesignPrice200 = 19.1;
            roofingDesignTime400 = 0.2;
            roofingDesignPrice400 = 12.7;
        }

        basementPlanTime50 = basementPlanTime50 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        basementPlanPrice50 = basementPlanPrice50 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        basementPlanTime100 = basementPlanTime100 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        basementPlanPrice100 = basementPlanPrice100 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        basementPlanTime200 = basementPlanTime200 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        basementPlanPrice200 = basementPlanPrice200 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        nonRepeatFloorPlanTime50 = nonRepeatFloorPlanTime50 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        nonRepeatFloorPlanPrice50 = nonRepeatFloorPlanPrice50 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        nonRepeatFloorPlanTime100 = nonRepeatFloorPlanTime100 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        nonRepeatFloorPlanPrice100 = nonRepeatFloorPlanPrice100 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        nonRepeatFloorPlanTime200 = nonRepeatFloorPlanTime200 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        nonRepeatFloorPlanPrice200 = nonRepeatFloorPlanPrice200 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        repeatFloorPlanTime50 = repeatFloorPlanTime50 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        repeatFloorPlanPrice50 = repeatFloorPlanPrice50 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        repeatFloorPlanTime100 = repeatFloorPlanTime100 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        repeatFloorPlanPrice100 = repeatFloorPlanPrice100 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        repeatFloorPlanTime200 = repeatFloorPlanTime200 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        repeatFloorPlanPrice200 = repeatFloorPlanPrice200 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        roofingDesignTime200 = roofingDesignTime200 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        roofingDesignPrice200 = roofingDesignPrice200 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        roofingDesignTime400 = roofingDesignTime400 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        roofingDesignPrice400 = roofingDesignPrice400 * coef1 * coef2 * coef3 * coef4 * coef5 * coef6;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{

                {"", "<html>План подвала:</html>", "", "", ""},
                {"116", "M 1 : 50", jobRank1, basementPlanTime50, basementPlanPrice50},
                {"117", "M 1 : 100", jobRank1, basementPlanTime100, basementPlanPrice100},
                {"118", "M 1 : 200", jobRank1, basementPlanTime200, basementPlanPrice200},

                {"", "<html>План неповторяющегося<br> этажа:</html>", "", "", ""},
                {"119", "M 1 : 50", jobRank1, nonRepeatFloorPlanTime50, nonRepeatFloorPlanPrice50},
                {"120", "M 1 : 100", jobRank1, nonRepeatFloorPlanTime100, nonRepeatFloorPlanPrice100},
                {"121", "M 1 : 200", jobRank1, nonRepeatFloorPlanTime200, nonRepeatFloorPlanPrice200},

                {"", "<html>План повторяющегося<br> этажа:</html>", "", "", ""},
                {"122", "M 1 : 50", jobRank1, repeatFloorPlanTime50, repeatFloorPlanPrice50},
                {"123", "M 1 : 100", jobRank1, repeatFloorPlanTime100, repeatFloorPlanPrice100},
                {"124", "M 1 : 200", jobRank1, repeatFloorPlanTime200, repeatFloorPlanPrice200},

                {"", "<html>План кровли:</html>", "", "", ""},
                {"125", "M 1 : 200", jobRank2, roofingDesignTime200, roofingDesignPrice200},
                {"126", "M 1 : 400", jobRank2, roofingDesignTime400, roofingDesignPrice400}
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
