package br.com.autodoc.rxfirebox;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.reactivex.functions.Function;

public interface Box<T> {

    Class<T> getMyType();

    public Function<Object, List<T>> toList();

    public Function<Object, T> toClass();

    public Function<Object, Map<String, Object>> toMap();

    public Function<Object, T> toFirst();

    public Function<Object, Set<String>> toSet();

}