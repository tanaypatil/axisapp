package com.developer.tanaypatil.axis2016.Notifs;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.developer.tanaypatil.axis2016.R;

/**
 * Created by Tanay on 25-Dec-17.
 */

public class MyNotificationManager {

    private Context ctx;
    public static final int NOTIFICATION_ID = 234;

    public MyNotificationManager(Context ctx){
        this.ctx = ctx;
    }

    public void showNotification(String from, String notification, Intent intent){
        PendingIntent pendingIntent = PendingIntent.getActivity(ctx, NOTIFICATION_ID, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(ctx);

        Notification mNotification = builder.setSmallIcon(R.mipmap.ic_launcher)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent)
                .setContentTitle(from).setContentText(notification).build();

        mNotification.flags |= Notification.FLAG_AUTO_CANCEL;
        NotificationManager notificationManager = (NotificationManager)ctx.getSystemService(Context.NOTIFICATION_SERVICE);
        if (notificationManager != null) {
            notificationManager.notify(NOTIFICATION_ID, mNotification);
        }

    }

}
