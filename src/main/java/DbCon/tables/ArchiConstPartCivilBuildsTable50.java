//Архитектурно-строительная часть гражданских зданий с подвалом табл. 50

package DbCon.tables;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class ArchiConstPartCivilBuildsTable50 extends JFrame {

    double forOneTime;
    double forOnePrice;
    String forOneJobRank;
    double forThreeTime;
    double forThreePrice;
    String forThreeJobRank;
    double forFiveTime;
    double forFivePrice;
    String forFiveJobRank;
    double forTenTime;
    double forTenPrice;
    String forTenJobRank;
    double forFifteenTime;
    double forFifteenPrice;
    String forFifteenJobRank;
    double forTwelveTime;
    double forTwelvePrice;
    String forTwelveJobRank;
    double forThirtyTime;
    double forThirtyPrice;
    String forThirtyJobRank;
    double forFiftyTime;
    double forFiftyPrice;
    String forFiftyJobRank;
    double forSeventyTime;
    double forSeventyPrice;
    String forSeventyJobRank;
    double forHundredAndMoreTime;
    double forHundredAndMorePrice;
    String forHundredAndMoreJobRank;
    double forOneTime1;
    double forOnePrice1;
    String forOneJobRank1;
    double forThreeTime1;
    double forThreePrice1;
    String forThreeJobRank1;
    double forFiveTime1;
    double forFivePrice1;
    String forFiveJobRank1;
    double forTenTime1;
    double forTenPrice1;
    String forTenJobRank1;
    double forFifteenTime1;
    double forFifteenPrice1;
    String forFifteenJobRank1;
    double forTwelveTime1;
    double forTwelvePrice1;
    String forTwelveJobRank1;
    double forThirtyTime1;
    double forThirtyPrice1;
    String forThirtyJobRank1;
    double forFiftyTime1;
    double forFiftyPrice1;
    String forFiftyJobRank1;
    double forSeventyTime1;
    double forSeventyPrice1;
    String forSeventyJobRank1;
    double forHundredAndMoreTime1;
    double forHundredAndMorePrice1;
    String forHundredAndMoreJobRank1;

    public ArchiConstPartCivilBuildsTable50(int answear, double coef1) {

        if (answear == 1) {
            forOneTime = 11.2;
            forOnePrice = 5.82;
            forOneJobRank = "IV";
            forThreeTime = 15.7;
            forThreePrice = 8.16;
            forThreeJobRank = "IV";
            forFiveTime = 18.7;
            forFivePrice = 9.72;
            forFiveJobRank = "IV";
            forTenTime = 24.6;
            forTenPrice = 12.79;
            forTenJobRank = "IV";
            forFifteenTime = 37.3;
            forFifteenPrice = 19.4;
            forFifteenJobRank = "IV";
            forTwelveTime = 42.6;
            forTwelvePrice = 22.15;
            forTwelveJobRank = "IV";
            forThirtyTime = 0;
            forThirtyPrice = 0;
            forThirtyJobRank = "";
            forFiftyTime = 0;
            forFiftyPrice = 0;
            forFiftyJobRank = "";
            forSeventyTime = 0;
            forSeventyPrice = 0;
            forSeventyJobRank = "";
            forHundredAndMoreTime = 0;
            forHundredAndMorePrice = 0;
            forHundredAndMoreJobRank = "";
            forOneTime1 = 7;
            forOnePrice1 = 3.64;
            forOneJobRank1 = "IV";
            forThreeTime1 = 9.8;
            forThreePrice1 = 5.10;
            forThreeJobRank1 = "IV";
            forFiveTime1 = 11.7;
            forFivePrice1 = 6.08;
            forFiveJobRank1 = "IV";
            forTenTime1 = 15.4;
            forTenPrice1 = 8.01;
            forTenJobRank1 = "IV";
            forFifteenTime1 = 23.3;
            forFifteenPrice1 = 12.15;
            forFifteenJobRank1 = "IV";
            forTwelveTime1 = 26.6;
            forTwelvePrice1 = 13.83;
            forTwelveJobRank1 = "IV";
            forThirtyTime1 = 0;
            forThirtyPrice1 = 0;
            forThirtyJobRank1 = "";
            forFiftyTime1 = 0;
            forFiftyPrice1 = 0;
            forFiftyJobRank1 = "";
            forSeventyTime1 = 0;
            forSeventyPrice1 = 0;
            forSeventyJobRank1 = "";
            forHundredAndMoreTime1 = 0;
            forHundredAndMorePrice1 = 0;
            forHundredAndMoreJobRank1 = "";
        } else if (answear == 2) {
            forOneTime = 0;
            forOnePrice = 0;
            forOneJobRank = "";
            forThreeTime = 0;
            forThreePrice = 0;
            forThreeJobRank = "";
            forFiveTime = 20.2;
            forFivePrice = 12.83;
            forFiveJobRank = "V";
            forTenTime = 29.9;
            forTenPrice = 18.99;
            forTenJobRank = "V";
            forFifteenTime = 47.8;
            forFifteenPrice = 30.35;
            forFifteenJobRank = "V";
            forTwelveTime = 51.2;
            forTwelvePrice = 32.51;
            forTwelveJobRank = "V";
            forThirtyTime = 63;
            forThirtyPrice = 40.04;
            forThirtyJobRank = "V";
            forFiftyTime = 80.8;
            forFiftyPrice = 51.31;
            forFiftyJobRank = "V";
            forSeventyTime = 0;
            forSeventyPrice = 0;
            forSeventyJobRank = "";
            forHundredAndMoreTime = 0;
            forHundredAndMorePrice = 0;
            forHundredAndMoreJobRank = "";
            forOneTime1 = 0;
            forOnePrice1 = 0;
            forOneJobRank1 = "";
            forThreeTime1 = 0;
            forThreePrice1 = 0;
            forThreeJobRank1 = "";
            forFiveTime1 = 12.6;
            forFivePrice1 = 8;
            forFiveJobRank1 = "V";
            forTenTime1 = 18.7;
            forTenPrice1 = 16.07;
            forTenJobRank1 = "V";
            forFifteenTime1 = 25.3;
            forFifteenPrice1 = 16.07;
            forFifteenJobRank1 = "V";
            forTwelveTime1 = 32;
            forTwelvePrice1 = 20.32;
            forTwelveJobRank1 = "V";
            forThirtyTime1 = 39.4;
            forThirtyPrice1 = 25.02;
            forThirtyJobRank1 = "V";
            forFiftyTime1 = 50.6;
            forFiftyPrice1 = 32.13;
            forFiftyJobRank1 = "V";
            forSeventyTime1 = 0;
            forSeventyPrice1 = 0;
            forSeventyJobRank1 = "";
            forHundredAndMoreTime1 = 0;
            forHundredAndMorePrice1 = 0;
            forHundredAndMoreJobRank1 = "";
        } else if (answear == 3) {
            forOneTime = 0;
            forOnePrice = 0;
            forOneJobRank = "";
            forThreeTime = 0;
            forThreePrice = 0;
            forThreeJobRank = "";
            forFiveTime = 0;
            forFivePrice = 0;
            forFiveJobRank = "";
            forTenTime = 47.8;
            forTenPrice = 30.35;
            forTenJobRank = "V";
            forFifteenTime = 57.8;
            forFifteenPrice = 36.70;
            forFifteenJobRank = "V";
            forTwelveTime = 79.5;
            forTwelvePrice = 50.48;
            forTwelveJobRank = "V";
            forThirtyTime = 89.9;
            forThirtyPrice = 57.09;
            forThirtyJobRank = "V";
            forFiftyTime = 97.4;
            forFiftyPrice = 61.85;
            forFiftyJobRank = "V";
            forSeventyTime = 114.7;
            forSeventyPrice = 72.83;
            forSeventyJobRank = "V";
            forHundredAndMoreTime = 157.4;
            forHundredAndMorePrice = 99.95;
            forHundredAndMoreJobRank = "V";
            forOneTime1 = 0;
            forOnePrice1 = 0;
            forOneJobRank1 = "";
            forThreeTime1 = 0;
            forThreePrice1 = 0;
            forThreeJobRank1 = "";
            forFiveTime1 = 0;
            forFivePrice1 = 0;
            forFiveJobRank1 = "";
            forTenTime1 = 25.3;
            forTenPrice1 = 16.07;
            forTenJobRank1 = "V";
            forFifteenTime1 = 36.1;
            forFifteenPrice1 = 22.92;
            forFifteenJobRank1 = "V";
            forTwelveTime1 = 49.7;
            forTwelvePrice1 = 31.56;
            forTwelveJobRank1 = "V";
            forThirtyTime1 = 56.2;
            forThirtyPrice1 = 35.69;
            forThirtyJobRank1 = "V";
            forFiftyTime1 = 60.9;
            forFiftyPrice1 = 38.67;
            forFiftyJobRank1 = "V";
            forSeventyTime1 = 71.7;
            forSeventyPrice1 = 45.53;
            forSeventyJobRank1 = "V";
            forHundredAndMoreTime1 = 98.4;
            forHundredAndMorePrice1 = 62.48;
            forHundredAndMoreJobRank1 = "V";
        }

        forOneTime *= coef1;
        forOnePrice *= coef1;

        forThreeTime *= coef1;
        forThreePrice *= coef1;

        forFiveTime *= coef1;
        forFivePrice *= coef1;
        forTenTime *= coef1;
        forTenPrice *= coef1;

        forFifteenTime *= coef1;
        forFifteenPrice *= coef1;

        forTwelveTime *= coef1;
        forTwelvePrice *= coef1;

        forThirtyTime *= coef1;
        forThirtyPrice *= coef1;

        forFiftyTime *= coef1;
        forFiftyPrice *= coef1;

        forSeventyTime *= coef1;
        forSeventyPrice *= coef1;

        forHundredAndMoreTime *= coef1;
        forHundredAndMorePrice *= coef1;

        forOneTime1 *= coef1;
        forOnePrice1 *= coef1;

        forThreeTime1 *= coef1;
        forThreePrice1 *= coef1;
        forFiveTime1 *= coef1;
        forFivePrice1 *= coef1;
        forTenTime1 *= coef1;
        forTenPrice1 *= coef1;

        forFifteenTime1 *= coef1;
        forFifteenPrice1 *= coef1;

        forTwelveTime1 *= coef1;
        forTwelvePrice1 *= coef1;

        forThirtyTime1 *= coef1;
        forThirtyPrice1 *= coef1;

        forFiftyTime1 *= coef1;
        forFiftyPrice1 *= coef1;

        forSeventyTime1 *= coef1;
        forSeventyPrice1 *= coef1;

        forHundredAndMoreTime1 *= coef1;
        forHundredAndMorePrice1 *= coef1;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"<html>Составление объёмов работ по архитектурно-строительной <br>" +
                        "части индивидуальных зданий с подвалом при стрительном <br>" +
                        "объёме в тыс.м³</html>", "", "", "", ""},
                {"386", "До 1", forOneJobRank, forOneTime, forOnePrice},
                {"387", "3", forThreeJobRank, forThreeTime, forThreePrice},
                {"388", "5", forFiveJobRank, forFiveTime, forFivePrice},
                {"389", "10", forTenJobRank, forTenTime, forTenPrice},
                {"390", "15", forFifteenJobRank, forFifteenTime, forFifteenPrice},
                {"391", "20", forTwelveJobRank, forTwelveTime, forTwelvePrice},
                {"392", "30", forThirtyJobRank, forThirtyTime, forThirtyPrice},
                {"393", "50", forFiftyJobRank, forFiftyTime, forFiftyPrice},
                {"394", "70", forSeventyJobRank, forSeventyTime, forSeventyPrice},
                {"395", "100 и более", forHundredAndMoreJobRank, forHundredAndMoreTime, forHundredAndMorePrice},
                {"<html>Составление объёмов работ по архитектурно-строительной<br>" +
                        "части повторно применяемых индивидуальных проектов гражданских зданий<br>" +
                        "с подвалом при стрительном объёме в тыс.м³</html>", "", "", "", ""},
                {"396", "До 1", forOneJobRank1, forOneTime1, forOnePrice1},
                {"397", "3", forThreeJobRank1, forThreeTime1, forThreePrice1},
                {"398", "5", forFiveJobRank1, forFiveTime1, forFivePrice1},
                {"399", "10", forTenJobRank1, forTenTime1, forTenPrice1},
                {"400", "15", forFifteenJobRank1, forFifteenTime1, forFifteenPrice1},
                {"401", "20", forTwelveJobRank1, forTwelveTime1, forTwelvePrice1},
                {"402", "30", forThirtyJobRank1, forThirtyTime1, forThirtyPrice1},
                {"403", "50", forFiftyJobRank1, forFiftyTime1, forFiftyPrice1},
                {"404", "70", forSeventyJobRank1, forSeventyTime1, forSeventyPrice1},
                {"405", "100 и более", forHundredAndMoreJobRank1, forHundredAndMoreTime1, forHundredAndMorePrice1}
        };

        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.setRowHeight(28);
        table.setRowHeight(0, 55);
        table.setRowHeight(11, 72);
        table.getColumnModel().getColumn(0).setMinWidth(350);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(700, 450);
        System.out.println("Вызвано");
    }
}
