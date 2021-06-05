package tinoco.castro.respuestaautobroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.PhoneStateListener;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

public class IncomingCall extends BroadcastReceiver {

    MainActivity obj = new MainActivity();
    String num;

    @Override
    public void onReceive(final Context context, Intent intent) {
        num = Mensaje.num;

        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        MyPhoneStateListener phoneStateListener = new MyPhoneStateListener();
        telephonyManager.listen(phoneStateListener, PhoneStateListener.LISTEN_CALL_STATE);

        if(num == Mensaje.num){
            SmsManager smsManager = null;
            smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(Mensaje.num,null, Mensaje.msj, null,null);
        }
        /*
        PhoneStateListener callStateListener = new PhoneStateListener() {
            public void onCallStateChanged(int state, String incomingNumber) {
                if (state == TelephonyManager.CALL_STATE_RINGING) {
                    if (num == incomingNumber) {

                    }
                }
            }
        };
        telephonyManager.listen(callStateListener, PhoneStateListener.LISTEN_CALL_STATE);*/
    }
}
