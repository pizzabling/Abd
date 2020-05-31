//Секции при применении типовых и вовторно применяемых проектов табл. 49

package DbCon.tables;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class FloorsOfTheBuildingTypicalTable49 extends JFrame {

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
    double percentAll;

    public FloorsOfTheBuildingTypicalTable49(int answear, double coef1, double coef2, double coef3, double coef4, double coef5,
                                             double coef6, double percent1, double percent2, double percent3, double percent4,
                                             double percent5, double percent6, double percent7, double percent8, double percent9,
                                             double percent10, double percent11, double percent12, double percent13) {
        coef = coef1 * coef2 * coef3 * coef4 * coef5 * coef6;
        percentAll = percent1 + percent2 + percent3 + percent4 + percent5 + percent6 + percent7 + percent8 +
                percent9 + percent10 + percent11 + percent12 + percent13;

        if (answear == 1) {
            jobRank = "IV";
            oneSectionTime = 11.3;
            oneSectionPrice = 5.88;
            twoSectionTime = 12.6;
            twoSectionPrice = 6.55;
            threeSectionTime = 15;
            threeSectionPrice = 7.8;
            fourSectionTime = 16.4;
            fourSectionPrice = 8.53;
            fiveSectionTime = 0;
            fiveSectionPrice = 0;
            sixSectionTime = 0;
            sixSectionPrice = 0;
            sevenOrMoreSectionsTime = 0;
            sevenOrMoreSectionsPrice = 0;
        } else if (answear == 2) {
            jobRank = "IV";
            oneSectionTime = 13.2;
            oneSectionPrice = 6.86;
            twoSectionTime = 15;
            twoSectionPrice = 7.80;
            threeSectionTime = 17.8;
            threeSectionPrice = 9.26;
            fourSectionTime = 19.6;
            fourSectionPrice = 10.19;
            fiveSectionTime = 0;
            fiveSectionPrice = 0;
            sixSectionTime = 0;
            sixSectionPrice = 0;
            sevenOrMoreSectionsTime = 0;
            sevenOrMoreSectionsPrice = 0;
        } else if (answear == 3) {
            jobRank = "V";
            oneSectionTime = 15.5;
            oneSectionPrice = 9.84;
            twoSectionTime = 17.3;
            twoSectionPrice = 10.99;
            threeSectionTime = 20.7;
            threeSectionPrice = 13.14;
            fourSectionTime = 22.5;
            fourSectionPrice = 14.28;
            fiveSectionTime = 0;
            fiveSectionPrice = 0;
            sixSectionTime = 0;
            sixSectionPrice = 0;
            sevenOrMoreSectionsTime = 0;
            sevenOrMoreSectionsPrice = 0;
        } else if (answear == 4) {
            jobRank = "V";
            oneSectionTime = 20.1;
            oneSectionPrice = 12.76;
            twoSectionTime = 26.3;
            twoSectionPrice = 16.7;
            threeSectionTime = 31.7;
            threeSectionPrice = 20.13;
            fourSectionTime = 34.7;
            fourSectionPrice = 22.04;
            fiveSectionTime = 36.1;
            fiveSectionPrice = 22.92;
            sixSectionTime = 40.3;
            sixSectionPrice = 25.59;
            sevenOrMoreSectionsTime = 44.6;
            sevenOrMoreSectionsPrice = 28.32;
        }

        oneSectionTime *= coef * percentAll;
        oneSectionPrice *= coef * percentAll;
        twoSectionTime *= coef * percentAll;
        twoSectionPrice *= coef * percentAll;
        threeSectionTime *= coef * percentAll;
        threeSectionPrice *= coef * percentAll;
        fourSectionTime *= coef * percentAll;
        fourSectionPrice *= coef * percentAll;
        fiveSectionTime *= coef * percentAll;
        fiveSectionPrice *= coef * percentAll;
        sixSectionTime *= coef * percentAll;
        sixSectionPrice *= coef * percentAll;
        sevenOrMoreSectionsTime *= coef * percentAll;
        sevenOrMoreSectionsPrice *= coef * percentAll;

        Object[] columnsHeader = new Object[]{"Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"Составление объёмов работ по архитектурно-строительной части при применении типовых и повторно " +
                        "применяемых проектов с подвалом при количестве секций", "", "", ""},
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
