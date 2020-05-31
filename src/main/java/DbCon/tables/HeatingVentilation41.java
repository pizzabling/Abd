//Отопление и вентиляция табл. 41
package DbCon.tables;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class HeatingVentilation41 extends JFrame {

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

    double coef;
    double percentForV;
    double percentForIV;

    public HeatingVentilation41(int answear, double coef1, double coef2, double coef3, double coef4, double coef5,
                                double coef6, double coef7, double coef8, double coef9, double coef10, double coef11,
                                double coefHeatingFor11, double coefVentFor11, double percent1ForV, double percent2ForV,
                                double percent3ForV, double percent4ForV, double percent5ForV, double percent6ForV,
                                double percent1ForIV, double percent2ForIV, double percent3ForIV, double percent4ForIV) {
        coef = coef1 * coef2 * coef3 * coef4 * coef5 * coef6 * coef7 * coef8 * coef9 * coef10 * coefHeatingFor11 * coefVentFor11;
        percentForV = percent1ForV + percent2ForV + percent3ForV + percent4ForV + percent5ForV + percent6ForV;
        percentForIV = percent1ForIV + percent2ForIV + percent3ForIV + percent4ForIV;



        if (answear == 1) {
            forOneTimeV = 2.9;
            forOnePriceV = 1.84;
            forOneTimeIV = 7.18;
            forOnePriceIV = 3.73;
            forThreeTimeV = 8.7;
            forThreePriceV = 5.52;
            forThreeTimeIV = 15.1;
            forThreePriceIV = 7.85;
            forFiveTimeV = 11.6;
            forFivePriceV = 7.37;
            forFiveTimeIV = 24.7;
            forFivePriceIV = 12.84;
            forTenTimeV = 15.2;
            forTenPriceV = 3.65;
            forTenTimeIV = 35.1;
            forTenPriceIV = 18.25;
            forFiteenTimeV = 18.1;
            forFiteenPriceV = 11.49;
            forFiteenTimeIV = 38.3;
            forFiteenPriceIV = 19.92;
            forTwentyTimeV = 19.6;
            forTwentyPriceV = 12.45;
            forTwentyTimeIV = 53.4;
            forTwentyPriceIV = 27.77;
            forThirtyTimeV = 25.4;
            forThirtyPriceV = 16.13;
            forThirtyTimeIV = 65.4;
            forThirtyPriceIV = 34.02;
            forFortyTimeV = 31.9;
            forFortyPriceV = 20.26;
            forFortyTimeIV = 82.9;
            forFortyPriceIV = 43.11;
            forFiftyTimeV = 39.2;
            forFiftyPriceV = 24.89;
            forFiftyTimeIV = 103;
            forFiftyPriceIV = 53.56;
            forSixtyTimeV = 46.4;
            forSixtyPriceV = 29.46;
            forSixtyTimeIV = 126;
            forSixtyPriceIV = 65.52;
            forSeventyTimeV = 54.4;
            forSeventyPriceV = 34.54;
            forSeventyTimeIV = 141;
            forSeventyPriceIV = 73.32;
            forEightyTimeV = 58.7;
            forEightyPriceV = 17.28;
            forEightyTimeIV = 155;
            forEightyPriceIV = 80.60;
            forNinetyTimeV = 63.8;
            forNinetyPriceV = 40.51;
            forNinetyTimeIV = 168;
            forNinetyPriceIV = 87.36;
            forHundredTimeV = 66.7;
            forHundredPriceV = 42.36;
            forHundredTimeIV = 185;
            forHundredPriceIV = 36.20;
            forHundredTwentyFiveTimeV = 70.3;
            forHundredTwentyFivePriceV = 44.64;
            forHundredTwentyFiveTimeIV = 207;
            forHundredTwentyFivePriceIV = 107.64;
            forHundredFiftyTimeV = 73.2;
            forHundredFiftyPriceV = 46.48;
            forHundredFiftyTimeIV = 216;
            forHundredFiftyPriceIV = 112.32;
        } else if (answear == 2) {
            forOneTimeV = 3.62;
            forOnePriceV = 2.30;
            forOneTimeIV = 8.77;
            forOnePriceIV = 4.56;
            forThreeTimeV = 9.43;
            forThreePriceV = 5.99;
            forThreeTimeIV = 18.3;
            forThreePriceIV = 9.52;
            forFiveTimeV = 13.8;
            forFivePriceV = 8.76;
            forFiveTimeIV = 31.9;
            forFivePriceIV = 16.59;
            forTenTimeV = 25.4;
            forTenPriceV = 16.13;
            forTenTimeIV = 51;
            forTenPriceIV = 26.52;
            forFiteenTimeV = 26.8;
            forFiteenPriceV = 17.02;
            forFiteenTimeIV = 59;
            forFiteenPriceIV = 30.68;
            forTwentyTimeV = 29;
            forTwentyPriceV = 18.42;
            forTwentyTimeIV = 69.4;
            forTwentyPriceIV = 36.09;
            forThirtyTimeV = 38.4;
            forThirtyPriceV = 24.38;
            forThirtyTimeIV = 83.7;
            forThirtyPriceIV = 43.52;
            forFortyTimeV = 47.9;
            forFortyPriceV = 30.42;
            forFortyTimeIV = 104;
            forFortyPriceIV = 54.08;
            forFiftyTimeV = 58.7;
            forFiftyPriceV = 37.28;
            forFiftyTimeIV = 128;
            forFiftyPriceIV = 66.56;
            forSixtyTimeV = 69.6;
            forSixtyPriceV = 44.20;
            forSixtyTimeIV = 162;
            forSixtyPriceIV = 84.24;
            forSeventyTimeV = 79;
            forSeventyPriceV = 50.17;
            forSeventyTimeIV = 176;
            forSeventyPriceIV = 91.52;
            forEightyTimeV = 86.3;
            forEightyPriceV = 54.80;
            forEightyTimeIV = 190;
            forEightyPriceIV = 98.80;
            forNinetyTimeV = 96.4;
            forNinetyPriceV = 61.21;
            forNinetyTimeIV = 210;
            forNinetyPriceIV = 109.20;
            forHundredTimeV = 104;
            forHundredPriceV = 66.04;
            forHundredTimeIV = 226;
            forHundredPriceIV = 117.52;
            forHundredTwentyFiveTimeV = 117;
            forHundredTwentyFivePriceV = 74.30;
            forHundredTwentyFiveTimeIV = 249;
            forHundredTwentyFivePriceIV = 129.48;
            forHundredFiftyTimeV = 129;
            forHundredFiftyPriceV = 81.92;
            forHundredFiftyTimeIV = 265;
            forHundredFiftyPriceIV = 137.80;
        } else if (answear == 3) {
            forOneTimeV = 12.3;
            forOnePriceV = 7.81;
            forOneTimeIV = 22.3;
            forOnePriceIV = 11.6;
            forThreeTimeV = 15.2;
            forThreePriceV = 9.65;
            forThreeTimeIV = 27.1;
            forThreePriceIV = 14.09;
            forFiveTimeV = 19.6;
            forFivePriceV = 12.45;
            forFiveTimeIV = 33.5;
            forFivePriceIV = 17.42;
            forTenTimeV = 34.1;
            forTenPriceV = 20.65;
            forTenTimeIV = 61.4;
            forTenPriceIV = 31.93;
            forFiteenTimeV = 39.1;
            forFiteenPriceV = 24.83;
            forFiteenTimeIV = 69.4;
            forFiteenPriceIV = 36.09;
            forTwentyTimeV = 47.8;
            forTwentyPriceV = 30.35;
            forTwentyTimeIV = 83.7;
            forTwentyPriceIV = 43.52;
            forThirtyTimeV = 58.7;
            forThirtyPriceV = 37.28;
            forThirtyTimeIV = 115;
            forThirtyPriceIV = 59.80;
            forFortyTimeV = 70.3;
            forFortyPriceV = 44.64;
            forFortyTimeIV = 128;
            forFortyPriceIV = 66.56;
            forFiftyTimeV = 81.9;
            forFiftyPriceV = 52.01;
            forFiftyTimeIV = 147;
            forFiftyPriceIV = 76.44;
            forSixtyTimeV = 92.1;
            forSixtyPriceV = 58.48;
            forSixtyTimeIV = 166;
            forSixtyPriceIV = 36.32;
            forSeventyTimeV = 97.2;
            forSeventyPriceV = 61.72;
            forSeventyTimeIV = 178;
            forSeventyPriceIV = 92.56;
            forEightyTimeV = 106;
            forEightyPriceV = 67.37;
            forEightyTimeIV = 195;
            forEightyPriceIV = 101.4;
            forNinetyTimeV = 116;
            forNinetyPriceV = 73.66;
            forNinetyTimeIV = 215;
            forNinetyPriceIV = 111.8;
            forHundredTimeV = 128;
            forHundredPriceV = 81.28;
            forHundredTimeIV = 242;
            forHundredPriceIV = 125.84;
            forHundredTwentyFiveTimeV = 144;
            forHundredTwentyFivePriceV = 91.44;
            forHundredTwentyFiveTimeIV = 278;
            forHundredTwentyFivePriceIV = 144.56;
            forHundredFiftyTimeV = 158;
            forHundredFiftyPriceV = 100.33;
            forHundredFiftyTimeIV = 304;
            forHundredFiftyPriceIV = 158.08;
        } else if (answear == 4) {
            forOneTimeV = 0;
            forOnePriceV = 0;
            forOneTimeIV = 0;
            forOnePriceIV = 0;
            forThreeTimeV = 19.6;
            forThreePriceV = 12.45;
            forThreeTimeIV = 35.1;
            forThreePriceIV = 18.25;
            forFiveTimeV = 26.8;
            forFivePriceV = 17.02;
            forFiveTimeIV = 45.5;
            forFivePriceIV = 23.66;
            forTenTimeV = 45.7;
            forTenPriceV = 29.02;
            forTenTimeIV = 82.9;
            forTenPriceIV = 43.11;
            forFiteenTimeV = 52.9;
            forFiteenPriceV = 33.59;
            forFiteenTimeIV = 93.3;
            forFiteenPriceIV = 48.52;
            forTwentyTimeV = 62.3;
            forTwentyPriceV = 39.56;
            forTwentyTimeIV = 113.2;
            forTwentyPriceIV = 58.86;
            forThirtyTimeV = 78.3;
            forThirtyPriceV = 49.72;
            forThirtyTimeIV = 140;
            forThirtyPriceIV = 72.80;
            forFortyTimeV = 95.7;
            forFortyPriceV = 60.77;
            forFortyTimeIV = 171;
            forFortyPriceIV = 88.92;
            forFiftyTimeV = 110;
            forFiftyPriceV = 69.85;
            forFiftyTimeIV = 198;
            forFiftyPriceIV = 102.96;
            forSixtyTimeV = 116;
            forSixtyPriceV = 73.66;
            forSixtyTimeIV = 221;
            forSixtyPriceIV = 114.92;
            forSeventyTimeV = 112;
            forSeventyPriceV = 77.47;
            forSeventyTimeIV = 238;
            forSeventyPriceIV = 123.76;
            forEightyTimeV = 132;
            forEightyPriceV = 83.82;
            forEightyTimeIV = 256;
            forEightyPriceIV = 133.12;
            forNinetyTimeV = 143;
            forNinetyPriceV = 90.80;
            forNinetyTimeIV = 274;
            forNinetyPriceIV = 142.48;
            forHundredTimeV = 168;
            forHundredPriceV = 106.68;
            forHundredTimeIV = 302;
            forHundredPriceIV = 157.04;
            forHundredTwentyFiveTimeV = 188;
            forHundredTwentyFivePriceV = 119.38;
            forHundredTwentyFiveTimeIV = 336;
            forHundredTwentyFivePriceIV = 174.72;
            forHundredFiftyTimeV = 205;
            forHundredFiftyPriceV = 130.18;
            forHundredFiftyTimeIV = 162;
            forHundredFiftyPriceIV = 188.24;
        } else if (answear == 5) {
            forOneTimeV = 0;
            forOnePriceV = 0;
            forOneTimeIV = 0;
            forOnePriceIV = 0;
            forThreeTimeV = 21.7;
            forThreePriceV = 13.78;
            forThreeTimeIV = 39.1;
            forThreePriceIV = 20.33;
            forFiveTimeV = 30.4;
            forFivePriceV = 19.30;
            forFiveTimeIV = 54.2;
            forFivePriceIV = 28.18;
            forTenTimeV = 55.1;
            forTenPriceV = 34.99;
            forTenTimeIV = 98.9;
            forTenPriceIV = 51.43;
            forFiteenTimeV = 63.1;
            forFiteenPriceV = 40.07;
            forFiteenTimeIV = 112;
            forFiteenPriceIV = 58.14;
            forTwentyTimeV = 75.4;
            forTwentyPriceV = 47.88;
            forTwentyTimeIV = 135;
            forTwentyPriceIV = 70.20;
            forThirtyTimeV = 96;
            forThirtyPriceV = 60.96;
            forThirtyTimeIV = 167;
            forThirtyPriceIV = 86.84;
            forFortyTimeV = 113;
            forFortyPriceV = 71.76;
            forFortyTimeIV = 216;
            forFortyPriceIV = 112.32;
            forFiftyTimeV = 132;
            forFiftyPriceV = 83.82;
            forFiftyTimeIV = 238;
            forFiftyPriceIV = 123.76;
            forSixtyTimeV = 148;
            forSixtyPriceV = 93.98;
            forSixtyTimeIV = 256;
            forSixtyPriceIV = 133.12;
            forSeventyTimeV = 156;
            forSeventyPriceV = 99.06;
            forSeventyTimeIV = 274;
            forSeventyPriceIV = 142.48;
            forEightyTimeV = 166;
            forEightyPriceV = 105.41;
            forEightyTimeIV = 302;
            forEightyPriceIV = 157.04;
            forNinetyTimeV = 185;
            forNinetyPriceV = 117.48;
            forNinetyTimeIV = 332;
            forNinetyPriceIV = 172.64;
            forHundredTimeV = 212;
            forHundredPriceV = 134;
            forHundredTimeIV = 366;
            forHundredPriceIV = 190.32;
            forHundredTwentyFiveTimeV = 246;
            forHundredTwentyFivePriceV = 156.21;
            forHundredTwentyFiveTimeIV = 407;
            forHundredTwentyFivePriceIV = 211.64;
            forHundredFiftyTimeV = 276;
            forHundredFiftyPriceV = 175.26;
            forHundredFiftyTimeIV = 439;
            forHundredFiftyPriceIV = 228.28;
        }

        forOneTimeV *= coef*percentForV*coef11;
        forOnePriceV *= coef*percentForV*coef11;

        forOneTimeIV *= coef*percentForIV;
        forOnePriceIV *= coef*percentForIV;

        forThreeTimeV *= coef*percentForV*coef11;
        forThreePriceV *= coef*percentForV*coef11;

        forThreeTimeIV *= coef*percentForIV;
        forThreePriceIV *= coef*percentForIV;

        forFiveTimeV *= coef*percentForV*coef11;
        forFivePriceV *= coef*percentForV*coef11;

        forFiveTimeIV *= coef*percentForIV;
        forFivePriceIV *= coef*percentForIV;

        forTenTimeV *= coef*percentForV*coef11;
        forTenPriceV *= coef*percentForV*coef11;

        forTenTimeIV *= coef*percentForIV;
        forTenPriceIV *= coef*percentForIV;

        forFiteenTimeV *= coef*percentForV*coef11;
        forFiteenPriceV *= coef*percentForV*coef11;

        forFiteenTimeIV *= coef*percentForIV;
        forFiteenPriceIV *= coef*percentForIV;

        forTwentyTimeV *= coef*percentForV*coef11;
        forTwentyPriceV *= coef*percentForV*coef11;

        forTwentyTimeIV *= coef*percentForIV;
        forTwentyPriceIV *= coef*percentForIV;

        forThirtyTimeV *= coef*percentForV*coef11;
        forThirtyPriceV *= coef*percentForV*coef11;

        forThirtyTimeIV *= coef*percentForIV;
        forThirtyPriceIV *= coef*percentForIV;

        forFortyTimeV *= coef*percentForV*coef11;
        forFortyPriceV *= coef*percentForV*coef11;

        forFortyTimeIV *= coef*percentForIV;
        forFortyPriceIV *= coef*percentForIV;

        forFiftyTimeV *= coef*percentForV*coef11;
        forFiftyPriceV *= coef*percentForV*coef11;

        forFiftyTimeIV *= coef*percentForIV;
        forFiftyPriceIV *= coef*percentForIV;

        forSixtyTimeV *= coef*percentForV*coef11;
        forSixtyPriceV *= coef*percentForV*coef11;

        forSixtyTimeIV *= coef*percentForIV;
        forSixtyPriceIV *= coef*percentForIV;

        forSeventyTimeV *= coef*percentForV*coef11;
        forSeventyPriceV *= coef*percentForV*coef11;

        forSeventyTimeIV *= coef*percentForIV;
        forSeventyPriceIV *= coef*percentForIV;

        forEightyTimeV *= coef*percentForV*coef11;
        forEightyPriceV *= coef*percentForV*coef11;

        forEightyTimeIV *= coef*percentForIV;
        forEightyPriceIV *= coef*percentForIV;

        forNinetyTimeV *= coef*percentForV*coef11;
        forNinetyPriceV *= coef*percentForV*coef11;

        forNinetyTimeIV *= coef*percentForIV;
        forNinetyPriceIV *= coef*percentForIV;

        forHundredTimeV *= coef*percentForV*coef11;
        forHundredPriceV *= coef*percentForV*coef11;

        forHundredTimeIV *= coef*percentForIV;
        forHundredPriceIV *= coef*percentForIV;

        forHundredTwentyFiveTimeV *= coef*percentForV*coef11;
        forHundredTwentyFivePriceV *= coef*percentForV*coef11;

        forHundredTwentyFiveTimeIV *= coef*percentForIV;
        forHundredTwentyFivePriceIV *= coef*percentForIV;

        forHundredFiftyTimeV *= coef*percentForV*coef11;
        forHundredFiftyPriceV *= coef*percentForV*coef11;

        forHundredFiftyTimeIV *= coef*percentForIV;
        forHundredFiftyPriceIV *= coef*percentForIV;

        Object[] columnsHeader = new Object[]{"№ нормы", "Объём здания в тыс. м³", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"324", "До 1", "<html>V<br>IV</html>", "<html>" + forOneTimeV + "<br>" + forOneTimeIV + "</html>"
                        , "<html>" + forOnePriceV + "<br>" + forOnePriceIV + "</html>"},
                {"325", "3", "<html>V<br>IV</html>", "<html>" + forThreeTimeV + "<br>" + forThreeTimeIV + "</html>"
                        , "<html>" + forThreePriceV + "<br>" + forThreePriceIV + "</html>"},
                {"326", "5", "<html>V<br>IV</html>", "<html>" + forFiveTimeV + "<br>" + forFiveTimeIV + "</html>"
                        , "<html>" + forFivePriceV + "<br>" + forFivePriceIV + "</html>"},
                {"327", "10", "<html>V<br>IV<html>", "<html>" + forTenTimeV + "<br>" + forTenTimeIV + "</html>"
                        , "<html>" + forTenPriceV + "<br>" + forTenTimeIV + "</html>"},
                {"328", "15", "<html>V<br>IV<html>", "<html>" + forFiteenTimeV + "<br>" + forFiteenTimeIV + "</html>"
                        , "<html>" + forFiteenPriceV + "<br>" + forFiteenPriceIV + "</html>"},
                {"329", "20", "<html>V<br>IV<html>", "<html>" + forTwentyTimeV + "<br>" + forTwentyTimeIV + "</html>"
                        , "<html>" + forTwentyPriceV + "<br>" + forTwentyPriceIV + "</html>"},
                {"330", "30", "<html>V<br>IV<html>", "<html>" + forThirtyTimeV + "<br>" + forThirtyTimeIV + "</html>"
                        , "<html>" + forThirtyPriceV + "<br>" + forThirtyPriceIV + "</html>"},
                {"331", "40", "<html>V<br>IV<html>", "<html>" + forFortyTimeV + "<br>" + forFortyTimeIV + "</html>"
                        , "<html>" + forFortyPriceV + "<br>" + forFortyPriceIV + "</html>"},
                {"332", "50", "<html>V<br>IV<html>", "<html>" + forFiftyTimeV + "<br>" + forFiftyTimeIV + "</html>"
                        , "<html>" + forFiftyPriceV + "<br>" + forFiftyPriceIV + "</html>"},
                {"333", "60", "<html>V<br>IV<html>", "<html>" + forSixtyTimeV + "<br>" + forSixtyTimeIV + "</html>"
                        , "<html>" + forSixtyPriceV + "<br>" + forSixtyPriceIV + "</html>"},
                {"334", "70", "<html>V<br>IV<html>", "<html>" + forSeventyTimeV + "<br>" + forSeventyTimeIV + "</html>"
                        , "<html>" + forSeventyPriceV + "<br>" + forSeventyPriceIV + "</html>"},
                {"335", "80", "<html>V<br>IV<html>", "<html>" + forEightyTimeV + "<br>" + forEightyTimeIV + "</html>"
                        , "<html>" + forEightyPriceV + "<br>" + forEightyPriceIV + "</html>"},
                {"336", "90", "<html>V<br>IV<html>", "<html>" + forNinetyTimeV + "<br>" + forNinetyTimeIV + "</html>"
                        , "<html>" + forNinetyPriceV + "<br>" + forNinetyPriceIV + "</html>"},
                {"337", "100", "<html>V<br>IV</html>", "<html>" + forHundredTimeV + "<br>" + forHundredTimeIV + "</html>"
                        , "<html>" + forHundredPriceV + "<br>" + forHundredPriceIV + "</html>"},
                {"338", "125", "<html>V<br>IV</html>", "<html>" + forHundredTwentyFiveTimeV + "<br>" + forHundredTwentyFiveTimeIV + "</html>"
                        , "<html>" + forHundredTwentyFivePriceV + "<br>" + forHundredTwentyFivePriceV + "</html>"},
                {"339", "150", "<html>V<br>IV</html>", "<html>" + forHundredFiftyTimeV + "<br>" + forHundredFiftyTimeIV + "</html>"
                        , "<html>" + forHundredFiftyPriceV + "<br>" + forHundredFiftyPriceIV + "</html>"}

        };
//        JTextField percentForV = new JTextField("percentForV: "+ Double.toString(percentForV));
//        JTextField percentForIV = new JTextField("percentForIV: "+ Double.toString(percentForIV));
        JTextField coefText = new JTextField(Double.toString(coef));

        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
//        contents.add(percentForV);
//        contents.add(percentForIV);
        contents.add(coefText);
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.setRowHeight(2, 100);
        table.setRowHeight(29);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 17));
        setContentPane(contents);
        setSize(600, 300);
        System.out.println("Вызвано");
    }
}
