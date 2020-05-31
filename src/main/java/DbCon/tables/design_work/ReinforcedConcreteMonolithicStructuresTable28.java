//Железобетонные монолитные конструкции табл. 28

package DbCon.tables.design_work;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class ReinforcedConcreteMonolithicStructuresTable28 extends JFrame {

    String jobRank;

    double ReinforcedConcreteBeamSlabsTime;
    double ReinforcedConcreteBeamSlabsPrice;

    double ReinforcedConcreteBeamSlabsSupportedTime;
    double ReinforcedConcreteBeamSlabsSupportedPrice;

    double ReinforcedConcreteBeamsGirdersTime;
    double ReinforcedConcreteBeamsGirdersPrice;

    double ReinforcedConcreteColumnsTime;
    double ReinforcedConcreteColumnsPrice;

    public ReinforcedConcreteMonolithicStructuresTable28(int answer) {
        if (answer == 1) {
            jobRank = "IV";

            ReinforcedConcreteBeamSlabsTime = 0.75;
            ReinforcedConcreteBeamSlabsPrice = 0.39;

            ReinforcedConcreteBeamSlabsSupportedTime = 1.22;
            ReinforcedConcreteBeamSlabsSupportedPrice = 63.4;

            ReinforcedConcreteBeamsGirdersTime = 0.92;
            ReinforcedConcreteBeamsGirdersPrice = 47.8;

            ReinforcedConcreteColumnsTime = 0.92;
            ReinforcedConcreteColumnsPrice = 47.8;

        } else if (answer == 2) {
            jobRank = "v";

            ReinforcedConcreteBeamSlabsTime = 1.22;
            ReinforcedConcreteBeamSlabsPrice = 77.5;

            ReinforcedConcreteBeamSlabsSupportedTime = 1.64;
            ReinforcedConcreteBeamSlabsSupportedPrice = 1.04;

            ReinforcedConcreteBeamsGirdersTime = 1.33;
            ReinforcedConcreteBeamsGirdersPrice = 84.5;

            ReinforcedConcreteColumnsTime = 1.7;
            ReinforcedConcreteColumnsPrice = 1.08;

        } else if (answer == 3) {
            jobRank = "V";

            ReinforcedConcreteBeamSlabsTime = 0;
            ReinforcedConcreteBeamSlabsPrice = 0;

            ReinforcedConcreteBeamSlabsSupportedTime = 0;
            ReinforcedConcreteBeamSlabsSupportedPrice = 0;

            ReinforcedConcreteBeamsGirdersTime = 2.54;
            ReinforcedConcreteBeamsGirdersPrice = 1.61;

            ReinforcedConcreteColumnsTime = 2.54;
            ReinforcedConcreteColumnsPrice = 1.61;
        }

        Object[] columnsHeader = new Object[]{"№ нормы", "Наименование работы", "Измеритель", "Разряд работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"286", "Железобетонные балочные плиты", "пролёт", jobRank, ReinforcedConcreteBeamSlabsTime, ReinforcedConcreteBeamSlabsPrice},
                {"287", "Железобетонные плиты, опёртые по" +
                        "контуру, или плиты безбалочного" +
                        "перекрытия", "-", jobRank, ReinforcedConcreteBeamSlabsSupportedTime, ReinforcedConcreteBeamSlabsSupportedPrice},
                {"288", "Железобетонные балки, прогоны, колонны" +
                        "и ростверки", "пролёт", jobRank, ReinforcedConcreteBeamsGirdersTime, ReinforcedConcreteBeamsGirdersPrice},
                {"289", "Железобетонные колонны", "сечение", jobRank, ReinforcedConcreteColumnsTime, ReinforcedConcreteColumnsPrice}
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
