//Вертикальная планировка к проектам застройки жилых районов, микрорайонов, кварталов и отдельных
//участков на стадии рабочих чертежей в масштабе 1 : 500 табл. 7
package DbCon.tables;

import javax.swing.*;
import java.awt.*;

public class LandDevStageWorkingDrawsTable7 extends JFrame {

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

    public LandDevStageWorkingDrawsTable7(int answear, double percent, double coef1, double coef2, double coef3) {
        coef = coef1 * coef2 * coef3;

        if (answear == 1) {
            forOneTime = 26.9;
            forOnePrice = 17.08;
            forTwoTime = 54.1;
            forTwoPrice = 34.35;
            forThreeTime = 81;
            forThreePrice = 51.44;
            forFiveTime = 135;
            forFivePrice = 85.72;
            forTenTime = 256;
            forTenPrice = 162.56;
            forFifteenTime = 370;
            forFifteenPrice = 234.95;
            forTwelveTime = 478;
            forTwelvePrice = 303.53;
            forTwentyFiveTime = 579;
            forTwentyFivePrice = 367.66;
            forThirdTime = 674;
            forThirdPrice = 427.99;
            forMoreThirdTime = 763;
            forMoreThirdPrice = 484.50;
        } else if (answear == 2) {
            forOneTime = 34;
            forOnePrice = 21.59;
            forTwoTime = 68;
            forTwoPrice = 43.18;
            forThreeTime = 102;
            forThreePrice = 64.77;
            forFiveTime = 170;
            forFivePrice = 107.95;
            forTenTime = 322;
            forTenPrice = 204.47;
            forFifteenTime = 465;
            forFifteenPrice = 295.28;
            forTwelveTime = 601;
            forTwelvePrice = 381.64;
            forTwentyFiveTime = 729;
            forTwentyFivePrice = 462.92;
            forThirdTime = 848;
            forThirdPrice = 538.48;
            forMoreThirdTime = 960;
            forMoreThirdPrice = 609.60;
        } else if (answear == 3) {
            forOneTime = 44.5;
            forOnePrice = 28.26;
            forTwoTime = 89;
            forTwoPrice = 56.52;
            forThreeTime = 133;
            forThreePrice = 84.46;
            forFiveTime = 222;
            forFivePrice = 140.97;
            forTenTime = 421;
            forTenPrice = 267.34;
            forFifteenTime = 609;
            forFifteenPrice = 386.72;
            forTwelveTime = 787;
            forTwelvePrice = 499.74;
            forTwentyFiveTime = 955;
            forTwentyFivePrice = 606.42;
            forThirdTime = 1111;
            forThirdPrice = 705.48;
            forMoreThirdTime = 1258;
            forMoreThirdPrice = 798.83;
        }

        forOneTime *= coef * percent;
        forOnePrice *= coef * percent;
        forTwoTime *= coef * percent;
        forTwoPrice *= coef * percent;
        forThreeTime *= coef * percent;
        forThreePrice *= coef * percent;
        forFiveTime *= coef * percent;
        forFivePrice *= coef * percent;
        forTenTime *= coef * percent;
        forTenPrice *= coef * percent;
        forFifteenTime *= coef * percent;
        forFifteenPrice *= coef * percent;
        forTwelveTime *= coef * percent;
        forTwelvePrice *= coef * percent;
        forTwentyFiveTime *= coef * percent;
        forTwentyFivePrice *= coef * percent;
        forThirdTime *= coef * percent;
        forThirdPrice *= coef * percent;
        forMoreThirdTime *= coef * percent;
        forMoreThirdPrice *= coef * percent;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"<html>Проект вертикальной планировки к проекту застройки" +
                        "и благоустройства жилого района, микрорайона, квартала" +
                        "или отдельного участка в масштабе 1 : 500 площадью в га:</html>", "", "", ""},
                {"28", "До 1", forOneTime, forOnePrice},
                {"29", "2", forTwoTime, forTwoPrice},
                {"30", "3", forThreeTime, forThreePrice},
                {"31", "5", forFiveTime, forFivePrice},
                {"32", "10", forTenTime, forTenPrice},
                {"33", "15", forFifteenTime, forFifteenPrice},
                {"34", "20", forTwelveTime, forTwelvePrice},
                {"35", "25", forTwentyFiveTime, forTwentyFivePrice},
                {"36", "30", forThirdTime, forThirdPrice},
                {"37", "более 30", forMoreThirdTime, forMoreThirdPrice}
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
