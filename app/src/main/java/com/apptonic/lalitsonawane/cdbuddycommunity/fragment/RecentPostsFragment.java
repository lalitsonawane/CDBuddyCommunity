package com.apptonic.lalitsonawane.cdbuddycommunity.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

import android.app.DownloadManager;

/**
 * Created by lalitkumarsonawane on 04/03/17.
 */

public class RecentPostsFragment extends PostListFragment {

    public RecentPostsFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // [START recent_posts_query]
        // Last 100 posts, these are automatically the 100 most recent
        // due to sorting by push() keys
        Query recentPostsQuery = databaseReference.child("posts")
                .limitToFirst(100);
        // [END recent_posts_query]

        return recentPostsQuery;
    }
}
