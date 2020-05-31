//Планы здания более 300 м². Рабочие чертежи табл. 12

package DbCon.tables.house_plans;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class WorkDrawsHousePlansMoreTable12 extends JFrame {

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

    double roofingDesignTime100;
    double roofingDesignPrice100;
    double roofingDesignTime200;
    double roofingDesignPrice200;
    double roofingDesignTime400;
    double roofingDesignPrice400;

    public WorkDrawsHousePlansMoreTable12(int answer) {
        if (answer == 1) {
            jobRank1 = "IV";
            jobRank2 = "III";

            basementPlanTime50 = 2.32;
            basementPlanPrice50 = 1.21;
            basementPlanTime100 = 1.95;
            basementPlanPrice100 = 1.01;
            basementPlanTime200 = 1.6;
            basementPlanPrice200 = 83.2;

            nonRepeatFloorPlanTime50 = 3.78;
            nonRepeatFloorPlanPrice50 = 1.97;
            nonRepeatFloorPlanTime100 = 2.93;
            nonRepeatFloorPlanPrice100 = 1.52;
            nonRepeatFloorPlanTime200 = 2.2;
            nonRepeatFloorPlanPrice200 = 1.14;

            repeatFloorPlanTime50 = 3.05;
            repeatFloorPlanPrice50 = 1.59;
            repeatFloorPlanTime100 = 2.44;
            repeatFloorPlanPrice100 = 1.27;
            repeatFloorPlanTime200 = 1.9;
            repeatFloorPlanPrice200 = 98.8;

            roofingDesignTime100 = 0.66;
            roofingDesignPrice100 = 30.5;
            roofingDesignTime200 = 0.44;
            roofingDesignPrice200 = 20.3;
            roofingDesignTime400 = 0.2;
            roofingDesignPrice400 = 9.2;

        } else if (answer == 2) {
            jobRank1 = "V";
            jobRank2 = "IV";

            basementPlanTime50 = 3.42;
            basementPlanPrice50 = 2.17;
            basementPlanTime100 = 2.68;
            basementPlanPrice100 = 1.7;
            basementPlanTime200 = 2.1;
            basementPlanPrice200 = 1.33;

            nonRepeatFloorPlanTime50 = 4.76;
            nonRepeatFloorPlanPrice50 = 3.02;
            nonRepeatFloorPlanTime100 = 3.78;
            nonRepeatFloorPlanPrice100 = 2.40;
            nonRepeatFloorPlanTime200 = 3;
            nonRepeatFloorPlanPrice200 = 1.31;

            repeatFloorPlanTime50 = 3.78;
            repeatFloorPlanPrice50 = 2.40;
            repeatFloorPlanTime100 = 2.93;
            repeatFloorPlanPrice100 = 1.86;
            repeatFloorPlanTime200 = 2.3;
            repeatFloorPlanPrice200 = 1.46;

            roofingDesignTime100 = 0.88;
            roofingDesignPrice100 = 45.8;
            roofingDesignTime200 = 0.49;
            roofingDesignPrice200 = 25.5;
            roofingDesignTime400 = 0.3;
            roofingDesignPrice400 = 15.6;
        } else if (answer == 3) {
            jobRank1 = "V";
            jobRank2 = "V";

            basementPlanTime50 = 4.39;
            basementPlanPrice50 = 2.79;
            basementPlanTime100 = 3.42;
            basementPlanPrice100 = 2.17;
            basementPlanTime200 = 2.7;
            basementPlanPrice200 = 1.72;

            nonRepeatFloorPlanTime50 = 5.98;
            nonRepeatFloorPlanPrice50 = 3.8;
            nonRepeatFloorPlanTime100 = 4.64;
            nonRepeatFloorPlanPrice100 = 2.95;
            nonRepeatFloorPlanTime200 = 3.7;
            nonRepeatFloorPlanPrice200 = 2.35;

            repeatFloorPlanTime50 = 4.76;
            repeatFloorPlanPrice50 = 3.02;
            repeatFloorPlanTime100 = 3.78;
            repeatFloorPlanPrice100 = 2.4;
            repeatFloorPlanTime200 = 3;
            repeatFloorPlanPrice200 = 1.91;

            roofingDesignTime100 = 0.99;
            roofingDesignPrice100 = 62.9;
            roofingDesignTime200 = 0.55;
            roofingDesignPrice200 = 34.9;
            roofingDesignTime400 = 0.3;
            roofingDesignPrice400 = 19.1;
        }

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{

                {"", "<html>План подвала:</html>", "", "", ""},
                {"42", "M 1 : 50", jobRank1, basementPlanTime50, basementPlanPrice50},
                {"43", "M 1 : 100", jobRank1, basementPlanTime100, basementPlanPrice100},
                {"44", "M 1 : 200", jobRank1, basementPlanTime200, basementPlanPrice200},

                {"", "<html>План неповторяющегося<br> этажа:</html>", "", "", ""},
                {"45", "M 1 : 50", jobRank1, nonRepeatFloorPlanTime50, nonRepeatFloorPlanPrice50},
                {"46", "M 1 : 100", jobRank1, nonRepeatFloorPlanTime100, nonRepeatFloorPlanPrice100},
                {"47", "M 1 : 200", jobRank1, nonRepeatFloorPlanTime200, nonRepeatFloorPlanPrice200},

                {"", "<html>План повторяющегося<br> этажа:</html>", "", "", ""},
                {"48", "M 1 : 50", jobRank1, repeatFloorPlanTime50, repeatFloorPlanPrice50},
                {"49", "M 1 : 100", jobRank1, repeatFloorPlanTime100, repeatFloorPlanPrice100},
                {"50", "M 1 : 200", jobRank1, repeatFloorPlanTime200, repeatFloorPlanPrice200},

                {"", "<html>План кровли:</html>", "", "", ""},
                {"51", "M 1 : 200", jobRank2, roofingDesignTime200, roofingDesignPrice200},
                {"52", "M 1 : 400", jobRank2, roofingDesignTime400, roofingDesignPrice400}
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

