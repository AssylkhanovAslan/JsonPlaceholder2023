package kz.tutorial.jsonplaceholdertypicode.presentation.utils

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration

class SpaceItemDecoration(
    private val verticalSpaceInDp: Int,
    private val horizontalSpaceInDp: Int
) : ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect, view: View, parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val density = parent.context.resources.displayMetrics.density
        val verticalSpace = (verticalSpaceInDp * density).toInt()
        val horizontalSpace = (horizontalSpaceInDp * density).toInt()

        outRect.bottom = verticalSpace
        outRect.top = verticalSpace
        outRect.left = horizontalSpace
        outRect.right = horizontalSpace
    }
}