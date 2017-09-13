package com.example.student.advert;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Student on 9/13/2017.
 */

public class Myadapter extends ArrayAdapter<String> {
    String [] names;
    int[] boooks;
    Context mcontext;
    public Myadapter(@NonNull Context context, String[] books, int[] Bookcovers ) {

        super(context, R.layout.listview_item);
        this.names = books;
        this.boooks = Bookcovers;
        this.mcontext = context;
    }

    @Override
    public int getCount() {
        return names.length;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if (convertView == null) {
            // layoutInflater mInflater = (layoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //convertView = mInflater.inflate(R.layout.listview_item, parent, false);
            ImageView mflag = (ImageView) convertView.findViewById(R.id.imageView);
            TextView mBooks = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(mViewHolder);
        }else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }
           mViewHolder.mflag.setImageResource(boooks[position]);
            mViewHolder.mBooks.setText(names[position]);

        return convertView;

    }
    static class ViewHolder{
        ImageView mflag;
        TextView mBooks;
    }
}
