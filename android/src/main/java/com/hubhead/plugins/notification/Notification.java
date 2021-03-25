package com.hubhead.plugins.notification;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import android.util.Log;

@NativePlugin
public class Notification extends Plugin {

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");
         Log.i("PLUGIN","EEEEEEEEEEEE");
        JSObject ret = new JSObject();
        ret.put("value", value);
        call.success(ret);
    }
}
