package com.example.example_context;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        Toast MyToast = new Toast(context);
        MyToast.makeText(context, "This is a Toast Message", Toast.LENGTH_LONG).show();

        AlertDialog.Builder DialogConf = new AlertDialog.Builder(this);
        DialogConf.setTitle("Regular Menus");
        DialogConf.setMessage("This is the Text of the Dialog");
        DialogConf.setIcon(R.mipmap.ic_launcher);

        DialogConf.setNeutralButton("Close",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(context, "You closed the dialog.", Toast.LENGTH_LONG).show();
                    }
                });

        AlertDialog MyDialog = DialogConf.create();
        MyDialog.show();


        AlertDialog.Builder SecDialogConf = new AlertDialog.Builder(this);
        SecDialogConf.setTitle("Regular Menus");
        SecDialogConf.setMessage("This is the Text of the Dialog");
        SecDialogConf.setIcon(R.mipmap.ic_launcher);

        SecDialogConf.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(context, "You OK'ed the dialog.", Toast.LENGTH_LONG).show();
                    }
                });

        SecDialogConf.setNegativeButton("Close",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(context, "You closed the dialog.", Toast.LENGTH_LONG).show();
                    }
                });

        SecDialogConf.setNeutralButton("I am Neutral",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(context, "You neutraled the dialog.", Toast.LENGTH_LONG).show();
                    }
                });

        AlertDialog MyDialog2 = SecDialogConf.create();
        MyDialog2.show();


        AlertDialog.Builder ThirdDialogConf = new AlertDialog.Builder(this);

        ThirdDialogConf.setTitle("Confirmation Dialog");
        ThirdDialogConf.setMessage("This is the Text of the Dialog");
        ThirdDialogConf.setIcon(R.mipmap.ic_launcher);
        final EditText TextInput = new EditText(context);
        TextInput.setTextColor(Color.BLUE);
        ThirdDialogConf.setView(TextInput);

        ThirdDialogConf.setNeutralButton("Accept",
                new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    String str = TextInput.getEditableText().toString();
                    Toast.makeText(context, "You wrote this in the dialog: " + str, Toast.LENGTH_LONG).show();
                }
            });

        AlertDialog MyDialog3 = ThirdDialogConf.create();
        MyDialog3.show();

        int NOTIF_ID = 1234;
        Notification.Builder notifBuilder = new Notification.Builder(this);
        notifBuilder.setSmallIcon(R.mipmap.ic_launcher);
        notifBuilder.setContentTitle("This is my shiny notification!");
        notifBuilder.setContentText("This is the detail of the notification");

        Intent notificationIntent = new Intent(context, ChildActivity.class);
        notificationIntent.putExtra("myData", "This string comes from the previous activity");
        PendingIntent contentIntent = PendingIntent.getActivity(context, 0, notificationIntent, 0);

        notifBuilder.setContentIntent(contentIntent);

        NotificationManager MyNotification = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        MyNotification.notify(NOTIF_ID, notifBuilder.build());

    }

}
