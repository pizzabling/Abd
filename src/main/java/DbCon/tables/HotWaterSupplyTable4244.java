//Горячее водоснабжение табл.42,44

package DbCon.tables;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class HotWaterSupplyTable4244 extends JFrame {

    double forOneTime;
    double forOnePrce;
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

    double forSixtyTimeIV;
    double forSixtyPriceIV;

    double forSeventyTimeV;
    double forSeventyPriceV;

    double forSeventyTimeIV;
    double forSeventyPriceIV;

    double forEightyTimeV;
    double forEightyPriceV;

    double forEightyTimeIV;
    double forEightyPriceIV;

    double forNinetyTimeV;
    double forNinetyPriceV;

    double forNinetyTimeIV;
    double forNinetyPriceIV;

    double forHundredTimeV;
    double forHundredPriceV;

    double forHundredTimeIV;
    double forHundredPriceIV;

    double forHundredTwentyFiveTimeV;
    double forHundredTwentyFivePriceV;

    double forHundredTwentyFiveTimeIV;
    double forHundredTwentyFivePriceIV;

    double forHundredFiftyTimeV;
    double forHundredFiftyPriceV;

    double forHundredFiftyTimeIV;
    double forHundredFiftyPriceIV;

    public HotWaterSupplyTable4244(int answear,double percent2ForV, double percent2ForIV) {
        if (answear == 1) {
            forOneTime = 1.09;
            forOnePrce = 69.2;
            forThreeTimeV = 1.6;
            forThreePriceV = 1.02;
            forThreeTimeIV = 1.04;
            forThreePriceIV = 54.1;
            forFiveTimeV = 2.18;
            forFivePriceV = 1.38;
            forFiveTimeIV = 1.76;
            forFivePriceIV = 91.5;
            forTenTimeV = 2.76;
            forTenPriceV = 75;
            forTenTimeIV = 2.71;
            forTenPriceIV = 1.41;
            forFiteenTimeV = 3.12;
            forFiteenPriceV = 1.98;
            forFiteenTimeIV = 3.97;
            forFiteenPriceIV = 2.03;
            forTwentyTimeV = 4.13;
            forTwentyPriceV = 2.62;
            forTwentyTimeIV = 4.55;
            forTwentyPriceIV = 2.37;
            forThirtyTimeV = 5.8;
            forThirtyPriceV = 3.68;
            forThirtyTimeIV = 6.38;
            forThirtyPriceIV = 3.32;
            forFortyTimeV = 6.52;
            forFortyPriceV = 4.14;
            forFortyTimeIV = 7.18;
            forFortyPriceIV = 3.73;
            forFiftyTimeV = 7.98;
            forFiftyPriceV = 5.07;
            forFiftyTimeIV = 3.67;
            forFiftyPriceIV = 5.03;
            forSixtyTimeV = 8.7;
            forSixtyPriceV = 5.52;
            forSixtyTimeIV = 10.4;
            forSixtyPriceIV = 5.41;
            forSeventyTimeV = 9.43;
            forSeventyPriceV = 5.99;
            forSeventyTimeIV = 10.4;
            forSeventyPriceIV = 5.41;
            forEightyTimeV = 10.1;
            forEightyPriceV = 6.41;
            forEightyTimeIV = 12;
            forEightyPriceIV = 6.24;
            forNinetyTimeV = 11.6;
            forNinetyPriceV = 7.37;
            forNinetyTimeIV = 13.6;
            forNinetyPriceIV = 7.07;
            forHundredTimeV = 13.8;
            forHundredPriceV = 8.76;
            forHundredTimeIV = 16;
            forHundredPriceIV = 8.32;
            forHundredTwentyFiveTimeV = 18.1;
            forHundredTwentyFivePriceV = 11.49;
            forHundredTwentyFiveTimeIV = 21.5;
            forHundredTwentyFivePriceIV = 11.18;
            forHundredFiftyTimeV = 22.5;
            forHundredFiftyPriceV = 14.29;
            forHundredFiftyTimeIV = 27.1;
            forHundredFiftyPriceIV = 14.09;
        } else if (answear == 2) {
            forOneTime = 1.3;
            forOnePrce = 0.82;
            forThreeTimeV = 1.88;
            forThreePriceV = 1.19;
            forThreeTimeIV = 1.76;
            forThreePriceIV = 0.91;
            forFiveTimeV = 2.61;
            forFivePriceV = 1.66;
            forFiveTimeIV = 2.47;
            forFivePriceIV = 1.28;
            forTenTimeV = 3.26;
            forTenPriceV = 2.07;
            forTenTimeIV = 3.91;
            forTenPriceIV = 2.03;
            forFiteenTimeV = 4;
            forFiteenPriceV = 2.54;
            forFiteenTimeIV = 5.58;
            forFiteenPriceIV = 2.9;
            forTwentyTimeV = 6.52;
            forTwentyPriceV = 4.14;
            forTwentyTimeIV = 6.46;
            forTwentyPriceIV = 3.36;
            forThirtyTimeV = 8.7;
            forThirtyPriceV = 5.52;
            forThirtyTimeIV = 8.77;
            forThirtyPriceIV = 4.56;
            forFortyTimeV = 10.1;
            forFortyPriceV = 6.41;
            forFortyTimeIV = 10.4;
            forFortyPriceIV = 5.41;
            forFiftyTimeV = 10.9;
            forFiftyPriceV = 6.92;
            forFiftyTimeIV = 12.8;
            forFiftyPriceIV = 6.66;
            forSixtyTimeV = 11.6;
            forSixtyPriceV = 7.37;
            forSixtyTimeIV = 14.4;
            forSixtyPriceIV = 7.49;
            forSeventyTimeV = 13.8;
            forSeventyPriceV = 8.76;
            forSeventyTimeIV = 17.6;
            forSeventyPriceIV = 9.15;
            forEightyTimeV = 15.2;
            forEightyPriceV = 9.65;
            forEightyTimeIV = 19.1;
            forEightyPriceIV = 9.93;
            forNinetyTimeV = 17.4;
            forNinetyPriceV = 11.05;
            forNinetyTimeIV = 21.5;
            forNinetyPriceIV = 11.18;
            forHundredTimeV = 20.3;
            forHundredPriceV = 12.89;
            forHundredTimeIV = 23.1;
            forHundredPriceIV = 12.01;
            forHundredTwentyFiveTimeV = 26.1;
            forHundredTwentyFivePriceV = 16.57;
            forHundredTwentyFiveTimeIV = 30.3;
            forHundredTwentyFivePriceIV = 15.76;
            forHundredFiftyTimeV = 31.9;
            forHundredFiftyPriceV = 20.26;
            forHundredFiftyTimeIV = 36.7;
            forHundredFiftyPriceIV = 19.08;
        }

        forOneTime*=percent2ForV;
        forOnePrce*=percent2ForV;
        forThreeTimeV*=percent2ForV;
        forThreePriceV*=percent2ForV;

        forThreeTimeIV*=percent2ForIV;
        forThreePriceIV*=percent2ForIV;

        forFiveTimeV*=percent2ForV;
        forFivePriceV*=percent2ForV;

        forFiveTimeIV*=percent2ForIV;
        forFivePriceIV*=percent2ForIV;

        forTenTimeV*=percent2ForV;
        forTenPriceV*=percent2ForV;

        forTenTimeIV*=percent2ForIV;
        forTenPriceIV*=percent2ForIV;

        forFiteenTimeV*=percent2ForV;
        forFiteenPriceV*=percent2ForV;

        forFiteenTimeIV*=percent2ForIV;
        forFiteenPriceIV*=percent2ForIV;

        forTwentyTimeV*=percent2ForV;
        forTwentyPriceV*=percent2ForV;

        forTwentyTimeIV*=percent2ForIV;
        forTwentyPriceIV*=percent2ForIV;

        forThirtyTimeV*=percent2ForV;
        forThirtyPriceV*=percent2ForV;

        forThirtyTimeIV*=percent2ForIV;
        forThirtyPriceIV*=percent2ForIV;

        forFortyTimeV*=percent2ForV;
        forFortyPriceV*=percent2ForV;

        forFortyTimeIV*=percent2ForIV;
        forFortyPriceIV*=percent2ForIV;

        forFiftyTimeV*=percent2ForV;
        forFiftyPriceV*=percent2ForV;

        forFiftyTimeIV*=percent2ForIV;
        forFiftyPriceIV*=percent2ForIV;

        forSixtyTimeV*=percent2ForV;
        forSixtyPriceV*=percent2ForV;

        forSixtyTimeIV*=percent2ForIV;
        forSixtyPriceIV*=percent2ForIV;

        forSeventyTimeV*=percent2ForV;
        forSeventyPriceV*=percent2ForV;

        forSeventyTimeIV*=percent2ForIV;
        forSeventyPriceIV*=percent2ForIV;

        forEightyTimeV*=percent2ForV;
        forEightyPriceV*=percent2ForV;

        forEightyTimeIV*=percent2ForIV;
        forEightyPriceIV*=percent2ForIV;

        forNinetyTimeV*=percent2ForV;
        forNinetyPriceV*=percent2ForV;

        forNinetyTimeIV*=percent2ForIV;
        forNinetyPriceIV*=percent2ForIV;

        forHundredTimeV*=percent2ForV;
        forHundredPriceV*=percent2ForV;

        forHundredTimeIV*=percent2ForIV;
        forHundredPriceIV*=percent2ForIV;

        forHundredTwentyFiveTimeV*=percent2ForV;
        forHundredTwentyFivePriceV*=percent2ForV;

        forHundredTwentyFiveTimeIV*=percent2ForIV;
        forHundredTwentyFivePriceIV*=percent2ForIV;

        forHundredFiftyTimeV*=percent2ForV;
        forHundredFiftyPriceV*=percent2ForV;

        forHundredFiftyTimeIV*=percent2ForIV;
        forHundredFiftyPriceIV*=percent2ForIV;

        Object[] columnsHeader = new Object[]{"№ нормы", "Объём здания в тыс.м³", "Разряд работы", "Норма времени",
                "Расценки"};
        Object[][] array = new Object[][]{
                {"340", "До 1", "<html>V<br></html>", forOneTime, forOnePrce},
                {"341", "3", "<html>V<br>IV</html>", "<html>" + forThreeTimeV + "<br>" + forThreePriceV + "</html>"
                        , "<html>" + forThreeTimeIV + "<br>" + forThreePriceIV + "</html>"},
                {"342", "5", "<html>V<br>IV</html>", "<html>" + forFiveTimeV + "<br>" + forFivePriceV + "</html>"
                        , "<html>" + forFiveTimeIV + "<br>" + forFivePriceIV+ "</html>"},
                {"343", "10", "<html>V<br>IV<html>", "<html>" + forTenTimeV + "<br>" + forTenPriceV + "</html>"
                        , "<html>" + forTenTimeIV + "<br>" + forTenTimeIV+ "</html>"},
                {"344", "15", "<html>V<br>IV<html>", "<html>" + forFiteenTimeV + "<br>" + forFiteenPriceV + "</html>"
                        , "<html>" + forFiteenTimeIV + "<br>" + forFiteenPriceIV+ "</html>"},
                {"345", "20", "<html>V<br>IV<html>", "<html>" + forTwentyTimeV + "<br>" + forTwentyPriceV + "</html>"
                        , "<html>" + forTwentyTimeIV + "<br>" + forTwentyPriceIV+ "</html>"},
                {"346", "30", "<html>V<br>IV<html>", "<html>" + forThirtyTimeV + "<br>" + forThirtyPriceV + "</html>"
                        , "<html>" + forThirtyTimeIV + "<br>" + forThirtyPriceIV+ "</html>"},
                {"347", "40", "<html>V<br>IV<html>", "<html>" + forFortyTimeV + "<br>" + forFortyPriceV + "</html>"
                        , "<html>" + forFortyTimeIV + "<br>" + forFortyPriceIV+ "</html>"},
                {"348", "50", "<html>V<br>IV<html>", "<html>" + forFiftyTimeV + "<br>" + forFiftyPriceV + "</html>"
                        , "<html>" + forFiftyTimeIV + "<br>" + forFiftyPriceIV+ "</html>"},
                {"349", "60", "<html>V<br>IV<html>", "<html>" + forSixtyTimeV + "<br>" + forSixtyPriceV + "</html>"
                        , "<html>" + forSixtyTimeIV + "<br>" + forSixtyPriceIV+ "</html>"},
                {"350", "70", "<html>V<br>IV<html>", "<html>" + forSeventyTimeV + "<br>" + forSeventyPriceV + "</html>"
                        , "<html>" + forSeventyTimeIV + "<br>" + forSeventyPriceIV+ "</html>"},
                {"351", "80", "<html>V<br>IV<html>", "<html>" + forEightyTimeV + "<br>" + forEightyPriceV + "</html>"
                        , "<html>" + forEightyTimeIV + "<br>" + forEightyPriceIV+ "</html>"},
                {"352", "90", "<html>V<br>IV<html>", "<html>" + forNinetyTimeV + "<br>" + forNinetyPriceV + "</html>"
                        , "<html>" + forNinetyTimeIV + "<br>" + forNinetyPriceIV+ "</html>"},
                {"353", "100", "<html>V<br>IV</html>", "<html>" + forHundredTimeV + "<br>" + forHundredPriceV + "</html>"
                        , "<html>" + forHundredTimeIV + "<br>" + forHundredPriceIV+ "</html>"},
                {"354", "125", "<html>V<br>IV</html>", "<html>" + forHundredTwentyFiveTimeV + "<br>" + forHundredTwentyFivePriceV + "</html>"
                        , "<html>" + forHundredTwentyFiveTimeIV + "<br>" + forHundredTwentyFivePriceV+ "</html>"},
                {"355", "150", "<html>V<br>IV</html>", "<html>" + forHundredFiftyTimeV + "<br>" + forHundredFiftyPriceV + "</html>"
                        , "<html>" + forHundredFiftyTimeIV + "<br>" + forHundredFiftyPriceIV + "</html>"}
        };

        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.getColumnModel().getColumn(0).setMinWidth(350);
        table.setRowHeight(2, 100);
        table.setRowHeight(29);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 17));
        setContentPane(contents);
        setSize(600, 300);
        System.out.println("Вызвано");
    }

}
