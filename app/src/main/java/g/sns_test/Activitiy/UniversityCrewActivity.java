package g.sns_test.Activitiy;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import g.sns_test.R;

public class UniversityCrewActivity extends AppCompatActivity {

    final static String TAG = "UniversityCrewActivity";
    TextView cr_name;
    ImageView cr_image;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "UniversityCrewActivity 호출");
        setContentView(R.layout.activity_universitycrew);
        getIncomingIntents();

        Intent intent = getIntent();
        TextView cr_nm =(TextView)findViewById(R.id.cr_name);
        TextView cr_lo =(TextView)findViewById(R.id.cr_location);
        TextView cr_intro =(TextView)findViewById(R.id.cr_introduce);
        TextView cr_wo =(TextView)findViewById(R.id.cr_work);

        String cr_name = intent.getStringExtra("cr_name");
        String cr_location= intent.getStringExtra("cr_location");
        String cr_introduce= intent.getStringExtra("cr_introduce");
        String cr_work= intent.getStringExtra("cr_work");

        cr_nm.setText(cr_name);
        cr_lo.setText(cr_location);
        cr_intro.setText(cr_introduce);
        cr_wo.setText(cr_work);

    }

    private void getIncomingIntents(){
        Log.d(TAG,"getIncomingIntent2 호출");

        if(getIntent().hasExtra("image_urls") && getIntent().hasExtra("image_names")){
            Log.d(TAG,"getIncomingIntent2 : found intent extras");

            String imageUrls = getIntent().getStringExtra("image_urls");
            String imageNames = getIntent().getStringExtra("image_names");

            setImages(imageUrls, imageNames);
        }
    }

    private void setImages(String imageUrls, String imageNames) {
        Log.d(TAG, "setImage 호출2");

        cr_name = (TextView) findViewById(R.id.textView4);
        cr_name.setText(imageNames);

        cr_image = (ImageView) findViewById(R.id.imageView3);
        Glide.with(this)
                .asBitmap()
                .load(imageUrls)
                .into(cr_image);

    }
}
