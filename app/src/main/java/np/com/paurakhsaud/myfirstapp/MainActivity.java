package np.com.paurakhsaud.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("hellow World");
    }

    public void tosting_test(View view) {
        Toast.makeText(this, "Button is clicked, Welcome to my club", Toast.LENGTH_SHORT).show();
    }
}