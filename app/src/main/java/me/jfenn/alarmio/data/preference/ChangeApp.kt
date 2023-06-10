package me.jfenn.alarmio.data.preference

import android.content.ComponentName
import android.content.Intent
import me.jfenn.alarmio.BuildConfig
import me.jfenn.alarmio.R
import me.jfenn.attribouter.Attribouter

class ChangeApp  : CustomPreferenceData(R.string.title_change) {

    override fun getValueName(holder: CustomPreferenceData.ViewHolder): String? = null

    override fun onClick(holder: CustomPreferenceData.ViewHolder) {

        try {
            val intent = Intent()
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.setComponent(ComponentName("net.gsantner.markor_test", "net.gsantner.markor.activity.MainActivity"))
            holder.context.startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
