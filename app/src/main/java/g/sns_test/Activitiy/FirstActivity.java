package g.sns_test.Activitiy;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import g.sns_test.Adapter.FirstAdapter;
import g.sns_test.Data.CrewItem;
import g.sns_test.R;

public class FirstActivity extends AppCompatActivity {

    final static String TAG = "UniversityTextActivity";
    TextView uv_name;
    ImageView uv_image;

    private FirstAdapter firstAdapter;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutmanager;
    private ArrayList<String> nNames = new ArrayList<>();
    private ArrayList<String> nImageUrls = new ArrayList<>();
    private ArrayList<CrewItem> nItems;

    private int loopNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);
        Log.d(TAG, "FirstActivity 호출");

//        getIncomingIntent();

 //       Intent intent = getIntent();
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        layoutmanager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(layoutmanager);
        recyclerView.setHasFixedSize(true);

        firstAdapter = new FirstAdapter(getApplicationContext(),nNames, nImageUrls, nItems);
        recyclerView.setAdapter(firstAdapter);


        nImageUrls.add("https://cdn.pixabay.com/photo/2020/05/21/13/33/blue-flax-5200811_960_720.jpg");
        nNames.add("체육분과");

        nImageUrls.add("https://cdn.pixabay.com/photo/2020/05/23/11/01/pond-5209108_960_720.jpg");
        nNames.add("봉사분과");

        nImageUrls.add("https://cdn.pixabay.com/photo/2020/05/22/14/04/landscape-5205518_960_720.jpg");
        nNames.add("교양분과");

        nImageUrls.add("https://cdn.pixabay.com/photo/2020/05/21/13/33/blue-flax-5200811_960_720.jpg");
        nNames.add("문화분과");


//        String cr_name = intent.getStringExtra("cr_name");
//        String cr_img =intent.getStringExtra("cr_img");
//        nImageUrls.add(cr_img);
//        nNames.add(cr_name);
//
//        String cr_name1 = intent.getStringExtra("cr_name1");
//        String cr_img1 =intent.getStringExtra("cr_img1");
//        nImageUrls.add(cr_img1);
//        nNames.add(cr_name1);
//
//        String cr_name2 = intent.getStringExtra("cr_name2");
//        String cr_img2 =intent.getStringExtra("cr_img2");
//        nImageUrls.add(cr_img2);
//        nNames.add(cr_name2);


    }

//    private void getIncomingIntent(){
//        Log.d(TAG,"getIncomingIntent 호출");
//
//        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")){
//            Log.d(TAG,"getIncomingIntent : found intent extras");
//
//            String imageUrl = getIntent().getStringExtra("image_url");
//            String imageName = getIntent().getStringExtra("image_name");
//
//            setImage(imageUrl, imageName);
//        }
//    }
//
//    private void setImage(String imageUrl, String imageName) {
//        Log.d(TAG, "setImage 호출");
//
//        uv_name = (TextView) findViewById(R.id.textView3);
//        uv_name.setText(imageName);
//
//        uv_image = (ImageView) findViewById(R.id.imageView2);
//        Glide.with(this)
//                .asBitmap()
//                .load(imageUrl)
//                .into(uv_image);
//
//    }
}
