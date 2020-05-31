//Районная планировка табл. 1

package DbCon.tables;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class DistrictLayoutTable1 extends JFrame {

    double districtLayoutTime1;
    double districtLayoutPrice1;
    double districtLayoutTime2;
    double districtLayoutPrice2;
    double executionPreSchemeTime;
    double executionPreSchemePrice;
    double mascaraPaintTime1;
    double mascaraPaintPrice1;
    double migratePlanToPlanTime1;
    double migratePlanToPlanPrice1;
    double drawExcursionsTime;
    double drawExcursionsPrice;
    double mascaraPaintTime2;
    double mascaraPaintPrice2;
    double migratePlanToPlanTime2;
    double migratePlanToPlanPrice2;
    double graphPrepairTime;
    double graphPrepairPrice;
    double mascaraPaintTime3;
    double mascaraPaintPrice3;
    double migratePlanToPlanTime3;
    double migratePlanToPlanPrice3;

    double percent;

    public DistrictLayoutTable1(double answear, double percent1, double percent2) {
        if (answear == 1) {
            districtLayoutTime1 = 728;
            districtLayoutPrice1 = 378.56;
            districtLayoutTime2 = 1500;
            districtLayoutPrice2 = 693;
            executionPreSchemeTime = 376;
            executionPreSchemePrice = 195.52;
            mascaraPaintTime1 = 138;
            mascaraPaintPrice1 = 63.76;
            migratePlanToPlanTime1 = 359;
            migratePlanToPlanPrice1 = 165.86;
            drawExcursionsTime = 285;
            drawExcursionsPrice = 131.67;
            mascaraPaintTime2 = 200;
            mascaraPaintPrice2 = 92.40;
            migratePlanToPlanTime2 = 411;
            migratePlanToPlanPrice2 = 189.88;
            graphPrepairTime = 352;
            graphPrepairPrice = 183.04;
            mascaraPaintTime3 = 11.9;
            mascaraPaintPrice3 = 5.50;
            migratePlanToPlanTime3 = 95.1;
            migratePlanToPlanPrice3 = 43.94;
        } else if (answear == 2) {
            districtLayoutTime1 = 1266;
            districtLayoutPrice1 = 658.32;
            districtLayoutTime2 = 2611;
            districtLayoutPrice2 = 1206.28;
            executionPreSchemeTime = 654;
            executionPreSchemePrice = 340.08;
            mascaraPaintTime1 = 240;
            mascaraPaintPrice1 = 110.88;
            migratePlanToPlanTime1 = 624;
            migratePlanToPlanPrice1 = 288.29;
            drawExcursionsTime = 500;
            drawExcursionsPrice = 231;
            mascaraPaintTime2 = 347;
            mascaraPaintPrice2 = 160.31;
            migratePlanToPlanTime2 = 715;
            migratePlanToPlanPrice2 = 330.33;
            graphPrepairTime = 612;
            graphPrepairPrice = 318.24;
            mascaraPaintTime3 = 20;
            mascaraPaintPrice3 = 9.24;
            migratePlanToPlanTime3 = 165;
            migratePlanToPlanPrice3 = 76.23;
        } else if (answear == 3) {
            districtLayoutTime1 = 1457;
            districtLayoutPrice1 = 757.64;
            districtLayoutTime2 = 3005;
            districtLayoutPrice2 = 1388.31;
            executionPreSchemeTime = 752;
            executionPreSchemePrice = 391.04;
            mascaraPaintTime1 = 276;
            mascaraPaintPrice1 = 127.51;
            migratePlanToPlanTime1 = 718;
            migratePlanToPlanPrice1 = 331.72;
            drawExcursionsTime = 575;
            drawExcursionsPrice = 265.65;
            mascaraPaintTime2 = 399;
            mascaraPaintPrice2 = 184.34;
            migratePlanToPlanTime2 = 823;
            migratePlanToPlanPrice2 = 380.23;
            graphPrepairTime = 705;
            graphPrepairPrice = 366.60;
            mascaraPaintTime3 = 24;
            mascaraPaintPrice3 = 11.09;
            migratePlanToPlanTime3 = 190;
            migratePlanToPlanPrice3 = 87.78;
        }


        migratePlanToPlanTime1 *= percent1;
        migratePlanToPlanPrice1 *= percent1;

        mascaraPaintTime2 *= percent2;
        mascaraPaintPrice2 *= percent2;

        migratePlanToPlanTime2 *= percent1;
        migratePlanToPlanPrice2 *= percent1;

        mascaraPaintTime3 *= percent2;
        mascaraPaintPrice3 *= percent2;

        migratePlanToPlanTime3 *= percent1;
        migratePlanToPlanPrice3 *= percent1;

        Object[] columnsHeader = new Object[]{"Наименование работы", "Разряд работы", "Норма времени", "Расценка"};
        Object[][] array = new Object[][]{
                {"Районная планировка", "IV", districtLayoutTime1, districtLayoutPrice1},
                {"", "III", districtLayoutTime2, districtLayoutPrice2},
                {"<html>План современного использования территории<br>" +
                        "района по готовой основе<br><html>", "", "", ""},
                {"Выполнение предварительной схемы", "IV", executionPreSchemeTime, executionPreSchemePrice},
                {"Оформление в туши и красках", "III", mascaraPaintTime1, mascaraPaintPrice1},
                {"Перенесение с пална на план и оформление в туши и красках", "III", migratePlanToPlanTime1, migratePlanToPlanPrice1},
                {"Проектный план района на готовой основе", "", "", ""},
                {"Нанесение экскихов с проектных данных на план или на готовую основу", "III", drawExcursionsTime, drawExcursionsPrice},
                {"Оформление в туши и красках", "III", mascaraPaintTime2, mascaraPaintPrice2},
                {"Перенесение с плана на план и оформление в туши и красках", "III", migratePlanToPlanTime2, migratePlanToPlanPrice2},
                {"Карта планировочных ограничений на готовой основе", "", "", ""},
                {"Графическая подготовка материалов", "IV", graphPrepairTime, graphPrepairPrice},
                {"Оформление в туши и красках", "III", mascaraPaintTime3, mascaraPaintPrice3},
                {"Перенсение с плана на план и оформление в туши и красках", "III", migratePlanToPlanTime3, migratePlanToPlanPrice3}
        };

        JTextField textField1 = new JTextField(Double.toString(percent1));
        JTextField textField2 = new JTextField(Double.toString(percent2));

        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        contents.add(textField1);
        contents.add(textField2);
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.getColumnModel().getColumn(0).setMinWidth(350);
        table.setRowHeight(25);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(800, 430);
        System.out.println("Вызвано");


    }
}
