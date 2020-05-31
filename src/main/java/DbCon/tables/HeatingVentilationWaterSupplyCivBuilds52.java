//Внутренние санитарно-технические работы жилых и гражданских зданий табл.52

package DbCon.tables;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;

public class HeatingVentilationWaterSupplyCivBuilds52 extends JFrame {

    double forOneTime;
    double forOnePrice;
    double forThreeTime;
    double forThreePrice;
    double forFiveTime;
    double forFivePrice;
    double forTenTime;
    double forTenPrice;
    double forFiteenTime;
    double forFiteenPrice;
    double forTwentyTime;
    double forTwentyPrice;
    double forThirtyTime;
    double forThirtyPrice;
    double forFortyTime;
    double forFortyPrice;
    double forFiftyTime;
    double forFiftyPrice;
    double forSixtyTime;
    double forSixtyPrice;
    double forSeventyTime;
    double forSeventyPrice;
    double forEightyTime;
    double forEightyPrice;
    double forNinetyTime;
    double forNinetyPrice;
    double forHundredTime;
    double forHundredPrice;

    double forOneTime1;
    double forOnePrice1;
    double forThreeTime1;
    double forThreePrice1;
    double forFiveTime1;
    double forFivePrice1;
    double forTenTime1;
    double forTenPrice1;
    double forFiteenTime1;
    double forFiteenPrice1;
    double forTwentyTime1;
    double forTwentyPrice1;
    double forThirtyTime1;
    double forThirtyPrice1;
    double forFortyTime1;
    double forFortyPrice1;
    double forFiftyTime1;
    double forFiftyPrice1;
    double forSixtyTime1;
    double forSixtyPrice1;
    double forSeventyTime1;
    double forSeventyPrice1;
    double forEightyTime1;
    double forEightyPrice1;
    double forNinetyTime1;
    double forNinetyPrice1;
    double forHundredTime1;
    double forHundredPrice1;

    double percent;

    public HeatingVentilationWaterSupplyCivBuilds52(int answear, double coef1, double percent1, double percent2, double percent3) {

        percent = percent1 + percent2 + percent3;

        if (answear == 1) {
            forOneTime = 0.7;
            forOnePrice = 36.4;
            forThreeTime = 1.26;
            forThreePrice = 65.5;
            forFiveTime = 1.94;
            forFivePrice = 1.23;
            forTenTime = 2.62;
            forTenPrice = 1.66;
            forFiteenTime = 3.07;
            forFiteenPrice = 1.95;
            forTwentyTime = 4.43;
            forTwentyPrice = 2.81;
            forThirtyTime = 4.9;
            forThirtyPrice = 3.11;
            forFortyTime = 6.26;
            forFortyPrice = 3.98;
            forFiftyTime = 7.71;
            forFiftyPrice = 4.9;
            forSixtyTime = 8.85;
            forSixtyPrice = 5.62;
            forSeventyTime = 10.21;
            forSeventyPrice = 6.48;
            forEightyTime = 11.1;
            forEightyPrice = 7.05;
            forNinetyTime = 12.02;
            forNinetyPrice = 7.63;
            forHundredTime = 13.28;
            forHundredPrice = 8.43;
            forOneTime1 = 0.44;
            forOnePrice1 = 22.9;
            forThreeTime1 = 0.79;
            forThreePrice1 = 41.1;
            forFiveTime1 = 1.21;
            forFivePrice1 = 76.8;
            forTenTime1 = 1.64;
            forTenPrice1 = 1.04;
            forFiteenTime1 = 1.99;
            forFiteenPrice1 = 1.22;
            forTwentyTime1 = 2.77;
            forTwentyPrice1 = 1.76;
            forThirtyTime1 = 3.06;
            forThirtyPrice1 = 1.94;
            forFortyTime1 = 3.91;
            forFortyPrice1 = 2.48;
            forFiftyTime1 = 4.82;
            forFiftyPrice1 = 3.06;
            forSixtyTime1 = 5.53;
            forSixtyPrice1 = 3.51;
            forSeventyTime1 = 6.38;
            forSeventyPrice1 = 4.05;
            forEightyTime1 = 6.94;
            forEightyPrice1 = 4.41;
            forNinetyTime1 = 7.51;
            forNinetyPrice1 = 4.77;
            forHundredTime1 = 8.3;
            forHundredPrice1 = 5.27;
        } else if (answear == 2) {
            forOneTime = 0.83;
            forOnePrice = 43.2;
            forThreeTime = 2.1;
            forThreePrice = 1.09;
            forFiveTime = 2.4;
            forFivePrice = 1.52;
            forTenTime = 3.98;
            forTenPrice = 2.53;
            forFiteenTime = 4.43;
            forFiteenPrice = 2.81;
            forTwentyTime = 5.66;
            forTwentyPrice = 3.59;
            forThirtyTime = 6.26;
            forThirtyPrice = 3.98;
            forFortyTime = 7.84;
            forFortyPrice = 4.98;
            forFiftyTime = 9.98;
            forFiftyPrice = 6.34;
            forSixtyTime = 12.83;
            forSixtyPrice = 8.15;
            forSeventyTime = 14.96;
            forSeventyPrice = 9.50;
            forEightyTime = 15.09;
            forEightyPrice = 9.58;
            forNinetyTime = 16.48;
            forNinetyPrice = 10.46;
            forHundredTime = 17.6;
            forHundredPrice = 11.18;
            forOneTime1 = 0.52;
            forOnePrice1 = 0.27;
            forThreeTime1 = 1.31;
            forThreePrice1 = 68.1;
            forFiveTime1 = 1.5;
            forFivePrice1 = 95.3;
            forTenTime1 = 2.49;
            forTenPrice1 = 1.58;
            forFiteenTime1 = 2.77;
            forFiteenPrice1 = 1.76;
            forTwentyTime1 = 3.54;
            forTwentyPrice1 = 2.25;
            forThirtyTime1 = 3.91;
            forThirtyPrice1 = 2.48;
            forFortyTime1 = 4.9;
            forFortyPrice1 = 3.11;
            forFiftyTime1 = 6.24;
            forFiftyPrice1 = 3.96;
            forSixtyTime1 = 8.02;
            forSixtyPrice1 = 5.09;
            forSeventyTime1 = 9.35;
            forSeventyPrice1 = 5.94;
            forEightyTime1 = 9.43;
            forEightyPrice1 = 5.99;
            forNinetyTime1 = 10.3;
            forNinetyPrice1 = 6.54;
            forHundredTime1 = 11;
            forHundredPrice1 = 6.98;
        } else if (answear == 3) {
            forOneTime = 1.81;
            forOnePrice = 94.1;
            forThreeTime = 2.5;
            forThreePrice = 1.30;
            forFiveTime = 2.85;
            forFivePrice = 1.81;
            forTenTime = 4.9;
            forTenPrice = 3.11;
            forFiteenTime = 5.66;
            forFiteenPrice = 3.59;
            forTwentyTime = 7.02;
            forTwentyPrice = 4.46;
            forThirtyTime = 9.1;
            forThirtyPrice = 5.91;
            forFortyTime = 10.66;
            forFortyPrice = 6.77;
            forFiftyTime = 12.83;
            forFiftyPrice = 8.15;
            forSixtyTime = 14.29;
            forSixtyPrice = 9.07;
            forSeventyTime = 15.78;
            forSeventyPrice = 10.02;
            forEightyTime = 17.12;
            forEightyPrice = 10.87;
            forNinetyTime = 19.2;
            forNinetyPrice = 12.19;
            forHundredTime = 20.8;
            forHundredPrice = 13.21;
            forOneTime1 = 1.13;
            forOnePrice1 = 58.8;
            forThreeTime1 = 1.56;
            forThreePrice1 = 81.1;
            forFiveTime1 = 1.78;
            forFivePrice1 = 1.13;
            forTenTime1 = 1.06;
            forTenPrice1 = 1.94;
            forFiteenTime1 = 3.54;
            forFiteenPrice1 = 2.25;
            forTwentyTime1 = 4.39;
            forTwentyPrice1 = 2.79;
            forThirtyTime1 = 5.81;
            forThirtyPrice1 = 3.69;
            forFortyTime1 = 6.66;
            forFortyPrice1 = 4.23;
            forFiftyTime1 = 8.02;
            forFiftyPrice1 = 5.09;
            forSixtyTime1 = 8.93;
            forSixtyPrice1 = 5.67;
            forSeventyTime1 = 9.86;
            forSeventyPrice1 = 6.26;
            forEightyTime1 = 10.7;
            forEightyPrice1 = 6.80;
            forNinetyTime1 = 12;
            forNinetyPrice1 = 7.62;
            forHundredTime1 = 13;
            forHundredPrice1 = 8.24;
        } else if (answear == 4) {
            forOneTime = 0;
            forOnePrice = 0;
            forThreeTime = 3.6;
            forThreePrice = 1.87;
            forFiveTime = 4.43;
            forFivePrice = 2.81;
            forTenTime = 6.26;
            forTenPrice = 3.98;
            forFiteenTime = 8.62;
            forFiteenPrice = 5.47;
            forTwentyTime = 10.66;
            forTwentyPrice = 6.77;
            forThirtyTime = 12.83;
            forThirtyPrice = 8.15;
            forFortyTime = 16.48;
            forFortyPrice = 10.46;
            forFiftyTime = 18.56;
            forFiftyPrice = 11.79;
            forSixtyTime = 20.8;
            forSixtyPrice = 13.21;
            forSeventyTime = 22.88;
            forSeventyPrice = 14.53;
            forEightyTime = 24.96;
            forEightyPrice = 15.85;
            forNinetyTime = 27.84;
            forNinetyPrice = 17.68;
            forHundredTime = 30.72;
            forHundredPrice = 19.51;
            forOneTime1 = 0;
            forOnePrice1 = 0;
            forThreeTime1 = 2.25;
            forThreePrice1 = 1.17;
            forFiveTime1 = 2.77;
            forFivePrice1 = 1.76;
            forTenTime1 = 3.91;
            forTenPrice1 = 2.49;
            forFiteenTime1 = 5.39;
            forFiteenPrice1 = 3.42;
            forTwentyTime1 = 6.66;
            forTwentyPrice1 = 4.23;
            forThirtyTime1 = 8.02;
            forThirtyPrice1 = 5.09;
            forFortyTime1 = 10.3;
            forFortyPrice1 = 6.54;
            forFiftyTime1 = 11.6;
            forFiftyPrice1 = 7.37;
            forSixtyTime1 = 13;
            forSixtyPrice1 = 8.26;
            forSeventyTime1 = 14.3;
            forSeventyPrice1 = 9.08;
            forEightyTime1 = 15.6;
            forEightyPrice1 = 9.91;
            forNinetyTime1 = 17.4;
            forNinetyPrice1 = 11.05;
            forHundredTime1 = 19.2;
            forHundredPrice1 = 12.19;
        }

        forOneTime *= coef1 * percent;
        forOnePrice *= coef1 * percent;
        forThreeTime *= coef1 * percent;
        forThreePrice *= coef1 * percent;
        forFiveTime *= coef1 * percent;
        forFivePrice *= coef1 * percent;
        forTenTime *= coef1 * percent;
        forTenPrice *= coef1 * percent;
        forFiteenTime *= coef1 * percent;
        forFiteenPrice *= coef1 * percent;
        forTwentyTime *= coef1 * percent;
        forTwentyPrice *= coef1 * percent;
        forThirtyTime *= coef1 * percent;
        forThirtyPrice *= coef1 * percent;
        forFortyTime *= coef1 * percent;
        forFortyPrice *= coef1 * percent;
        forFiftyTime *= coef1 * percent;
        forFiftyPrice *= coef1 * percent;
        forSixtyTime *= coef1 * percent;
        forSixtyPrice *= coef1 * percent;
        forSeventyTime *= coef1 * percent;
        forSeventyPrice *= coef1 * percent;
        forEightyTime *= coef1 * percent;
        forEightyPrice *= coef1 * percent;
        forNinetyTime *= coef1 * percent;
        forNinetyPrice *= coef1 * percent;
        forHundredTime *= coef1 * percent;
        forHundredPrice *= coef1 * percent;

        forOneTime1 *= coef1 * percent;
        forOnePrice1 *= coef1 * percent;
        forThreeTime1 *= coef1 * percent;
        forThreePrice1 *= coef1 * percent;
        forFiveTime1 *= coef1 * percent;
        forFivePrice1 *= coef1 * percent;
        forTenTime1 *= coef1 * percent;
        forTenPrice1 *= coef1 * percent;
        forFiteenTime1 *= coef1 * percent;
        forFiteenPrice1 *= coef1 * percent;
        forTwentyTime1 *= coef1 * percent;
        forTwentyPrice1 *= coef1 * percent;
        forThirtyTime1 *= coef1 * percent;
        forThirtyPrice1 *= coef1 * percent;
        forFortyTime1 *= coef1 * percent;
        forFortyPrice1 *= coef1 * percent;
        forFiftyTime1 *= coef1 * percent;
        forFiftyPrice1 *= coef1 * percent;
        forSixtyTime1 *= coef1 * percent;
        forSixtyPrice1 *= coef1 * percent;
        forSeventyTime1 *= coef1 * percent;
        forSeventyPrice1 *= coef1 * percent;
        forEightyTime1 *= coef1 * percent;
        forEightyPrice1 *= coef1 * percent;
        forNinetyTime1 *= coef1 * percent;
        forNinetyPrice1 *= coef1 * percent;
        forHundredTime1 *= coef1 * percent;
        forHundredPrice1 *= coef1 * percent;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"<html>Составление объёмов работ по внутренним<br>" +
                        "санитарно-техническим устройствам индивидуальных<br>" +
                        "проектов жилых и гражданских зданий при строительном<br>" +
                        "объёме в тыс.м³</html>", "", "", "", ""},
                {"412", "До 1", "IV", forOneTime, forOnePrice},
                {"413", "3", "IV", forThreeTime, forThreePrice},
                {"414", "5", "V", forFiveTime, forFivePrice},
                {"415", "10", "V", forTenTime, forTenPrice},
                {"416", "15", "V", forFiteenTime, forFiteenPrice},
                {"417", "20", "V", forTwentyTime, forTwentyPrice},
                {"418", "30", "V", forThirtyTime, forThirtyPrice},
                {"419", "40", "V", forFortyTime, forFortyPrice},
                {"420", "50", "V", forFiftyTime, forFiftyPrice},
                {"421", "60", "V", forSixtyTime, forSixtyPrice},
                {"422", "70", "V", forSeventyTime, forSeventyPrice},
                {"423", "80", "V", forEightyTime, forEightyPrice},
                {"424", "90", "V", forNinetyTime, forNinetyPrice},
                {"425", "100 и более", "V", forHundredTime, forHundredPrice},
                {"<html>Составление объёмов работ по внутренним<br>" +
                        "санитарно-техническим устройствам при применении<br>" +
                        "типовых и повторно применяемых проектов жилых и гражданских<br>" +
                        "зданий при строительном объёме в тыс.м³</html>", "", "", "", ""},
                {"426", "До 1", "IV", forOneTime1, forOnePrice1},
                {"427", "3", "IV", forThreeTime1, forThreePrice1},
                {"428", "5", "V", forFiveTime1, forFivePrice1},
                {"429", "10", "V", forTenTime1, forTenPrice1},
                {"430", "15", "V", forFiteenTime1, forFiteenPrice1},
                {"431", "20", "V", forTwentyTime1, forTwentyPrice1},
                {"432", "30", "V", forThirtyTime1, forThirtyPrice1},
                {"433", "40", "V", forFortyTime1, forFortyPrice1},
                {"434", "50", "V", forFiftyTime1, forFiftyPrice1},
                {"435", "60", "V", forSixtyTime1, forSixtyPrice1},
                {"436", "70", "V", forSeventyTime1, forSeventyPrice1},
                {"437", "80", "V", forEightyTime1, forEightyPrice1},
                {"438", "90", "V", forNinetyTime1, forNinetyPrice1},
                {"439", "100 и более", "V", forHundredTime1, forHundredPrice1},
        };

        JTextField text = new JTextField(Double.toString(percent));
        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        contents.add(text);
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.setRowHeight(28);
        table.setRowHeight(0, 55);
        table.setRowHeight(15, 55);
        table.getColumnModel().getColumn(0).setMinWidth(350);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(700, 450);
        System.out.println("Вызвано");
    }
}
