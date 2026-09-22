package com.example.otherviewsdemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    int images[]={R.drawable.pear, R.drawable.watermelon,R.drawable.pineapple,R.drawable.mausambi, R.drawable.coconut,
            R.drawable.orange,R.drawable.pear, R.drawable.watermelon,R.drawable.pineapple,R.drawable.mausambi, R.drawable.coconut,
            R.drawable.orange,R.drawable.pear,R.drawable.pear, R.drawable.watermelon,R.drawable.pineapple,R.drawable.mausambi, R.drawable.coconut, R.drawable.orange,R.drawable.pear, R.drawable.watermelon,R.drawable.pineapple,R.drawable.mausambi, R.drawable.coconut, R.drawable.orange,
            R.drawable.watermelon,R.drawable.pineapple,R.drawable.mausambi, R.drawable.coconut, R.drawable.orange};
    Context context;

    ImageAdapter(Context context)
    {
        this.context=context;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return images[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView=new ImageView(context);
        imageView.setLayoutParams(
                new GridView.LayoutParams(
                        GridView.LayoutParams.MATCH_PARENT,
                        300
                )
        );

        imageView.setImageResource(images[i]);
        return imageView;
    }
}
