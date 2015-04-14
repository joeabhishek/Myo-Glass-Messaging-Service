package com.thalmic.android.myoglass.wearchat;

import android.widget.Toast;

import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.WearableListenerService;

public class ListenerService extends WearableListenerService {

    private static final String MESSAGE1 = "SINGLE";
    private static final String MESSAGE2 = "DOUBLE";
    private static final String MESSAGE3 = "RTL";
    private static final String MESSAGE4 = "LONG";
    private static final String MESSAGE5 = "I'm in the airport now, I'll talk to you later.";


    @Override
    public void onMessageReceived(MessageEvent messageEvent) {

        if (messageEvent.getPath().equals(MESSAGE1)) {
            showToast(messageEvent.getPath());
//            Intent startIntent = new Intent(this, Msg1Activity.class);
//            startIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            startIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            startActivity(startIntent);
        }

        if (messageEvent.getPath().equals(MESSAGE2)) {
            showToast(messageEvent.getPath());
//            Intent startIntent = new Intent(this, Msg2Activity.class);
//            startIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            startIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            startActivity(startIntent);
        }

        if (messageEvent.getPath().equals(MESSAGE3)) {
            showToast(messageEvent.getPath());
//            Intent startIntent = new Intent(this, Msg3Activity.class);
//            startIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            startIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            startActivity(startIntent);
        }

        if (messageEvent.getPath().equals(MESSAGE4)) {
            showToast(messageEvent.getPath());
//            Intent startIntent = new Intent(this, Msg4Activity.class);
//            startIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            startIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            startActivity(startIntent);
        }

        if (messageEvent.getPath().equals(MESSAGE5)) {
            showToast(messageEvent.getPath());
//            Intent startIntent = new Intent(this, Msg5Activity.class);
//            startIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            startIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            startActivity(startIntent);
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}