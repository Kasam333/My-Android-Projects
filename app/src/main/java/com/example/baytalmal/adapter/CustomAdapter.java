package com.example.baytalmal.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.baytalmal.R;
import com.example.baytalmal.activies.FullViewActivity;
import com.example.baytalmal.model.Chapters;

import java.util.List;

public class CustomAdapter extends BaseExpandableListAdapter {

    List<Chapters>chaptersList;
    Context context;

    public CustomAdapter(List<Chapters> chaptersList, Context context) {
        this.chaptersList = chaptersList;
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return chaptersList.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return chaptersList.get(i).getTopicsList().size();
    }

    @Override
    public Object getGroup(int i) {
        return chaptersList.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return chaptersList.get(i).getTopicsList().get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.chapters_item,viewGroup,false);
        TextView chapterName = (TextView)view.findViewById(R.id.chapter_text);
        chapterName.setText(chaptersList.get(i).getChaptername());

        return view;

    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.topics_item,viewGroup,false);
        TextView topicName = (TextView)view.findViewById(R.id.topics_text);
        topicName.setText(chaptersList.get(i).getTopicsList().get(i1).getTopicName());

        CardView cardView = (CardView) view.findViewById(R.id.topicClick);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(context, FullViewActivity.class));
                intent.putExtra("filename",chaptersList.get(i).getTopicsList().get(i1).getFileName());
                context.startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
