package com.lb6905.jnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.tv_jni);
        byte[] arr = getArray();
        mTextView.setText(stringFromJNI());
        JNIReflect();

//        TestClass t = TestClass.getNamess("00");
////        t.test(111);
////        String value = new String(t.getBytefun());
////        Log.i("main","value: " + value);
//        byte[] addr = t.getBytefun();
        byte[] addr = getArray();
        StringBuffer buf = new StringBuffer();
        for (byte b : addr) {
            buf.append(String.format("%02X:", b));
        }
        if (buf.length() > 0) {
            buf.deleteCharAt(buf.length() - 1);
        }
        String macAddress = buf.toString();
        Log.i("main","macAddress: " + macAddress);
    }

    public native String stringFromJNI();
    public native void setArray(int[] array);
    public native byte[] getArray();
    public native void JNIReflect();

    static {
        System.loadLibrary("hello-jni");
    }
}
