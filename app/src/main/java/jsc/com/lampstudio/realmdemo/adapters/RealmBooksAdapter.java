package jsc.com.lampstudio.realmdemo.adapters;

import jsc.com.lampstudio.realmdemo.model.Book;
import android.content.Context;

import io.realm.RealmResults;
/**
 * Created by khoa on 6/25/2017.
 */

public class RealmBooksAdapter extends RealmModelAdapter<Book> {

    public RealmBooksAdapter(Context context, RealmResults<Book> realmResults, boolean automaticUpdate) {

        super(context, realmResults, automaticUpdate);
    }
}
