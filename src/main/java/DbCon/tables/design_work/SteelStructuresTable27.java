//Стальные конструкции табл.27

package DbCon.tables.design_work;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class SteelStructuresTable27 extends JFrame {

    String jobRank1;
    String jobRank2;

    double beamsGirdersTime;
    double beamsGirdersPrice;

    double beamsRunsCompositeSectionTime;
    double beamsRunsCompositeSectionPrice;

    double simpleColumnsTime;
    double simpleColumnsPrice;

    double compoundSectionColumnsTime;
    double compoundSectionColumnsPrice;

    double simpleFarmsTime;
    double simpleFarmsPrice;

    double farmsWithFalseCeilingTime;
    double farmsWithFalseCeilingPrice;


    public SteelStructuresTable27(int answer) {

        if (answer == 1) {
            jobRank1 = "IV";
            jobRank2 = "V";

            beamsGirdersTime = 0.61;
            beamsGirdersPrice = 31.7;

            beamsRunsCompositeSectionTime = 4.34;
            beamsRunsCompositeSectionPrice = 2.76;

            simpleColumnsTime = 1.22;
            simpleColumnsPrice = 63.4;

            compoundSectionColumnsTime = 1.79;
            compoundSectionColumnsPrice = 1.14;

            simpleFarmsTime = 18.7;
            simpleFarmsPrice = 11.88;

            farmsWithFalseCeilingTime = 22.9;
            farmsWithFalseCeilingPrice = 11.91;

        } else if (answer == 2) {
            jobRank1 = "V";
            jobRank2 = "V";

            beamsGirdersTime = 0.94;
            beamsGirdersPrice = 59.7;

            beamsRunsCompositeSectionTime = 6.13;
            beamsRunsCompositeSectionPrice = 3.89;

            simpleColumnsTime = 1.36;
            simpleColumnsPrice = 86.4;

            compoundSectionColumnsTime = 2.29;
            compoundSectionColumnsPrice = 1.45;

            simpleFarmsTime = 2.29;
            simpleFarmsPrice = 1.45;

            farmsWithFalseCeilingTime = 30.4;
            farmsWithFalseCeilingPrice = 19.30;

        } else if (answer == 3) {
            jobRank1 = "V";
            jobRank2 = "V";

            beamsGirdersTime = 1.87;
            beamsGirdersPrice = 1.19;

            beamsRunsCompositeSectionTime = 0;
            beamsRunsCompositeSectionPrice = 0;

            simpleColumnsTime = 0;
            simpleColumnsPrice = 0;

            compoundSectionColumnsTime = 3.39;
            compoundSectionColumnsPrice = 2.15;

            simpleFarmsTime = 30.4;
            simpleFarmsPrice = 19.30;

            farmsWithFalseCeilingTime = 38.4;
            farmsWithFalseCeilingPrice = 24.38;
        }


        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Измеритель", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"280", "Балки и прогоны несоставного сечения", "пролёт", jobRank1, beamsGirdersTime, beamsGirdersPrice},
                {"281", "Балки прогоны составного сечения", "-", jobRank2, beamsRunsCompositeSectionTime, beamsRunsCompositeSectionPrice},
                {"282", "Колонны простые", "сечение", jobRank1, simpleColumnsTime, simpleColumnsPrice},
                {"283", "Колонны составного сечения", "", jobRank2, compoundSectionColumnsTime, compoundSectionColumnsPrice},
                {"284", "Фермы простые", "шт.", jobRank2, simpleFarmsTime, simpleFarmsPrice},
                {"285", "Фермы с подвесным потолком", "-", jobRank1, farmsWithFalseCeilingTime, farmsWithFalseCeilingPrice},
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
