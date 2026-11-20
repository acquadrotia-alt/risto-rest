package ital.TotemLib;

/* loaded from: classes.dex */
public class language {
    private static ital.TotemLib.language mostCurrent = new ital.TotemLib.language();
    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
    public static java.lang.String[] _vvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public static java.lang.String[] _vvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public static java.lang.String[] _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public static java.lang.String[] _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public static java.lang.String[] _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public static java.lang.String[] _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    public static java.lang.Object getObject() {
        throw new java.lang.RuntimeException("Code module does not support this method.");
    }

    public static class _languageobject {
        public boolean IsInitialized;
        public int Key;
        public java.lang.Object Obj;

        public void Initialize() {
            this.IsInitialized = true;
            this.Key = 0;
            this.Obj = new java.lang.Object();
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static class _languageactivetype {
        public java.lang.String Code;
        public int Id;
        public boolean IsInitialized;

        public void Initialize() {
            this.IsInitialized = true;
            this.Id = 0;
            this.Code = "";
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static java.lang.String[] _vvvv4(anywheresoftware.b4a.BA ba, int i) throws java.lang.Exception {
        java.lang.String[] strArr = new java.lang.String[5];
        java.util.Arrays.fill(strArr, "");
        int length = strArr.length - 1;
        for (int i2 = 0; i2 <= length; i2++) {
            strArr[i2] = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, i2 + 1, i);
        }
        return strArr;
    }

    public static java.lang.String _vvvv5(anywheresoftware.b4a.BA ba, int i) throws java.lang.Exception {
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvv6[i - 1];
    }

    public static java.lang.String _vvvv6(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvv6[_vvvvvvvvvvvvvvvvvvvvvvvvvvvv7 - 1];
    }

    public static java.lang.String _vvvv7(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        return anywheresoftware.b4a.BA.NumberToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvv7 - 1);
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.BA ba, int i, int i2) throws java.lang.Exception {
        switch (i) {
            case 1:
                return _vvvvvvvvvvvvvvvvvvvvvvvvvvvv0[i2];
            case 2:
                return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1[i2];
            case 3:
                return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv2[i2];
            case 4:
                return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3[i2];
            case 5:
                return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv4[i2];
            default:
                return "";
        }
    }

    public static java.lang.String _vvvv0(anywheresoftware.b4a.BA ba, int i) throws java.lang.Exception {
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, _vvvvvvvvvvvvvvvvvvvvvvvvvvvv7, i);
    }

    public static java.lang.String _process_globals() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 1;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new java.lang.String[]{"it", "uk", "fr", "de", "es"};
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new java.lang.String[]{"Aggiungi all’ordine", "Esagerato", "Conferma Ordine", "Cancella Ordine", "Info Prodotto", "Chiudi Info", "Chiudi carrello della spesa", "Totale", "Contanti", "Carta Credito / Bancomat", "Consumo qui", "Asporto", "Rimuovi", "Indietro"};
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new java.lang.String[]{"Add to Order", "Exceeding", "Confirm Order", "Cancel Order", "Info Product", "Close Info", "Close shopping cart", "Total", "Cash", "Credit Card / Bancomat", "Eat here", "Take away", "Remove", "Back"};
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new java.lang.String[]{"Ajouter à la commande", "Dépassement", "Confirmer la commande", "Annuler la commande", "Informations sur le produit", "Fermer les informations", "Fermer le panier", "Le total", "Espèces", "Carte de crédit / Bancomat", "Mange ici", "Emporter", "Supprimer", "Arrière"};
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new java.lang.String[]{"Zur Bestellung hinzufügen", "Überschreiten", "Bestellung bestätigen", "Bestellung stornieren", "Info produkt", "Info schließen", "Warenkorb schließen", "Gesamt", "Kasse", "Kreditkarte / Bancomat", "Iss hier", "Wegbringen", "Entfernen", "Zurück"};
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new java.lang.String[]{"Agregar a la orden", "Excesivo", "Confirmar Orden", "Cancelar Orden", "Producto de información", "Cerrar información", "Cerrar carrito de compras", "Total", "Dinero", "Tarjeta de crédito / Bancomat", "Coma aqui", "Quitar", "Eliminar", "Espalda"};
        return "";
    }

    public static java.lang.String _vvvvv1(anywheresoftware.b4a.BA ba, int i) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = i;
        return "";
    }

    public static java.lang.String _vvvvv2(anywheresoftware.b4a.BA ba, anywheresoftware.b4a.objects.collections.List list, int i) throws java.lang.Exception {
        if (list.getSize() > 0) {
            new anywheresoftware.b4a.objects.ButtonWrapper();
            int size = list.getSize() - 1;
            for (int i2 = 0; i2 <= size; i2++) {
                ((anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button) list.Get(i2))).setText(anywheresoftware.b4a.BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, _vvvvvvvvvvvvvvvvvvvvvvvvvvvv7, i)));
            }
            return "";
        }
        return "";
    }
}
