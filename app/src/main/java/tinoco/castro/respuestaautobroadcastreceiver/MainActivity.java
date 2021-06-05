package tinoco.castro.respuestaautobroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

     static AppCompatTextView num, msj;
     AppCompatButton guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (AppCompatTextView)findViewById(R.id.txtTelefono);
        msj = (AppCompatTextView)findViewById(R.id.txtMensaje);
        guardar = (AppCompatButton)findViewById(R.id.btnGuardar);
        guardar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Mensaje.msj = msj.getText().toString();
        Mensaje.num = num.getText().toString();
    }
}
