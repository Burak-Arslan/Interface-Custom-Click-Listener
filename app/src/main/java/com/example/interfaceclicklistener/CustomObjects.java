package com.example.interfaceclicklistener;

public class CustomObjects {


    private MyCustomObjectsListener listener;

    public interface MyCustomObjectsListener {

        void onObjectReady(String title);

        void onDataLoaded(String title);
    }

    public CustomObjects() {
        this.listener = null;
    }

    public void setListener(MyCustomObjectsListener listener) {
        this.listener = listener;
        loadAsync();
    }

    public void loadAsync() {

        if (listener != null) {
            listener.onDataLoaded("TEST");
        }
    }
}
