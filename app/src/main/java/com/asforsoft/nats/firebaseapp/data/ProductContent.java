package com.asforsoft.nats.firebaseapp.data;

import android.support.annotation.NonNull;
import android.util.Log;

import com.asforsoft.nats.firebaseapp.model.Product;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class ProductContent {

    private static FirebaseFirestore db = FirebaseFirestore.getInstance();
    public static String TAG = "ProductContent";
    private static List<Product> products = new ArrayList<>();


    public static List<Product> getProducts() {
        db.collection("products")
                .get()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        for (QueryDocumentSnapshot document : task.getResult()) {
                            String id = document.getData().get("id").toString();
                            String nombre = document.getData().get("nombre").toString();
                            String descripcion = document.getData().get("descripcion").toString();
                            String precioCompra = document.getData().get("precioCompra").toString();
                            String precioVentaBase = document.getData().get("precioVentaBase").toString();
                            String gananciaMinima = document.getData().get("gananciaMinima").toString();
                            String cantidad = document.getData().get("stock").toString();
                            products.add(new Product(id, nombre, descripcion, precioCompra, precioVentaBase, gananciaMinima, cantidad));
                        }
                    } else {
                        Log.w(TAG, "Error getting documents.", task.getException());
                    }
                });

        return products;
    }
}
