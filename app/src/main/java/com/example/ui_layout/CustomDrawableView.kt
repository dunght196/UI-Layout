package com.example.ui_layout

import android.R
import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.View


class CustomDrawableView : View {

    private var drawable: ShapeDrawable? = null

    constructor(context: Context) : super(context) {
        val x = 10
        val y = 10
        val width = 300
        val height = 50
        contentDescription = "aaaa"
        drawable = ShapeDrawable(OvalShape())
        // If the color isn't set, the shape uses black as the default.
        drawable!!.paint.color = -0x8b53dd
        // If the bounds aren't set, the shape can't be drawn.
        drawable!!.setBounds(x, y, x + width, y + height)
    }

    override fun onDraw(canvas: Canvas?) {
        drawable!!.draw(canvas!!)
    }
}