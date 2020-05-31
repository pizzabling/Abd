//Генеральные планы городов, поселков табл. 2

package DbCon.tables;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class LocalityMasterPlanTable2 extends JFrame {

    double cityMasterPlanTime1;
    double cityMasterPlanPrice1;
    double cityMasterPlanTime2;
    double cityMasterPlanPrice2;
    double modificationAdditionTime;
    double modificationAdditionPrice;
    double supportPlanDesingTime;
    double supportPlanDesingPrice;
    double drawingReferencePlanTime;
    double drawingReferencePlanPrice;
    double drawingCommunicationsTime;
    double drawingCommunicationsPrice;
    double inkStrokeTime;
    double inkStrokePrice;
    double bypassPaintTime;
    double bypassPaintPrice;
    double TracingAmmoniaPaperTime;
    double TracingAmmoniaPaperPrice;
    double finalDrawingPlanTime;
    double finalDrawingPlanPrice;
    double masterOutlinePlanTime;
    double masterOutlinePlanPrice;
    double masterPlanPaintingTime;
    double masterPlanPaintingPrice;
    double pushingMasterPlanTime;
    double pushingMasterPlanPrice;
    double carcassDecorationTime;
    double carcassDecorationPrice;
    double transferFromMainDrawingTime;
    double transferFromMainDrawingPrice;
    double desingMasterInkAndColorTime;
    double desingMasterInkAndColorPrice;
    double transferExecutionHighwaysTime;
    double transferExecutionHighwaysPrice;
    double makingCopyCircuitTime;
    double makingCopyCircuitPrice;
    double squeezingTracingSchemeTime;
    double squeezingTracingSchemePrice;
    double paitingPaperSquaresTime;
    double paitingPaperSquaresPrice;
    double hatchingParallelLinesTime;
    double hatchingParallelLinesPrice;
    double transferDrawingDesignInMascaraTime;
    double transferDrawingDesignInMascaraPrice;
    double transferDrawingDesignSchemaTime;
    double transferDrawingDesignSchemaPrice;
    double mascaraDesignTime;
    double mascaraDesignPrice;
    double drawingExistingNetWorksTime;
    double drawingExistingNetWorksPrice;
    double transferExecutionTime;
    double transferExecutionPrice;
    double drawingExistingNetWorksTime1;
    double drawingExistingNetWorksPrice1;
    double transferExecutionNetworksTime;
    double transferExecutionNetworksPrice;
    double transferExecutionInMascaraTime1;
    double transferExecutionInMascaraPrice1;
    double transferExecutionHighlightingTime;
    double transferExecutionHighlightingPrice;
    double transferExecutionInMascaraTime2;
    double transferExecutionInMascaraPrice2;

    public LocalityMasterPlanTable2(double answear, double percent1, double percent2) {
        if (answear == 1) {
            cityMasterPlanTime1 = 95.5;
            cityMasterPlanPrice1 = 49.66;
            cityMasterPlanTime2 = 450;
            cityMasterPlanPrice2 = 207.90;
            modificationAdditionTime = 55.9;
            modificationAdditionPrice = 29.07;
            supportPlanDesingTime = 40.7;
            supportPlanDesingPrice = 18.80;
            drawingReferencePlanTime = 35.7;
            drawingReferencePlanPrice = 16.49;
            drawingCommunicationsTime = 32.4;
            drawingCommunicationsPrice = 14.97;
            inkStrokeTime = 11.9;
            inkStrokePrice = 5.50;
            bypassPaintTime = 53.5;
            bypassPaintPrice = 24.72;
            TracingAmmoniaPaperTime = 39.6;
            TracingAmmoniaPaperPrice = 20.59;
            finalDrawingPlanTime = 20.2;
            finalDrawingPlanPrice = 9.33;
            masterOutlinePlanTime = 28.8;
            masterOutlinePlanPrice = 13.31;
            masterPlanPaintingTime = 38.6;
            masterPlanPaintingPrice = 17.83;
            pushingMasterPlanTime = 14;
            pushingMasterPlanPrice = 6.47;
            carcassDecorationTime = 26.8;
            carcassDecorationPrice = 12.38;
            transferFromMainDrawingTime = 3.3;
            transferFromMainDrawingPrice = 1.53;
            desingMasterInkAndColorTime = 10.7;
            desingMasterInkAndColorPrice = 4.94;
            transferExecutionHighwaysTime = 56.5;
            transferExecutionHighwaysPrice = 26.10;
            makingCopyCircuitTime = 2.38;
            makingCopyCircuitPrice = 1.10;
            squeezingTracingSchemeTime = 8.92;
            squeezingTracingSchemePrice = 4.12;
            paitingPaperSquaresTime = 3.27;
            paitingPaperSquaresPrice = 1.51;
            hatchingParallelLinesTime = 2.38;
            hatchingParallelLinesPrice = 1.10;
            transferDrawingDesignInMascaraTime = 6.24;
            transferDrawingDesignInMascaraPrice = 2.88;
            transferDrawingDesignSchemaTime = 14.6;
            transferDrawingDesignSchemaPrice = 6.75;
            mascaraDesignTime = 6.84;
            mascaraDesignPrice = 3.16;
            drawingExistingNetWorksTime = 5.05;
            drawingExistingNetWorksPrice = 2.33;
            transferExecutionTime = 3.27;
            transferExecutionPrice = 1.51;
            drawingExistingNetWorksTime1 = 3.27;
            drawingExistingNetWorksPrice1 = 1.51;
            transferExecutionNetworksTime = 8.92;
            transferExecutionNetworksPrice = 4.12;
            transferExecutionInMascaraTime1 = 2.38;
            transferExecutionInMascaraPrice1 = 1.10;
            transferExecutionHighlightingTime = 2.68;
            transferExecutionHighlightingPrice = 1.24;
            transferExecutionInMascaraTime2 = 6.7;
            transferExecutionInMascaraPrice2 = 3.10;
        } else if (answear == 2) {
            cityMasterPlanTime1 = 262;
            cityMasterPlanPrice1 = 136.24;
            cityMasterPlanTime2 = 1232;
            cityMasterPlanPrice2 = 569.18;
            modificationAdditionTime = 154;
            modificationAdditionPrice = 80.08;
            supportPlanDesingTime = 111;
            supportPlanDesingPrice = 51.28;
            drawingReferencePlanTime = 95.7;
            drawingReferencePlanPrice = 44.21;
            drawingCommunicationsTime = 86.5;
            drawingCommunicationsPrice = 39.96;
            inkStrokeTime = 29.4;
            inkStrokePrice = 13.58;
            bypassPaintTime = 150;
            bypassPaintPrice = 69.30;
            TracingAmmoniaPaperTime = 108;
            TracingAmmoniaPaperPrice = 56.16;
            finalDrawingPlanTime = 57.4;
            finalDrawingPlanPrice = 26.52;
            masterOutlinePlanTime = 78.8;
            masterOutlinePlanPrice = 36.41;
            masterPlanPaintingTime = 107;
            masterPlanPaintingPrice = 49.43;
            pushingMasterPlanTime = 38.6;
            pushingMasterPlanPrice = 17.83;
            carcassDecorationTime = 72.5;
            carcassDecorationPrice = 33.50;
            transferFromMainDrawingTime = 9.21;
            transferFromMainDrawingPrice = 4.26;
            desingMasterInkAndColorTime = 29.4;
            desingMasterInkAndColorPrice = 13.58;
            transferExecutionHighwaysTime = 155;
            transferExecutionHighwaysPrice = 71.61;
            makingCopyCircuitTime = 6.24;
            makingCopyCircuitPrice = 2.88;
            squeezingTracingSchemeTime = 24.7;
            squeezingTracingSchemePrice = 11.41;
            paitingPaperSquaresTime = 9.21;
            paitingPaperSquaresPrice = 4.26;
            hatchingParallelLinesTime = 6.24;
            hatchingParallelLinesPrice = 2.88;
            transferDrawingDesignInMascaraTime = 16.9;
            transferDrawingDesignInMascaraPrice = 7.81;
            transferDrawingDesignSchemaTime = 40.1;
            transferDrawingDesignSchemaPrice = 18.53;
            mascaraDesignTime = 18.7;
            mascaraDesignPrice = 8.64;
            drawingExistingNetWorksTime = 14;
            drawingExistingNetWorksPrice = 6.47;
            transferExecutionTime = 9.22;
            transferExecutionPrice = 4.26;
            drawingExistingNetWorksTime1 = 9.22;
            drawingExistingNetWorksPrice1 = 4.26;
            transferExecutionNetworksTime = 24.7;
            transferExecutionNetworksPrice = 11.41;
            transferExecutionInMascaraTime1 = 6.24;
            transferExecutionInMascaraPrice1 = 2.88;
            transferExecutionHighlightingTime = 7.72;
            transferExecutionHighlightingPrice = 3.57;
            transferExecutionInMascaraTime2 = 18.7;
            transferExecutionInMascaraPrice2 = 8.64;
        } else if (answear == 3) {
            cityMasterPlanTime1 = 419;
            cityMasterPlanPrice1 = 217.88;
            cityMasterPlanTime2 = 1995;
            cityMasterPlanPrice2 = 921.69;
            modificationAdditionTime = 247;
            modificationAdditionPrice = 128.44;
            supportPlanDesingTime = 176;
            supportPlanDesingPrice = 81.31;
            drawingReferencePlanTime = 155;
            drawingReferencePlanPrice = 77.61;
            drawingCommunicationsTime = 140;
            drawingCommunicationsPrice = 64.68;
            inkStrokeTime = 47.2;
            inkStrokePrice = 21.81;
            bypassPaintTime = 239;
            bypassPaintPrice = 110.42;
            TracingAmmoniaPaperTime = 172;
            TracingAmmoniaPaperPrice = 89.44;
            finalDrawingPlanTime = 105;
            finalDrawingPlanPrice = 48.51;
            masterOutlinePlanTime = 127;
            masterOutlinePlanPrice = 58.67;
            masterPlanPaintingTime = 169;
            masterPlanPaintingPrice = 78.08;
            pushingMasterPlanTime = 65.1;
            pushingMasterPlanPrice = 30.08;
            carcassDecorationTime = 117;
            carcassDecorationPrice = 54.05;
            transferFromMainDrawingTime = 15.8;
            transferFromMainDrawingPrice = 7.30;
            desingMasterInkAndColorTime = 47.2;
            desingMasterInkAndColorPrice = 21.81;
            transferExecutionHighwaysTime = 250;
            transferExecutionHighwaysPrice = 115.50;
            makingCopyCircuitTime = 10.1;
            makingCopyCircuitPrice = 4.67;
            squeezingTracingSchemeTime = 39.5;
            squeezingTracingSchemePrice = 18.25;
            paitingPaperSquaresTime = 15.2;
            paitingPaperSquaresPrice = 7.02;
            hatchingParallelLinesTime = 10.1;
            hatchingParallelLinesPrice = 4.67;
            transferDrawingDesignInMascaraTime = 27.3;
            transferDrawingDesignInMascaraPrice = 12.61;
            transferDrawingDesignSchemaTime = 64.5;
            transferDrawingDesignSchemaPrice = 29.80;
            mascaraDesignTime = 29.7;
            mascaraDesignPrice = 13.72;
            drawingExistingNetWorksTime = 22.6;
            drawingExistingNetWorksPrice = 10.44;
            transferExecutionTime = 15.2;
            transferExecutionPrice = 7.02;
            drawingExistingNetWorksTime1 = 15.02;
            drawingExistingNetWorksPrice1 = 7.02;
            transferExecutionNetworksTime = 40.1;
            transferExecutionNetworksPrice = 18.53;
            transferExecutionInMascaraTime1 = 10.1;
            transferExecutionInMascaraPrice1 = 4.67;
            transferExecutionHighlightingTime = 12.5;
            transferExecutionHighlightingPrice = 5.78;
            transferExecutionInMascaraTime2 = 29.7;
            transferExecutionInMascaraPrice2 = 13.72;
        } else if (answear == 4) {
            cityMasterPlanTime1 = 864;
            cityMasterPlanPrice1 = 449.28;
            cityMasterPlanTime2 = 4071;
            cityMasterPlanPrice2 = 1880.80;
            modificationAdditionTime = 506;
            modificationAdditionPrice = 263.12;
            supportPlanDesingTime = 368;
            supportPlanDesingPrice = 170.02;
            drawingReferencePlanTime = 315;
            drawingReferencePlanPrice = 145.53;
            drawingCommunicationsTime = 287;
            drawingCommunicationsPrice = 132.59;
            inkStrokeTime = 97.2;
            inkStrokePrice = 44.91;
            bypassPaintTime = 496;
            bypassPaintPrice = 229.15;
            TracingAmmoniaPaperTime = 358;
            TracingAmmoniaPaperPrice = 186.16;
            finalDrawingPlanTime = 189;
            finalDrawingPlanPrice = 87.32;
            masterOutlinePlanTime = 261;
            masterOutlinePlanPrice = 120.58;
            masterPlanPaintingTime = 353;
            masterPlanPaintingPrice = 163.09;
            pushingMasterPlanTime = 128;
            pushingMasterPlanPrice = 59.14;
            carcassDecorationTime = 240;
            carcassDecorationPrice = 110.88;
            transferFromMainDrawingTime = 30.6;
            transferFromMainDrawingPrice = 14.14;
            desingMasterInkAndColorTime = 97.2;
            desingMasterInkAndColorPrice = 44.91;
            transferExecutionHighwaysTime = 510;
            transferExecutionHighwaysPrice = 235.82;
            makingCopyCircuitTime = 20.5;
            makingCopyCircuitPrice = 9.47;
            squeezingTracingSchemeTime = 81.7;
            squeezingTracingSchemePrice = 37.75;
            paitingPaperSquaresTime = 30.6;
            paitingPaperSquaresPrice = 14.14;
            hatchingParallelLinesTime = 20.5;
            hatchingParallelLinesPrice = 9.47;
            transferDrawingDesignInMascaraTime = 56.2;
            transferDrawingDesignInMascaraPrice = 25.96;
            transferDrawingDesignSchemaTime = 133;
            transferDrawingDesignSchemaPrice = 61.45;
            mascaraDesignTime = 60.9;
            mascaraDesignPrice = 28.14;
            drawingExistingNetWorksTime = 46.1;
            drawingExistingNetWorksPrice = 21.30;
            transferExecutionTime = 30.6;
            transferExecutionPrice = 14.14;
            drawingExistingNetWorksTime1 = 30.6;
            drawingExistingNetWorksPrice1 = 14.14;
            transferExecutionNetworksTime = 81.7;
            transferExecutionNetworksPrice = 37.75;
            transferExecutionInMascaraTime1 = 20.5;
            transferExecutionInMascaraPrice1 = 9.47;
            transferExecutionHighlightingTime = 25.6;
            transferExecutionHighlightingPrice = 11.83;
            transferExecutionInMascaraTime2 = 60.9;
            transferExecutionInMascaraPrice2 = 28.14;
        }


        carcassDecorationTime*=percent2;
        carcassDecorationPrice*=percent2;

        desingMasterInkAndColorTime*=percent2;
        desingMasterInkAndColorPrice*=percent2;

        transferDrawingDesignInMascaraTime*=percent1;
        transferDrawingDesignInMascaraPrice*=percent1;

        mascaraDesignTime*=percent2;
        mascaraDesignPrice*=percent2;

        transferExecutionNetworksTime*=percent1;
        transferExecutionNetworksPrice*=percent1;

        transferExecutionInMascaraTime1*=percent1;
        transferExecutionInMascaraPrice1*=percent1;

        transferExecutionHighlightingTime*=percent1;
        transferExecutionHighlightingPrice*=percent1;

        transferExecutionInMascaraTime2*=percent1;
        transferExecutionInMascaraPrice2*=percent1;

        Object[] columnsHeader = new Object[]{"Наименование работы", "Разряд работы", "Норма времени", "Расценка"};
        Object[][] array = new Object[][]{
                {"Генеральный план города, поселка", "IV", cityMasterPlanTime1, cityMasterPlanPrice1},
                {"", "III", cityMasterPlanTime2, cityMasterPlanPrice2},
                {"Архитектурно-планировочные работы", "", "", ""},
                {"Основные чертежи", "", "", ""},
                {"Нанесение изменений и дополнений по застройке города и инженерных сетей", "IV", modificationAdditionTime, modificationAdditionPrice},
                {"<html>Оформление скорректированного предвариельного опорного плана <br>в красках на аммиачной бумаге</br></html>", "III", supportPlanDesingTime, supportPlanDesingPrice},
                {"Передавливание и вычерчивание опорного плана", "III", drawingReferencePlanTime, drawingReferencePlanPrice},
                {"Нанесение коммуникаций и дорожных покрытий с графических и текстовых материалов", "III", drawingCommunicationsTime, drawingCommunicationsPrice},
                {"Обводка тушью опорного плана на ватмане", "III", inkStrokeTime, inkStrokePrice},
                {"Покраска опорного плана и обводка тушью всех коммуникаций на ватмане", "III", bypassPaintTime, bypassPaintPrice},
                {"Вычерчивание, покраска экскизов на аммиачной бумаге для выдачи задания", "IV", TracingAmmoniaPaperTime, TracingAmmoniaPaperPrice},
                {"Окончательное вычерчивание на ватмане генерального плана", "III", finalDrawingPlanTime, finalDrawingPlanPrice},
                {"Обводка тушью вычерченного генерального плана", "III", masterOutlinePlanTime, masterOutlinePlanPrice},
                {"Покраска генерального плана на ватмане", "III", masterPlanPaintingTime, masterPlanPaintingPrice},
                {"Передавливание и вычерчивание сводного плана на ватмане", "III", pushingMasterPlanTime, pushingMasterPlanPrice},
                {"Оформление в туши и красках сводного плана на ватмане", "III", carcassDecorationTime, carcassDecorationPrice},
                {"Перенесение с основного чертежа и вычерчивание в карандаше генерального плана города", "III", transferFromMainDrawingTime, transferFromMainDrawingPrice},
                {"Оформление в туши и красках генерального плана района", "III", desingMasterInkAndColorTime, desingMasterInkAndColorPrice},
                {"Инженерные схемы", "", "", ""},
                {"Транспорт", "", "", ""},
                {"Перенесение и оформление схемы магистралей и транспорта с покраской зонирования", "III", transferExecutionHighwaysTime, transferExecutionHighwaysPrice},
                {"Схема планировочных ограничений", "", "", ""},
                {"Снятие копии схемы оценки территории на кальку в карандаше", "III", makingCopyCircuitTime, makingCopyCircuitPrice},
                {"Передавливание и вычерчивание схем", "III", squeezingTracingSchemeTime, squeezingTracingSchemePrice},
                {"Оформление в туши и красках с заштриховкой по условным обозначениям и выполнением всех надписей", "", "", ""},
                {"Покраска на ватмане площадей различных конфигураций с выполнением всех надписей", "III", paitingPaperSquaresTime, paitingPaperSquaresPrice},
                {"Штриховка параллельными линиями различных направлений и густоты с выполнением всех надписей", "III", hatchingParallelLinesTime, hatchingParallelLinesPrice},
                {"Инженерная подготовка территорий", "", "", ""},
                {"Перенесение, вычерчивание и оформление в туши и красках схемы инженерной подготовки", "III", transferDrawingDesignInMascaraTime, transferDrawingDesignInMascaraPrice},
                {"Перенесение, вычерчивание и оформление совмещённой схемы инженерной подготовки", "III", transferDrawingDesignSchemaTime, transferDrawingDesignSchemaPrice},
                {"Вертикальная планировка", "", "", ""},
                {"Оформление схемы в туши и красках с выделением зонирования и выполнением всех надписей", "III", mascaraDesignTime, mascaraDesignPrice},
                {"Водопровод и канализация", "", "", ""},
                {"Нанесение существующих сетей водопровода на генеральный план города или поселка", "III", drawingExistingNetWorksTime, drawingExistingNetWorksPrice},
                {"Перенесение и оформление в туши и красках схемы водопровода", "III", transferExecutionTime, transferExecutionPrice},
                {"Нанесение существующих сетей канализации на генеральный план города или посёлка", "III", drawingExistingNetWorksTime1, drawingExistingNetWorksPrice1},
                {"Перенесение и оформление в туши и красках совмещённых схем водопровода и канализации", "III", transferExecutionNetworksTime, transferExecutionNetworksPrice},
                {"Перенесение и оформление схемы канализации в туши и красках с выделением зонирования", "III", transferExecutionInMascaraTime1, transferExecutionInMascaraPrice1},
                {"Энергоснабжение", "", "", ""},
                {"Перенесение и оформление в туши и красках с выделением зонирования схем теплофикации", "III", transferExecutionHighlightingTime, transferExecutionHighlightingPrice},
                {"<html>Перенесение и оформление в туши и красках совмещённой схемы <br>энергоснабжения с выделением зонирования</br></html>", "III", transferExecutionInMascaraTime2, transferExecutionInMascaraPrice2}
        };

        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.getColumnModel().getColumn(0).setMinWidth(350);
        table.setRowHeight(28);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(800, 400);
        System.out.println("Вызвано");
    }
}
