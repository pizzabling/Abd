//Заполнение проёмов и тамбуры табл.23

package DbCon.tables.architectural_details_and_patterns;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class FillingOpeningsVestibulesTable23 extends JFrame {

    String jobRank;

    double woodTransomsUpTo2Time;
    double woodTransomsUpTo2Price;
    double woodTransomsUpTo4Time;
    double woodTransomsUpTo4Price;
    double woodTransomsUpTo6Time;
    double woodTransomsUpTo6Price;
    double woodTransomsMore6Time;
    double woodTransomsMore6Price;

    double metalTransomsUpTo2Time;
    double metalTransomsUpTo2Price;
    double metalTransomsUpTo5Time;
    double metalTransomsUpTo5Price;
    double metalTransomsUpTo10Time;
    double metalTransomsUpTo10Price;
    double metalTransomsMore10Time;
    double metalTransomsMore10Price;

    double insideDoorUpTo2Time;
    double insideDoorUpTo2Price;
    double insideDoorUpTo4Time;
    double insideDoorUpTo4Price;
    double insideDoorMore4Time;
    double insideDoorMore4Price;

    double outsideDoorUpTo2Time;
    double outsideDoorUpTo2Price;
    double outsideDoorUpTo4Time;
    double outsideDoorUpTo4Price;
    double outsideDoorMore4Time;
    double outsideDoorMore4Price;

    double vestibuleTime;
    double vestibulePrice;

    double coef;

    public FillingOpeningsVestibulesTable23(int answer, double coef1, double coef2, double coef3, double coef4) {
        coef = coef1 * coef2 * coef3 * coef4;
        if (answer == 1) {
            jobRank = "IV";

            woodTransomsUpTo2Time = 4.24;
            woodTransomsUpTo2Price = 2.21;
            woodTransomsUpTo4Time = 8.71;
            woodTransomsUpTo4Price = 4.53;
            woodTransomsUpTo6Time = 9.04;
            woodTransomsUpTo6Price = 4.7;
            woodTransomsMore6Time = 11.3;
            woodTransomsMore6Price = 5.88;

            metalTransomsUpTo2Time = 7.86;
            metalTransomsUpTo2Price = 4.09;
            metalTransomsUpTo5Time = 13.2;
            metalTransomsUpTo5Price = 6.86;
            metalTransomsUpTo10Time = 15.6;
            metalTransomsUpTo10Price = 8.11;
            metalTransomsMore10Time = 20.1;
            metalTransomsMore10Price = 10.45;

            insideDoorUpTo2Time = 6.36;
            insideDoorUpTo2Price = 3.30;
            insideDoorUpTo4Time = 8.49;
            insideDoorUpTo4Price = 4.42;
            insideDoorMore4Time = 12.3;
            insideDoorMore4Price = 6.40;

            outsideDoorUpTo2Time = 9.04;
            outsideDoorUpTo2Price = 4.7;
            outsideDoorUpTo4Time = 11;
            outsideDoorUpTo4Price = 5.72;
            outsideDoorMore4Time = 15.6;
            outsideDoorMore4Price = 8.11;

            vestibuleTime = 15.6;
            vestibulePrice = 8.11;

        } else if (answer == 2) {
            jobRank = "IV";

            woodTransomsUpTo2Time = 5.14;
            woodTransomsUpTo2Price = 2.67;
            woodTransomsUpTo4Time = 10;
            woodTransomsUpTo4Price = 5.20;
            woodTransomsUpTo6Time = 10.8;
            woodTransomsUpTo6Price = 5.62;
            woodTransomsMore6Time = 12.3;
            woodTransomsMore6Price = 6.40;

            metalTransomsUpTo2Time = 9.04;
            metalTransomsUpTo2Price = 4.7;
            metalTransomsUpTo5Time = 16.1;
            metalTransomsUpTo5Price = 8.37;
            metalTransomsUpTo10Time = 20.1;
            metalTransomsUpTo10Price = 10.45;
            metalTransomsMore10Time = 24.6;
            metalTransomsMore10Price = 12.79;

            insideDoorUpTo2Time = 8.04;
            insideDoorUpTo2Price = 4.18;
            insideDoorUpTo4Time = 11.4;
            insideDoorUpTo4Price = 5.93;
            insideDoorMore4Time = 15.6;
            insideDoorMore4Price = 8.11;

            outsideDoorUpTo2Time = 12.1;
            outsideDoorUpTo2Price = 6.29;
            outsideDoorUpTo4Time = 14.1;
            outsideDoorUpTo4Price = 7.33;
            outsideDoorMore4Time = 20.1;
            outsideDoorMore4Price = 10.45;

            vestibuleTime = 24.6;
            vestibulePrice = 12.79;

        } else if (answer == 3) {
            jobRank = "V";

            woodTransomsUpTo2Time = 6.81;
            woodTransomsUpTo2Price = 4.32;
            woodTransomsUpTo4Time = 13.2;
            woodTransomsUpTo4Price = 8.38;
            woodTransomsUpTo6Time = 15.6;
            woodTransomsUpTo6Price = 9.91;
            woodTransomsMore6Time = 20.1;
            woodTransomsMore6Price = 12.76;

            metalTransomsUpTo2Time = 11;
            metalTransomsUpTo2Price = 6.99;
            metalTransomsUpTo5Time = 21.7;
            metalTransomsUpTo5Price = 13.78;
            metalTransomsUpTo10Time = 24.6;
            metalTransomsUpTo10Price = 15.62;
            metalTransomsMore10Time = 30.2;
            metalTransomsMore10Price = 19.18;

            insideDoorUpTo2Time = 11;
            insideDoorUpTo2Price = 6.99;
            insideDoorUpTo4Time = 13.3;
            insideDoorUpTo4Price = 8.46;
            insideDoorMore4Time = 20.1;
            insideDoorMore4Price = 12.76;

            outsideDoorUpTo2Time = 14.1;
            outsideDoorUpTo2Price = 8.95;
            outsideDoorUpTo4Time = 18.1;
            outsideDoorUpTo4Price = 11.49;
            outsideDoorMore4Time = 24.6;
            outsideDoorMore4Price = 15.62;

            vestibuleTime = 32.4;
            vestibulePrice = 20.57;
        }

        woodTransomsUpTo2Time *= coef;
        woodTransomsUpTo2Price *= coef;
        woodTransomsUpTo4Time *= coef;
        woodTransomsUpTo4Price *= coef;
        woodTransomsUpTo6Time *= coef;
        woodTransomsUpTo6Price *= coef;
        woodTransomsMore6Time *= coef;
        woodTransomsMore6Price *= coef;

        metalTransomsUpTo2Time *= coef;
        metalTransomsUpTo2Price *= coef;
        metalTransomsUpTo5Time *= coef;
        metalTransomsUpTo5Price *= coef;
        metalTransomsUpTo10Time *= coef;
        metalTransomsUpTo10Price *= coef;
        metalTransomsMore10Time *= coef;
        metalTransomsMore10Price *= coef;

        insideDoorUpTo2Time *= coef;
        insideDoorUpTo2Price *= coef;
        insideDoorUpTo4Time *= coef;
        insideDoorUpTo4Price *= coef;
        insideDoorMore4Time *= coef;
        insideDoorMore4Price *= coef;

        outsideDoorUpTo2Time *= coef;
        outsideDoorUpTo2Price *= coef;
        outsideDoorUpTo4Time *= coef;
        outsideDoorUpTo4Price *= coef;
        outsideDoorMore4Time *= coef;
        outsideDoorMore4Price *= coef;

        vestibuleTime *= coef;
        vestibulePrice *= coef;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"", "<html>Фрамуги, окна и витрины с деревянными" +
                        " переплётами площадью проёма в м²:</html>", "", "", ""},
                {"239", "До 2", jobRank, woodTransomsUpTo2Time, woodTransomsUpTo2Price},
                {"240", ",более 2 до 4", jobRank, woodTransomsUpTo4Time, woodTransomsUpTo4Price},
                {"241", ",более 4 до 6", jobRank, woodTransomsUpTo6Time, woodTransomsUpTo6Price},
                {"242", ",более 6", jobRank, woodTransomsMore6Time, woodTransomsMore6Price},

                {"", "<html>C металлическими переплётами " +
                        "площадью проёма в м²:</html>", "", "", ""},
                {"243", "До 2", jobRank, metalTransomsUpTo2Time, metalTransomsUpTo2Time},
                {"244", ",более 2 до 5", jobRank, metalTransomsUpTo5Time, metalTransomsUpTo5Time},
                {"245", ",более 5 до 10", jobRank, metalTransomsUpTo10Time, metalTransomsUpTo10Price},
                {"246", ",более 10", jobRank, metalTransomsMore10Time, metalTransomsMore10Time},

                {"", "<html>Двери внутренние площадью " +
                        "проёма в м²:</html>", "", "", ""},
                {"247", "До 2", jobRank, insideDoorUpTo2Time, insideDoorUpTo2Price},
                {"248", ",более 2 до 4", jobRank, insideDoorUpTo4Time, insideDoorUpTo4Price},
                {"249", ",более 4 ", jobRank, insideDoorMore4Time, insideDoorMore4Price},

                {"", "<html>Двери внещние площадью " +
                        "проёма в м²:</html>", "", "", ""},
                {"247", "До 2", jobRank, outsideDoorUpTo2Time, outsideDoorUpTo2Price},
                {"248", ",более 2 до 4", jobRank, outsideDoorUpTo4Time, outsideDoorUpTo4Price},
                {"249", ",более 4 ", jobRank, outsideDoorMore4Time, outsideDoorMore4Price},
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
