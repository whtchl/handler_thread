package com.example.tchl.handler_thread;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.os.Handler;

/**
 * Created by tchl on 2016-05-11.
 */
public class MyHandlerThread extends Thread {
    public static final String TAG = "tchl MyHandlerThread";

    public Handler mHandler = null;

    @Override
    public void run() {
        Log.d(TAG, "进入Thread的run");
      //  Looper.prepare();
        Looper.prepare();
        mHandler = new Handler(Looper.myLooper()){
            @Override
            public void handleMessage(Message msg){

                Log.d(TAG, "获得了message");
                super.handleMessage(msg);
            }
        };
        Looper.loop();
    }
}
