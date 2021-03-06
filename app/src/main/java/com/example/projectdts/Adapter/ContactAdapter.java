package com.example.projectdts.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projectdts.Model.Contact;
import com.example.projectdts.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private List<Contact> listContact = new ArrayList<>();
    private OnContactClickListener listener;

    public ContactAdapter(List<Contact> listContact) {
        this.listContact = listContact;
    }

    public interface OnContactClickListener{
        public void onClick(View view, int position);
    }

    public void setListener(OnContactClickListener listener){
        this.listener = listener;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vh = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_contact,viewGroup,false);
        ContactViewHolder viewHolder = new ContactViewHolder(vh);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ContactViewHolder contactViewHolder, int i) {
        Contact item = listContact.get(i);
        contactViewHolder.txtPhone.setText(item.getNo());
        contactViewHolder.txtName.setText(item.getName());
        Picasso.get().load(item.getImageUrl())
                .placeholder(R.drawable.ic_launcher_background)
                .into(contactViewHolder.imageContact);
    }

    @Override
    public int getItemCount() {
        return listContact.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageContact;
        public TextView txtName, txtPhone;

        public ContactViewHolder(View vh) {
            super(vh);
            imageContact = vh.findViewById(R.id.imageContact);
            txtName = vh.findViewById(R.id.txtName);
            txtPhone = vh.findViewById(R.id.txtPhone);
            vh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(v,getAdapterPosition());
                }
            });

        }
    }
}
