package com.example.simulationcenterbaku;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "MyFirebaseMessagingServ";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        // Выводим данные уведомления в лог
        Log.d(TAG, "From: " + remoteMessage.getFrom());

        // Проверяем, есть ли данные уведомления
        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data payload: " + remoteMessage.getData());

            // TODO: Обработка данных уведомления, например, отображение уведомления в уведомлении или выполнение дополнительных действий
        }

        // Проверяем, есть ли уведомление в теле сообщения
        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());

            // TODO: Обработка уведомления, например, отображение уведомления в уведомлении или выполнение дополнительных действий
        }
    }

    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);

        // Выводим новый токен в лог
        Log.d(TAG, "Refreshed token: " + token);

        // TODO: Обновление токена на сервере при необходимости
    }
}
