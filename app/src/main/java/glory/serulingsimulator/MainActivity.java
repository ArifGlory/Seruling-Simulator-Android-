package glory.serulingsimulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
    }

    public void btnMulai(View view) {

        Intent i = new Intent(this,SerulingActivity.class);
        startActivity(i);

    }

    public void btnTentang(View view) {

        Intent p = new Intent(this,TentangActivity.class);
        startActivity(p);
    }

    public void btnKeluar(View view) {
        System.exit(0);

    }

    public void btnPetunjuk(View view) {
        Intent a = new Intent(this,PetunjukActivity.class);
        startActivity(a);
    }
}
