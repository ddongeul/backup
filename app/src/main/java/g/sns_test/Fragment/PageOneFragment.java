package g.sns_test.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import g.sns_test.Adapter.FirstAdapter;
import g.sns_test.Data.CrewItem;
import g.sns_test.R;

public class PageOneFragment extends Fragment  {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutmanager;
    private FirstAdapter firstAdapter;
    private ArrayList<String> nNames = new ArrayList<>();
    private ArrayList<String> nImageUrls = new ArrayList<>();
    private ArrayList<CrewItem> nItems = new ArrayList<>();

    public static Fragment newInstance() {
        Bundle args = new Bundle();
        PageOneFragment fragment = new PageOneFragment();
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_page_one, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        layoutmanager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(layoutmanager);
        recyclerView.setHasFixedSize(true);

        firstAdapter = new FirstAdapter(getContext(), nNames, nImageUrls,nItems);
        recyclerView.setAdapter(firstAdapter);


        nImageUrls.add("https://cdn.pixabay.com/photo/2020/05/21/13/33/blue-flax-5200811_960_720.jpg");
        nNames.add("체육분과");

        nImageUrls.add("https://cdn.pixabay.com/photo/2020/05/23/11/01/pond-5209108_960_720.jpg");
        nNames.add("봉사분과");

        nImageUrls.add("https://cdn.pixabay.com/photo/2020/05/22/14/04/landscape-5205518_960_720.jpg");
        nNames.add("교양분과");

        nImageUrls.add("https://cdn.pixabay.com/photo/2020/05/21/13/33/blue-flax-5200811_960_720.jpg");
        nNames.add("문화분과");

         return  view;
    }

}
