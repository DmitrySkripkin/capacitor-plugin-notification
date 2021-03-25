package com.hubhead.plugins.notification;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import android.app.NotificationChannel;

@NativePlugin
public class Notification extends Plugin {

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        Notification notification = new NotificationCompat.Builder(this, "0")
                    .setContentTitle("Title")
                    .setContentText("Body")
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                    .build();
            NotificationManagerCompat manager = NotificationManagerCompat.from(getApplicationContext());
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                NotificationChannel channel = new NotificationChannel(
                        "0", "0", NotificationManager.IMPORTANCE_DEFAULT);
                notificationManager.createNotificationChannel(channel);
            }
            manager.notify("tag", 0, notification);
    }
}
