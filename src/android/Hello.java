package com.example.plugins;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.provider.Settings;
import android.content.Intent;


public class Hello extends CordovaPlugin {

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    PluginResult.Status status = PluginResult.Status.OK;
    if (action.equals("hi")) {

      String name = args.getString(0);

      Intent intent = new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      callbackContext.sendPluginResult(new PluginResult(status, ""));

      return true;
    }
    return false;
  }
}
