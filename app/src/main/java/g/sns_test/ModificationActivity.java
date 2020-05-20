package g.sns_test;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class ModificationActivity extends AppCompatActivity {

    private static final String TAG = "Modification";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modification);

        Log.d(TAG, "Modification 호출");


    }
}