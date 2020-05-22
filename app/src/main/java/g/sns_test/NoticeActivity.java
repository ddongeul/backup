package g.sns_test;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class NoticeActivity extends AppCompatActivity {

    private static final String TAG = "Notice";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        Log.d(TAG, "NoticeActivity 호출");


    }
}