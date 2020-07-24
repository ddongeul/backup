package g.sns_test.Activitiy;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import g.sns_test.R;

public class RecommendationActivity extends AppCompatActivity {

    private static final String TAG = "Recommendation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);

        Log.d(TAG, "RecommendationActivity 호출");


    }
}