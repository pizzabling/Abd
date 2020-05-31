//Застройка районов, микрорайонов, кварталов и отдельных участков табл. 6

package DbCon.tables;

import javax.swing.*;
import java.awt.*;

public class LandDevStageTechProject6 extends JFrame {

    double forOneTime;
    double forOnePrice;
    double forTwoTime;
    double forTwoPrice;
    double forThreeTime;
    double forThreePrice;
    double forFiveTime;
    double forFivePrice;
    double forTenTime;
    double forTenPrice;
    double forFifteenTime;
    double forFifteenPrice;
    double forTwelveTime;
    double forTwelvePrice;
    double forTwentyFiveTime;
    double forTwentyFivePrice;
    double forThirdTime;
    double forThirdPrice;
    double forMoreThirdTime;
    double forMoreThirdPrice;

    double coef;

    public LandDevStageTechProject6(int answear, double percent, double coef1, double coef2, double coef3) {
        coef = coef1 * coef2 * coef3;

        if (answear == 1) {
            forOneTime = 17.5;
            forOnePrice = 9.10;
            forTwoTime = 31;
            forTwoPrice = 16.12;
            forThreeTime = 44.5;
            forThreePrice = 23.14;
            forFiveTime = 71.5;
            forFivePrice = 37.18;
            forTenTime = 136;
            forTenPrice = 70.72;
            forFifteenTime = 196;
            forFifteenPrice = 101.92;
            forTwelveTime = 254;
            forTwelvePrice = 132.08;
            forTwentyFiveTime = 308;
            forTwentyFivePrice = 160.16;
            forThirdTime = 358;
            forThirdPrice = 186.16;
            forMoreThirdTime = 405;
            forMoreThirdPrice = 210.60;
        } else if (answear == 2) {
            forOneTime = 22.9;
            forOnePrice = 11.91;
            forTwoTime = 40.6;
            forTwoPrice = 21.11;
            forThreeTime = 58.3;
            forThreePrice = 30.32;
            forFiveTime = 93.7;
            forFivePrice = 48.72;
            forTenTime = 178;
            forTenPrice = 92.56;
            forFifteenTime = 257;
            forFifteenPrice = 133.64;
            forTwelveTime = 333;
            forTwelvePrice = 173.16;
            forTwentyFiveTime = 403;
            forTwentyFivePrice = 209.56;
            forThirdTime = 470;
            forThirdPrice = 244.40;
            forMoreThirdTime = 532;
            forMoreThirdPrice = 276.64;
        } else if (answear == 3) {
            forOneTime = 27.2;
            forOnePrice = 14.14;
            forTwoTime = 47.8;
            forTwoPrice = 24.86;
            forThreeTime = 68.5;
            forThreePrice = 35.62;
            forFiveTime = 110;
            forFivePrice = 57.05;
            forTenTime = 208;
            forTenPrice = 108.16;
            forFifteenTime = 300;
            forFifteenPrice = 156.00;
            forTwelveTime = 388;
            forTwelvePrice = 201.76;
            forTwentyFiveTime = 471;
            forTwentyFivePrice = 244.92;
            forThirdTime = 548;
            forThirdPrice = 284.96;
            forMoreThirdTime = 620;
            forMoreThirdPrice = 322.40;
        }

        forOneTime *= percent * coef;
        forOnePrice *= percent * coef;
        forTwoTime *= percent * coef;
        forTwoPrice *= percent * coef;
        forThreeTime *= percent * coef;
        forThreePrice *= percent * coef;
        forFiveTime *= percent * coef;
        forFivePrice *= percent * coef;
        forTenTime *= percent * coef;
        forTenPrice *= percent * coef;
        forFifteenTime *= percent * coef;
        forFifteenPrice *= percent * coef;
        forTwelveTime *= percent * coef;
        forTwelvePrice *= percent * coef;
        forTwentyFiveTime *= percent * coef;
        forTwentyFivePrice *= percent * coef;
        forThirdTime *= percent * coef;
        forThirdPrice *= percent * coef;
        forMoreThirdTime *= percent * coef;
        forMoreThirdPrice *= percent * coef;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"<html>Проект вертикальной планировки к проекту застройки" +
                        "и благоустройства жилого района, микрорайона, квартала" +
                        "или отдельного участка в масштабе 1 : 100 площадью в га:</html>", "", "", ""},
                {"18", "До 1", forOneTime, forOnePrice},
                {"19", "2", forTwoTime, forTwoPrice},
                {"20", "3", forThreeTime, forThreePrice},
                {"21", "5", forFiveTime, forFivePrice},
                {"22", "10", forTenTime, forTenPrice},
                {"23", "15", forFifteenTime, forFifteenPrice},
                {"24", "20", forTwelveTime, forTwelvePrice},
                {"25", "25", forTwentyFiveTime, forTwentyFivePrice},
                {"26", "30", forThirdTime, forThirdPrice},
                {"27", "более 30", forMoreThirdTime, forMoreThirdPrice}
        };
        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
//        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.getColumnModel().getColumn(0).setMinWidth(350);
        table.setRowHeight(0, 44);
//        table.setRowHeight(29);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(600, 300);
        System.out.println("Вызвано");
    }
}
