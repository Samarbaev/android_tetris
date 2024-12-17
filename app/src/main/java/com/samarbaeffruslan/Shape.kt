package com.samarbaeffruslan

import android.icu.text.Transliterator.Position
import com.samarbaeffruslan.tetris.Frame

enum class Shape(val frameCount: Int, val startPosition: Int) {

    TETRAMINO_IS_I(2, 2) {
        override fun getFrame(frameNumber: Int): Frame {
            return when (frameNumber) {
                0 -> Frame(4).addRow("1111")
                1 -> Frame(1)
                    .addRow("1")
                    .addRow("1")
                    .addRow("1")
                    .addRow("1")

                else -> throw IllegalArgumentException(
                    "$frameNumber is an invalid frame number."
                )
            }
        }
    },

    TETRAMINO_IS_Z(2, 1) {
        override fun getFrame(frameNumber: Int): Frame {
            return when (frameNumber) {
                0 -> Frame(3).addRow("110").addRow("011")
                1 -> Frame(2).addRow("01").addRow("11").addRow("10")
                else -> throw IllegalArgumentException(
                    "$frameNumber is an invalid frame number."
                )
            }
        }

    },
    TETRAMINO_IS_S(2, 1) {
        override fun getFrame(frameNumber: Int): Frame {
            return when (frameNumber) {
                0 -> Frame(3).addRow("011").addRow("110")
                1 -> Frame(2).addRow("10").addRow("11").addRow("01")
                else -> throw IllegalArgumentException(
                    "$frameNumber is an invalid frame number."
                )
            }
        }

    },

    TETRAMINO_IS_T(4, 1) {
        override fun getFrame(frameNumber: Int): Frame {
            return when (frameNumber) {
                0 -> Frame(3).addRow("010").addRow("111")
                1 -> Frame(2).addRow("10").addRow("11").addRow("10")
                2 -> Frame(3).addRow("111").addRow("010")
                3 -> Frame(2).addRow("01").addRow("11").addRow("01")
                else -> throw IllegalArgumentException(
                    "$frameNumber is an invalid frame number."
                )
            }
        }

    },

    TETRAMINO_IS_J(4, 1) {
        override fun getFrame(frameNumber: Int): Frame {
            return when (frameNumber) {
                0 -> Frame(3).addRow("100").addRow("111")
                1 -> Frame(2).addRow("11").addRow("10").addRow("10")
                2 -> Frame(3).addRow("111").addRow("001")
                3 -> Frame(2).addRow("01").addRow("01").addRow("11")
                else -> throw IllegalArgumentException(
                    "$frameNumber is an invalid frame number."
                )
            }
        }
    },

    TETRAMINO_IS_L(4, 1) {
        override fun getFrame(frameNumber: Int): Frame {
            return when (frameNumber) {
                0 -> Frame(3).addRow("001").addRow("111")
                1 -> Frame(2).addRow("10").addRow("10").addRow("11")
                2 -> Frame(3).addRow("111").addRow("100")
                3 -> Frame(2).addRow("11").addRow("01").addRow("01")
                else -> throw IllegalArgumentException(
                    "$frameNumber is an invalid frame number."
                )
            }
        }
    },

    TETRAMINO_IS_O(1, 1) {
        override fun getFrame(frameNumber: Int): Frame {
            return Frame(1)
                .addRow("11")
                .addRow("11")
        }
    };


    abstract fun getFrame(frameNumber: Int): Frame
}