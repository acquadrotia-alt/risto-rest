package cassandraRisto.ital.designerscripts;

/* loaded from: classes.dex */
public class LS_schedainz {
    public static void LS_general(java.util.LinkedHashMap<java.lang.String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> linkedHashMap, int i, int i2, float f) {
        anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3d);
        anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(linkedHashMap);
        linkedHashMap.get("inzdadata").vw.setLeft((int) (10.0d * f));
        linkedHashMap.get("inzdadata").vw.setWidth((int) ((0.49d * i) - (10.0d * f)));
        linkedHashMap.get("inzadata").vw.setLeft((int) (0.51d * i));
        linkedHashMap.get("inzadata").vw.setWidth((int) (((1.0d * i) - (10.0d * f)) - (0.51d * i)));
        linkedHashMap.get("inzdaora").vw.setLeft((int) (10.0d * f));
        linkedHashMap.get("inzdaora").vw.setWidth((int) ((0.49d * i) - (10.0d * f)));
        linkedHashMap.get("inzaora").vw.setLeft((int) (0.51d * i));
        linkedHashMap.get("inzaora").vw.setWidth((int) (((1.0d * i) - (10.0d * f)) - (0.51d * i)));
    }
}
