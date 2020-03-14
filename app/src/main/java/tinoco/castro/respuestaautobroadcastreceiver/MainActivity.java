package tinoco.castro.respuestaautobroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

     static TextView num, msj;
     Button guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (TextView)findViewById(R.id.txtTelefono);
        msj = (TextView)findViewById(R.id.txtMensaje);
        guardar = (Button)findViewById(R.id.btnGuardar);
        guardar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Mensaje.msj = msj.getText().toString();
        Mensaje.num = num.getText().toString();
    }
}
