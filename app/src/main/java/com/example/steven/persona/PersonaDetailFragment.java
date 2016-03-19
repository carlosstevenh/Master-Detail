package com.example.steven.persona;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.steven.persona.dummy.DummyContent;
import com.example.steven.persona.persona.Persona;
import com.example.steven.persona.persona.PersonaContent;

/**
 * A fragment representing a single Persona detail screen.
 * This fragment is either contained in a {@link PersonaListActivity}
 * in two-pane mode (on tablets) or a {@link PersonaDetailActivity}
 * on handsets.
 */
public class PersonaDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private Persona person;
    //private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PersonaDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            //mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
            int index = Integer.valueOf(getArguments().getString(ARG_ITEM_ID));
            person=(Persona) PersonaContent.getPersonList().get(index);

            /*Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }*/
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_persona_detail, container, false);

        // Show the dummy content as text in a TextView.
        /*if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.persona_detail)).setText(mItem.details);
        }*/

        if(person!=null){
           ((TextView) rootView.findViewById(R.id.textViewNombre)).setText(person.getNombre());
            ((TextView) rootView.findViewById(R.id.textViewApellido)).setText(person.getApellido());
            ((TextView) rootView.findViewById(R.id.textViewTelefono)).setText(person.getTelefono());
            ((TextView) rootView.findViewById(R.id.textViewCorreo)).setText(person.getCorreo());
        }

        return rootView;
    }
}
