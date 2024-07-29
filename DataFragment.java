
public class DataFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_data, container, false);
        ListView listView = view.findViewById(R.id.listView);

        Cursor cursor = getActivity().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(getActivity(),
                android.R.layout.simple_list_item_1,
                cursor,
                new String[]{ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME},
                new int[]{android.R.id.text1}, 0);
        listView.setAdapter(adapter);

        return view;
    }
}
