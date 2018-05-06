package id.luaspersegipanjang;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivityJava extends AppCompatActivity {

    private TextInputEditText etPanjang;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        setContentView(R.layout.activity_main);
        etPanjang = (TextInputEditText) findViewById(R.id.etPanjang);
        etPanjang.getText();
        super.onCreate(savedInstanceState, persistentState);
    }
}
