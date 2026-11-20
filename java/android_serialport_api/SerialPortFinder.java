package android_serialport_api;

@anywheresoftware.b4a.BA.ShortName("PortFinder")
/* loaded from: classes.dex */
public class SerialPortFinder {
    private static final java.lang.String TAG = "SerialPort";
    private java.util.Vector<android_serialport_api.SerialPortFinder.Driver> mDrivers = null;

    @anywheresoftware.b4a.BA.ShortName("Driver")
    public class Driver {
        private java.lang.String mDeviceRoot;
        java.util.Vector<java.io.File> mDevices = null;
        private java.lang.String mDriverName;

        public Driver(java.lang.String name, java.lang.String root) {
            this.mDriverName = name;
            this.mDeviceRoot = root;
        }

        public java.util.Vector<java.io.File> getDevices() {
            if (this.mDevices == null) {
                this.mDevices = new java.util.Vector<>();
                java.io.File dev = new java.io.File("/dev");
                java.io.File[] files = dev.listFiles();
                for (int i = 0; i < files.length; i++) {
                    if (files[i].getAbsolutePath().startsWith(this.mDeviceRoot)) {
                        android.util.Log.d("SerialPort", "Found new device: " + files[i]);
                        this.mDevices.add(files[i]);
                    }
                }
            }
            return this.mDevices;
        }

        public java.lang.String getName() {
            return this.mDriverName;
        }
    }

    java.util.Vector<android_serialport_api.SerialPortFinder.Driver> getDrivers() throws java.io.IOException {
        if (this.mDrivers == null) {
            this.mDrivers = new java.util.Vector<>();
            java.io.LineNumberReader r = new java.io.LineNumberReader(new java.io.FileReader("/proc/tty/drivers"));
            while (true) {
                java.lang.String l = r.readLine();
                if (l == null) {
                    break;
                }
                java.lang.String drivername = l.substring(0, 21).trim();
                java.lang.String[] w = l.split(" +");
                if (w.length >= 5 && w[w.length - 1].equals("serial")) {
                    android.util.Log.d("SerialPort", "Found new driver " + drivername + " on " + w[w.length - 4]);
                    this.mDrivers.add(new android_serialport_api.SerialPortFinder.Driver(drivername, w[w.length - 4]));
                }
            }
            r.close();
        }
        return this.mDrivers;
    }

    public java.lang.String[] getAllDevices() {
        java.util.Vector<java.lang.String> devices = new java.util.Vector<>();
        try {
            java.util.Iterator<android_serialport_api.SerialPortFinder.Driver> itdriv = getDrivers().iterator();
            while (itdriv.hasNext()) {
                android_serialport_api.SerialPortFinder.Driver driver = itdriv.next();
                java.util.Iterator<java.io.File> itdev = driver.getDevices().iterator();
                while (itdev.hasNext()) {
                    java.lang.String device = itdev.next().getName();
                    java.lang.String value = java.lang.String.format("%s (%s)", device, driver.getName());
                    devices.add(value);
                }
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return (java.lang.String[]) devices.toArray(new java.lang.String[devices.size()]);
    }

    public java.lang.String[] getAllDevicesPath() {
        java.util.Vector<java.lang.String> devices = new java.util.Vector<>();
        try {
            java.util.Iterator<android_serialport_api.SerialPortFinder.Driver> itdriv = getDrivers().iterator();
            while (itdriv.hasNext()) {
                android_serialport_api.SerialPortFinder.Driver driver = itdriv.next();
                java.util.Iterator<java.io.File> itdev = driver.getDevices().iterator();
                while (itdev.hasNext()) {
                    java.lang.String device = itdev.next().getAbsolutePath();
                    devices.add(device);
                }
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return (java.lang.String[]) devices.toArray(new java.lang.String[devices.size()]);
    }
}
