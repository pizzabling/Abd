//Планы здания до 300 м². Рабочие чертежи табл. 10
package DbCon.tables.house_plans;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class WorkDrawsHousePlansUpToTable10 extends JFrame {

    String jobRank1;
    String jobRank2;
    String jobRank3;

    double sectionPlanFragmentTime;
    double sectionPlanFragmentPrice;

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

    double o1sectionPlanFragmentTime;
    double o1sectionPlanFragmentPrice;

    double o1basementPlanTime50;
    double o1basementPlanPrice50;
    double o1basementPlanTime100;
    double o1basementPlanPrice100;
    double o1basementPlanTime200;
    double o1basementPlanPrice200;

    double o1nonRepeatFloorPlanTime50;
    double o1nonRepeatFloorPlanPrice50;
    double o1nonRepeatFloorPlanTime100;
    double o1nonRepeatFloorPlanPrice100;
    double o1nonRepeatFloorPlanTime200;
    double o1nonRepeatFloorPlanPrice200;

    double o1repeatFloorPlanTime50;
    double o1repeatFloorPlanPrice50;
    double o1repeatFloorPlanTime100;
    double o1repeatFloorPlanPrice100;
    double o1repeatFloorPlanTime200;
    double o1repeatFloorPlanPrice200;

    double o1roofingDesignTime100;
    double o1roofingDesignPrice100;
    double o1roofingDesignTime200;
    double o1roofingDesignPrice200;
    double o1roofingDesignTime400;
    double o1roofingDesignPrice400;

    double o2sectionPlanFragmentTime;
    double o2sectionPlanFragmentPrice;

    double o2basementPlanTime50;
    double o2basementPlanPrice50;
    double o2basementPlanTime100;
    double o2basementPlanPrice100;
    double o2basementPlanTime200;
    double o2basementPlanPrice200;

    double o2nonRepeatFloorPlanTime50;
    double o2nonRepeatFloorPlanPrice50;
    double o2nonRepeatFloorPlanTime100;
    double o2nonRepeatFloorPlanPrice100;
    double o2nonRepeatFloorPlanTime200;
    double o2nonRepeatFloorPlanPrice200;

    double o2repeatFloorPlanTime50;
    double o2repeatFloorPlanPrice50;
    double o2repeatFloorPlanTime100;
    double o2repeatFloorPlanPrice100;
    double o2repeatFloorPlanTime200;
    double o2repeatFloorPlanPrice200;

    double o2roofingDesignTime100;
    double o2roofingDesignPrice100;
    double o2roofingDesignTime200;
    double o2roofingDesignPrice200;
    double o2roofingDesignTime400;
    double o2roofingDesignPrice400;

    public WorkDrawsHousePlansUpToTable10(int answear) {
        if (answear == 1) {
            jobRank1 = "III";
            jobRank2 = "IV";
            jobRank3 = "IV";

            sectionPlanFragmentTime = 8.4;
            sectionPlanFragmentPrice = 4.37;

            basementPlanTime50 = 4.64;
            basementPlanPrice50 = 2.41;
            basementPlanTime100 = 3.9;
            basementPlanPrice100 = 2.03;
            basementPlanTime200 = 3.2;
            basementPlanPrice200 = 1.66;

            nonRepeatFloorPlanTime50 = 7.6;
            nonRepeatFloorPlanPrice50 = 3.95;
            nonRepeatFloorPlanTime100 = 5.8;
            nonRepeatFloorPlanPrice100 = 3.02;
            nonRepeatFloorPlanTime200 = 4.4;
            nonRepeatFloorPlanPrice200 = 2.29;

            repeatFloorPlanTime50 = 6;
            repeatFloorPlanPrice50 = 3.12;
            repeatFloorPlanTime100 = 4.8;
            repeatFloorPlanPrice100 = 2.50;
            repeatFloorPlanTime200 = 3.8;
            repeatFloorPlanPrice200 = 1.98;

            roofingDesignTime100 = 1.4;
            roofingDesignPrice100 = 64.7;
            roofingDesignTime200 = 0.8;
            roofingDesignPrice200 = 37;
            roofingDesignTime400 = 0.4;
            roofingDesignPrice400 = 18.5;

            o1sectionPlanFragmentTime = 14.7;
            o1sectionPlanFragmentPrice = 7.64;

            o1basementPlanTime50 = 8.12;
            o1basementPlanPrice50 = 4.22;
            o1basementPlanTime100 = 6.82;
            o1basementPlanPrice100 = 3.55;
            o1basementPlanTime200 = 5.6;
            o1basementPlanPrice200 = 2.91;

            o1nonRepeatFloorPlanTime50 = 13.3;
            o1nonRepeatFloorPlanPrice50 = 6.92;
            o1nonRepeatFloorPlanTime100 = 10.1;
            o1nonRepeatFloorPlanPrice100 = 5.28;
            o1nonRepeatFloorPlanTime200 = 7.7;
            o1nonRepeatFloorPlanPrice200 = 4;

            o1repeatFloorPlanTime50 = 10.5;
            o1repeatFloorPlanPrice50 = 5.46;
            o1repeatFloorPlanTime100 = 8.4;
            o1repeatFloorPlanPrice100 = 4.37;
            o1repeatFloorPlanTime200 = 6.65;
            o1repeatFloorPlanPrice200 = 3.46;

            o1roofingDesignTime100 = 2.45;
            o1roofingDesignPrice100 = 1.13;
            o1roofingDesignTime200 = 1.4;
            o1roofingDesignPrice200 = 64.7;
            o1roofingDesignTime400 = 0.7;
            o1roofingDesignPrice400 = 32.3;

            o2sectionPlanFragmentTime = 18.9;
            o2sectionPlanFragmentPrice = 9.83;

            o2basementPlanTime50 = 10.44;
            o2basementPlanPrice50 = 5.43;
            o2basementPlanTime100 = 8.77;
            o2basementPlanPrice100 = 4.56;
            o2basementPlanTime200 = 7.2;
            o2basementPlanPrice200 = 3.74;

            o2nonRepeatFloorPlanTime50 = 17.1;
            o2nonRepeatFloorPlanPrice50 = 8.89;
            o2nonRepeatFloorPlanTime100 = 13.05;
            o2nonRepeatFloorPlanPrice100 = 6.79;
            o2nonRepeatFloorPlanTime200 = 9.9;
            o2nonRepeatFloorPlanPrice200 = 5.15;

            o2repeatFloorPlanTime50 = 13.5;
            o2repeatFloorPlanPrice50 = 7.02;
            o2repeatFloorPlanTime100 = 10.8;
            o2repeatFloorPlanPrice100 = 5.62;
            o2repeatFloorPlanTime200 = 8.55;
            o2repeatFloorPlanPrice200 = 4.45;

            o2roofingDesignTime100 = 3.15;
            o2roofingDesignPrice100 = 1.46;
            o2roofingDesignTime200 = 1.8;
            o2roofingDesignPrice200 = 83.2;
            o2roofingDesignTime400 = 0.9;
            o2roofingDesignPrice400 = 41.6;
        } else if (answear == 2) {
            jobRank1 = "V";
            jobRank2 = "IV";
            jobRank3 = "V";

            sectionPlanFragmentTime = 10.6;
            sectionPlanFragmentPrice = 6.73;

            basementPlanTime50 = 6.82;
            basementPlanPrice50 = 4.33;
            basementPlanTime100 = 5.36;
            basementPlanPrice100 = 3.40;
            basementPlanTime200 = 4.22;
            basementPlanPrice200 = 2.68;

            nonRepeatFloorPlanTime50 = 9.6;
            nonRepeatFloorPlanPrice50 = 6.10;
            nonRepeatFloorPlanTime100 = 7.6;
            nonRepeatFloorPlanPrice100 = 4.83;
            nonRepeatFloorPlanTime200 = 6;
            nonRepeatFloorPlanPrice200 = 3.81;

            repeatFloorPlanTime50 = 7.6;
            repeatFloorPlanPrice50 = 4.83;
            repeatFloorPlanTime100 = 5.8;
            repeatFloorPlanPrice100 = 3.68;
            repeatFloorPlanTime200 = 4.6;
            repeatFloorPlanPrice200 = 2.92;

            roofingDesignTime100 = 1.8;
            roofingDesignPrice100 = 93.6;
            roofingDesignTime200 = 1;
            roofingDesignPrice200 = 0.52;
            roofingDesignTime400 = 0.6;
            roofingDesignPrice400 = 31.2;

            o1sectionPlanFragmentTime = 18.5;
            o1sectionPlanFragmentPrice = 11.75;

            o1basementPlanTime50 = 11.9;
            o1basementPlanPrice50 = 7.56;
            o1basementPlanTime100 = 9.38;
            o1basementPlanPrice100 = 5.96;
            o1basementPlanTime200 = 7.3;
            o1basementPlanPrice200 = 4.64;

            o1nonRepeatFloorPlanTime50 = 16.8;
            o1nonRepeatFloorPlanPrice50 = 10.67;
            o1nonRepeatFloorPlanTime100 = 13.3;
            o1nonRepeatFloorPlanPrice100 = 8.45;
            o1nonRepeatFloorPlanTime200 = 10.5;
            o1nonRepeatFloorPlanPrice200 = 6.67;

            o1repeatFloorPlanTime50 = 13.3;
            o1repeatFloorPlanPrice50 = 8.46;
            o1repeatFloorPlanTime100 = 10.1;
            o1repeatFloorPlanPrice100 = 6.41;
            o1repeatFloorPlanTime200 = 8.05;
            o1repeatFloorPlanPrice200 = 5.11;

            o1roofingDesignTime100 = 3.15;
            o1roofingDesignPrice100 = 1.64;
            o1roofingDesignTime200 = 1.75;
            o1roofingDesignPrice200 = 0.91;
            o1roofingDesignTime400 = 1.05;
            o1roofingDesignPrice400 = 54.6;

            o2sectionPlanFragmentTime = 23.8;
            o2sectionPlanFragmentPrice = 15.11;

            o2basementPlanTime50 = 15.3;
            o2basementPlanPrice50 = 9.72;
            o2basementPlanTime100 = 12.0;
            o2basementPlanPrice100 = 7.62;
            o2basementPlanTime200 = 9.4;
            o2basementPlanPrice200 = 5.97;

            o2nonRepeatFloorPlanTime50 = 21.6;
            o2nonRepeatFloorPlanPrice50 = 13.72;
            o2nonRepeatFloorPlanTime100 = 16.1;
            o2nonRepeatFloorPlanPrice100 = 10.22;
            o2nonRepeatFloorPlanTime200 = 13.5;
            o2nonRepeatFloorPlanPrice200 = 8.57;

            o2repeatFloorPlanTime50 = 17.1;
            o2repeatFloorPlanPrice50 = 10.86;
            o2repeatFloorPlanTime100 = 13;
            o2repeatFloorPlanPrice100 = 8.29;
            o2repeatFloorPlanTime200 = 10.4;
            o2repeatFloorPlanPrice200 = 6.6;

            o2roofingDesignTime100 = 4.05;
            o2roofingDesignPrice100 = 2.11;
            o2roofingDesignTime200 = 2.25;
            o2roofingDesignPrice200 = 1.17;
            o2roofingDesignTime400 = 1.35;
            o2roofingDesignPrice400 = 70.2;
        } else if (answear == 3) {
            jobRank1 = "V";
            jobRank2 = "V";

            sectionPlanFragmentTime = 13.2;
            sectionPlanFragmentPrice = 8.38;

            basementPlanTime50 = 8.78;
            basementPlanPrice50 = 5.58;
            basementPlanTime100 = 6.82;
            basementPlanPrice100 = 4.33;
            basementPlanTime200 = 5.4;
            basementPlanPrice200 = 3.43;

            nonRepeatFloorPlanTime50 = 12;
            nonRepeatFloorPlanPrice50 = 7.62;
            nonRepeatFloorPlanTime100 = 9.2;
            nonRepeatFloorPlanPrice100 = 5.84;
            nonRepeatFloorPlanTime200 = 7.4;
            nonRepeatFloorPlanPrice200 = 4.7;

            repeatFloorPlanTime50 = 9.6;
            repeatFloorPlanPrice50 = 6.1;
            repeatFloorPlanTime100 = 7.6;
            repeatFloorPlanPrice100 = 4.83;
            repeatFloorPlanTime200 = 6;
            repeatFloorPlanPrice200 = 3.81;

            roofingDesignTime100 = 2;
            roofingDesignPrice100 = 1.27;
            roofingDesignTime200 = 1;
            roofingDesignPrice200 = 63.5;
            roofingDesignTime400 = 0.6;
            roofingDesignPrice400 = 38.1;

            o1sectionPlanFragmentTime = 23.1;
            o1sectionPlanFragmentPrice = 14.67;

            o1basementPlanTime50 = 15.3;
            o1basementPlanPrice50 = 9.72;
            o1basementPlanTime100 = 11.9;
            o1basementPlanPrice100 = 7.56;
            o1basementPlanTime200 = 9.4;
            o1basementPlanPrice200 = 5.97;

            o1nonRepeatFloorPlanTime50 = 21;
            o1nonRepeatFloorPlanPrice50 = 13.34;
            o1nonRepeatFloorPlanTime100 = 16.1;
            o1nonRepeatFloorPlanPrice100 = 10.22;
            o1nonRepeatFloorPlanTime200 = 12.9;
            o1nonRepeatFloorPlanPrice200 = 8.19;

            o1repeatFloorPlanTime50 = 16.8;
            o1repeatFloorPlanPrice50 = 10.67;
            o1repeatFloorPlanTime100 = 13.3;
            o1repeatFloorPlanPrice100 = 8.45;
            o1repeatFloorPlanTime200 = 10.5;
            o1repeatFloorPlanPrice200 = 6.67;

            o1roofingDesignTime100 = 3.5;
            o1roofingDesignPrice100 = 2.22;
            o1roofingDesignTime200 = 1.75;
            o1roofingDesignPrice200 = 1.11;
            o1roofingDesignTime400 = 1.05;
            o1roofingDesignPrice400 = 66.7;

            o2sectionPlanFragmentTime = 29.7;
            o2sectionPlanFragmentPrice = 18.86;

            o2basementPlanTime50 = 19.7;
            o2basementPlanPrice50 = 12.51;
            o2basementPlanTime100 = 15.3;
            o2basementPlanPrice100 = 9.72;
            o2basementPlanTime200 = 12.1;
            o2basementPlanPrice200 = 7.68;

            o2nonRepeatFloorPlanTime50 = 27;
            o2nonRepeatFloorPlanPrice50 = 17.14;
            o2nonRepeatFloorPlanTime100 = 20.7;
            o2nonRepeatFloorPlanPrice100 = 13.14;
            o2nonRepeatFloorPlanTime200 = 16.6;
            o2nonRepeatFloorPlanPrice200 = 10.54;

            o2repeatFloorPlanTime50 = 21.6;
            o2repeatFloorPlanPrice50 = 13.78;
            o2repeatFloorPlanTime100 = 17.1;
            o2repeatFloorPlanPrice100 = 10.86;
            o2repeatFloorPlanTime200 = 13.5;
            o2repeatFloorPlanPrice200 = 8.57;

            o2roofingDesignTime100 = 4.5;
            o2roofingDesignPrice100 = 2.86;
            o2roofingDesignTime200 = 2.25;
            o2roofingDesignPrice200 = 1.43;
            o2roofingDesignTime400 = 1.35;
            o2roofingDesignPrice400 = 85.7;
        }

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"<html>План здания площадью до 100 м²</html>", "", "", "", ""},

                {"", "<html>План секций, фрагмент<br> плана:</html>", "", "", ""},
                {"77", "M 1 : 50", jobRank1, sectionPlanFragmentTime, sectionPlanFragmentPrice},

                {"", "<html>План подвала:</html>", "", "", ""},
                {"78", "M 1 : 50", jobRank1, basementPlanTime50, basementPlanPrice50},
                {"79", "M 1 : 100", jobRank1, basementPlanTime100, basementPlanPrice100},
                {"80", "M 1 : 200", jobRank1, basementPlanTime200, basementPlanPrice200},

                {"", "<html>План неповторяющегося<br> этажа:</html>", "", "", ""},
                {"81", "M 1 : 50", jobRank1, nonRepeatFloorPlanTime50, nonRepeatFloorPlanPrice50},
                {"82", "M 1 : 100", jobRank1, nonRepeatFloorPlanTime100, nonRepeatFloorPlanPrice100},
                {"83", "M 1 : 200", jobRank1, nonRepeatFloorPlanTime200, nonRepeatFloorPlanPrice200},

                {"", "<html>План повторяющегося<br> этажа:</html>", "", "", ""},
                {"84", "M 1 : 50", jobRank1, repeatFloorPlanTime50, repeatFloorPlanPrice50},
                {"85", "M 1 : 100", jobRank1, repeatFloorPlanTime100, repeatFloorPlanPrice100},
                {"86", "M 1 : 200", jobRank1, repeatFloorPlanTime200, repeatFloorPlanPrice200},

                {"", "<html>План кровли:</html>", "", "", ""},
                {"87", "M 1 : 100", jobRank2, roofingDesignTime100, roofingDesignPrice100},
                {"88", "M 1 : 200", jobRank2, roofingDesignTime200, roofingDesignPrice200},
                {"89", "M 1 : 400", jobRank2, roofingDesignTime400, roofingDesignPrice400},

                {"<html>План здания площадью более 100 до 200 м²</html>", "", "", "", ""},

                {"", "<html>План секций, фрагмент<br> плана:</html>", "", "", ""},
                {"90", "M 1 : 50", jobRank1, o1sectionPlanFragmentTime, o1sectionPlanFragmentPrice},

                {"", "<html>План подвала:</html>", "", "", ""},
                {"91", "M 1 : 50", jobRank1, o1basementPlanTime50, o1basementPlanPrice50},
                {"92", "M 1 : 100", jobRank1, o1basementPlanTime100, o1basementPlanPrice100},
                {"93", "M 1 : 200", jobRank1, o1basementPlanTime200, o1basementPlanPrice200},

                {"", "<html>План неповторяющегося<br> этажа:</html>", "", "", ""},
                {"94", "M 1 : 50", jobRank1, o1nonRepeatFloorPlanTime50, o1nonRepeatFloorPlanPrice50},
                {"95", "M 1 : 100", jobRank1, o1nonRepeatFloorPlanTime100, o1nonRepeatFloorPlanPrice100},
                {"96", "M 1 : 200", jobRank1, o1nonRepeatFloorPlanTime200, o1nonRepeatFloorPlanPrice200},

                {"", "<html>План повторяющегося<br> этажа:</html>", "", "", ""},
                {"97", "M 1 : 50", jobRank1, o1repeatFloorPlanTime50, o1repeatFloorPlanPrice50},
                {"98", "M 1 : 100", jobRank1, o1repeatFloorPlanTime100, o1repeatFloorPlanPrice100},
                {"99", "M 1 : 200", jobRank1, o1repeatFloorPlanTime200, o1repeatFloorPlanPrice200},

                {"", "<html>План кровли:</html>", "", "", ""},
                {"100", "M 1 : 100", jobRank2, o1roofingDesignTime100, o1roofingDesignPrice100},
                {"101", "M 1 : 200", jobRank2, o1roofingDesignTime200, o1roofingDesignPrice200},
                {"102", "M 1 : 400", jobRank2, o1roofingDesignTime400, o1roofingDesignPrice400},

                {"<html>План здания площадью более 200 до 300 м²</html>", "", "", "", ""},

                {"", "<html>План секций, фрагмент<br> плана:</html>", "", "", ""},
                {"103", "M 1 : 50", jobRank1, o2sectionPlanFragmentTime, o2sectionPlanFragmentPrice},

                {"", "<html>План подвала:</html>", "", "", ""},
                {"104", "M 1 : 50", jobRank1, o2basementPlanTime50, o2basementPlanPrice50},
                {"105", "M 1 : 100", jobRank1, o2basementPlanTime100, o2basementPlanPrice100},
                {"106", "M 1 : 200", jobRank1, o2basementPlanTime200, o2basementPlanPrice200},

                {"", "<html>План неповторяющегося<br> этажа:</html>", "", "", ""},
                {"107", "M 1 : 50", jobRank1, o2nonRepeatFloorPlanTime50, o2nonRepeatFloorPlanPrice50},
                {"108", "M 1 : 100", jobRank1, o2nonRepeatFloorPlanTime100, o2nonRepeatFloorPlanPrice100},
                {"109", "M 1 : 200", jobRank1, o2nonRepeatFloorPlanTime200, o2nonRepeatFloorPlanPrice200},

                {"", "<html>План повторяющегося<br> этажа:</html>", "", "", ""},
                {"110", "M 1 : 50", jobRank1, o2repeatFloorPlanTime50, o2repeatFloorPlanPrice50},
                {"111", "M 1 : 100", jobRank1, o2repeatFloorPlanTime100, o2repeatFloorPlanPrice100},
                {"112", "M 1 : 200", jobRank1, o2repeatFloorPlanTime200, o2repeatFloorPlanPrice200},

                {"", "<html>План кровли:</html>", "", "", ""},
                {"113", "M 1 : 100", jobRank2, o2roofingDesignTime100, o2roofingDesignPrice100},
                {"114", "M 1 : 200", jobRank2, o2roofingDesignTime200, o2roofingDesignPrice200},
                {"115", "M 1 : 400", jobRank2, o2roofingDesignTime400, o2roofingDesignPrice400},
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
