//Внутренние водопровод и канализация жилых и гражданских зданий табл. 47

package DbCon.tables;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class InternalWaterSupplyTable47 extends JFrame {

    double forOneTimeV;
    double forOnePriceV;

    double forOneTimeIV;
    double forOnePriceIV;

    double forThreeTimeV;
    double forThreePriceV;

    double forThreeTimeIV;
    double forThreePriceIV;

    double forFiveTimeV;
    double forFivePriceV;

    double forFiveTimeIV;
    double forFivePriceIV;

    double forTenTimeV;
    double forTenPriceV;

    double forTenTimeIV;
    double forTenPriceIV;

    double forFiteenTimeV;
    double forFiteenPriceV;

    double forFiteenTimeIV;
    double forFiteenPriceIV;

    double forTwentyTimeV;
    double forTwentyPriceV;

    double forTwentyTimeIV;
    double forTwentyPriceIV;

    double forThirtyTimeV;
    double forThirtyPriceV;

    double forThirtyTimeIV;
    double forThirtyPriceIV;

    double forFortyTimeV;
    double forFortyPriceV;

    double forFortyTimeIV;
    double forFortyPriceIV;

    double forFiftyTimeV;
    double forFiftyPriceV;

    double forFiftyTimeIV;
    double forFiftyPriceIV;

    double forSixtyTimeV;
    double forSixtyPriceV;
    double forSeventyTimeV;
    double forSeventyPriceV;
    double forEightyTimeV;
    double forEightyPriceV;
    double forNinetyTimeV;
    double forNinetyPriceV;
    double forHundredTimeV;
    double forHundredPriceV;
    double forHundredTwentyFiveTimeV;
    double forHundredTwentyFivePriceV;
    double forHundredFiftyTimeV;
    double forHundredFiftyPriceV;

    double coef;
    double percentAll;

    public InternalWaterSupplyTable47(int answear, double coef1, double coef2, double coef3, double coef4, double coef5,
                                      double coef6, double coef7, double coef8, double percent, double percent1, double percent2,
                                      double percent3, double percent4, double percent5, double percent6, double percent7) {

        coef = coef1 * coef2 * coef3 * coef4 * coef5 * coef6 * coef7 * coef8;
        percentAll = percent + percent1 + percent2 + percent3 + percent4 + percent5 + percent6 + percent7;
        if (answear == 1) {
            forOneTimeV = 0;
            forOnePriceV = 0;
            forOneTimeIV = 5.98;
            forOnePriceIV = 3.11;
            forThreeTimeV = 0;
            forThreePriceV = 0;
            forThreeTimeIV = 12;
            forThreePriceIV = 6.24;
            forFiveTimeV = 0;
            forFivePriceV = 0;
            forFiveTimeIV = 17.3;
            forFivePriceIV = 9.00;
            forTenTimeV = 0;
            forTenPriceV = 0;
            forTenTimeIV = 22.3;
            forTenPriceIV = 11.6;
            forFiteenTimeV = 0;
            forFiteenPriceV = 0;
            forFiteenTimeIV = 27.9;
            forFiteenPriceIV = 14.51;
            forTwentyTimeV = 0;
            forTwentyPriceV = 0;
            forTwentyTimeIV = 35.1;
            forTwentyPriceIV = 18.25;
            forThirtyTimeV = 0;
            forThirtyPriceV = 0;
            forThirtyTimeIV = 40.7;
            forThirtyPriceIV = 21.16;
            forFortyTimeV = 0;
            forFortyPriceV = 0;
            forFortyTimeIV = 49.4;
            forFortyPriceIV = 25.69;
            forFiftyTimeV = 0;
            forFiftyPriceV = 0;
            forFiftyTimeIV = 56.6;
            forFiftyPriceIV = 29.43;
            forSixtyTimeV = 47.8;
            forSixtyPriceV = 30.35;
            forSeventyTimeV = 54.2;
            forSeventyPriceV = 34.42;
            forEightyTimeV = 59;
            forEightyPriceV = 37.46;
            forNinetyTimeV = 64.6;
            forNinetyPriceV = 41.02;
            forHundredTimeV = 68.6;
            forHundredPriceV = 41.56;
            forHundredTwentyFiveTimeV = 77.4;
            forHundredTwentyFivePriceV = 49.15;
            forHundredFiftyTimeV = 83;
            forHundredFiftyPriceV = 52.70;
        } else if (answear == 2) {
            forOneTimeV = 0;
            forOnePriceV = 0;
            forOneTimeIV = 7.26;
            forOnePriceIV = 3.78;
            forThreeTimeV = 0;
            forThreePriceV = 0;
            forThreeTimeIV = 15.8;
            forThreePriceIV = 8.22;
            forFiveTimeV = 0;
            forFivePriceV = 0;
            forFiveTimeIV = 24.4;
            forFivePriceIV = 12.69;
            forTenTimeV = 0;
            forTenPriceV = 0;
            forTenTimeIV = 30.9;
            forTenPriceIV = 16.07;
            forFiteenTimeV = 0;
            forFiteenPriceV = 0;
            forFiteenTimeIV = 39.1;
            forFiteenPriceIV = 20.33;
            forTwentyTimeV = 37.5;
            forTwentyPriceV = 23.81;
            forTwentyTimeIV = 0;
            forTwentyPriceIV = 0;
            forThirtyTimeV = 47.1;
            forThirtyPriceV = 29.91;
            forThirtyTimeIV = 0;
            forThirtyPriceIV = 0;
            forFortyTimeV = 57.4;
            forFortyPriceV = 36.45;
            forFortyTimeIV = 0;
            forFortyPriceIV = 0;
            forFiftyTimeV = 68.6;
            forFiftyPriceV = 43.56;
            forFiftyTimeIV = 0;
            forFiftyPriceIV = 0;
            forSixtyTimeV = 79.8;
            forSixtyPriceV = 50.67;
            forSeventyTimeV = 87.7;
            forSeventyPriceV = 55.69;
            forEightyTimeV = 95.7;
            forEightyPriceV = 60.77;
            forNinetyTimeV = 102;
            forNinetyPriceV = 64.77;
            forHundredTimeV = 112;
            forHundredPriceV = 71.12;
            forHundredTwentyFiveTimeV = 123;
            forHundredTwentyFivePriceV = 78.10;
            forHundredFiftyTimeV = 132;
            forHundredFiftyPriceV = 83.82;
        } else if (answear == 3) {
            forOneTimeV = 5.82;
            forOnePriceV = 3.7;
            forOneTimeIV = 0;
            forOnePriceIV = 0;
            forThreeTimeV = 12;
            forThreePriceV = 7.62;
            forThreeTimeIV = 0;
            forThreePriceIV = 0;
            forFiveTimeV = 19.7;
            forFivePriceV = 12.51;
            forFiveTimeIV = 0;
            forFivePriceIV = 0;
            forTenTimeV = 26;
            forTenPriceV = 16.51;
            forTenTimeIV = 0;
            forTenPriceIV = 0;
            forFiteenTimeV = 36;
            forFiteenPriceV = 22.86;
            forFiteenTimeIV = 0;
            forFiteenPriceIV = 0;
            forTwentyTimeV = 45.5;
            forTwentyPriceV = 28.89;
            forTwentyTimeIV = 0;
            forTwentyPriceIV = 0;
            forThirtyTimeV = 57.4;
            forThirtyPriceV = 36.45;
            forThirtyTimeIV = 0;
            forThirtyPriceIV = 0;
            forFortyTimeV = 74.2;
            forFortyPriceV = 47.12;
            forFortyTimeIV = 0;
            forFortyPriceIV = 0;
            forFiftyTimeV = 87.7;
            forFiftyPriceV = 55.69;
            forFiftyTimeIV = 0;
            forFiftyPriceIV = 0;
            forSixtyTimeV = 102;
            forSixtyPriceV = 64.77;
            forSeventyTimeV = 116;
            forSeventyPriceV = 73.66;
            forEightyTimeV = 129;
            forEightyPriceV = 81.92;
            forNinetyTimeV = 140;
            forNinetyPriceV = 88.90;
            forHundredTimeV = 152;
            forHundredPriceV = 96.52;
            forHundredTwentyFiveTimeV = 169;
            forHundredTwentyFivePriceV = 107.32;
            forHundredFiftyTimeV = 183;
            forHundredFiftyPriceV = 116.20;
        } else if (answear == 4) {
            forOneTimeV = 7.5;
            forOnePriceV = 4.76;
            forOneTimeIV = 0;
            forOnePriceIV = 0;
            forThreeTimeV = 14.4;
            forThreePriceV = 9.14;
            forThreeTimeIV = 0;
            forThreePriceIV = 0;
            forFiveTimeV = 21.3;
            forFivePriceV = 13.53;
            forFiveTimeIV = 0;
            forFivePriceIV = 0;
            forTenTimeV = 35.1;
            forTenPriceV = 22.29;
            forTenTimeIV = 0;
            forTenPriceIV = 0;
            forFiteenTimeV = 47.8;
            forFiteenPriceV = 30.35;
            forFiteenTimeIV = 0;
            forFiteenPriceIV = 0;
            forTwentyTimeV = 60.6;
            forTwentyPriceV = 38.48;
            forTwentyTimeIV = 0;
            forTwentyPriceIV = 0;
            forThirtyTimeV = 77.4;
            forThirtyPriceV = 49.15;
            forThirtyTimeIV = 0;
            forThirtyPriceIV = 0;
            forFortyTimeV = 95.7;
            forFortyPriceV = 60.77;
            forFortyTimeIV = 0;
            forFortyPriceIV = 0;
            forFiftyTimeV = 115;
            forFiftyPriceV = 73.02;
            forFiftyTimeIV = 0;
            forFiftyPriceIV = 0;
            forSixtyTimeV = 132;
            forSixtyPriceV = 83.82;
            forSeventyTimeV = 151;
            forSeventyPriceV = 95.88;
            forEightyTimeV = 160;
            forEightyPriceV = 101.60;
            forNinetyTimeV = 183;
            forNinetyPriceV = 116.20;
            forHundredTimeV = 199;
            forHundredPriceV = 126.36;
            forHundredTwentyFiveTimeV = 223;
            forHundredTwentyFivePriceV = 141.6;
            forHundredFiftyTimeV = 241;
            forHundredFiftyPriceV = 153.04;
        } else if (answear == 5) {
            forOneTimeV = 8.22;
            forOnePriceV = 5.22;
            forOneTimeIV = 0;
            forOnePriceIV = 0;
            forThreeTimeV = 17.3;
            forThreePriceV = 10.99;
            forThreeTimeIV = 0;
            forThreePriceIV = 0;
            forFiveTimeV = 24.4;
            forFivePriceV = 15.49;
            forFiveTimeIV = 0;
            forFivePriceIV = 0;
            forTenTimeV = 40.2;
            forTenPriceV = 25.53;
            forTenTimeIV = 0;
            forTenPriceIV = 0;
            forFiteenTimeV = 55;
            forFiteenPriceV = 34.92;
            forFiteenTimeIV = 0;
            forFiteenPriceIV = 0;
            forTwentyTimeV = 71.8;
            forTwentyPriceV = 45.59;
            forTwentyTimeIV = 0;
            forTwentyPriceIV = 0;
            forThirtyTimeV = 90;
            forThirtyPriceV = 57.15;
            forThirtyTimeIV = 0;
            forThirtyPriceIV = 0;
            forFortyTimeV = 116;
            forFortyPriceV = 73.66;
            forFortyTimeIV = 0;
            forFortyPriceIV = 0;
            forFiftyTimeV = 138;
            forFiftyPriceV = 87.63;
            forFiftyTimeIV = 0;
            forFiftyPriceIV = 0;
            forSixtyTimeV = 161;
            forSixtyPriceV = 102.24;
            forSeventyTimeV = 179;
            forSeventyPriceV = 113.66;
            forEightyTimeV = 199;
            forEightyPriceV = 126.36;
            forNinetyTimeV = 215;
            forNinetyPriceV = 136.52;
            forHundredTimeV = 234;
            forHundredPriceV = 149.59;
            forHundredTwentyFiveTimeV = 263;
            forHundredTwentyFivePriceV = 167;
            forHundredFiftyTimeV = 287;
            forHundredFiftyPriceV = 182.24;
        }

        forOneTimeV *= coef * percentAll;
        forOnePriceV *= coef * percentAll;

        forOneTimeIV *= coef * percentAll;
        forOnePriceIV *= coef * percentAll;

        forThreeTimeV *= coef * percentAll;
        forThreePriceV *= coef * percentAll;

        forThreeTimeIV *= coef * percentAll;
        forThreePriceIV *= coef * percentAll;

        forFiveTimeV *= coef * percentAll;
        forFivePriceV *= coef * percentAll;

        forFiveTimeIV *= coef * percentAll;
        forFivePriceIV *= coef * percentAll;

        forTenTimeV *= coef * percentAll;
        forTenPriceV *= coef * percentAll;

        forTenTimeIV *= coef * percentAll;
        forTenPriceIV *= coef * percentAll;

        forFiteenTimeV *= coef * percentAll;
        forFiteenPriceV *= coef * percentAll;

        forFiteenTimeIV *= coef * percentAll;
        forFiteenPriceIV *= coef * percentAll;

        forTwentyTimeV *= coef * percentAll;
        forTwentyPriceV *= coef * percentAll;

        forTwentyTimeIV *= coef * percentAll;
        forTwentyPriceIV *= coef * percentAll;

        forThirtyTimeV *= coef * percentAll;
        forThirtyPriceV *= coef * percentAll;

        forThirtyTimeIV *= coef * percentAll;
        forThirtyPriceIV *= coef * percentAll;

        forFortyTimeV *= coef * percentAll;
        forFortyPriceV *= coef * percentAll;

        forFortyTimeIV *= coef * percentAll;
        forFortyPriceIV *= coef * percentAll;

        forFiftyTimeV *= coef * percentAll;
        forFiftyPriceV *= coef * percentAll;

        forFiftyTimeIV *= coef * percentAll;
        forFiftyPriceIV *= coef * percentAll;

        forSixtyTimeV *= coef * percentAll;
        forSixtyPriceV *= coef * percentAll;
        forSeventyTimeV *= coef * percentAll;
        forSeventyPriceV *= coef * percentAll;
        forEightyTimeV *= coef * percentAll;
        forEightyPriceV *= coef * percentAll;
        forNinetyTimeV *= coef * percentAll;
        forNinetyPriceV *= coef * percentAll;
        forHundredTimeV *= coef * percentAll;
        forHundredPriceV *= coef * percentAll;
        forHundredTwentyFiveTimeV *= coef * percentAll;
        forHundredTwentyFivePriceV *= coef * percentAll;
        forHundredFiftyTimeV *= coef * percentAll;
        forHundredFiftyPriceV *= coef * percentAll;

        Object[] columnsHeader = new Object[]{"№ нормы", "Объём здания в тыс.м³", "Разряд работы", "Норма времени",
                "Расценки"};
        Object[][] array = new Object[][]{
                {"340", "До 1", "<html>V<br>IV</html>", "<html>" + forOneTimeV + "<br>" + forOneTimeIV + "</html>"
                        , "<html>" + forOnePriceV + "<br>" + forOnePriceIV + "<html>"},
                {"341", "3", "<html>V<br>IV</html>", "<html>" + forThreeTimeV + "<br>" + forThreeTimeIV + "</html>"
                        , "<html>" + forThreePriceV + "<br>" + forThreePriceIV + "</html>"},
                {"342", "5", "<html>V<br>IV</html>", "<html>" + forFiveTimeV + "<br>" + forFiveTimeIV + "</html>"
                        , "<html>" + forFivePriceV + "<br>" + forFivePriceIV + "</html>"},
                {"343", "10", "<html>V<br>IV<html>", "<html>" + forTenTimeV + "<br>" + forTenPriceIV + "</html>"
                        , "<html>" + forTenPriceV + "<br>" + forTenTimeIV + "</html>"},
                {"344", "15", "<html>V<br>IV<html>", "<html>" + forFiteenTimeV + "<br>" + forFiteenTimeIV + "</html>"
                        , "<html>" + forFiteenPriceV + "<br>" + forFiteenPriceIV + "</html>"},
                {"345", "20", "<html>V<br>IV<html>", "<html>" + forTwentyTimeV + "<br>" + forTwentyTimeIV + "</html>"
                        , "<html>" + forTwentyPriceV + "<br>" + forTwentyPriceIV + "</html>"},
                {"346", "30", "<html>V<br>IV<html>", "<html>" + forThirtyTimeV + "<br>" + forThirtyTimeIV + "</html>"
                        , "<html>" + forThirtyPriceV + "<br>" + forThirtyPriceIV + "</html>"},
                {"347", "40", "<html>V<br>IV<html>", "<html>" + forFortyTimeV + "<br>" + forFortyTimeIV + "</html>"
                        , "<html>" + forFortyPriceV + "<br>" + forFortyPriceIV + "</html>"},
                {"348", "50", "<html>V<br>IV<html>", "<html>" + forFiftyTimeV + "<br>" + forFiftyTimeIV + "</html>"
                        , "<html>" + forFiftyPriceV + "<br>" + forFiftyPriceIV + "</html>"},
                {"349", "60", "<html>V<html>", forSixtyTimeV, forSixtyPriceV},
                {"350", "70", "<html>V<html>", forSeventyTimeV, forSeventyPriceV},
                {"351", "80", "<html>V<html>", forEightyTimeV, forEightyPriceV},
                {"352", "90", "<html>V<html>", forNinetyTimeV, forNinetyPriceV},
                {"353", "100", "<html>V<html>", forHundredTimeV, forHundredPriceV},
                {"354", "125", "<html>V<html>", forHundredTwentyFiveTimeV, forHundredTwentyFivePriceV},
                {"355", "150", "<html>V<html>", forHundredFiftyTimeV, forHundredFiftyPriceV},
        };
        JTextField text = new JTextField(Double.toString(percentAll));
        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        contents.add(text);
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.setRowHeight(28);
        table.getColumnModel().getColumn(0).setMinWidth(350);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(700, 450);
        System.out.println("Вызвано");
    }
}
