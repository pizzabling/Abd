//Фасады зданий площадью более 300 м². Технический проект табл. 15

package DbCon.tables.facades;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class TechProjectFacadesHouseMoreTable15 extends JFrame {
    String jobRank;

    double coef;

    double mainFacadeTime100;
    double mainFacadePrice100;
    double mainFacadeTime200;
    double mainFacadePrice200;

    double sideFacadeTime100;
    double sideFacadePrice100;
    double sideFacadeTime200;
    double sideFacadePrice200;

    double streetFacadeTime100;
    double streetFacadePrice100;
    double streetFacadeTime200;
    double streetFacadePrice200;

    double fragmentTime50;
    double fragmentPrice50;

    public TechProjectFacadesHouseMoreTable15(int answer, double coef1, double coef2, double coef3, double coef4, double coef5, double coef6) {
        if (answer == 1) {
            jobRank = "III";

            mainFacadeTime100 = 1.63;
            mainFacadePrice100 = 75.3;
            mainFacadeTime200 = 1.02;
            mainFacadePrice200 = 47.1;

            sideFacadeTime100 = 1.17;
            sideFacadePrice100 = 54.1;
            sideFacadeTime200 = 0.73;
            sideFacadePrice200 = 33.7;

            streetFacadeTime100 = 0.88;
            streetFacadePrice100 = 40.7;
            streetFacadeTime200 = 0.58;
            streetFacadePrice200 = 26.8;

            fragmentTime50 = 2.1;
            fragmentPrice50 = 0.97;

        } else if (answer == 2) {
            jobRank = "IV";

            mainFacadeTime100 = 2.12;
            mainFacadePrice100 = 1.10;
            mainFacadeTime200 = 1.46;
            mainFacadePrice200 = 75.9;

            sideFacadeTime100 = 1.63;
            sideFacadePrice100 = 84.8;
            sideFacadeTime200 = 1.17;
            sideFacadePrice200 = 60.8;

            streetFacadeTime100 = 1.17;
            streetFacadePrice100 = 60.8;
            streetFacadeTime200 = 0.73;
            streetFacadePrice200 = 0.38;

            fragmentTime50 = 2.7;
            fragmentPrice50 = 1.4;
        }

        coef = coef1 * coef2 * coef3 * coef4 * coef5 * coef6;

        mainFacadeTime100 = coef * mainFacadeTime100;
        mainFacadePrice100 = coef * mainFacadePrice100;
        mainFacadeTime200 = coef * mainFacadeTime200;
        mainFacadePrice200 = coef * mainFacadePrice200;

        sideFacadeTime100 = coef * sideFacadeTime100;
        sideFacadePrice100 = coef * sideFacadePrice100;
        sideFacadeTime200 = coef * sideFacadeTime200;
        sideFacadePrice200 = coef * sideFacadePrice200;

        streetFacadeTime100 = coef * streetFacadeTime100;
        streetFacadePrice100 = coef * streetFacadePrice100;
        streetFacadeTime200 = coef * streetFacadeTime200;
        streetFacadePrice200 = coef * streetFacadePrice200;

        fragmentTime50 = coef * fragmentTime50;
        fragmentPrice50 = coef * fragmentPrice50;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"", "Главный фасад:", "", "", ""},
                {"187", "M 1 : 100", jobRank, mainFacadeTime100, mainFacadePrice100},
                {"188", "M 1 : 200", jobRank, mainFacadeTime200, mainFacadePrice200},

                {"", "Боковой фасад:", "", "", ""},
                {"189", "M 1 : 100", jobRank, sideFacadeTime100, sideFacadePrice100},
                {"190", "M 1 : 200", jobRank, sideFacadeTime200, sideFacadePrice200},

                {"", "Дворовый фасад:", "", "", ""},
                {"191", "M 1 : 100", jobRank, streetFacadeTime100, streetFacadePrice100},
                {"192", "M 1 : 200", jobRank, streetFacadeTime200, streetFacadePrice200},

                {"", "Фрагмент:", "", "", ""},
                {"193", "M 1 : 50", jobRank, fragmentTime50, fragmentPrice50},
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