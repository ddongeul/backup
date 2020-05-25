package g.sns_test;

import android.app.Activity;
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

public class UniversityAdapter extends RecyclerView.Adapter<g.sns_test.UniversityAdapter.MyViewHolder> {

    final static String TAG = "University";
    //  private Activity activity;
   // private ArrayList<UniversityData> arrayList;
    private ArrayList<String> mTextViews = new ArrayList<>();
    private ArrayList<String> mImageViews = new ArrayList<>();
    private Context mContext;
//
//    public UniversityAdapter (Activity activity, ArrayList<UniversityData> arrayList) {
//
//    }

    public UniversityAdapter(Context context, ArrayList<String> texts, ArrayList<String> images) {

        //this.activity = activity;
        //this.arrayList = arrayList;
        mTextViews =texts;
        mImageViews = images;
        mContext = context;

    }

    @Override
    public UniversityAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "UniversityAdapter 호출");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        MyViewHolder ViewHolder = new MyViewHolder(view);

        return ViewHolder;

    }

    @Override
    public void onBindViewHolder(UniversityAdapter.MyViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder 호출");

        Glide.with(mContext)
                .asBitmap()
                .load(mImageViews.get(position))
                .into(holder.mImageView);

        //UniversityData universitydata = arrayList.get(position);

        holder.mTextView.setText(mTextViews.get(position));
        holder.parentLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClickListener 호출");
                Intent intent = new Intent (mContext, UniversityTextActivity.class);
                intent.putExtra("image_name",mTextViews.get(position));
                intent.putExtra("image_url",mImageViews.get(position));

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount 호출");
        return mTextViews.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mTextView;
        ImageView mImageView;
        CardView parentLayout;

        public MyViewHolder(View view) {
            super(view);
            Log.d(TAG, "myviewholder 호출");
            mTextView = view.findViewById(R.id.tv_list);
            mImageView = view.findViewById(R.id.uv_picture);
            parentLayout = view.findViewById(R.id.parentLayout);

          //  view.setOnClickListener(this);
        }

//        @Override
//        public void onClick(View v) {
//
//            Intent intent = new Intent(v.getContext(), UniversityTextActivity.class);
//            intent.putExtra("image_url",mImageView);
//            intent.putExtra("image_name",mTextView);
//
//            v.getContext().startActivity(intent);
//
//
//        }
    }


}
