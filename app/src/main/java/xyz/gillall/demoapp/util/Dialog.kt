package xyz.gillall.demoapp.util

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable

object Dialog {

    fun dialogCreate(c: Context, resid: Int, cancelable: Boolean): Dialog {
        val dialog = Dialog(c)
        //dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(resid)
        dialog.setCancelable(cancelable)
        return dialog
    }

    fun dialogTransCreate(c: Context, resid: Int, cancelable: Boolean): Dialog {
        val dialog = Dialog(c)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(resid)
        dialog.setCancelable(cancelable)
        return dialog
    }
}