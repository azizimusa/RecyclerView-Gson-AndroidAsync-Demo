package com.ur.shoppr.listitem;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.ur.shoppr.R;
import com.ur.shoppr.RestClient;

import org.json.JSONObject;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cz.msebera.android.httpclient.Header;
import timber.log.Timber;

/**
 * Created by azizimusa on 08/10/2016.
 */

public class ShowItemFragment extends Fragment {
    View view;
    ProductAdapter adapter;
    @BindView(R.id.rv)
    RecyclerView rv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.show_item, container, false);
        ButterKnife.bind(this, view);

        RestClient.get("/v2/search/data/men-jackets-nav?p=1&rows=10&userQuery=false", new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {

                Timber.e(response.toString());

                JSONObject resultsObj = response.optJSONObject("data").optJSONObject("results");

                if (resultsObj != null) {
                    Gson gg = new Gson();
                    ResultsModel productModel = gg.fromJson(resultsObj.toString(), ResultsModel.class);
                    List<ProductsModel> product = productModel.getProducts();

                    showProduct(product);

                }
            }

        });

        return view;
    }

    private void showProduct(List<ProductsModel> product) {
        adapter = new ProductAdapter(getActivity(), product);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
