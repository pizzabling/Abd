//Секции с индивидуальных проектов жилых зданий табл. 49

package DbCon.tables;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class FloorsOfTheBuildingIndividualTable49 extends JFrame {

    String jobRank;
    double oneSectionTime;
    double oneSectionPrice;
    double twoSectionTime;
    double twoSectionPrice;
    double threeSectionTime;
    double threeSectionPrice;
    double fourSectionTime;
    double fourSectionPrice;
    double fiveSectionTime;
    double fiveSectionPrice;
    double sixSectionTime;
    double sixSectionPrice;
    double sevenOrMoreSectionsTime;
    double sevenOrMoreSectionsPrice;

    double coef;

    public FloorsOfTheBuildingIndividualTable49(int answear, double coef1, double coef2, double coef3, double coef4,
                                                double coef5, double coef6) {

        coef = coef1 * coef2 * coef3 * coef4 * coef5 * coef6;

        if (answear == 1) {
            jobRank = "IV";
            oneSectionTime = 18.1;
            oneSectionPrice = 9.41;
            twoSectionTime = 20.2;
            twoSectionPrice = 10.50;
            threeSectionTime = 24;
            threeSectionPrice = 12.48;
            fourSectionTime = 26.2;
            fourSectionPrice = 13.62;
            fiveSectionTime = 0;
            fiveSectionPrice = 0;
            sixSectionTime = 0;
            sixSectionPrice = 0;
            sevenOrMoreSectionsTime = 0;
            sevenOrMoreSectionsPrice = 0;
        } else if (answear == 2) {
            jobRank = "IV";
            oneSectionTime = 21.1;
            oneSectionPrice = 10.97;
            twoSectionTime = 24;
            twoSectionPrice = 12.48;
            threeSectionTime = 28.5;
            threeSectionPrice = 14.82;
            fourSectionTime = 31.4;
            fourSectionPrice = 16.33;
            fiveSectionTime = 0;
            fiveSectionPrice = 0;
            sixSectionTime = 0;
            sixSectionPrice = 0;
            sevenOrMoreSectionsTime = 0;
            sevenOrMoreSectionsPrice = 0;
        } else if (answear == 3) {
            jobRank = "V";
            oneSectionTime = 24.8;
            oneSectionPrice = 15.75;
            twoSectionTime = 27.7;
            twoSectionPrice = 17.59;
            threeSectionTime = 33.1;
            threeSectionPrice = 21.02;
            fourSectionTime = 36;
            fourSectionPrice = 22.86;
            fiveSectionTime = 0;
            fiveSectionPrice = 0;
            sixSectionTime = 0;
            sixSectionPrice = 0;
            sevenOrMoreSectionsTime = 0;
            sevenOrMoreSectionsPrice = 0;
        } else if (answear == 4) {
            jobRank = "V";
            oneSectionTime = 32.2;
            oneSectionPrice = 20.45;
            twoSectionTime = 42.1;
            twoSectionPrice = 26.73;
            threeSectionTime = 50.7;
            threeSectionPrice = 32.19;
            fourSectionTime = 55.5;
            fourSectionPrice = 36.25;
            fiveSectionTime = 57.8;
            fiveSectionPrice = 36.70;
            sixSectionTime = 64.5;
            sixSectionPrice = 40.96;
            sevenOrMoreSectionsTime = 71.4;
            sevenOrMoreSectionsPrice = 45.34;
        }

        oneSectionTime *= coef;
        oneSectionPrice *= coef;
        twoSectionTime *= coef;
        twoSectionPrice *= coef;
        threeSectionTime *= coef;
        threeSectionPrice *= coef;
        fourSectionTime *= coef;
        fourSectionPrice *= coef;
        fiveSectionTime *= coef;
        fiveSectionPrice *= coef;
        sixSectionTime *= coef;
        sixSectionPrice *= coef;
        sevenOrMoreSectionsTime *= coef;
        sevenOrMoreSectionsPrice *= coef;

        Object[] columnsHeader = new Object[]{"Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"Составление объёмов работ по архитектурно-строительной части индивидуальных проектов жилых зданийй с " +
                        "подвалом при количестве секций", "", "", ""},
                {"1", jobRank, oneSectionTime, oneSectionPrice},
                {"2", jobRank, twoSectionTime, twoSectionPrice},
                {"3", jobRank, threeSectionTime, threeSectionPrice},
                {"4", jobRank, fourSectionTime, fourSectionPrice},
                {"5", jobRank, fiveSectionTime, fiveSectionPrice},
                {"6", jobRank, sixSectionTime, sixSectionPrice},
                {"7", jobRank, sevenOrMoreSectionsTime, sevenOrMoreSectionsPrice},
        };

        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.getColumnModel().getColumn(0).setMinWidth(350);
        table.setRowHeight(2, 100);
        table.setRowHeight(25);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(600, 300);
        System.out.println("Вызвано");
    }
}
