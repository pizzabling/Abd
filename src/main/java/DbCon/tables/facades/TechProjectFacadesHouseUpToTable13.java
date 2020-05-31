//Фасады зданий площадью до 300 м². Технический проект табл. 13

package DbCon.tables.facades;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class TechProjectFacadesHouseUpToTable13 extends JFrame {

    String jobRank;

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

    double o1mainFacadeTime100;
    double o1mainFacadePrice100;
    double o1mainFacadeTime200;
    double o1mainFacadePrice200;

    double o1sideFacadeTime100;
    double o1sideFacadePrice100;
    double o1sideFacadeTime200;
    double o1sideFacadePrice200;

    double o1streetFacadeTime100;
    double o1streetFacadePrice100;
    double o1streetFacadeTime200;
    double o1streetFacadePrice200;

    double o1fragmentTime50;
    double o1fragmentPrice50;

    double o2mainFacadeTime100;
    double o2mainFacadePrice100;
    double o2mainFacadeTime200;
    double o2mainFacadePrice200;

    double o2sideFacadeTime100;
    double o2sideFacadePrice100;
    double o2sideFacadeTime200;
    double o2sideFacadePrice200;

    double o2streetFacadeTime100;
    double o2streetFacadePrice100;
    double o2streetFacadeTime200;
    double o2streetFacadePrice200;

    double o2fragmentTime50;
    double o2fragmentPrice50;

    double coef;

    public TechProjectFacadesHouseUpToTable13(int answer, double coef1, double coef2) {
        if (answer == 1) {
            jobRank = "III";

            mainFacadeTime100 = 3.26;
            mainFacadePrice100 = 1.51;
            mainFacadeTime200 = 2.06;
            mainFacadePrice200 = 95.2;

            sideFacadeTime100 = 2.34;
            sideFacadePrice100 = 1.08;
            sideFacadeTime200 = 1.46;
            sideFacadePrice200 = 67.5;

            streetFacadeTime100 = 1.76;
            streetFacadePrice100 = 81.3;
            streetFacadeTime200 = 1.18;
            streetFacadePrice200 = 54.5;

            fragmentTime50 = 4.2;
            fragmentPrice50 = 1.94;

            o1mainFacadeTime100 = 5.7;
            o1mainFacadePrice100 = 2.63;
            o1mainFacadeTime200 = 3.6;
            o1mainFacadePrice200 = 1.66;

            o1sideFacadeTime100 = 4.09;
            o1sideFacadePrice100 = 1.89;
            o1sideFacadeTime200 = 2.55;
            o1sideFacadePrice200 = 1.18;

            o1streetFacadeTime100 = 3.08;
            o1streetFacadePrice100 = 1.42;
            o1streetFacadeTime200 = 2.07;
            o1streetFacadePrice200 = 95.6;

            o1fragmentTime50 = 7.35;
            o1fragmentPrice50 = 3.40;

            o2mainFacadeTime100 = 7.33;
            o2mainFacadePrice100 = 3.39;
            o2mainFacadeTime200 = 4.63;
            o2mainFacadePrice200 = 2.14;

            o2sideFacadeTime100 = 5.26;
            o2sideFacadePrice100 = 2.43;
            o2sideFacadeTime200 = 3.28;
            o2sideFacadePrice200 = 1.52;

            o2streetFacadeTime100 = 3.96;
            o2streetFacadePrice100 = 1.83;
            o2streetFacadeTime200 = 2.66;
            o2streetFacadePrice200 = 1.23;

            o2fragmentTime50 = 9.45;
            o2fragmentPrice50 = 4.37;

        } else if (answer == 2) {
            jobRank = "IV";

            mainFacadeTime100 = 4.22;
            mainFacadePrice100 = 2.19;
            mainFacadeTime200 = 2.92;
            mainFacadePrice200 = 1.52;

            sideFacadeTime100 = 3.26;
            sideFacadePrice100 = 1.7;
            sideFacadeTime200 = 2.34;
            sideFacadePrice200 = 1.22;

            streetFacadeTime100 = 2.34;
            streetFacadePrice100 = 1.22;
            streetFacadeTime200 = 1.46;
            streetFacadePrice200 = 75.9;

            fragmentTime50 = 5.4;
            fragmentPrice50 = 2.81;

            o1mainFacadeTime100 = 7.38;
            o1mainFacadePrice100 = 3.84;
            o1mainFacadeTime200 = 5.11;
            o1mainFacadePrice200 = 2.66;

            o1sideFacadeTime100 = 5.7;
            o1sideFacadePrice100 = 2.96;
            o1sideFacadeTime200 = 4.09;
            o1sideFacadePrice200 = 2.13;

            o1streetFacadeTime100 = 4.09;
            o1streetFacadePrice100 = 2.13;
            o1streetFacadeTime200 = 2.55;
            o1streetFacadePrice200 = 1.33;

            o1fragmentTime50 = 9.45;
            o1fragmentPrice50 = 4.91;

            o2mainFacadeTime100 = 9.49;
            o2mainFacadePrice100 = 4.94;
            o2mainFacadeTime200 = 6.57;
            o2mainFacadePrice200 = 3.42;

            o2sideFacadeTime100 = 7.33;
            o2sideFacadePrice100 = 3.81;
            o2sideFacadeTime200 = 5.26;
            o2sideFacadePrice200 = 2.74;

            o2streetFacadeTime100 = 5.26;
            o2streetFacadePrice100 = 2.74;
            o2streetFacadeTime200 = 3.28;
            o2streetFacadePrice200 = 1.71;

            o2fragmentTime50 = 12.15;
            o2fragmentPrice50 = 6.32;
        }
        coef = coef1 * coef2;

        mainFacadeTime100 *= coef;
        mainFacadePrice100 *= coef;
        mainFacadeTime200 *= coef;
        mainFacadePrice200 *= coef;

        sideFacadeTime100 *= coef;
        sideFacadePrice100 *= coef;
        sideFacadeTime200 *= coef;
        sideFacadePrice200 *= coef;

        streetFacadeTime100 *= coef;
        streetFacadePrice100 *= coef;
        streetFacadeTime200 *= coef;
        streetFacadePrice200 *= coef;

        fragmentTime50 *= coef;
        fragmentPrice50 *= coef;

        o1mainFacadeTime100 *= coef;
        o1mainFacadePrice100 *= coef;
        o1mainFacadeTime200 *= coef;
        o1mainFacadePrice200 *= coef;

        o1sideFacadeTime100 *= coef;
        o1sideFacadePrice100 *= coef;
        o1sideFacadeTime200 *= coef;
        o1sideFacadePrice200 *= coef;

        o1streetFacadeTime100 *= coef;
        o1streetFacadePrice100 *= coef;
        o1streetFacadeTime200 *= coef;
        o1streetFacadePrice200 *= coef;

        o1fragmentTime50 *= coef;
        o1fragmentPrice50 *= coef;

        o2mainFacadeTime100 *= coef;
        o2mainFacadePrice100 *= coef;
        o2mainFacadeTime200 *= coef;
        o2mainFacadePrice200 *= coef;

        o2sideFacadeTime100 *= coef;
        o2sideFacadePrice100 *= coef;
        o2sideFacadeTime200 *= coef;
        o2sideFacadePrice200 *= coef;

        o2streetFacadeTime100 *= coef;
        o2streetFacadePrice100 *= coef;
        o2streetFacadeTime200 *= coef;
        o2streetFacadePrice200 *= coef;

        o2fragmentTime50 *= coef;
        o2fragmentPrice50 *= coef;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"", "<html><h4>Фасад здания площадью до 100 м³</h4></html>", "", "", ""},

                {"", "Главный фасад:", "", "", ""},
                {"139", "M 1 : 100", jobRank, mainFacadeTime100, mainFacadePrice100},
                {"140", "M 1 : 200", jobRank, mainFacadeTime200, mainFacadePrice200},

                {"", "Боковой фасад:", "", "", ""},
                {"141", "M 1 : 100", jobRank, sideFacadeTime100, sideFacadePrice100},
                {"142", "M 1 : 200", jobRank, sideFacadeTime200, sideFacadePrice200},

                {"", "Дворовый фасад:", "", "", ""},
                {"143", "M 1 : 100", jobRank, streetFacadeTime100, streetFacadePrice100},
                {"144", "M 1 : 200", jobRank, streetFacadeTime200, streetFacadePrice200},

                {"", "Фрагмент:", "", "", ""},
                {"145", "M 1 : 50", jobRank, fragmentTime50, fragmentPrice50},

                {"", "<html><h4>Фасад здания площадью более 100 до 200 м³</h4></html>", "", "", ""},

                {"", "Главный фасад:", "", "", ""},
                {"146", "M 1 : 100", jobRank, o1mainFacadeTime100, o1mainFacadePrice100},
                {"147", "M 1 : 200", jobRank, o1mainFacadeTime200, o1mainFacadePrice200},

                {"", "Боковой фасад:", "", "", ""},
                {"148", "M 1 : 100", jobRank, o1sideFacadeTime100, o1sideFacadePrice100},
                {"149", "M 1 : 200", jobRank, o1sideFacadeTime200, o1sideFacadePrice200},

                {"", "Дворовый фасад:", "", "", ""},
                {"150", "M 1 : 100", jobRank, o1streetFacadeTime100, o1streetFacadePrice100},
                {"151", "M 1 : 200", jobRank, o1streetFacadeTime200, o1streetFacadePrice200},

                {"", "Фрагмент:", "", "", ""},
                {"152", "M 1 : 50", jobRank, o1fragmentTime50, o1fragmentPrice50},

                {"", "<html><h4>Фасад здания площадью более 200 до 300 м³</h4></html>", "", "", ""},

                {"", "Главный фасад:", "", "", ""},
                {"153", "M 1 : 100", jobRank, o2mainFacadeTime100, o2mainFacadePrice100},
                {"154", "M 1 : 200", jobRank, o2mainFacadeTime200, o2mainFacadePrice200},

                {"", "Боковой фасад:", "", "", ""},
                {"155", "M 1 : 100", jobRank, o2sideFacadeTime100, o2sideFacadePrice100},
                {"156", "M 1 : 200", jobRank, o2sideFacadeTime200, o2sideFacadePrice200},

                {"", "Дворовый фасад:", "", "", ""},
                {"157", "M 1 : 100", jobRank, o2streetFacadeTime100, o2streetFacadePrice100},
                {"158", "M 1 : 200", jobRank, o2streetFacadeTime200, o2streetFacadePrice200},

                {"", "Фрагмент:", "", "", ""},
                {"159", "M 1 : 50", jobRank, o2fragmentTime50, o2fragmentPrice50},

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
