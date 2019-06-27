package com.deepan.goweather.view

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import com.deepan.goweather.BuildConfig
import com.deepan.goweather.util.FontsConstants
import com.deepan.goweather.util.FontsHelper
import com.deepan.goweather.R
import kotlinx.android.synthetic.main.dialog_permissions.*

class PermissionsDialog(private var ctx: Context, var msg: String) : Dialog(ctx) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_permissions)

        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        message.text = msg

        dismiss.setOnClickListener {
            dismiss()
        }

        settings.setOnClickListener {
            val i = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:" + BuildConfig.APPLICATION_ID))
            ctx.startActivity(i)
            dismiss()
        }

        permissionsTitle.typeface = FontsHelper[ctx, FontsConstants.BLACK]
        message.typeface = FontsHelper[ctx, FontsConstants.REGULAR]
        dismiss.typeface = FontsHelper[ctx, FontsConstants.REGULAR]
        settings.typeface = FontsHelper[ctx, FontsConstants.REGULAR]
    }
}