package ifreecomm.nettydemo;

import android.app.Application;

public class Myapp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

//        File file = new File(getApplicationContext().getCacheDir(), "app7");
//        Log.i("wangweijun", "onCreate: " + file.getAbsolutePath());
//        Debug.startMethodTracing(file.getAbsolutePath());
//        method1();
//        Debug.stopMethodTracing();
        
    }

   

    private void method1() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }
        method2();
    }

    private void method2() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        method3();
    }

    private void  method3() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
    }
}
