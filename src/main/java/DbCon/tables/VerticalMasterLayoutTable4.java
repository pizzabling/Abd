//Вертикальная планировка генеральная табл. 4

package DbCon.tables;

import javax.swing.*;
import java.awt.*;

public class VerticalMasterLayoutTable4 extends JFrame {

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

    public VerticalMasterLayoutTable4(int answear) {
        if (answear == 1) {
            forFiveTime = 6.9;
            forFivePrice = 3.59;
            forTenTime = 8.6;
            forTenPrice = 4.47;
            forFifteenTime = 10.3;
            forFifteenPrice = 5.36;
            forTwelveTime = 11.8;
            forTwelvePrice = 6.14;
            forTwentyFiveTime = 13.3;
            forTwentyFivePrice = 6.92;
            forThirdTime = 14.7;
            forThirdPrice = 7.64;
            forMoreThirdTime = 16;
            forMoreThirdPrice = 8.32;
        } else if (answear == 2) {
            forFiveTime = 8.5;
            forFivePrice = 4.42;
            forTenTime = 11;
            forTenPrice = 5.72;
            forFifteenTime = 13.3;
            forFifteenPrice = 6.92;
            forTwelveTime = 15.5;
            forTwelvePrice = 8.06;
            forTwentyFiveTime = 17.6;
            forTwentyFivePrice = 9.15;
            forThirdTime = 19.7;
            forThirdPrice = 10.24;
            forMoreThirdTime = 21.5;
            forMoreThirdPrice = 11.18;
        } else if (answear == 3) {
            forFiveTime = 10.8;
            forFivePrice = 5.62;
            forTenTime = 13.8;
            forTenPrice = 7.18;
            forFifteenTime = 16.7;
            forFifteenPrice = 8.68;
            forTwelveTime = 19.3;
            forTwelvePrice = 10.04;
            forTwentyFiveTime = 21.9;
            forTwentyFivePrice = 11.39;
            forThirdTime = 24.3;
            forThirdPrice = 12.64;
            forMoreThirdTime = 26.5;
            forMoreThirdPrice = 13.78;
        } else if (answear == 4) {
            forFiveTime = 13;
            forFivePrice = 6.76;
            forTenTime = 16.6;
            forTenPrice = 8.63;
            forFifteenTime = 20;
            forFifteenPrice = 10.40;
            forTwelveTime = 23.2;
            forTwelvePrice = 12.06;
            forTwentyFiveTime = 26.2;
            forTwentyFivePrice = 13.62;
            forThirdTime = 29;
            forThirdPrice = 15.08;
            forMoreThirdTime = 31.6;
            forMoreThirdPrice = 16.43;
        }
        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"<html>Схема вертикальной планировки к генеральным " +
                        "планам городов и посёлков в масштабе 1:5000 площадью в га:</html>", "", "", ""},
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
