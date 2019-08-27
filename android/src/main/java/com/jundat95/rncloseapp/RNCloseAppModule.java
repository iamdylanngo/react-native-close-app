package com.jundat95.rncloseapp;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNCloseAppModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNCloseAppModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNCloseApp";
  }

  @ReactMethod
  public void close() {
    android.os.Process.killProcess(android.os.Process.myPid());
    System.exit(0);
  }

}