package com.apptonic.lalitsonawane.cdbuddycommunity.fragment;

/**
 * Created by lalitkumarsonawane on 04/03/17.
 */
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyPostsFragment extends PostListFragment {

    public MyPostsFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // All my posts
        return databaseReference.child("user-posts")
                .child(getUid());
    }
}
