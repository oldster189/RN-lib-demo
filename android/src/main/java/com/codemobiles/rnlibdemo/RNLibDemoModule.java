package com.codemobiles.rnlibdemo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNLibDemoModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNLibDemoModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNLibDemo";
    }

    @Nullable
       @Override
       public Map<String, Object> getConstants() {
           final Map<String, Object> constants = new HashMap<>();
           constants.put("SHORT", Toast.LENGTH_SHORT);
           constants.put("LONG", Toast.LENGTH_LONG);
           return constants;
       }

       @ReactMethod
       public void show(String message, int duration) {
           Toast.makeText(getReactApplicationContext(), message, duration).show();
       }
}