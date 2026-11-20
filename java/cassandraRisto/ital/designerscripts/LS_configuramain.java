package cassandraRisto.ital.designerscripts;

/* loaded from: classes.dex */
public class LS_configuramain {
    public static void LS_general(java.util.LinkedHashMap<java.lang.String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> linkedHashMap, int i, int i2, float f) {
        anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3d);
        linkedHashMap.get("tabhost1").vw.setLeft(0);
        linkedHashMap.get("tabhost1").vw.setWidth((int) ((i * 1.0d) - 0.0d));
        linkedHashMap.get("tabhost1").vw.setTop((int) (f * 70.0d));
        linkedHashMap.get("tabhost1").vw.setHeight((int) ((i2 * 1.0d) - (f * 70.0d)));
        linkedHashMap.get("lbltitolo").vw.setLeft((int) (i * 0.0d));
        linkedHashMap.get("lbltitolo").vw.setWidth((int) ((i * 1.0d) - (i * 0.0d)));
        linkedHashMap.get("lbltitolo").vw.setTop((int) (i2 * 0.0d));
        linkedHashMap.get("lbltitolo").vw.setHeight((int) ((f * 70.0d) - (i2 * 0.0d)));
        linkedHashMap.get("conf_annulla").vw.setLeft((int) (f * 0.0d));
        linkedHashMap.get("conf_annulla").vw.setWidth((int) ((f * 70.0d) - (f * 0.0d)));
        linkedHashMap.get("conf_annulla").vw.setTop((int) (f * 0.0d));
        linkedHashMap.get("conf_annulla").vw.setHeight((int) ((f * 70.0d) - (f * 0.0d)));
        linkedHashMap.get("conf_ok").vw.setLeft((int) ((i * 1.0d) - (f * 70.0d)));
        linkedHashMap.get("conf_ok").vw.setWidth((int) ((i * 1.0d) - ((i * 1.0d) - (f * 70.0d))));
        linkedHashMap.get("conf_ok").vw.setTop((int) (f * 0.0d));
        linkedHashMap.get("conf_ok").vw.setHeight((int) ((f * 70.0d) - (f * 0.0d)));
    }
}
