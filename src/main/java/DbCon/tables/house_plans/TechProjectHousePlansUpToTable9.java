//Планы здания до 300 м². Технический проект табл. 9

package DbCon.tables.house_plans;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class TechProjectHousePlansUpToTable9 extends JFrame {

    double coef1;
    double coef2;
    double coef3;
    double coef4;


    String jobRank;

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

    double o2roofingDesignTime200;
    double o2roofingDesignPrice200;
    double o2roofingDesignTime400;
    double o2roofingDesignPrice400;

    public TechProjectHousePlansUpToTable9(final int answear, double coef1, double coef2, double coef3, double coef4) {
        final int param = answear;

        if (param == 1) {
            jobRank = "III";

            sectionPlanFragmentTime = 6.8;
            sectionPlanFragmentPrice = 3.14;

            basementPlanTime50 = 4.4;
            basementPlanPrice50 = 2.03;
            basementPlanTime100 = 3;
            basementPlanPrice100 = 1.39;
            basementPlanTime200 = 1.8;
            basementPlanPrice200 = 83.2;

            nonRepeatFloorPlanTime50 = 6.2;
            nonRepeatFloorPlanPrice50 = 2.86;
            nonRepeatFloorPlanTime100 = 4.2;
            nonRepeatFloorPlanPrice100 = 1.94;
            nonRepeatFloorPlanTime200 = 2.64;
            nonRepeatFloorPlanPrice200 = 1.22;

            repeatFloorPlanTime50 = 5.8;
            repeatFloorPlanPrice50 = 2.68;
            repeatFloorPlanTime100 = 3.9;
            repeatFloorPlanPrice100 = 1.8;
            repeatFloorPlanTime200 = 2.34;
            repeatFloorPlanPrice200 = 1.08;

            roofingDesignTime200 = 0.48;
            roofingDesignPrice200 = 22.2;
            roofingDesignTime400 = 0.28;
            roofingDesignPrice400 = 12.9;

            o1sectionPlanFragmentTime = 12.2;
            o1sectionPlanFragmentPrice = 5.64;

            o1basementPlanTime50 = 7.7;
            o1basementPlanPrice50 = 3.56;
            o1basementPlanTime100 = 5.25;
            o1basementPlanPrice100 = 2.43;
            o1basementPlanTime200 = 3.15;
            o1basementPlanPrice200 = 1.46;

            o1nonRepeatFloorPlanTime50 = 10.8;
            o1nonRepeatFloorPlanPrice50 = 4.99;
            o1nonRepeatFloorPlanTime100 = 7.35;
            o1nonRepeatFloorPlanPrice100 = 3.40;
            o1nonRepeatFloorPlanTime200 = 4.62;
            o1nonRepeatFloorPlanPrice200 = 2.13;

            o1repeatFloorPlanTime50 = 10.1;
            o1repeatFloorPlanPrice50 = 4.67;
            o1repeatFloorPlanTime100 = 6.82;
            o1repeatFloorPlanPrice100 = 3.15;
            o1repeatFloorPlanTime200 = 4.1;
            o1repeatFloorPlanPrice200 = 1.89;

            o1roofingDesignTime200 = 0.84;
            o1roofingDesignPrice200 = 38.8;
            o1roofingDesignTime400 = 0.49;
            o1roofingDesignPrice400 = 22.6;

            o2sectionPlanFragmentTime = 15.6;
            o2sectionPlanFragmentPrice = 7.21;

            o2basementPlanTime50 = 9.9;
            o2basementPlanPrice50 = 4.57;
            o2basementPlanTime100 = 6.75;
            o2basementPlanPrice100 = 3.12;
            o2basementPlanTime200 = 4.05;
            o2basementPlanPrice200 = 1.87;

            o2nonRepeatFloorPlanTime50 = 13.9;
            o2nonRepeatFloorPlanPrice50 = 6.42;
            o2nonRepeatFloorPlanTime100 = 9.45;
            o2nonRepeatFloorPlanPrice100 = 4.37;
            o2nonRepeatFloorPlanTime200 = 5.94;
            o2nonRepeatFloorPlanPrice200 = 2.74;

            o2repeatFloorPlanTime50 = 13;
            o2repeatFloorPlanPrice50 = 6;
            o2repeatFloorPlanTime100 = 8.77;
            o2repeatFloorPlanPrice100 = 4.05;
            o2repeatFloorPlanTime200 = 5.57;
            o2repeatFloorPlanPrice200 = 2.57;

            o2roofingDesignTime200 = 1.08;
            o2roofingDesignPrice200 = 49.9;
            o2roofingDesignTime400 = 0.63;
            o2roofingDesignPrice400 = 29.1;
        } else if (param == 2) {
            jobRank = "IV";
            sectionPlanFragmentTime = 7.8;
            sectionPlanFragmentPrice = 4.06;
            basementPlanTime50 = 5.6;
            basementPlanPrice50 = 4.91;
            basementPlanTime100 = 4;
            basementPlanPrice100 = 2.08;
            basementPlanTime200 = 2.6;
            basementPlanPrice200 = 1.35;
            nonRepeatFloorPlanTime50 = 7.2;
            nonRepeatFloorPlanPrice50 = 3.74;
            nonRepeatFloorPlanTime100 = 5.2;
            nonRepeatFloorPlanPrice100 = 2.70;
            nonRepeatFloorPlanTime200 = 3.28;
            nonRepeatFloorPlanPrice200 = 1.71;
            repeatFloorPlanTime50 = 6;
            repeatFloorPlanPrice50 = 3.12;
            repeatFloorPlanTime100 = 4.22;
            repeatFloorPlanPrice100 = 2.19;
            repeatFloorPlanTime200 = 2.92;
            repeatFloorPlanPrice200 = 1.52;
            roofingDesignTime200 = 0.6;
            roofingDesignPrice200 = 31.2;
            roofingDesignTime400 = 0.36;
            roofingDesignPrice400 = 18.7;
            o1sectionPlanFragmentTime = 13.6;
            o1sectionPlanFragmentPrice = 7.07;
            o1basementPlanTime50 = 9.8;
            o1basementPlanPrice50 = 5.04;
            o1basementPlanTime100 = 7;
            o1basementPlanPrice100 = 3.64;
            o1basementPlanTime200 = 4.55;
            o1basementPlanPrice200 = 2.37;
            o1nonRepeatFloorPlanTime50 = 12.6;
            o1nonRepeatFloorPlanPrice50 = 6.55;
            o1nonRepeatFloorPlanTime100 = 9.1;
            o1nonRepeatFloorPlanPrice100 = 4.73;
            o1nonRepeatFloorPlanTime200 = 5.74;
            o1nonRepeatFloorPlanPrice200 = 2.98;
            o1repeatFloorPlanTime50 = 10.5;
            o1repeatFloorPlanPrice50 = 5.46;
            o1repeatFloorPlanTime100 = 7.38;
            o1repeatFloorPlanPrice100 = 3.84;
            o1repeatFloorPlanTime200 = 5.11;
            o1repeatFloorPlanPrice200 = 2.66;
            o1roofingDesignTime200 = 1.05;
            o1roofingDesignPrice200 = 54.6;
            o1roofingDesignTime400 = 0.63;
            o1roofingDesignPrice400 = 32.8;
            o2sectionPlanFragmentTime = 17.5;
            o2sectionPlanFragmentPrice = 9.10;
            o2basementPlanTime50 = 12.6;
            o2basementPlanPrice50 = 6.55;
            o2basementPlanTime100 = 9;
            o2basementPlanPrice100 = 4.68;
            o2basementPlanTime200 = 5.85;
            o2basementPlanPrice200 = 3.04;
            o2nonRepeatFloorPlanTime50 = 16.2;
            o2nonRepeatFloorPlanPrice50 = 8.42;
            o2nonRepeatFloorPlanTime100 = 11.7;
            o2nonRepeatFloorPlanPrice100 = 6.08;
            o2nonRepeatFloorPlanTime200 = 7.38;
            o2nonRepeatFloorPlanPrice200 = 3.84;
            o2repeatFloorPlanTime50 = 13.5;
            o2repeatFloorPlanPrice50 = 7.02;
            o2repeatFloorPlanTime100 = 9.49;
            o2repeatFloorPlanPrice100 = 4.94;
            o2repeatFloorPlanTime200 = 6.57;
            o2repeatFloorPlanPrice200 = 3.42;
            o2roofingDesignTime200 = 1.35;
            o2roofingDesignPrice200 = 70.2;
            o2roofingDesignTime400 = 0.81;
            o2roofingDesignPrice400 = 42.1;
        } else if (param == 3) {
            jobRank = "IV";
            sectionPlanFragmentTime = 10.4;
            sectionPlanFragmentPrice = 5.41;
            basementPlanTime50 = 6.2;
            basementPlanPrice50 = 3.22;
            basementPlanTime100 = 4.8;
            basementPlanPrice100 = 2.50;
            basementPlanTime200 = 3.2;
            basementPlanPrice200 = 1.66;
            nonRepeatFloorPlanTime50 = 9.4;
            nonRepeatFloorPlanPrice50 = 4.89;
            nonRepeatFloorPlanTime100 = 7.2;
            nonRepeatFloorPlanPrice100 = 3.74;
            nonRepeatFloorPlanTime200 = 4.22;
            nonRepeatFloorPlanPrice200 = 2.19;
            repeatFloorPlanTime50 = 6.8;
            repeatFloorPlanPrice50 = 3.54;
            repeatFloorPlanTime100 = 5.2;
            repeatFloorPlanPrice100 = 2.7;
            repeatFloorPlanTime200 = 3.26;
            repeatFloorPlanPrice200 = 1.7;
            roofingDesignTime200 = 0;
            roofingDesignPrice200 = 0;
            roofingDesignTime400 = 0;
            roofingDesignPrice400 = 0;
            o1sectionPlanFragmentTime = 18.2;
            o1sectionPlanFragmentPrice = 9.46;
            o1basementPlanTime50 = 10.8;
            o1basementPlanPrice50 = 5.62;
            o1basementPlanTime100 = 8.4;
            o1basementPlanPrice100 = 4.37;
            o1basementPlanTime200 = 5.6;
            o1basementPlanPrice200 = 2.91;
            o1nonRepeatFloorPlanTime50 = 16.4;
            o1nonRepeatFloorPlanPrice50 = 8.53;
            o1nonRepeatFloorPlanTime100 = 12.6;
            o1nonRepeatFloorPlanPrice100 = 6.55;
            o1nonRepeatFloorPlanTime200 = 7.38;
            o1nonRepeatFloorPlanPrice200 = 3.84;
            o1repeatFloorPlanTime50 = 11.9;
            o1repeatFloorPlanPrice50 = 6.19;
            o1repeatFloorPlanTime100 = 9.10;
            o1repeatFloorPlanPrice100 = 4.73;
            o1repeatFloorPlanTime200 = 5.70;
            o1repeatFloorPlanPrice200 = 2.96;
            o1roofingDesignTime200 = 0;
            o1roofingDesignPrice200 = 0;
            o1roofingDesignTime400 = 0;
            o1roofingDesignPrice400 = 0;
            o2sectionPlanFragmentTime = 23.4;
            o2sectionPlanFragmentPrice = 12.17;
            o2basementPlanTime50 = 13.9;
            o2basementPlanPrice50 = 7.23;
            o2basementPlanTime100 = 10.8;
            o2basementPlanPrice100 = 5.62;
            o2basementPlanTime200 = 7.2;
            o2basementPlanPrice200 = 3.74;
            o2nonRepeatFloorPlanTime50 = 21.1;
            o2nonRepeatFloorPlanPrice50 = 10.97;
            o2nonRepeatFloorPlanTime100 = 16.2;
            o2nonRepeatFloorPlanPrice100 = 8.42;
            o2nonRepeatFloorPlanTime200 = 9.49;
            o2nonRepeatFloorPlanPrice200 = 4.94;
            o2repeatFloorPlanTime50 = 15.3;
            o2repeatFloorPlanPrice50 = 7.96;
            o2repeatFloorPlanTime100 = 11.7;
            o2repeatFloorPlanPrice100 = 6.08;
            o2repeatFloorPlanTime200 = 7.33;
            o2repeatFloorPlanPrice200 = 3.81;
            o2roofingDesignTime200 = 0;
            o2roofingDesignPrice200 = 0;
            o2roofingDesignTime400 = 0;
            o2roofingDesignPrice400 = 0;
        }

        sectionPlanFragmentTime = sectionPlanFragmentTime * coef1 * coef2 * coef3 * coef4;
        sectionPlanFragmentPrice = sectionPlanFragmentPrice * coef1 * coef2 * coef3 * coef4;
        basementPlanTime50 = basementPlanTime50 * coef1 * coef2 * coef3 * coef4;
        basementPlanPrice50 = basementPlanPrice50 * coef1 * coef2 * coef3 * coef4;
        basementPlanTime100 = basementPlanTime100 * coef1 * coef2 * coef3 * coef4;
        basementPlanPrice100 = basementPlanPrice100 * coef1 * coef2 * coef3 * coef4;
        basementPlanTime200 = basementPlanTime200 * coef1 * coef2 * coef3 * coef4;
        basementPlanPrice200 = basementPlanPrice200 * coef1 * coef2 * coef3 * coef4;
        nonRepeatFloorPlanTime50 = nonRepeatFloorPlanTime50 * coef1 * coef2 * coef3 * coef4;
        nonRepeatFloorPlanPrice50 = nonRepeatFloorPlanPrice50 * coef1 * coef2 * coef3 * coef4;
        nonRepeatFloorPlanTime100 = nonRepeatFloorPlanTime100 * coef1 * coef2 * coef3 * coef4;
        nonRepeatFloorPlanPrice100 = nonRepeatFloorPlanPrice100 * coef1 * coef2 * coef3 * coef4;
        nonRepeatFloorPlanTime200 = nonRepeatFloorPlanTime200 * coef1 * coef2 * coef3 * coef4;
        nonRepeatFloorPlanPrice200 = nonRepeatFloorPlanPrice200 * coef1 * coef2 * coef3 * coef4;
        repeatFloorPlanTime50 = repeatFloorPlanTime50 * coef1 * coef2 * coef3 * coef4;
        repeatFloorPlanPrice50 = repeatFloorPlanPrice50 * coef1 * coef2 * coef3 * coef4;
        repeatFloorPlanTime100 = repeatFloorPlanTime100 * coef1 * coef2 * coef3 * coef4;
        repeatFloorPlanPrice100 = repeatFloorPlanPrice100 * coef1 * coef2 * coef3 * coef4;
        repeatFloorPlanTime200 = repeatFloorPlanTime200 * coef1 * coef2 * coef3 * coef4;
        repeatFloorPlanPrice200 = repeatFloorPlanPrice200 * coef1 * coef2 * coef3 * coef4;
        roofingDesignTime200 = roofingDesignTime200 * coef1 * coef2 * coef3 * coef4;
        roofingDesignPrice200 = roofingDesignPrice200 * coef1 * coef2 * coef3 * coef4;
        roofingDesignTime400 = roofingDesignTime400 * coef1 * coef2 * coef3 * coef4;
        roofingDesignPrice400 = roofingDesignPrice400 * coef1 * coef2 * coef3 * coef4;
        o1sectionPlanFragmentTime = o1sectionPlanFragmentTime * coef1 * coef2 * coef3 * coef4;
        o1sectionPlanFragmentPrice = o1sectionPlanFragmentPrice * coef1 * coef2 * coef3 * coef4;
        o1basementPlanTime50 = o1basementPlanTime50 * coef1 * coef2 * coef3 * coef4;
        o1basementPlanPrice50 = o1basementPlanPrice50 * coef1 * coef2 * coef3 * coef4;
        o1basementPlanTime100 = o1basementPlanTime100 * coef1 * coef2 * coef3 * coef4;
        o1basementPlanPrice100 = o1basementPlanPrice100 * coef1 * coef2 * coef3 * coef4;
        o1basementPlanTime200 = o1basementPlanTime200 * coef1 * coef2 * coef3 * coef4;
        o1basementPlanPrice200 = o1basementPlanPrice200 * coef1 * coef2 * coef3 * coef4;
        o1nonRepeatFloorPlanTime50 = o1nonRepeatFloorPlanTime50 * coef1 * coef2 * coef3 * coef4;
        o1nonRepeatFloorPlanPrice50 = o1nonRepeatFloorPlanPrice50 * coef1 * coef2 * coef3 * coef4;
        o1nonRepeatFloorPlanTime100 = o1nonRepeatFloorPlanTime100 * coef1 * coef2 * coef3 * coef4;
        o1nonRepeatFloorPlanPrice100 = o1nonRepeatFloorPlanPrice100 * coef1 * coef2 * coef3 * coef4;
        o1nonRepeatFloorPlanTime200 = o1nonRepeatFloorPlanTime200 * coef1 * coef2 * coef3 * coef4;
        o1nonRepeatFloorPlanPrice200 = o1nonRepeatFloorPlanPrice200 * coef1 * coef2 * coef3 * coef4;
        o1repeatFloorPlanTime50 = o1repeatFloorPlanTime50 * coef1 * coef2 * coef3 * coef4;
        o1repeatFloorPlanPrice50 = o1repeatFloorPlanPrice50 * coef1 * coef2 * coef3 * coef4;
        o1repeatFloorPlanTime100 = o1repeatFloorPlanTime100 * coef1 * coef2 * coef3 * coef4;
        o1repeatFloorPlanPrice100 = o1repeatFloorPlanPrice100 * coef1 * coef2 * coef3 * coef4;
        o1repeatFloorPlanTime200 = o1repeatFloorPlanTime200 * coef1 * coef2 * coef3 * coef4;
        o1repeatFloorPlanPrice200 = o1repeatFloorPlanPrice200 * coef1 * coef2 * coef3 * coef4;
        o1roofingDesignTime200 = o1roofingDesignTime200 * coef1 * coef2 * coef3 * coef4;
        o1roofingDesignPrice200 = o1roofingDesignPrice200 * coef1 * coef2 * coef3 * coef4;
        o1roofingDesignTime400 = o1roofingDesignTime400 * coef1 * coef2 * coef3 * coef4;
        o1roofingDesignPrice400 = o1roofingDesignPrice400 * coef1 * coef2 * coef3 * coef4;
        o2sectionPlanFragmentTime = o2sectionPlanFragmentTime * coef1 * coef2 * coef3 * coef4;
        o2sectionPlanFragmentPrice = o2sectionPlanFragmentPrice * coef1 * coef2 * coef3 * coef4;
        o2basementPlanTime50 = o2basementPlanTime50 * coef1 * coef2 * coef3 * coef4;
        o2basementPlanPrice50 = o2basementPlanPrice50 * coef1 * coef2 * coef3 * coef4;
        o2basementPlanTime100 = o2basementPlanTime100 * coef1 * coef2 * coef3 * coef4;
        o2basementPlanPrice100 = o2basementPlanPrice100 * coef1 * coef2 * coef3 * coef4;
        o2basementPlanTime200 = o2basementPlanTime200 * coef1 * coef2 * coef3 * coef4;
        o2basementPlanPrice200 = o2basementPlanPrice200 * coef1 * coef2 * coef3 * coef4;
        o2nonRepeatFloorPlanTime50 = o2nonRepeatFloorPlanTime50 * coef1 * coef2 * coef3 * coef4;
        o2nonRepeatFloorPlanPrice50 = o2nonRepeatFloorPlanPrice50 * coef1 * coef2 * coef3 * coef4;
        o2nonRepeatFloorPlanTime100 = o2nonRepeatFloorPlanTime100 * coef1 * coef2 * coef3 * coef4;
        o2nonRepeatFloorPlanPrice100 = o2nonRepeatFloorPlanPrice100 * coef1 * coef2 * coef3 * coef4;
        o2nonRepeatFloorPlanTime200 = o2nonRepeatFloorPlanTime200 * coef1 * coef2 * coef3 * coef4;
        o2nonRepeatFloorPlanPrice200 = o2nonRepeatFloorPlanPrice200 * coef1 * coef2 * coef3 * coef4;
        o2repeatFloorPlanTime50 = o2repeatFloorPlanTime50 * coef1 * coef2 * coef3 * coef4;
        o2repeatFloorPlanPrice50 = o2repeatFloorPlanPrice50 * coef1 * coef2 * coef3 * coef4;
        o2repeatFloorPlanTime100 = o2repeatFloorPlanTime100 * coef1 * coef2 * coef3 * coef4;
        o2repeatFloorPlanPrice100 = o2repeatFloorPlanPrice100 * coef1 * coef2 * coef3 * coef4;
        o2repeatFloorPlanTime200 = o2repeatFloorPlanTime200 * coef1 * coef2 * coef3 * coef4;
        o2repeatFloorPlanPrice200 = o2repeatFloorPlanPrice200 * coef1 * coef2 * coef3 * coef4;
        o2roofingDesignTime200 = o2roofingDesignTime200 * coef1 * coef2 * coef3 * coef4;
        o2roofingDesignPrice200 = o2roofingDesignPrice200 * coef1 * coef2 * coef3 * coef4;
        o2roofingDesignTime400 = o2roofingDesignTime400 * coef1 * coef2 * coef3 * coef4;
        o2roofingDesignPrice400 = o2roofingDesignPrice400 * coef1 * coef2 * coef3 * coef4;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"<html>План здания площадью до 100 м²</html>", "", "", "", ""},

                {"", "<html>План секций, фрагмент<br> плана:</html>", "", "", ""},
                {"41", "M 1 : 50", jobRank, sectionPlanFragmentTime, sectionPlanFragmentPrice},

                {"", "<html>План подвала:</html>", "", "", ""},
                {"42", "M 1 : 50", jobRank, basementPlanTime50, basementPlanPrice50},
                {"43", "M 1 : 100", jobRank, basementPlanTime100, basementPlanPrice100},
                {"44", "M 1 : 200", jobRank, basementPlanTime200, basementPlanPrice200},

                {"", "<html>План неповторяющегося<br> этажа:</html>", "", "", ""},
                {"45", "M 1 : 50", jobRank, nonRepeatFloorPlanTime50, nonRepeatFloorPlanPrice50},
                {"46", "M 1 : 100", jobRank, nonRepeatFloorPlanTime100, nonRepeatFloorPlanPrice100},
                {"47", "M 1 : 200", jobRank, nonRepeatFloorPlanTime200, nonRepeatFloorPlanPrice200},

                {"", "<html>План повторяющегося<br> этажа:</html>", "", "", ""},
                {"48", "M 1 : 50", jobRank, repeatFloorPlanTime50, repeatFloorPlanPrice50},
                {"49", "M 1 : 100", jobRank, repeatFloorPlanTime100, repeatFloorPlanPrice100},
                {"50", "M 1 : 200", jobRank, repeatFloorPlanTime200, repeatFloorPlanPrice200},

                {"", "<html>План кровли:</html>", "", "", ""},
                {"51", "M 1 : 200", jobRank, roofingDesignTime200, roofingDesignPrice200},
                {"52", "M 1 : 400", jobRank, roofingDesignTime400, roofingDesignPrice400},

                {"<html>План здания площадью более 100 до 200 м²</html>", "", "", "", ""},

                {"", "<html>План секций, фрагмент<br> плана:</html>", "", "", ""},
                {"41", "M 1 : 50", jobRank, o1sectionPlanFragmentTime, o1sectionPlanFragmentPrice},

                {"", "<html>План подвала:</html>", "", "", ""},
                {"42", "M 1 : 50", jobRank, o1basementPlanTime50, o1basementPlanPrice50},
                {"43", "M 1 : 100", jobRank, o1basementPlanTime100, o1basementPlanPrice100},
                {"44", "M 1 : 200", jobRank, o1basementPlanTime200, o1basementPlanPrice200},

                {"", "<html>План неповторяющегося<br> этажа:</html>", "", "", ""},
                {"45", "M 1 : 50", jobRank, o1nonRepeatFloorPlanTime50, o1nonRepeatFloorPlanPrice50},
                {"46", "M 1 : 100", jobRank, o1nonRepeatFloorPlanTime100, o1nonRepeatFloorPlanPrice100},
                {"47", "M 1 : 200", jobRank, o1nonRepeatFloorPlanTime200, o1nonRepeatFloorPlanPrice200},

                {"", "<html>План повторяющегося<br> этажа:</html>", "", "", ""},
                {"48", "M 1 : 50", jobRank, o1repeatFloorPlanTime50, o1repeatFloorPlanPrice50},
                {"49", "M 1 : 100", jobRank, o1repeatFloorPlanTime100, o1repeatFloorPlanPrice100},
                {"50", "M 1 : 200", jobRank, o1repeatFloorPlanTime200, o1repeatFloorPlanPrice200},

                {"", "<html>План кровли:</html>", "", "", ""},
                {"51", "M 1 : 200", jobRank, o1roofingDesignTime200, o1roofingDesignPrice200},
                {"52", "M 1 : 400", jobRank, o1roofingDesignTime400, o1roofingDesignPrice400},

                {"<html>План здания площадью более 200 до 300 м²</html>", "", "", "", ""},

                {"", "<html>План секций, фрагмент<br> плана:</html>", "", "", ""},
                {"41", "M 1 : 50", jobRank, o2sectionPlanFragmentTime, o2sectionPlanFragmentPrice},

                {"", "<html>План подвала:</html>", "", "", ""},
                {"42", "M 1 : 50", jobRank, o2basementPlanTime50, o2basementPlanPrice50},
                {"43", "M 1 : 100", jobRank, o2basementPlanTime100, o2basementPlanPrice100},
                {"44", "M 1 : 200", jobRank, o2basementPlanTime200, o2basementPlanPrice200},

                {"", "<html>План неповторяющегося<br> этажа:</html>", "", "", ""},
                {"45", "M 1 : 50", jobRank, o2nonRepeatFloorPlanTime50, o2nonRepeatFloorPlanPrice50},
                {"46", "M 1 : 100", jobRank, o2nonRepeatFloorPlanTime100, o2nonRepeatFloorPlanPrice100},
                {"47", "M 1 : 200", jobRank, o2nonRepeatFloorPlanTime200, o2nonRepeatFloorPlanPrice200},

                {"", "<html>План повторяющегося<br> этажа:</html>", "", "", ""},
                {"48", "M 1 : 50", jobRank, o2repeatFloorPlanTime50, o2repeatFloorPlanPrice50},
                {"49", "M 1 : 100", jobRank, o2repeatFloorPlanTime100, o2repeatFloorPlanPrice100},
                {"50", "M 1 : 200", jobRank, o2repeatFloorPlanTime200, o2repeatFloorPlanPrice200},

                {"", "<html>План кровли:</html>", "", "", ""},
                {"51", "M 1 : 200", jobRank, o2roofingDesignTime200, o2roofingDesignPrice200},
                {"52", "M 1 : 400", jobRank, o2roofingDesignTime400, o2roofingDesignPrice400},

        };

        JTable table = new JTable(array, columnsHeader);
        final Box contents = new Box(BoxLayout.Y_AXIS);
        JButton refreshButton = new JButton("Обновить");
        contents.add(new JScrollPane(table));
        contents.add(refreshButton);
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
