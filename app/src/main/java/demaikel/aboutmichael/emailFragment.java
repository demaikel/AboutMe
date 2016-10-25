package demaikel.aboutmichael;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class emailFragment extends Fragment {


    public emailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_email, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Button contact = (Button) view.findViewById(R.id.contactBtn);

        final TextInputLayout holder = (TextInputLayout) view.findViewById(R.id.holder);

        final TextInputEditText msg = (TextInputEditText) view.findViewById(R.id.msget);

        final Button send = (Button) view.findViewById(R.id.sendBtn);

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contact.setVisibility(View.GONE);
                holder.setVisibility(View.VISIBLE);
                send.setVisibility(View.VISIBLE);
            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = msg.getText().toString();
                if (text.trim().length() >0) {
                    Intent intent = new Intent(Intent.ACTION_SENDTO);
                    intent.setType("*/*");
                    intent.setData(Uri.parse("" +
                            "mailto:"));
                    intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"michael.m.i@mhotmail.com"});
                    intent.putExtra(Intent.EXTRA_SUBJECT,"Contacto desde mi AboutMe");
                    intent.putExtra(Intent.EXTRA_TEXT, text);
                    startActivity(intent);

                }else{
                    holder.setError("Debe escribir un mensaje");


                }

            }
        });

    }

}
