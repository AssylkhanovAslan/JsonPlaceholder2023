package kz.tutorial.jsonplaceholdertypicode.presentation.extensions

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.annotation.StringRes

fun Context.showToast(msg: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, msg, length).show()
}

fun Context.showToast(@StringRes resId: Int, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, resId, length).show()
}

fun Context?.openEmailWithAddress(email: String) {
    val intent = Intent(Intent.ACTION_SENDTO)
    intent.setData(Uri.parse("mailto:")) // only email apps should handle this

    intent.putExtra(Intent.EXTRA_EMAIL, email)
    if (this?.packageManager?.let { intent.resolveActivity(it) } != null) {
        startActivity(intent)
    } else {
        this?.showToast("No email app")
    }
}