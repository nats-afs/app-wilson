package com.asforsoft.nats.firebaseapp;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class FirebaseService {
    static FirebaseAuth auth = FirebaseAuth.getInstance();
    static FirebaseFirestore db = FirebaseFirestore.getInstance();

    public static FirebaseAuth getAuth() {
        return auth;
    }

    public static FirebaseFirestore getRoot() {
        return db;
    }

    public static FirebaseUser getCurrentUser() {
        return auth.getCurrentUser();
    }

    public static CollectionReference getUsersCollection() {
        return db.collection("users");
    }

    public static CollectionReference getProductsCollection() {
        return db.collection("products");
    }


}
