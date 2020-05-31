//Вертикальная планировка табл. 5

package DbCon.tables;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class VerticalDetailLayoutTable5 extends JFrame {

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

    public VerticalDetailLayoutTable5(int answear, double percent) {
        if (answear == 1) {
            forFiveTime = 2.6;
            forFivePrice = 1.35;
            forTenTime = 5;
            forTenPrice = 2.6;
            forFifteenTime = 7.3;
            forFifteenPrice = 3.80;
            forTwelveTime = 9.4;
            forTwelvePrice = 4.89;
            forTwentyFiveTime = 11.5;
            forTwentyFivePrice = 5.98;
            forThirdTime = 13.4;
            forThirdPrice = 6.97;
            forMoreThirdTime = 15.1;
            forMoreThirdPrice = 7.85;
        } else if (answear == 2) {
            forFiveTime = 3.3;
            forFivePrice = 1.72;
            forTenTime = 6.4;
            forTenPrice = 3.33;
            forFifteenTime = 9.3;
            forFifteenPrice = 4.84;
            forTwelveTime = 12;
            forTwelvePrice = 6.24;
            forTwentyFiveTime = 14.6;
            forTwentyFivePrice = 7.59;
            forThirdTime = 17.1;
            forThirdPrice = 8.89;
            forMoreThirdTime = 19.3;
            forMoreThirdPrice = 10.04;
        } else if (answear == 3) {
            forFiveTime = 4;
            forFivePrice = 2.08;
            forTenTime = 7.8;
            forTenPrice = 4.06;
            forFifteenTime = 11.4;
            forFifteenPrice = 5.93;
            forTwelveTime = 14.7;
            forTwelvePrice = 7.64;
            forTwentyFiveTime = 17.9;
            forTwentyFivePrice = 9.31;
            forThirdTime = 20.3;
            forThirdPrice = 10.87;
            forMoreThirdTime = 23.6;
            forMoreThirdPrice = 12.27;
        } else if (answear == 4) {
            forFiveTime = 4.5;
            forFivePrice = 2.34;
            forTenTime = 8.7;
            forTenPrice = 4.52;
            forFifteenTime = 12.7;
            forFifteenPrice = 6.60;
            forTwelveTime = 16.5;
            forTwelvePrice = 8.58;
            forTwentyFiveTime = 20;
            forTwentyFivePrice = 10.40;
            forThirdTime = 23.4;
            forThirdPrice = 12.17;
            forMoreThirdTime = 26.5;
            forMoreThirdPrice = 13.78;
        }

        forFiveTime *= percent;
        forFivePrice *= percent;
        forTenTime *= percent;
        forTenPrice *= percent;
        forFifteenTime *= percent;
        forFifteenPrice *= percent;
        forTwelveTime *= percent;
        forTwelvePrice *= percent;
        forTwentyFiveTime *= percent;
        forTwentyFivePrice *= percent;
        forThirdTime *= percent;
        forThirdPrice *= percent;
        forMoreThirdTime *= percent;
        forMoreThirdPrice *= percent;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"<html>Схема вертикальной планировки к проектам детальной" +
                        " планировки городов и посёлков в масштабе 1:2000 площадью в га:</html>", "", "", ""},
                {"11", "5", forFiveTime, forFivePrice},
                {"12", "10", forTenTime, forTenPrice},
                {"13", "15", forFifteenTime, forFifteenPrice},
                {"14", "20", forTwelveTime, forTwelvePrice},
                {"15", "25", forTwentyFiveTime, forTwentyFivePrice},
                {"16", "30", forThirdTime, forThirdPrice},
                {"17", "более 30", forMoreThirdTime, forMoreThirdPrice}
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
