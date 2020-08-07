package g.sns_test.Adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import g.sns_test.Activitiy.FirstActivity;
import g.sns_test.Activitiy.UniversityCrewActivity;
import g.sns_test.Data.CrewItem;
import g.sns_test.R;

public class FirstAdapter extends RecyclerView.Adapter<FirstAdapter.MyViewHolder> {

    final static String TAG = "University";

    private ArrayList<String> nTextViews;
    private ArrayList<String> nImageViews;
    private ArrayList<CrewItem> nItems;
    private Context nContext;


    public FirstAdapter(Context context, ArrayList<String> texts, ArrayList<String> images, ArrayList<CrewItem> items) {

        nTextViews =texts;
        nImageViews = images;
        nItems = items;
        nContext = context;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "UniversityAdapter 호출");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        MyViewHolder ViewHolder = new MyViewHolder(view);

        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder 호출");

        Glide.with(nContext)
                .asBitmap()
                .load(nImageViews.get(position))
                .into(holder.nImageView);

        holder.nTextView.setText(nTextViews.get(position));
        holder.parentLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClickListener 호출");
                final Intent intent;

                intent =new Intent(nContext, UniversityCrewActivity.class);
                intent.putExtra("cr_number",nItems.get(position).getNumber());
                intent.putExtra("image_name",nTextViews.get(position));
                intent.putExtra("image_url",nImageViews.get(position));

                nContext.startActivity(intent);

//                switch (holder.getAdapterPosition()) {
//                    case 0:
//                        intent = new Intent(nContext, UniversityCrewActivity.class);
//                        String cr_name = "Mr.Mister";
//                        String cr_img = "https://cdn.pixabay.com/photo/2020/05/21/13/33/blue-flax-5200811_960_720.jpg";
//                        intent.putExtra("cr_name", cr_name);
//                        intent.putExtra("cr_img", cr_img);
////                        intent.putExtra("names",names);
//
//                        String cr_name1 = "슈퍼스타";
//                        String cr_img1 = "https://cdn.pixabay.com/photo/2020/05/21/13/33/blue-flax-5200811_960_720.jpg";
//                        intent.putExtra("cr_name1", cr_name1);
//                        intent.putExtra("cr_img1", cr_img1);
//
//                        String cr_name2 = "perfect";
//                        String cr_img2 = "https://cdn.pixabay.com/photo/2020/05/21/13/33/blue-flax-5200811_960_720.jpg";
//                        intent.putExtra("cr_name2", cr_name2);
//                        intent.putExtra("cr_img2", cr_img2);
//
//                        break;
//
//                    case 1:
//                        intent = new Intent(nContext, UniversityCrewActivity.class);
//                        String cr_nameA = "로타렉트";
//                        String cr_imgA = "https://cdn.pixabay.com/photo/2020/05/23/11/01/pond-5209108_960_720.jpg";
//                        intent.putExtra("cr_name", cr_nameA);
//                        intent.putExtra("cr_img", cr_imgA);
//
//                        String cr_nameA1 = "맑은소리";
//                        String cr_imgA1 = "https://cdn.pixabay.com/photo/2020/05/23/11/01/pond-5209108_960_720.jpg";
//                        intent.putExtra("cr_name1", cr_nameA1);
//                        intent.putExtra("cr_img1", cr_imgA1);
//
//                        String cr_nameA2 = "한울회";
//                        String cr_imgA2 = "https://cdn.pixabay.com/photo/2020/05/23/11/01/pond-5209108_960_720.jpg";
//                        intent.putExtra("cr_name2", cr_nameA2);
//                        intent.putExtra("cr_img2", cr_imgA2);
//                        break;
//
//                    case 2:
//                        intent = new Intent(nContext, UniversityCrewActivity.class);
//                        String cr_nameB = "다반향초";
//                        String cr_imgB = "https://cdn.pixabay.com/photo/2020/05/22/14/04/landscape-5205518_960_720.jpg";
//                        intent.putExtra("cr_name", cr_nameB);
//                        intent.putExtra("cr_img", cr_imgB);
//
//
//                        String cr_nameB1 = "스크린";
//                        String cr_imgB1 = "https://cdn.pixabay.com/photo/2020/05/22/14/04/landscape-5205518_960_720.jpg";
//                        intent.putExtra("cr_name1", cr_nameB1);
//                        intent.putExtra("cr_img1", cr_imgB1);
//
//                        String cr_nameB2 = "스크린";
//                        String cr_imgB2 = "https://cdn.pixabay.com/photo/2020/05/22/14/04/landscape-5205518_960_720.jpg";
//                        intent.putExtra("cr_name1", cr_nameB2);
//                        intent.putExtra("cr_img1", cr_imgB2);
//                        break;
//
//                    case 3:
//                        intent = new Intent(nContext, UniversityCrewActivity.class);
//                        String cr_nameC = "피노키오";
//                        String cr_imgC = "https://cdn.pixabay.com/photo/2020/05/21/13/33/blue-flax-5200811_960_720.jpg";
//                        intent.putExtra("cr_name", cr_nameC);
//                        intent.putExtra("cr_img", cr_imgC);
//                        break;
//
//                    case 4:
//                        intent = new Intent(nContext, UniversityCrewActivity.class);
//                        String cr_nameD = "CCC";
//                        String cr_imgD = "https://cdn.pixabay.com/photo/2020/05/23/11/01/pond-5209108_960_720.jpg";
//                        intent.putExtra("cr_name", cr_nameD);
//                        intent.putExtra("cr_img", cr_imgD);
//                        break;
//
//                    default:
//                        intent = new Intent(nContext, FirstActivity.class);
//                        String cr_nameE = "Study";
//                        String cr_imgE = "https://cdn.pixabay.com/photo/2020/05/22/14/04/landscape-5205518_960_720.jpg";
//                        intent.putExtra("cr_name", cr_nameE);
//                        intent.putExtra("cr_img", cr_imgE);
//                        break;
//
////                    default:
////                        intent =  new Intent(mContext, FirstActivity.class);
////                        String cr_nameF = "피노키오";
////                        String cr_imgF ="https://cdn.pixabay.com/photo/2020/05/22/14/04/landscape-5205518_960_720.jpg";
////                        intent.putExtra("cr_name",cr_nameF);
////                        intent.putExtra("cr_img",cr_imgF);
////                        break;
//                }


            }
        });
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount 호출");
        return nItems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nTextView;
        ImageView nImageView;
        CardView parentLayout;

        public MyViewHolder(View view) {
            super(view);
            Log.d(TAG, "myviewholder 호출");
            nTextView = view.findViewById(R.id.tv_list);
            nImageView = view.findViewById(R.id.uv_picture);
            parentLayout = view.findViewById(R.id.parentLayout);
            nContext = view.getContext();
        }

    }

}
