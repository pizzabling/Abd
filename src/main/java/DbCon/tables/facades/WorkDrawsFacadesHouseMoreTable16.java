//Фасады зданий площадью более 300 м². Рабочие чертежи табл. 16

package DbCon.tables.facades;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class WorkDrawsFacadesHouseMoreTable16 extends JFrame {

    String jobRank;

    double mainFacadeTime50;
    double mainFacadePrice50;
    double mainFacadeTime100;
    double mainFacadePrice100;
    double mainFacadeTime200;
    double mainFacadePrice200;

    double sideFacadeTime50;
    double sideFacadePrice50;
    double sideFacadeTime100;
    double sideFacadePrice100;
    double sideFacadeTime200;
    double sideFacadePrice200;

    double streetFacadeTime50;
    double streetFacadePrice50;
    double streetFacadeTime100;
    double streetFacadePrice100;
    double streetFacadeTime200;
    double streetFacadePrice200;

    public WorkDrawsFacadesHouseMoreTable16(int answer) {

        if (answer == 1) {
            jobRank = "IV";

            mainFacadeTime50 = 2.68;
            mainFacadePrice50 = 1.39;
            mainFacadeTime100 = 1.71;
            mainFacadePrice100 = 88.9;
            mainFacadeTime200 = 1;
            mainFacadePrice200 = 0.52;

            sideFacadeTime50 = 2.07;
            sideFacadePrice50 = 1.08;
            sideFacadeTime100 = 1.34;
            sideFacadePrice100 = 0.7;
            sideFacadeTime200 = 0.8;
            sideFacadePrice200 = 41.6;

            streetFacadeTime50 = 1.59;
            streetFacadePrice50 = 82.7;
            streetFacadeTime100 = 0.99;
            streetFacadePrice100 = 51.5;
            streetFacadeTime200 = 0.59;
            streetFacadePrice200 = 30.7;

        } else if (answer == 2) {
            jobRank = "V";

            mainFacadeTime50 = 3.78;
            mainFacadePrice50 = 2.40;
            mainFacadeTime100 = 2.68;
            mainFacadePrice100 = 1.70;
            mainFacadeTime200 = 1.88;
            mainFacadePrice200 = 1.19;

            sideFacadeTime50 = 3.05;
            sideFacadePrice50 = 1.94;
            sideFacadeTime100 = 1.83;
            sideFacadePrice100 = 1.16;
            sideFacadeTime200 = 1.11;
            sideFacadePrice200 = 70.5;

            streetFacadeTime50 = 2.2;
            streetFacadePrice50 = 1.40;
            streetFacadeTime100 = 1.34;
            streetFacadePrice100 = 85.1;
            streetFacadeTime200 = 0.8;
            streetFacadePrice200 = 50.8;
        }

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"", "Главный фасад:", "", "", ""},
                {"194", "M 1 : 50", jobRank, mainFacadeTime50, mainFacadePrice50},
                {"195", "M 1 : 100", jobRank, mainFacadeTime100, mainFacadePrice100},
                {"196", "M 1 : 200", jobRank, mainFacadeTime200, mainFacadePrice200},

                {"", "Боковой фасад:", "", "", ""},
                {"197", "M 1 : 50", jobRank, sideFacadeTime50, sideFacadePrice50},
                {"198", "M 1 : 100", jobRank, sideFacadeTime100, sideFacadePrice100},
                {"199", "M 1 : 200", jobRank, sideFacadeTime200, sideFacadePrice200},

                {"", "Дворовый фасад:", "", "", ""},
                {"200", "M 1 : 50", jobRank, streetFacadeTime50, streetFacadePrice50},
                {"201", "M 1 : 100", jobRank, streetFacadeTime100, streetFacadePrice100},
                {"202", "M 1 : 200", jobRank, streetFacadeTime200, streetFacadePrice200},
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
