package ital.TotemLib;

/* loaded from: classes.dex */
public class utility {
    private static ital.TotemLib.utility mostCurrent = new ital.TotemLib.utility();
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    public static java.lang.Object getObject() {
        throw new java.lang.RuntimeException("Code module does not support this method.");
    }

    public static ital.TotemLib.totemdata._totemcategorytype[] _v5(anywheresoftware.b4a.BA ba, ital.TotemLib.totemdata._totemcategorytype[] _totemcategorytypeVarArr, ital.TotemLib.totemdata._totemcategorytype[] _totemcategorytypeVarArr2) throws java.lang.Exception {
        ital.TotemLib.totemdata._totemcategorytype[] _totemcategorytypeVarArr3 = new ital.TotemLib.totemdata._totemcategorytype[_totemcategorytypeVarArr.length + _totemcategorytypeVarArr2.length];
        int length = _totemcategorytypeVarArr3.length;
        for (int i = 0; i < length; i++) {
            _totemcategorytypeVarArr3[i] = new ital.TotemLib.totemdata._totemcategorytype();
        }
        int length2 = _totemcategorytypeVarArr.length;
        if (_totemcategorytypeVarArr.length > 0) {
            int length3 = _totemcategorytypeVarArr.length - 1;
            for (int i2 = 0; i2 <= length3; i2++) {
                _totemcategorytypeVarArr3[i2] = _totemcategorytypeVarArr[i2];
            }
        }
        if (_totemcategorytypeVarArr2.length > 0) {
            int length4 = _totemcategorytypeVarArr2.length - 1;
            for (int i3 = 0; i3 <= length4; i3++) {
                _totemcategorytypeVarArr3[i3 + length2] = _totemcategorytypeVarArr2[i3];
            }
        }
        return _totemcategorytypeVarArr3;
    }

    public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _v6(anywheresoftware.b4a.BA ba, int i, int i2, java.lang.String str) throws java.lang.Exception {
        float length;
        anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper bitmapWrapper = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
        bitmapWrapper.InitializeMutable(i, i2);
        anywheresoftware.b4a.objects.drawable.CanvasWrapper canvasWrapper = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
        canvasWrapper.Initialize2(bitmapWrapper.getObject());
        if (str.length() > 20) {
            length = str.length() - 10;
        } else if (str.length() > 10) {
            length = str.length() - 5;
        } else {
            length = str.length() - 1;
        }
        float f = (float) (i / length);
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        canvasWrapper.DrawColor(-1);
        anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper = anywheresoftware.b4a.keywords.Common.Typeface;
        android.graphics.Typeface typeface = anywheresoftware.b4a.keywords.constants.TypefaceWrapper.DEFAULT_BOLD;
        anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
        canvasWrapper.DrawText(ba, str, (float) (i / 2.0d), (float) (i2 / 2.0d), typeface, f, -16777216, (android.graphics.Paint.Align) anywheresoftware.b4a.BA.getEnumFromString(android.graphics.Paint.Align.class, "CENTER"));
        return canvasWrapper.getBitmap();
    }

    public static anywheresoftware.b4a.objects.ImageViewWrapper _v7(anywheresoftware.b4a.BA ba, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2) throws java.lang.Exception {
        anywheresoftware.b4a.objects.ImageViewWrapper imageViewWrapper = new anywheresoftware.b4a.objects.ImageViewWrapper();
        imageViewWrapper.Initialize(ba, str2);
        imageViewWrapper.setTag(str3);
        if (str != null) {
            try {
                if (!str.equals("")) {
                    ital.TotemLib.totemdata totemdataVar = mostCurrent._vvvvv0;
                    if (ital.TotemLib.totemdata._vvv2.IsSimulation) {
                        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                        imageViewWrapper.setBitmap(anywheresoftware.b4a.keywords.Common.LoadBitmapResize(anywheresoftware.b4a.objects.streams.File.getDirAssets(), str, i, i2, true).getObject());
                    } else {
                        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                        ital.TotemLib.totemdata totemdataVar2 = mostCurrent._vvvvv0;
                        if (anywheresoftware.b4a.objects.streams.File.Exists(ital.TotemLib.totemdata._vvv2.PathImages, str)) {
                            ital.TotemLib.totemdata totemdataVar3 = mostCurrent._vvvvv0;
                            imageViewWrapper.setBitmap(anywheresoftware.b4a.keywords.Common.LoadBitmapResize(ital.TotemLib.totemdata._vvv2.PathImages, str, i, i2, true).getObject());
                        } else {
                            imageViewWrapper.setBitmap(_v6(ba, i, i2, str).getObject());
                        }
                    }
                }
            } catch (java.lang.Exception e) {
                (ba.processBA == null ? ba : ba.processBA).setLastException(e);
                ital.TotemLib.totemdata totemdataVar4 = mostCurrent._vvvvv0;
                if (ital.TotemLib.totemdata._vvv2.IsSimulation) {
                    anywheresoftware.b4a.keywords.Common.LogImpl("43473429", "ExceGetExternalBitmap (Simulation): " + str + "\n(" + anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage() + ")", 0);
                } else {
                    java.lang.StringBuilder append = new java.lang.StringBuilder().append("ExceGetExternalBitmap: ");
                    ital.TotemLib.totemdata totemdataVar5 = mostCurrent._vvvvv0;
                    anywheresoftware.b4a.keywords.Common.LogImpl("43473431", append.append(ital.TotemLib.totemdata._vvv2.PathImages).append("/").append(str).append("\n").append("(").append(anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage()).append(")").toString(), 0);
                }
            }
        }
        return imageViewWrapper;
    }

    public static double _vvvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.BA ba, ital.TotemLib.totemdata._totemproductvariationstype _totemproductvariationstypeVar) throws java.lang.Exception {
        if (_totemproductvariationstypeVar.FlgExceedingSelected) {
            return _totemproductvariationstypeVar.PriceExceeding;
        }
        if (!_totemproductvariationstypeVar.FlgSelected) {
            return 0.0d;
        }
        return _totemproductvariationstypeVar.Price;
    }

    public static double _v0(anywheresoftware.b4a.BA ba, int i, ital.TotemLib.totemdata._totemmenulistproducttype _totemmenulistproducttypeVar) throws java.lang.Exception {
        double d;
        double d2 = 0.0d;
        double d3 = _totemmenulistproducttypeVar.ProductMenu.Price;
        if (_totemmenulistproducttypeVar.Products.length > 0) {
            int length = _totemmenulistproducttypeVar.Products.length - 1;
            for (int i2 = 0; i2 <= length; i2++) {
                if (_totemmenulistproducttypeVar.Products[i2].Variations != null && _totemmenulistproducttypeVar.Products[i2].Variations.length > 0) {
                    int length2 = _totemmenulistproducttypeVar.Products[i2].Variations.length - 1;
                    int i3 = 0;
                    while (i3 <= length2) {
                        double _vvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, _totemmenulistproducttypeVar.Products[i2].Variations[i3]) + d2;
                        i3++;
                        d2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    }
                }
            }
            d = (d2 + d3) * i;
        } else {
            d = d3;
        }
        return _vv2(ba, d);
    }

    public static double _vv1(anywheresoftware.b4a.BA ba, int i, ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar, double d) throws java.lang.Exception {
        double d2 = 0.0d;
        if (_totemproducttypeVar.Variations == null || _totemproducttypeVar.Variations.length == 0) {
            d2 = (_totemproducttypeVar.Price * i) - d;
        } else if (_totemproducttypeVar.Variations.length > 0) {
            int length = _totemproducttypeVar.Variations.length - 1;
            double d3 = 0.0d;
            for (int i2 = 0; i2 <= length; i2++) {
                d3 += _vvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, _totemproducttypeVar.Variations[i2]);
            }
            d2 = ((_totemproducttypeVar.Price + d3) * i) - d;
        }
        return _vv2(ba, d2);
    }

    public static java.lang.String _process_globals() throws java.lang.Exception {
        return "";
    }

    public static double _vv2(anywheresoftware.b4a.BA ba, double d) throws java.lang.Exception {
        return anywheresoftware.b4a.keywords.Common.Round2(d, 2);
    }

    public static java.lang.String _vv3(anywheresoftware.b4a.BA ba, double d) throws java.lang.Exception {
        return anywheresoftware.b4a.keywords.Common.NumberFormat2(d, 1, 2, 2, false);
    }
}
