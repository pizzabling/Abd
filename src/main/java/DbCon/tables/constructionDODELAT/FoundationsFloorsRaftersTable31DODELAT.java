//Фундаменты, перекрытия, стропила табл. 31

package DbCon.tables.constructionDODELAT;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class FoundationsFloorsRaftersTable31DODELAT extends JFrame {

    String jobRank;

    double foundationPlanTime;
    double foundationPlanPrice;

    double foundationDevelopmentTime;
    double foundationDevelopmentPrice;

    double foundationSectionsTime;
    double foundationSectionsPrice;

    double floorPlanTime;
    double floorPlanPrice;

    double rafterPlanTime;
    double rafterPlanPrice;

    double coef;

    public FoundationsFloorsRaftersTable31DODELAT(int answer302, int answer303304, int answer305306, double coef1, double coef2, double coef3, double coef4, double coef5, double coef6, double coef7, double coef8, double coef9, double coef10, double coef11, double coef12, double coef13) {

        coef = coef1 * coef2 * coef3 * coef4 * coef5 * coef6 * coef7 * coef8 * coef9 * coef10 * coef11 * coef12 * coef13;

        if (answer302 == 1) {
            jobRank = "IV";
            foundationPlanTime = 1.68;
            foundationPlanPrice = 87.4;

        } else if (answer302 == 2) {
            jobRank = "IV";
            foundationPlanTime = 2.46;
            foundationPlanPrice = 1.28;

        } else if (answer302 == 3) {
            jobRank = "V";
            foundationPlanTime = 2.58;
            foundationPlanPrice = 1.64;

        }

        if (answer303304 == 1) {
            jobRank = "IV";
            foundationDevelopmentTime = 0.24;
            foundationDevelopmentPrice = 12.5;

            foundationSectionsTime = 0.4;
            foundationSectionsPrice = 20.8;

        } else if (answer303304 == 2) {
            jobRank = "IV";
            foundationDevelopmentTime = 0.45;
            foundationDevelopmentPrice = 23.4;

            foundationSectionsTime = 0.7;
            foundationSectionsPrice = 36.4;

        } else if (answer303304 == 3) {
            jobRank = "V";
            foundationDevelopmentTime = 0.73;
            foundationDevelopmentPrice = 46.4;

            foundationSectionsTime = 0.88;
            foundationSectionsPrice = 55.9;

        }

        if (answer305306 == 1) {
            jobRank = "V";
            floorPlanTime = 1.31;
            floorPlanPrice = 68.1;

            rafterPlanTime = 2.27;
            rafterPlanPrice = 1.18;

        } else if (answer305306 == 2) {
            jobRank = "V";
            floorPlanTime = 2.1;
            floorPlanPrice = 1.09;

            rafterPlanTime = 2.74;
            rafterPlanPrice = 1.42;

        } else if (answer305306 == 3) {
            jobRank = "V";
            floorPlanTime = 2.01;
            floorPlanPrice = 1.28;

            rafterPlanTime = 2.79;
            rafterPlanPrice = 1.77;
        }
        foundationPlanTime *= coef1 * coef2 * coef3 * coef4 * coef5 * coef9 * coef10 * coef11 * coef12 * coef13;
        foundationPlanPrice *= coef1 * coef2 * coef3 * coef4 * coef5 * coef9 * coef10 * coef11 * coef12 * coef13;

        foundationDevelopmentTime *= coef1;
        foundationDevelopmentPrice *= coef1;

        foundationSectionsTime *= coef1;
        foundationSectionsPrice *= coef1;

        floorPlanTime *= coef6 * coef7 * coef9 * coef10 * coef11 * coef12 * coef13;
        floorPlanPrice *= coef6 * coef7 * coef9 * coef10 * coef11 * coef12 * coef13;

        rafterPlanTime *= coef8 * coef9 * coef10 * coef11 * coef12 * coef13;
        rafterPlanPrice *= coef8 * coef9 * coef10 * coef11 * coef12 * coef13;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Измеритель", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"302", "План фундаментов (М 1 : 100)", "100 м²", jobRank, foundationPlanTime, foundationPlanPrice},
                {"303", "Развёртка фундаментов (М 1 : 100)", "10 м", jobRank, foundationDevelopmentTime, foundationDevelopmentPrice},
                {"304", "Сечения фундаментов (М 1 : 20)", "сечение", jobRank, foundationSectionsTime, foundationSectionsPrice},
                {"305", "План перекрытий (М 1 : 100)", jobRank, "100 м²", floorPlanTime, floorPlanPrice},
                {"306", "План стропил (М 1 : 100)", "-", jobRank, rafterPlanTime, rafterPlanTime}
        };
        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.getColumnModel().getColumn(1).setMinWidth(350);
        table.setRowHeight(28);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(800, 400);
        System.out.println("Вызвано");
    }
}
