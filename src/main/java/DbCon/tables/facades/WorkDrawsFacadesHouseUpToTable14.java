//Фасады зданий площадью до 300 м². Рабочие чертежи табл. 14

package DbCon.tables.facades;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class WorkDrawsFacadesHouseUpToTable14 extends JFrame {

    String jobRank;

    double coef;

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


    double o1mainFacadeTime50;
    double o1mainFacadePrice50;
    double o1mainFacadeTime100;
    double o1mainFacadePrice100;
    double o1mainFacadeTime200;
    double o1mainFacadePrice200;

    double o1sideFacadeTime50;
    double o1sideFacadePrice50;
    double o1sideFacadeTime100;
    double o1sideFacadePrice100;
    double o1sideFacadeTime200;
    double o1sideFacadePrice200;

    double o1streetFacadeTime50;
    double o1streetFacadePrice50;
    double o1streetFacadeTime100;
    double o1streetFacadePrice100;
    double o1streetFacadeTime200;
    double o1streetFacadePrice200;


    double o2mainFacadeTime50;
    double o2mainFacadePrice50;
    double o2mainFacadeTime100;
    double o2mainFacadePrice100;
    double o2mainFacadeTime200;
    double o2mainFacadePrice200;

    double o2sideFacadeTime50;
    double o2sideFacadePrice50;
    double o2sideFacadeTime100;
    double o2sideFacadePrice100;
    double o2sideFacadeTime200;
    double o2sideFacadePrice200;

    double o2streetFacadeTime50;
    double o2streetFacadePrice50;
    double o2streetFacadeTime100;
    double o2streetFacadePrice100;
    double o2streetFacadeTime200;
    double o2streetFacadePrice200;


    public WorkDrawsFacadesHouseUpToTable14(int answer, double coef1, double coef2) {

        if (answer == 1) {
            jobRank = "IV";

            mainFacadeTime50 = 5.36;
            mainFacadePrice50 = 2.79;
            mainFacadeTime100 = 3.42;
            mainFacadePrice100 = 1.78;
            mainFacadeTime200 = 2;
            mainFacadePrice200 = 1.04;

            sideFacadeTime50 = 4.14;
            sideFacadePrice50 = 2.15;
            sideFacadeTime100 = 2.68;
            sideFacadePrice100 = 1.39;
            sideFacadeTime200 = 1.6;
            sideFacadePrice200 = 83.2;

            streetFacadeTime50 = 3.18;
            streetFacadePrice50 = 1.65;
            streetFacadeTime100 = 1.98;
            streetFacadePrice100 = 1.03;
            streetFacadeTime200 = 1.18;
            streetFacadePrice200 = 61.4;

            o1mainFacadeTime50 = 9.38;
            o1mainFacadePrice50 = 4.88;
            o1mainFacadeTime100 = 5.98;
            o1mainFacadePrice100 = 3.11;
            o1mainFacadeTime200 = 3.5;
            o1mainFacadePrice200 = 1.82;

            o1sideFacadeTime50 = 7.25;
            o1sideFacadePrice50 = 3.77;
            o1sideFacadeTime100 = 4.69;
            o1sideFacadePrice100 = 2.44;
            o1sideFacadeTime200 = 2.8;
            o1sideFacadePrice200 = 1.46;

            o1streetFacadeTime50 = 5.57;
            o1streetFacadePrice50 = 2.90;
            o1streetFacadeTime100 = 3.46;
            o1streetFacadePrice100 = 1.80;
            o1streetFacadeTime200 = 2.06;
            o1streetFacadePrice200 = 1.07;

            o2mainFacadeTime50 = 12.1;
            o2mainFacadePrice50 = 6.29;
            o2mainFacadeTime100 = 7.7;
            o2mainFacadePrice100 = 4.00;
            o2mainFacadeTime200 = 4.5;
            o2mainFacadePrice200 = 2.34;

            o2sideFacadeTime50 = 9.32;
            o2sideFacadePrice50 = 4.85;
            o2sideFacadeTime100 = 6.03;
            o2sideFacadePrice100 = 3.14;
            o2sideFacadeTime200 = 3.6;
            o2sideFacadePrice200 = 1.87;

            o2streetFacadeTime50 = 7.15;
            o2streetFacadePrice50 = 3.72;
            o2streetFacadeTime100 = 4.46;
            o2streetFacadePrice100 = 2.32;
            o2streetFacadeTime200 = 2.65;
            o2streetFacadePrice200 = 1.38;

        } else if (answer == 2) {
            jobRank = "V";

            mainFacadeTime50 = 7.56;
            mainFacadePrice50 = 4.8;
            mainFacadeTime100 = 5.38;
            mainFacadePrice100 = 3.42;
            mainFacadeTime200 = 3.76;
            mainFacadePrice200 = 2.39;

            sideFacadeTime50 = 6.1;
            sideFacadePrice50 = 3.87;
            sideFacadeTime100 = 3.66;
            sideFacadePrice100 = 2.32;
            sideFacadeTime200 = 2.22;
            sideFacadePrice200 = 1.41;

            streetFacadeTime50 = 4.4;
            streetFacadePrice50 = 2.79;
            streetFacadeTime100 = 2.68;
            streetFacadePrice100 = 1.70;
            streetFacadeTime200 = 1.6;
            streetFacadePrice200 = 1.02;

            o1mainFacadeTime50 = 13.2;
            o1mainFacadePrice50 = 8.39;
            o1mainFacadeTime100 = 9.38;
            o1mainFacadePrice100 = 5.96;
            o1mainFacadeTime200 = 6.58;
            o1mainFacadePrice200 = 4.18;

            o1sideFacadeTime50 = 10.7;
            o1sideFacadePrice50 = 6.77;
            o1sideFacadeTime100 = 6.40;
            o1sideFacadePrice100 = 4.06;
            o1sideFacadeTime200 = 3.89;
            o1sideFacadePrice200 = 2.47;

            o1streetFacadeTime50 = 7.7;
            o1streetFacadePrice50 = 4.89;
            o1streetFacadeTime100 = 4.69;
            o1streetFacadePrice100 = 2.98;
            o1streetFacadeTime200 = 2.8;
            o1streetFacadePrice200 = 1.78;

            o2mainFacadeTime50 = 17;
            o2mainFacadePrice50 = 10.80;
            o2mainFacadeTime100 = 12.1;
            o2mainFacadePrice100 = 7.68;
            o2mainFacadeTime200 = 8.46;
            o2mainFacadePrice200 = 5.37;

            o2sideFacadeTime50 = 13.7;
            o2sideFacadePrice50 = 8.70;
            o2sideFacadeTime100 = 8.23;
            o2sideFacadePrice100 = 5.23;
            o2sideFacadeTime200 = 5;
            o2sideFacadePrice200 = 3.18;

            o2streetFacadeTime50 = 9.9;
            o2streetFacadePrice50 = 6.29;
            o2streetFacadeTime100 = 6.03;
            o2streetFacadePrice100 = 3.83;
            o2streetFacadeTime200 = 3.6;
            o2streetFacadePrice200 = 2.29;
        }

        coef = coef1 * coef2;

        mainFacadeTime50 *= coef;
        mainFacadePrice50 *= coef;
        mainFacadeTime100 *= coef;
        mainFacadePrice100 *= coef;
        mainFacadeTime200 *= coef;
        mainFacadePrice200 *= coef;

        sideFacadeTime50 *= coef;
        sideFacadePrice50 *= coef;
        sideFacadeTime100 *= coef;
        sideFacadePrice100 *= coef;
        sideFacadeTime200 *= coef;
        sideFacadePrice200 *= coef;

        streetFacadeTime50 *= coef;
        streetFacadePrice50 *= coef;
        streetFacadeTime100 *= coef;
        streetFacadePrice100 *= coef;
        streetFacadeTime200 *= coef;
        streetFacadePrice200 *= coef;

        o1mainFacadeTime50 *= coef;
        o1mainFacadePrice50 *= coef;
        o1mainFacadeTime100 *= coef;
        o1mainFacadePrice100 *= coef;
        o1mainFacadeTime200 *= coef;
        o1mainFacadePrice200 *= coef;

        o1sideFacadeTime50 *= coef;
        o1sideFacadePrice50 *= coef;
        o1sideFacadeTime100 *= coef;
        o1sideFacadePrice100 *= coef;
        o1sideFacadeTime200 *= coef;
        o1sideFacadePrice200 *= coef;

        o1streetFacadeTime50 *= coef;
        o1streetFacadePrice50 *= coef;
        o1streetFacadeTime100 *= coef;
        o1streetFacadePrice100 *= coef;
        o1streetFacadeTime200 *= coef;
        o1streetFacadePrice200 *= coef;

        o2mainFacadeTime50 *= coef;
        o2mainFacadePrice50 *= coef;
        o2mainFacadeTime100 *= coef;
        o2mainFacadePrice100 *= coef;
        o2mainFacadeTime200 *= coef;
        o2mainFacadePrice200 *= coef;

        o2sideFacadeTime50 *= coef;
        o2sideFacadePrice50 *= coef;
        o2sideFacadeTime100 *= coef;
        o2sideFacadePrice100 *= coef;
        o2sideFacadeTime200 *= coef;
        o2sideFacadePrice200 *= coef;

        o2streetFacadeTime50 *= coef;
        o2streetFacadePrice50 *= coef;
        o2streetFacadeTime100 *= coef;
        o2streetFacadePrice100 *= coef;
        o2streetFacadeTime200 *= coef;
        o2streetFacadePrice200 *= coef;


        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"", "<html><h4>Фасад здания площадью до 100 м²</h4></html>", "", "", ""},

                {"", "Главный фасад:", "", "", ""},
                {"160", "M 1 : 50", jobRank, mainFacadeTime50, mainFacadePrice50},
                {"161", "M 1 : 100", jobRank, mainFacadeTime100, mainFacadePrice100},
                {"162", "M 1 : 200", jobRank, mainFacadeTime200, mainFacadePrice200},

                {"", "Боковой фасад:", "", "", ""},
                {"163", "M 1 : 50", jobRank, sideFacadeTime50, sideFacadePrice50},
                {"164", "M 1 : 100", jobRank, sideFacadeTime100, sideFacadePrice100},
                {"165", "M 1 : 200", jobRank, sideFacadeTime200, sideFacadePrice200},

                {"", "Дворовый фасад:", "", "", ""},
                {"166", "M 1 : 50", jobRank, streetFacadeTime50, streetFacadePrice50},
                {"167", "M 1 : 100", jobRank, streetFacadeTime100, streetFacadePrice100},
                {"168", "M 1 : 200", jobRank, streetFacadeTime200, streetFacadePrice200},

                {"", "<html><h4>Фасад здания площадью более 100 до 200 м²</h4></html>", "", "", ""},

                {"", "Главный фасад:", "", "", ""},
                {"169", "M 1 : 50", jobRank, o1mainFacadeTime50, o1mainFacadePrice50},
                {"170", "M 1 : 100", jobRank, o1mainFacadeTime100, o1mainFacadePrice100},
                {"171", "M 1 : 200", jobRank, o1mainFacadeTime200, o1mainFacadePrice200},

                {"", "Боковой фасад:", "", "", ""},
                {"172", "M 1 : 50", jobRank, o1sideFacadeTime50, o1sideFacadePrice50},
                {"173", "M 1 : 100", jobRank, o1sideFacadeTime100, o1sideFacadePrice100},
                {"174", "M 1 : 200", jobRank, o1sideFacadeTime200, o1sideFacadePrice200},

                {"", "Дворовый фасад:", "", "", ""},
                {"175", "M 1 : 50", jobRank, o1streetFacadeTime50, o1streetFacadePrice50},
                {"176", "M 1 : 100", jobRank, o1streetFacadeTime100, o1streetFacadePrice100},
                {"177", "M 1 : 200", jobRank, o1streetFacadeTime200, o1streetFacadePrice200},

                {"", "<html><h4>Фасад здания площадью более 200 до 300 м²</h4></html>", "", "", ""},

                {"", "Главный фасад:", "", "", ""},
                {"178", "M 1 : 50", jobRank, o2mainFacadeTime50, o2mainFacadePrice50},
                {"179", "M 1 : 100", jobRank, o2mainFacadeTime100, o2mainFacadePrice100},
                {"180", "M 1 : 200", jobRank, o2mainFacadeTime200, o2mainFacadePrice200},

                {"", "Боковой фасад:", "", "", ""},
                {"181", "M 1 : 50", jobRank, o2sideFacadeTime50, o2sideFacadePrice50},
                {"182", "M 1 : 100", jobRank, o2sideFacadeTime100, o2sideFacadePrice100},
                {"183", "M 1 : 200", jobRank, o2sideFacadeTime200, o2sideFacadePrice200},

                {"", "Дворовый фасад:", "", "", ""},
                {"184", "M 1 : 50", "jobRank", o2streetFacadeTime50, o2streetFacadePrice50},
                {"185", "M 1 : 100", "jobRank", o2streetFacadeTime100, o2streetFacadePrice100},
                {"186", "M 1 : 200", "jobRank", o2streetFacadeTime200, o2streetFacadePrice200},


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