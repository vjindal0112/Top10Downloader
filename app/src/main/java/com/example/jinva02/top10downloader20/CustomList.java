package com.example.jinva02.top10downloader20;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jinva02 on 7/7/2017.
 */

public class CustomList extends ArrayAdapter<String>{
    private Activity context;
    private String[] appInfo;
    private String[] imgUrl;

    public CustomList(Activity context, String[] appInfo, String[] imgUrl) {
        super(context, R.layout.list_item_image, appInfo);
        this.context = context;
        this.appInfo = appInfo;
        this.imgUrl = imgUrl;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listItem = inflater.inflate(R.layout.list_item_image, null, true);
        TextView appInfoText = (TextView) listItem.findViewById(R.id.appInfoText);
        ImageView appImg = (ImageView) listItem.findViewById(R.id.appImg);
        appInfoText.setText(appInfo[position]);
        
        // https://developer.android.com/reference/android/widget/ArrayAdapter.html
        return super.getView(position, convertView, parent);
    }
}
