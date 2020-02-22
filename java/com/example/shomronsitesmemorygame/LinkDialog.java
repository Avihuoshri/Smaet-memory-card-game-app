package com.example.shomronsitesmemorygame;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatDialogFragment;


import java.util.Date;

public class LinkDialog extends AppCompatDialogFragment {

    private EditText msg_title ;
    private EditText msg_body  ;
    //private MessageBoardActivity messageBoardActivity;


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getActivity()) ;
        LayoutInflater inflater = getActivity().getLayoutInflater() ;
        View view = inflater.inflate(R.layout.layout_dialog , null) ;
        //messageBoardActivity = new MessageBoardActivity() ;
        dialogBuilder.setView(view)
                .setTitle("Message for customers")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("Send", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {


                    }
                }) ;


        return dialogBuilder.create() ;


    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


}
