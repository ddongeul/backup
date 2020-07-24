package g.sns_test.Activitiy;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import g.sns_test.R;

public class FriendActivity extends AppCompatActivity {

    private static final String TAG = "Friend";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);

        Log.d(TAG, "FriendActivity 호출");


    }
}