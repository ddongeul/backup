package g.sns_test.Activitiy;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import g.sns_test.R;

public class PrivacyActivity extends AppCompatActivity {

    private static final String TAG = "Privacy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);

        Log.d(TAG, "PrivacyActivity 호출");


    }
}