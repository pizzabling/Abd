//Железобетонные сборные конструкции табл. 29

package DbCon.tables.design_work;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class ReinforcedConcretePrefabricatedStructures29 extends JFrame {

    String jobRank1;
    String jobRank2;
    String jobRank3;

    double flatPlatesTime;
    double flatPlatesPrice;

    double runsRectangularTime;
    double runsRectangularPrice;

    double ribbedCaissonBalconyTime;
    double ribbedCaissonBalconyPrice;

    double tauriRunsColumnsTime;
    double tauriRunsColumnsPrice;

    double oversizedSlabsTime;
    double oversizedSlabsPrice;

    public ReinforcedConcretePrefabricatedStructures29(int answer, double coef1) {

        if (answer == 1) {
            jobRank1 = "III";
            jobRank2 = "IV";
            jobRank3 = "IV";

            flatPlatesTime = 1.7;
            flatPlatesPrice = 78.5;

            runsRectangularTime = 2.71;
            runsRectangularPrice = 1.41;

            ribbedCaissonBalconyTime = 4.62;
            ribbedCaissonBalconyPrice = 2.40;

            tauriRunsColumnsTime = 5.28;
            tauriRunsColumnsPrice = 2.75;

            oversizedSlabsTime = 6.11;
            oversizedSlabsPrice = 3.18;

        } else if (answer == 2) {
            jobRank1 = "IV";
            jobRank2 = "IV";
            jobRank3 = "V";

            flatPlatesTime = 2.07;
            flatPlatesPrice = 1.08;

            runsRectangularTime = 4.24;
            runsRectangularPrice = 2.21;

            ribbedCaissonBalconyTime = 5.83;
            ribbedCaissonBalconyPrice = 3.06;

            tauriRunsColumnsTime = 6.79;
            tauriRunsColumnsPrice = 3.53;

            oversizedSlabsTime = 7.54;
            oversizedSlabsPrice = 4.79;
        } else if (answer == 3) {
            jobRank1 = "V";
            jobRank2 = "V";
            jobRank3 = "V";

            flatPlatesTime = 2.54;
            flatPlatesPrice = 1.61;

            runsRectangularTime = 5.09;
            runsRectangularPrice = 3.23;

            ribbedCaissonBalconyTime = 6.05;
            ribbedCaissonBalconyPrice = 3.84;

            tauriRunsColumnsTime = 6.79;
            tauriRunsColumnsPrice = 4.31;

            oversizedSlabsTime = 10.4;
            oversizedSlabsPrice = 6.60;
        }

        tauriRunsColumnsTime *= coef1;
        tauriRunsColumnsPrice *= coef1;

        oversizedSlabsTime *= coef1;
        oversizedSlabsPrice *= coef1;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"290", "Плоские плиты", jobRank1, flatPlatesTime, flatPlatesPrice},
                {"291", "Прогоны прямоугольные", jobRank2, runsRectangularTime, runsRectangularPrice},
                {"292", "Ребристые, кесонные балконные и карнизные" +
                        "плиты", jobRank2, ribbedCaissonBalconyTime, ribbedCaissonBalconyPrice},
                {"293", "Тавровые прогоны или колонны", jobRank2, tauriRunsColumnsTime, tauriRunsColumnsPrice},
                {"294", "Крупноразмерные плиты, стеновые панели", jobRank3, oversizedSlabsTime, oversizedSlabsPrice},
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
