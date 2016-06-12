package glory.serulingsimulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TentangActivity extends AppCompatActivity {

    private TextView judul,isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);


        judul = (TextView)findViewById(R.id.labTentang);
        isi= (TextView)findViewById(R.id.labIsi);



        String jdl = "BIOGRAFI PEMBUAT";
        judul.setText(jdl);


        String isinya = "Pembuat Aplikasi ini bernama Arif Rahman Edison\n" +
                "Lahir di Kota Metro pada tahun 1995\n" +
                "Saat ini masih mengikuti studi S1 di Perguruan Tinggi Teknokrat\n" +
                "Jika kau berusaha kau akan Berhasil";

        isi.setText(isinya);




    }
}
