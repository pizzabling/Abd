//Архитектурные детали и шаблоны табл.22

package DbCon.tables.architectural_details_and_patterns;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class ArchiDetailsPatternsTable22 extends JFrame {

    String jobRank1;
    String jobRank2;

    double capTime;
    double capPrice;

    double paintedDetailsTime;
    double paintedDetailsPrice;

    double cornicesTime;
    double cornicesPrice;

    double capTime1;
    double capPrice1;

    double vasesTime;
    double vasesPrice;

    double stuccoPatternsTime;
    double stuccoPatternsPrice;

    public ArchiDetailsPatternsTable22(int answer, double coef1) {
        if (answer == 1) {
            jobRank1 = "IV";
            jobRank2 = "V";

            capTime = 4.8;
            capPrice = 2.5;

            paintedDetailsTime = 8.93;
            paintedDetailsPrice = 5.67;

            cornicesTime = 4.35;
            cornicesPrice = 2.76;

            capTime1 = 6.14;
            capPrice1 = 3.90;

            vasesTime = 2.9;
            vasesPrice = 1.84;

            stuccoPatternsTime = 9.04;
            stuccoPatternsPrice = 5.74;

        } else if (answer == 2) {
            jobRank1 = "V";
            jobRank2 = "V";

            capTime = 11.2;
            capPrice = 7.11;

            paintedDetailsTime = 15.6;
            paintedDetailsPrice = 9.91;

            cornicesTime = 8.04;
            cornicesPrice = 5.11;

            capTime1 = 9.49;
            capPrice1 = 6.03;

            vasesTime = 4.91;
            vasesPrice = 3.12;

            stuccoPatternsTime = 16.1;
            stuccoPatternsPrice = 10.22;

        } else if (answer == 3) {
            jobRank1 = "V";
            jobRank2 = "V";

            capTime = 14.5;
            capPrice = 9.21;

            paintedDetailsTime = 20.1;
            paintedDetailsPrice = 12.76;

            cornicesTime = 11.2;
            cornicesPrice = 7.11;

            capTime1 = 19.9;
            capPrice1 = 12.64;

            vasesTime = 9.04;
            vasesPrice = 5.74;

            stuccoPatternsTime = 27.1;
            stuccoPatternsPrice = 17.21;
        }

        capTime *= coef1;
        capPrice *= coef1;

        paintedDetailsTime *= coef1;
        paintedDetailsPrice *= coef1;

        cornicesTime *= coef1;
        cornicesPrice *= coef1;

        capTime1 *= coef1;
        capPrice1 *= coef1;

        vasesTime *= coef1;
        vasesPrice *= coef1;

        stuccoPatternsTime *= coef1;
        stuccoPatternsPrice *= coef1;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Измеритель", "Разряд работы", "Норма времени", "Расценка"};
        Object[][] array = new Object[][]{
                {"233", "Капители, пояса, карнизы, тяги, решетки, картуши,фризы, вазы, обелиски", "деталь", jobRank1, capTime, capPrice},
                {"234", "Детали росписи и лепки", "м²", jobRank2, paintedDetailsTime, paintedDetailsPrice},
                {"235", "Карнизы, решетки, модульоны, пояса, тяги, парапеты, сандрики, наличники", "шаблон", jobRank2,
                        cornicesTime, cornicesPrice},
                {"236", "Капители", "»", jobRank2, capTime1, capPrice1},
                {"237", "Вазы, цоколи, пьедесталы, лепные балясины, перила, зонты, навесы, розетки", "шаблон", jobRank2, vasesTime, vasesPrice},
                {"238", "Шаблоны лепного орнамента", "м²", jobRank2, stuccoPatternsTime, stuccoPatternsPrice}
        };
        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.getColumnModel().getColumn(1).setMinWidth(350);
        table.setRowHeight(28);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(800, 400);
        System.out.println("Вызвано");
    }
}
