package com.example.moviesbrowser;

import android.app.AlertDialog;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.github.chrisbanes.photoview.PhotoView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Viewholder> {
    private Context context;
    private List<Result> Result;
    public RecyclerViewAdapter(Context context, List<Result> Result) {
        this.context = context;
        this.Result = Result;
    }
    @NonNull
    @Override
    public RecyclerViewAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout, parent, false);
        return new Viewholder(view);    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.Viewholder holder, int position) {
        Result rm = Result.get(position);
        if(rm.getTitle() == null){
            holder.courseNameTV.setText(rm.getName());
        }
        else{
            holder.courseNameTV.setText(rm.getTitle());
        }
        holder.courseRatingTV.setText("" + rm.getOverview());
        holder.courseRatingTV.setMovementMethod(new ScrollingMovementMethod());
        holder.courseRatingTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(context);
                alert.setTitle(holder.courseNameTV.getText());
                alert.setMessage(holder.courseRatingTV.getText());
                alert.show();

            }
        });
        Picasso.get().load("https://image.tmdb.org/t/p/w500/"+rm.getPosterPath()).into(holder.courseIV);

       // holder.courseIV.setImageResource(rm.getCourse_image());
    }

    @Override
    public int getItemCount() {
        return Result.size();
    }
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView courseIV;
        private TextView courseNameTV, courseRatingTV;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            courseIV = itemView.findViewById(R.id.idIVCourseImage);
            courseNameTV = itemView.findViewById(R.id.idTVCourseName);
            courseRatingTV = itemView.findViewById(R.id.idTVCourseRating);
        }
    }
}
