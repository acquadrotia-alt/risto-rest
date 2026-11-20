package android_serialport_api;

@anywheresoftware.b4a.BA.ShortName("SerialPort")
/* loaded from: classes.dex */
public class SerialPort {
    private static final java.lang.String TAG = "SerialPort";
    private java.io.FileDescriptor mFd;
    private java.io.FileInputStream mFileInputStream;
    private java.io.FileOutputStream mFileOutputStream;

    private static native java.io.FileDescriptor open(java.lang.String str, int i, int i2);

    public native void close();

    public void SetPort(java.lang.String path, int baudrate, int flags) throws java.lang.SecurityException, java.io.IOException {
        this.mFd = open(path, baudrate, flags);
        if (this.mFd == null) {
            android.util.Log.e("SerialPort", "native open returns null");
            throw new java.io.IOException();
        }
        this.mFileInputStream = new java.io.FileInputStream(this.mFd);
        this.mFileOutputStream = new java.io.FileOutputStream(this.mFd);
    }

    public java.io.InputStream getInputStream() {
        return this.mFileInputStream;
    }

    public java.io.OutputStream getOutputStream() {
        return this.mFileOutputStream;
    }

    static {
        java.lang.System.loadLibrary("serial_port");
    }
}
