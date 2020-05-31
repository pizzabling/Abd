//Фундаменты табл.25

package DbCon.tables.design_work;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class FoundationTable25 extends JFrame {

    String jobRank1;
    String jobRank2;

    double woodenPillarsTime;
    double woodenPillarsPrice;

    double rockFoundationUpTo3Time;
    double rockFoundationUpTo3Price;
    double rockFoundationUpTo6Time;
    double rockFoundationUpTo6Price;
    double rockFoundationMore6Time;
    double rockFoundationMore6Price;

    double metalFoundationUpTo6Time;
    double metalFoundationUpTo6Price;
    double metalFoundationMore6Time;
    double metalFoundationMore6Price;

    double coef;

    public FoundationTable25(int answer, double coef1, double coef2, double coef3) {

        coef = coef1 * coef2;

        if (answer == 1) {
            jobRank1 = "IV";
            jobRank2 = "V";

            woodenPillarsTime = 1.7;
            woodenPillarsPrice = 88.4;

            rockFoundationUpTo3Time = 0.98;
            rockFoundationUpTo3Price = 0.51;
            rockFoundationUpTo6Time = 1.36;
            rockFoundationUpTo6Price = 86.4;
            rockFoundationMore6Time = 2.04;
            rockFoundationMore6Price = 1.30;

            metalFoundationUpTo6Time = 2.54;
            metalFoundationUpTo6Price = 1.61;
            metalFoundationMore6Time = 3.05;
            metalFoundationMore6Price = 1.94;


        } else if (answer == 2) {
            jobRank1 = "V";
            jobRank2 = "V";

            woodenPillarsTime = 0;
            woodenPillarsPrice = 0;

            rockFoundationUpTo3Time = 1.7;
            rockFoundationUpTo3Price = 1.08;
            rockFoundationUpTo6Time = 2.54;
            rockFoundationUpTo6Price = 1.61;
            rockFoundationMore6Time = 3.39;
            rockFoundationMore6Price = 2.15;

            metalFoundationUpTo6Time = 3.77;
            metalFoundationUpTo6Price = 2.39;
            metalFoundationMore6Time = 4.62;
            metalFoundationMore6Price = 2.93;

        } else if (answer == 3) {
            jobRank1 = "V";
            jobRank2 = "V";

            woodenPillarsTime = 0;
            woodenPillarsPrice = 0;

            rockFoundationUpTo3Time = 2.54;
            rockFoundationUpTo3Price = 1.61;
            rockFoundationUpTo6Time = 3.39;
            rockFoundationUpTo6Price = 2.15;
            rockFoundationMore6Time = 4.24;
            rockFoundationMore6Price = 2.69;

            metalFoundationUpTo6Time = 5.09;
            metalFoundationUpTo6Price = 3.23;
            metalFoundationMore6Time = 5.94;
            metalFoundationMore6Price = 3.77;

        }

        woodenPillarsTime *= coef1 * coef2;
        woodenPillarsPrice *= coef1 * coef2;

        rockFoundationUpTo3Time *= coef1 * coef2;
        rockFoundationUpTo3Price *= coef1 * coef2;

        rockFoundationUpTo6Time *= coef1 * coef2;
        rockFoundationUpTo6Price *= coef1 * coef2;

        rockFoundationMore6Time *= coef1 * coef2;
        rockFoundationMore6Price *= coef1 * coef2;

        metalFoundationUpTo6Time *= coef1 * coef2;
        metalFoundationUpTo6Price *= coef1 * coef2;

        metalFoundationMore6Time *= coef1 * coef2 * coef3;
        metalFoundationMore6Price *= coef1 * coef2 * coef3;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"270", "Деревянные столбовые фундаменты", jobRank1, woodenPillarsTime, woodenPillarsPrice},

                {"", "Каменные и бетонные фундаменты" +
                        "для зданий высотой:", "", "", ""},
                {"271", "до трёх этажей", jobRank1, rockFoundationUpTo3Time, rockFoundationUpTo3Price},
                {"272", "до шести этажей", jobRank1, rockFoundationUpTo6Time, rockFoundationUpTo6Price},
                {"273", "более шести этажей", jobRank1, rockFoundationMore6Time, rockFoundationMore6Price},

                {"", "Железобетонные фундаменты" +
                        "для зданий высотой:", "", "", ""},
                {"273", "до шести этажей", jobRank2, metalFoundationUpTo6Time, metalFoundationUpTo6Price},
                {"274", "более шести этажей", jobRank2, metalFoundationMore6Time, metalFoundationMore6Price},
        };

        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
//        table.getColumnModel().getColumn(1).setMinWidth(350);
        table.setRowHeight(28);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(800, 400);
        System.out.println("Вызвано");
    }
}
