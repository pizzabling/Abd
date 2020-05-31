//Проект детальной планировки табл. 3

package DbCon.tables;

import DbCon.settings.MultiLineCellRenderer;

import javax.swing.*;
import java.awt.*;

public class DetailedLayoutProjectTable3 extends JFrame {

    double detailedLayoutProjectTime;
    double detailedLayoutProjectPrice;

    //Корректировка существующего опорного плана-нанесение карандашом текущих изменений
    double adjustExistingReferencePlanTime;
    double adjustExistingReferencePlanPrice;

    //Оформление откорректированного опорного плана в туши и красках
    double reflerectingCorrectedReferencePlanTime;
    double reflerectingCorrectedReferencePlanPrice;

    //Вычерчивание в карандаше плана населенного пункта или эскиза застройки
    double drawingPlanVillageTime;
    double drawingPlanVillagePrice;

    //Нанесение на план населённого пункта или эскиз застройки подземных коммуникаций с разных графических или текстовых материалов
    double drawingOnPlanSettlementCommunicTime;
    double drawingOnPlanSettlementCommunicPrice;

    //Покраска эскиза застройки
    double paintingSketchTime;
    double paintingSketchPrice;

    //Графическое оформление плана красных линий на ватмане с обводкой цветной тушью
    double whatmanRedLinesGraphDesingTime;
    double whatmanRedLinesGraphDesingPrice;

    //Графическое оформление плана красных линий на светокопии
    double graphDesignRedLinesBlueprintTime;
    double graphDesignRedLinesBlueprintPrice;


    //Вычерчивание в карандаше и обводка тушью поперечных профилей городских улиц и проездов с экспликацией
    double inkStrokeTransverseStreetProfilesTime;
    double inkStrokeTransverseStreetProfilesPrice;
    //Расчерчивание в карандаше с имеющихся материалов и экскизов автора горизонтальной планировки-
    //городских проездов, красных линий, направлений движений транспорта в одну линию, светофоров-
    //с выполнением всех надписей
    double drawingMaterialsAuthorTime;
    double drawingMaterialsAuthorPrice;

    //Обводка тушью схемы движения транспорта, отбивка кантов по красным линиям, покраска кварталов-
    //, обводкацветной тушью схемы транспорта, выполнение всех надписей
    double inkStrokesTrafficPatternsTime;
    double inkStrokesTrafficPatternsPrice;

    //Оформление в красках различных схем на фото для пояснительных записок
    double designPaintsVariousSchemesInPhotoTime;
    double designPaintsVariousSchemesInPhotoPrice;

    //Перенесение, вычерчивание и оформление схемы инженерной подготовки и ливнестоков с покраской-
    //подготовки и выполнением всех надписей
    double transferEngineerSchemesTime;
    double transferEngineerSchemesPrice;

    //Оформление схемы вертикальной планировки в туши и красках и выполнение всех надписей
    double verticalLayoutDesignTime;
    double verticalLayoutDesignPrice;

    public DetailedLayoutProjectTable3(double answear, double percent1, double percent2) {
        if (answear == 1) {
            detailedLayoutProjectTime = 891;
            detailedLayoutProjectPrice = 411.64;
            adjustExistingReferencePlanTime = 38.3;
            adjustExistingReferencePlanPrice = 17.7;
            reflerectingCorrectedReferencePlanTime = 98.1;
            reflerectingCorrectedReferencePlanPrice = 45.32;
            drawingPlanVillageTime = 80.2;
            drawingPlanVillagePrice = 37.05;
            drawingOnPlanSettlementCommunicTime = 210;
            drawingOnPlanSettlementCommunicPrice = 97.02;
            paintingSketchTime = 89.1;
            paintingSketchPrice = 41.16;
            whatmanRedLinesGraphDesingTime = 28.5;
            whatmanRedLinesGraphDesingPrice = 13.17;
            graphDesignRedLinesBlueprintTime = 15.2;
            graphDesignRedLinesBlueprintPrice = 7.02;
            inkStrokeTransverseStreetProfilesTime = 42.8;
            inkStrokeTransverseStreetProfilesPrice = 19.77;
            drawingMaterialsAuthorTime = 101;
            drawingMaterialsAuthorPrice = 45.66;
            inkStrokesTrafficPatternsTime = 74.9;
            inkStrokesTrafficPatternsPrice = 34.60;
            designPaintsVariousSchemesInPhotoTime = 55.3;
            designPaintsVariousSchemesInPhotoPrice = 25.55;
            transferEngineerSchemesTime = 22.3;
            transferEngineerSchemesPrice = 10.30;
            verticalLayoutDesignTime = 35.7;
            verticalLayoutDesignPrice = 16.49;
        } else if (answear == 2) {
            detailedLayoutProjectTime = 1308;
            detailedLayoutProjectPrice = 604.30;
            adjustExistingReferencePlanTime = 56.2;
            adjustExistingReferencePlanPrice = 25.96;
            reflerectingCorrectedReferencePlanTime = 144;
            reflerectingCorrectedReferencePlanPrice = 66.53;
            drawingPlanVillageTime = 118;
            drawingPlanVillagePrice = 54.52;
            drawingOnPlanSettlementCommunicTime = 308;
            drawingOnPlanSettlementCommunicPrice = 142.30;
            paintingSketchTime = 131;
            paintingSketchPrice = 60.52;
            whatmanRedLinesGraphDesingTime = 41.9;
            whatmanRedLinesGraphDesingPrice = 19.36;
            graphDesignRedLinesBlueprintTime = 22.3;
            graphDesignRedLinesBlueprintPrice = 10.30;
            inkStrokeTransverseStreetProfilesTime = 62.7;
            inkStrokeTransverseStreetProfilesPrice = 28.97;
            drawingMaterialsAuthorTime = 148;
            drawingMaterialsAuthorPrice = 68.38;
            inkStrokesTrafficPatternsTime = 110;
            inkStrokesTrafficPatternsPrice = 50.82;
            designPaintsVariousSchemesInPhotoTime = 81.1;
            designPaintsVariousSchemesInPhotoPrice = 37.47;
            transferEngineerSchemesTime = 32.7;
            transferEngineerSchemesPrice = 15.11;
            verticalLayoutDesignTime = 52.3;
            verticalLayoutDesignPrice = 24.16;
        } else if (answear == 3) {
            detailedLayoutProjectTime = 1647;
            detailedLayoutProjectPrice = 760.91;
            adjustExistingReferencePlanTime = 71;
            adjustExistingReferencePlanPrice = 32.80;
            reflerectingCorrectedReferencePlanTime = 181;
            reflerectingCorrectedReferencePlanPrice = 83.62;
            drawingPlanVillageTime = 148;
            drawingPlanVillagePrice = 68.38;
            drawingOnPlanSettlementCommunicTime = 389;
            drawingOnPlanSettlementCommunicPrice = 179.72;
            paintingSketchTime = 165;
            paintingSketchPrice = 76.23;
            whatmanRedLinesGraphDesingTime = 52.9;
            whatmanRedLinesGraphDesingPrice = 24.44;
            graphDesignRedLinesBlueprintTime = 27.9;
            graphDesignRedLinesBlueprintPrice = 12.89;
            inkStrokeTransverseStreetProfilesTime = 79.3;
            inkStrokeTransverseStreetProfilesPrice = 36.64;
            drawingMaterialsAuthorTime = 186;
            drawingMaterialsAuthorPrice = 85.93;
            inkStrokesTrafficPatternsTime = 138;
            inkStrokesTrafficPatternsPrice = 63.76;
            designPaintsVariousSchemesInPhotoTime = 102;
            designPaintsVariousSchemesInPhotoPrice = 47.12;
            transferEngineerSchemesTime = 41.3;
            transferEngineerSchemesPrice = 19.08;
            verticalLayoutDesignTime = 66;
            verticalLayoutDesignPrice = 30.49;
        }

        reflerectingCorrectedReferencePlanTime*=percent2;
        reflerectingCorrectedReferencePlanPrice*=percent2;

        verticalLayoutDesignTime*=percent2;
        verticalLayoutDesignPrice*=percent2;

        Object[] columnsHeader = new Object[]{"Наименование работы", "Норма времени", "Расценки"};
        Object[][] array = new Object[][]{
                {"Проект детальной планировки", detailedLayoutProjectTime, detailedLayoutProjectPrice},
                {"В том числе:", "", ""},
                {"Корректировка существующего опорного плана", adjustExistingReferencePlanTime, adjustExistingReferencePlanPrice},
                {"Оформление откорректированного опорного плана в туши и красках", reflerectingCorrectedReferencePlanTime, reflerectingCorrectedReferencePlanPrice},
                {"Вычерчивание в карандаше плана населённого пункта или эскиза застройки", drawingPlanVillageTime, drawingPlanVillagePrice},
                {"Нанесение на план населённого пункта или эскиз застрйоки подземных коммуникаций", drawingOnPlanSettlementCommunicTime, drawingOnPlanSettlementCommunicPrice},
                {"Покраска эскиза застрйоки", paintingSketchTime, paintingSketchPrice},
                {"<html>Графическое оформление плана красных линий на ватмане с обводкой <br>цветной тушью</br></html>", whatmanRedLinesGraphDesingTime, whatmanRedLinesGraphDesingPrice},
                {"Графическое оформление плана красных линий на светокопии", graphDesignRedLinesBlueprintTime, graphDesignRedLinesBlueprintPrice},
                {"<html>Вычерчивание в карандаше и обводка тушью поперечных профилей <br>городских улиц и проездов с экспликацией</br></html>", inkStrokeTransverseStreetProfilesTime, inkStrokeTransverseStreetProfilesPrice},
                {"<html>Расчерчивание в карандаше с имеющихся материалов и <br>эскизов автора горизонтальной планировки городских проездов</br><html>", drawingMaterialsAuthorTime, drawingMaterialsAuthorPrice},
                {"<html>Обводка тушью схемы движения транспорта, <br>отбивка кантов по красным линиям и т.д.</br></html>", inkStrokesTrafficPatternsTime, inkStrokesTrafficPatternsPrice},
                {"Оформление в красках различных схем на фото для пояснительных записок", designPaintsVariousSchemesInPhotoTime, designPaintsVariousSchemesInPhotoPrice},
                {"<html>Перенесение, вычерчивание и оформление схемы инженерной подготовки и <br>ливнестоков с покраской</br></html>", transferEngineerSchemesTime, transferEngineerSchemesPrice},
                {"<html>Оформление схемы вертикальной планировки в туши и красках и <br>выполнение всех надписей</br></html>", verticalLayoutDesignTime, verticalLayoutDesignPrice}
        };
        JTable table = new JTable(array, columnsHeader);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        table.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        table.getColumnModel().getColumn(0).setMinWidth(350);
//        table.setRowHeight(2,100);
        table.setRowHeight(27);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 15));
        setContentPane(contents);
        setSize(800, 400);
        System.out.println("Вызвано");
    }


}
