package com.rokid.nativemoduleexample;

/**
 * Created by kapon2016 on 16/6/10.
 */
import android.util.*;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.*;

import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class BGNativeExampleModule extends ReactContextBaseJavaModule {
    public BGNativeExampleModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }
    @Override
    public String getName() {
        return "BGNativeModuleExample";
    }

}