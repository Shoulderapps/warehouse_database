package com.google.firebase.quickstart.database.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

//  RecentPostsFragment
public class OrderFragment extends OrderListFragment {

    public OrderFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // [START recent_posts_query]
        // Last 100 posts, these are automatically the 100 most recent
        // due to sorting by push() keys
        Query recentOrdersQuery = databaseReference.child("orders").limitToFirst(100);
        //Query recentOrdersQuery = databaseReference.orderByChild("orders").startAt("111").limitToFirst(100);
        // [END recent_posts_query]

        return recentOrdersQuery;
    }

}