package cassandraRisto.ital;

/* loaded from: classes.dex */
public class usbpl2303 {
    private static cassandraRisto.ital.usbpl2303 mostCurrent = new cassandraRisto.ital.usbpl2303();
    public static anywheresoftware.b4a.objects.usb.UsbManagerWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public static anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbDeviceWrapper[] _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public static anywheresoftware.b4a.objects.usb.UsbDeviceConnectionWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public static anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbEndpointWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public static anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbEndpointWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public static anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbEndpointWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
    public static anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbInterfaceWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
    public static byte[] _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
    public static int _max_timer_reads = 0;
    public static int _set_line_request_type = 0;
    public static int _set_line_request = 0;
    public static int _set_control_request_type = 0;
    public static int _set_control_request = 0;
    public static int _vendor_write_request_type = 0;
    public static int _vendor_write_request = 0;
    public static int _vendor_read_request_type = 0;
    public static int _vendor_read_request = 0;
    public static anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public static int _uart_dtr = 0;
    public static int _uart_rts = 0;
    public static int _parity_odd = 0;
    public static int _stopbits_1 = 0;
    public static int _databits_7 = 0;
    public static int _rate_19200 = 0;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public b4a.example.dateutils _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public ital.TotemLib.utility _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public ital.TotemLib.totemdata _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public ital.TotemLib.language _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public ital.TotemLib.acttotemmain _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.main _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public cassandraRisto.ital.tabelle _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.configura _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public cassandraRisto.ital.httpclient _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public cassandraRisto.ital.operatori _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public cassandraRisto.ital.frmfraziona _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public cassandraRisto.ital.mod1 _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public cassandraRisto.ital.starter _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.cassetto _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public cassandraRisto.ital.clienti _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.colorsroutine _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public cassandraRisto.ital.confpalmari _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public cassandraRisto.ital.confstampe _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public cassandraRisto.ital.dbutil _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public cassandraRisto.ital.fatturafm _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public cassandraRisto.ital.filtro _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.ftpmanager _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public cassandraRisto.ital.iniziative _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.magazzino _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public cassandraRisto.ital.menu _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public cassandraRisto.ital.modfunstr _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public cassandraRisto.ital.offerte _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public cassandraRisto.ital.ordini _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public cassandraRisto.ital.prenotazioni _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.rpidevice _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public cassandraRisto.ital.stampe _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.stampecustom _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public cassandraRisto.ital.tabelleappoggio _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public cassandraRisto.ital.usbpl2303service _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public cassandraRisto.ital.verificazione _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public cassandraRisto.ital.httputils2service _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.xuiviewsutils _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;

    public static java.lang.Object getObject() {
        throw new java.lang.RuntimeException("Code module does not support this method.");
    }

    public static class _uartdata {
        public boolean IsInitialized;
        public int databits;
        public int parity;
        public int rate;
        public int stopbits;

        public void Initialize() {
            this.IsInitialized = true;
            this.rate = 0;
            this.stopbits = 0;
            this.parity = 0;
            this.databits = 0;
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static class _rxdatablock {
        public boolean IsInitialized;
        public int bytecount;
        public byte[] data;

        public void Initialize() {
            this.IsInitialized = true;
            this.data = new byte[0];
            this.bytecount = 0;
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.HasPermission(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0[_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5].getObject());
    }

    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Initialize();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = -1;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.GetDevices();
        int length = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.length - 1;
        for (int i = 0; i <= length; i++) {
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0[i].getVendorId() == _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0[i].getProductId() == _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = i;
                return true;
            }
        }
        return false;
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.BA ba, int i, int i2, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Initialize();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbInterfaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbInterfaceWrapper(), _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0[_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5].GetInterface(0));
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.OpenDevice(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0[_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5].getObject(), _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getObject(), true);
        anywheresoftware.b4a.agraham.reflection.Reflection reflection = new anywheresoftware.b4a.agraham.reflection.Reflection();
        reflection.Target = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        reflection.Target = reflection.GetField("connection");
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (byte[]) reflection.RunMethod("getRawDescriptors");
        int endpointCount = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getEndpointCount() - 1;
        for (int i3 = 0; i3 <= endpointCount; i3++) {
            new anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbEndpointWrapper();
            anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbEndpointWrapper GetEndpoint = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetEndpoint(i3);
            int type = GetEndpoint.getType();
            anywheresoftware.b4a.objects.usb.UsbManagerWrapper usbManagerWrapper = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
            if (type == 2) {
                int direction = GetEndpoint.getDirection();
                anywheresoftware.b4a.objects.usb.UsbManagerWrapper usbManagerWrapper2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                if (direction == 128) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = GetEndpoint;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getMaxPacketSize();
                } else {
                    int direction2 = GetEndpoint.getDirection();
                    anywheresoftware.b4a.objects.usb.UsbManagerWrapper usbManagerWrapper3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                    if (direction2 == 0) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = GetEndpoint;
                    }
                }
            } else {
                int type2 = GetEndpoint.getType();
                anywheresoftware.b4a.objects.usb.UsbManagerWrapper usbManagerWrapper4 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                if (type2 == 3) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = GetEndpoint;
                }
            }
        }
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0[4] == 2) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
        } else if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0[7] == 64) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 2;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, 8, 0);
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, 9, 0);
        } else if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0[4] == 0) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 1;
        } else if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0[4] == 255) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 1;
        }
        byte[] bArr = new byte[1];
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba, 33924, 0, bArr);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, 1028, 0);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba, 33924, 0, bArr);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba, 33667, 0, bArr);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba, 33924, 0, bArr);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, 1028, 1);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba, 33924, 0, bArr);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba, 33667, 0, bArr);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, 0, 1);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, 1, 0);
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 == 2) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, 2, 68);
        } else {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, 2, 36);
        }
        if (ba.processBA != null) {
            ba = ba.processBA;
        }
        cassandraRisto.ital.usbpl2303service usbpl2303serviceVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        anywheresoftware.b4a.keywords.Common.StartService(ba, cassandraRisto.ital.usbpl2303service.getObject());
        return "";
    }

    public static java.lang.String _process_globals() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.usb.UsbManagerWrapper();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbDeviceWrapper[0];
        int length = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.length;
        for (int i = 0; i < length; i++) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0[i] = new anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbDeviceWrapper();
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.usb.UsbDeviceConnectionWrapper();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbEndpointWrapper();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbEndpointWrapper();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbEndpointWrapper();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbInterfaceWrapper();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new byte[0];
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 1659;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 8963;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 100;
        _max_timer_reads = 0;
        _max_timer_reads = 50;
        _set_line_request_type = 0;
        _set_line_request_type = 33;
        _set_line_request = 0;
        _set_line_request = 32;
        _set_control_request_type = 0;
        _set_control_request_type = 33;
        _set_control_request = 0;
        _set_control_request = 34;
        _vendor_write_request_type = 0;
        _vendor_write_request_type = 64;
        _vendor_write_request = 0;
        _vendor_write_request = 1;
        _vendor_read_request_type = 0;
        _vendor_read_request_type = 192;
        _vendor_read_request = 0;
        _vendor_read_request = 1;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.collections.List();
        _uart_dtr = 0;
        _uart_dtr = 1;
        _uart_rts = 0;
        _uart_rts = 2;
        _parity_odd = 0;
        _parity_odd = 1;
        _stopbits_1 = 0;
        _stopbits_1 = 0;
        _databits_7 = 0;
        _databits_7 = 7;
        _rate_19200 = 0;
        _rate_19200 = 19200;
        return "";
    }

    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.RequestPermission(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0[_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5].getObject());
        return false;
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(anywheresoftware.b4a.BA ba, boolean z, boolean z2) throws java.lang.Exception {
        int i;
        if (z) {
            anywheresoftware.b4a.keywords.Bit bit = anywheresoftware.b4a.keywords.Common.Bit;
            i = anywheresoftware.b4a.keywords.Bit.Or(0, _uart_dtr);
        } else {
            i = 0;
        }
        if (z2) {
            anywheresoftware.b4a.keywords.Bit bit2 = anywheresoftware.b4a.keywords.Common.Bit;
            i = anywheresoftware.b4a.keywords.Bit.Or(i, _uart_rts);
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ControlTransfer(_set_control_request_type, _set_control_request, i, 0, (byte[]) anywheresoftware.b4a.keywords.Common.Null, 0, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.BA ba, cassandraRisto.ital.usbpl2303._uartdata _uartdataVar) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Bit bit = anywheresoftware.b4a.keywords.Common.Bit;
        anywheresoftware.b4a.keywords.Bit bit2 = anywheresoftware.b4a.keywords.Common.Bit;
        anywheresoftware.b4a.keywords.Bit bit3 = anywheresoftware.b4a.keywords.Common.Bit;
        anywheresoftware.b4a.keywords.Bit bit4 = anywheresoftware.b4a.keywords.Common.Bit;
        anywheresoftware.b4a.keywords.Bit bit5 = anywheresoftware.b4a.keywords.Common.Bit;
        anywheresoftware.b4a.keywords.Bit bit6 = anywheresoftware.b4a.keywords.Common.Bit;
        anywheresoftware.b4a.keywords.Bit bit7 = anywheresoftware.b4a.keywords.Common.Bit;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ControlTransfer(_set_line_request_type, _set_line_request, 0, 0, new byte[]{(byte) anywheresoftware.b4a.keywords.Bit.And(_uartdataVar.rate, 255), (byte) anywheresoftware.b4a.keywords.Bit.And(anywheresoftware.b4a.keywords.Bit.ShiftRight(_uartdataVar.rate, 8), 255), (byte) anywheresoftware.b4a.keywords.Bit.And(anywheresoftware.b4a.keywords.Bit.ShiftRight(_uartdataVar.rate, 16), 255), (byte) anywheresoftware.b4a.keywords.Bit.And(anywheresoftware.b4a.keywords.Bit.ShiftRight(_uartdataVar.rate, 24), 255), (byte) _uartdataVar.stopbits, (byte) _uartdataVar.parity, (byte) _uartdataVar.databits}, 7, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(anywheresoftware.b4a.BA ba, int i, int i2, byte[] bArr) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ControlTransfer(_vendor_read_request_type, _vendor_read_request, i, i2, bArr, 1, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.BA ba, int i, int i2) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ControlTransfer(_vendor_write_request_type, _vendor_write_request, i, i2, (byte[]) anywheresoftware.b4a.keywords.Common.Null, 0, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
        return "";
    }

    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(anywheresoftware.b4a.BA ba, byte[] bArr, int i, int i2) throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
        anywheresoftware.b4a.objects.usb.UsbDeviceConnectionWrapper.UsbRequestWrapper usbRequestWrapper = new anywheresoftware.b4a.objects.usb.UsbDeviceConnectionWrapper.UsbRequestWrapper();
        usbRequestWrapper.Initialize(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject());
        usbRequestWrapper.Queue(bArr, i);
        if (ba.processBA != null) {
            ba = ba.processBA;
        }
        cassandraRisto.ital.usbpl2303service usbpl2303serviceVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba, cassandraRisto.ital.usbpl2303service.getObject(), "Read", java.lang.Integer.valueOf(i2));
        return 0;
    }
}
