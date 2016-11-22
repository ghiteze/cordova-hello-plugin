package com.example.plugins;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Hello extends CordovaPlugin {

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

    if (action.equals("hi")) {

      String name = args.getString(0);

      if (name != null && name.length() > 0) {
        callbackContext.success("Hello " + name);
      }
      else {
        callbackContext.error("Error");
      }

      return true;
    }
    return false;

  }
}
