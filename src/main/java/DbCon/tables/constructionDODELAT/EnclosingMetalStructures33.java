//Ограждающие металлические конструкции
//(витражи, подвесные потолки, навесные панели,
//перегородки и т. п.) табл. 33

package DbCon.tables.constructionDODELAT;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class EnclosingMetalStructures33 extends JFrame {

    double wiringDiagramsTime;
    double wiringDiagramsPrice;

    double mountingStampsTime;
    double mountingStampsPrice;

    double assembliesSectionsMountingMarksTime;
    double assembliesSectionsMountingMarksPrice;

    double detailDrawingsTime;
    double detailDrawingsPrice;

    public EnclosingMetalStructures33(int answer, double coef1, double coef2, double coef3) {
        String jobRank1 = "IV";
        String jobRank2 = "III";

        if (answer == 1) {
            wiringDiagramsTime = 28.1;
            wiringDiagramsPrice = 14.61;

            mountingStampsTime = 21.7;
            mountingStampsPrice = 11.28;

            assembliesSectionsMountingMarksTime = 16.8;
            assembliesSectionsMountingMarksPrice = 8.74;

            detailDrawingsTime = 13.6;
            detailDrawingsPrice = 6.28;

        } else if (answer == 2) {
            wiringDiagramsTime = 35.9;
            wiringDiagramsPrice = 18.67;

            mountingStampsTime = 28.1;
            mountingStampsPrice = 14.61;

            assembliesSectionsMountingMarksTime = 21.7;
            assembliesSectionsMountingMarksPrice = 11.28;

            detailDrawingsTime = 22.3;
            detailDrawingsPrice = 10.30;

        } else if (answer == 3) {
            wiringDiagramsTime = 41.6;
            wiringDiagramsPrice = 21.63;

            mountingStampsTime = 30.9;
            mountingStampsPrice = 16.07;

            assembliesSectionsMountingMarksTime = 28.1;
            assembliesSectionsMountingMarksPrice = 14.61;

            detailDrawingsTime = 26.3;
            detailDrawingsPrice = 12.15;
        }

        wiringDiagramsTime *= 0.7;
        wiringDiagramsPrice *= 0.7;

        assembliesSectionsMountingMarksTime *= coef1 * coef2 * coef3;
        assembliesSectionsMountingMarksPrice *= coef1 * coef2 * coef3;

        detailDrawingsTime *= 1.2;
        detailDrawingsPrice *= 1.2;

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"311", "Монтажные схемы (марки КМ)", jobRank1, wiringDiagramsTime, wiringDiagramsPrice},
                {"312", "Монтажные марки (марки КМ)", jobRank1, mountingStampsTime, mountingStampsPrice},
                {"313", "Узлы и сечения по монтажным маркам (марки КМ)", jobRank1, assembliesSectionsMountingMarksTime, assembliesSectionsMountingMarksPrice},
                {"314", "Деталировочные чертежи(марки КМД)", jobRank2, detailDrawingsTime, detailDrawingsPrice},
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
