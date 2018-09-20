package com.prineside.tdi;

import android.content.Context;
import android.content.pm.Signature;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import com.badlogic.gdx.backends.android.AndroidApplication;

import java.security.MessageDigest;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		if (Game.game != null) {
			Game.game.logger.log("AndroidLauncher", "onCreate");
		}
		try {
			Thread.currentThread().setUncaughtExceptionHandler(Game.f6550d);
		} catch (Exception e) {
		}
		C0310b c0310b = new C0310b();
		c0310b.f1098g = 4;
		c0310b.f1106o = true;
		c0310b.f1099h = false;
		c0310b.f1101j = false;
		c0310b.f1111t = true;
		c0310b.f1105n = true;
		try {
			AudioManager audioManager = (AudioManager) getSystemService("audio");
			if (Build.VERSION.SDK_INT >= 17) {
				int intValue = Integer.valueOf(audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE")).intValue();
				Log.i("AndroidLauncher", "SDK version is " + Build.VERSION.SDK_INT + ", audio sample rate: " + String.valueOf(intValue));
				Sound.f6839a = intValue;
			} else {
				Log.i("AndroidLauncher", "SDK version is too low (" + Build.VERSION.SDK_INT + ") to get sample rate");
			}
		} catch (Exception e2) {
		}
		initialize(new Game(this), c0310b);
		try {
			String string = Settings.Secure.getString(getContext().getContentResolver(), "android_id");
			if (string != null && string.length() >= 8) {
				char[] toCharArray = string.toCharArray();
				byte[] bArr = new byte[toCharArray.length];
				for (intValue = 0; intValue < toCharArray.length; intValue++) {
					bArr[intValue] = (byte) (toCharArray[intValue] - 109);
				}
				SafePreferences.m8837a(bArr);
			}
		} catch (Exception e3) {
			e3.printStackTrace();
		}
		GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this);
		zzac.m2852a((Object) this, (Object) "Listener must not be null");
		builder.f3351a.add(this);
		zzac.m2852a((Object) this, (Object) "Listener must not be null");
		builder.f3352b.add(this);
		this.f6424a = builder.m2675a(Games.f4034c).m2676a(Games.f4033b).m2675a(Drive.f3718f).m2676a(Drive.f3715c).m2678b();
		try {
			Context applicationContext = getApplicationContext();
			for (Signature signature : applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 64).signatures) {
				MessageDigest instance = MessageDigest.getInstance("SHA");
				instance.update(signature.toByteArray());
				String encodeToString = Base64.encodeToString(instance.digest(), 0);
				f6421d = encodeToString;
				f6421d = encodeToString.trim();
			}
		} catch (Throwable e4) {
			Log.i("AndroidLauncher", "Unable to get signature", e4);
		}
	}
}
