package g.sns_test;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UniversityTextActivity extends AppCompatActivity {
    final static String TAG = "University";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_universitytext);
        Log.d(TAG, "UniversityText 호출");


    }
}
