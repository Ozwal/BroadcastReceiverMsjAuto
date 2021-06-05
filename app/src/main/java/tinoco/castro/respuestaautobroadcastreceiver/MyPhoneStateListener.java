package tinoco.castro.respuestaautobroadcastreceiver;

import android.telephony.PhoneStateListener;
import android.util.Log;

class MyPhoneStateListener extends PhoneStateListener {
    @Override
    public void onCallStateChanged(int state, String phoneNumber) {
        super.onCallStateChanged(state, phoneNumber);
        Log.d("MyPhoneStateListener", state+"xd");
    }
}
