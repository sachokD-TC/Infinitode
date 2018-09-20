package com.badlogic.gdx.backends.android;

import android.content.Context;
import android.content.Intent;
import android.view.WindowManager;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.C0280i;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0728z;

/* renamed from: com.badlogic.gdx.backends.android.a */
public interface C0283a extends Application {
    Context getContext();

    C0676a<Runnable> getExecutedRunnables();

    C0341k getInput();

    C0728z<C0280i> getLifecycleListeners();

    C0676a<Runnable> getRunnables();

    WindowManager getWindowManager();

    void runOnUiThread(Runnable runnable);

    void startActivity(Intent intent);
}
