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

    if (action.equals("open")) {
      setting = args.getString(0);
      Inten intent = null;

      if (setting.equals("location")) {
        intent = new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
      }
      else if (setting.equals("wifi")) {
        intent = new Intent(android.provider.Settings.ACTION_WIFI_SETTINGS);
      }

      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

      this.cordova.getActivity().startActivity(intent);

      callbackContext.sendPluginResult(new PluginResult(status, ""));

      return true;
    }
    return false;
  }
}
